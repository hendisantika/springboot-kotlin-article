package com.hendisantika.springbootkotlinarticle

import com.hendisantika.springbootkotlinarticle.controller.ArticleController
import com.hendisantika.springbootkotlinarticle.entity.Article
import com.hendisantika.springbootkotlinarticle.service.ArticleService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kotlin-article
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-04
 * Time: 06:54
 */
class ArticleControllerTest {

    @InjectMocks
    lateinit var articleController: ArticleController
    @Mock
    lateinit var articleService: ArticleService

    @Test
    fun getAllArticles() {
        val expectedArticles = listOf(Article(1, "Mudah Belajar Spring Framework", "Spring Framework"))
        Mockito.doReturn(expectedArticles).`when`(articleService).getAllArticles()
        val result = articleController.getAllArticles()
        assertNotNull(result)
        assertEquals(result, expectedArticles)
    }
}
