package com.hendisantika.springbootkotlinarticle.controller

import com.hendisantika.springbootkotlinarticle.entity.Article
import com.hendisantika.springbootkotlinarticle.service.ArticleService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kotlin-article
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-04
 * Time: 06:21
 */
@RestController
@RequestMapping("/api")
class ArticleController(@Autowired private val articleService: ArticleService) {

    @GetMapping("/articles")
    fun getAllArticles(): List<Article> = articleService.getAllArticles()

    @PostMapping("/article/save")
    fun createNewArticle(@ModelAttribute article: Article): Article = articleService.save(article)

    @GetMapping("/articles/search")
    fun getArticleById(@RequestParam("id") articleId: Int): ResponseEntity<Article> {
        return articleService.getArticleById(articleId).map { article ->
            ResponseEntity.ok(article)
        }.orElse(ResponseEntity.notFound().build())
    }

    @PutMapping("/articles/{id}")
    fun updateArticleById(@PathVariable(value = "id") articleId: Int,
                          @Valid @RequestBody newArticle: Article): ResponseEntity<Article> {

        val updatedArticle: Optional<Article> = articleService.updateArticleById(articleId, newArticle)
        return updatedArticle.map { updated ->
            ResponseEntity.ok().body(updated)
        }.orElse(ResponseEntity.notFound().build())
    }

    @DeleteMapping("/articles/delete")
    fun deleteArticleById(@RequestParam("id") articleId: Int): ResponseEntity<Void> {

        return articleService.deleteArticleById(articleId).map { _ ->
            ResponseEntity<Void>(HttpStatus.OK)
        }.orElse(ResponseEntity.notFound().build())

    }
}
