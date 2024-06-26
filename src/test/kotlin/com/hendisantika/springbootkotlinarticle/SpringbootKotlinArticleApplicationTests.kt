package com.hendisantika.springbootkotlinarticle

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringbootKotlinArticleApplicationTests {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun getAllArticles() {
        //	val content = """[{"article_id":1,"title":"Learning Spring Boot","contents":"Some resources to learn Spring Boot"}]"""
        val result = testRestTemplate.getForEntity("/api/articles", String::class.java)
        assertNotNull(result)
        assertEquals(result?.statusCode, HttpStatus.OK)
        //	assertEquals(result?.body, content)
    }

}
