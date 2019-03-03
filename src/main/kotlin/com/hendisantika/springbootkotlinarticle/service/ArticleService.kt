package com.hendisantika.springbootkotlinarticle.service

import com.hendisantika.springbootkotlinarticle.entity.Article
import com.hendisantika.springbootkotlinarticle.repository.ArticleRepository
import org.springframework.stereotype.Service
import java.util.*

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kotlin-article
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-04
 * Time: 06:18
 */
@Service
class ArticleService(private val articleRepository: ArticleRepository) {

    fun getAllArticles(): List<Article> = articleRepository.findAll()

    fun save(article: Article): Article = articleRepository.save(article)

    fun getArticleById(articleId: Int): Optional<Article> = articleRepository.findById(articleId)

    fun updateArticleById(articleId: Int, newArticle: Article): Optional<Article> {
        return articleRepository.findById(articleId).map { existingArticle ->
            val updatedArticle: Article = existingArticle
                    .copy(title = newArticle.title, contents = newArticle.contents)
            articleRepository.save(updatedArticle)
        }
    }

    fun deleteArticleById(articleId: Int): Optional<Unit> {
        return articleRepository.findById(articleId).map { article ->
            articleRepository.delete(article)
        }
    }
}