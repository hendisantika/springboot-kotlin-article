package com.hendisantika.springbootkotlinarticle.entity

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kotlin-article
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-04
 * Time: 06:16
 */
@Entity
@Table(name = "articles")
data class Article(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "article_id")
        val id: Int = 0,

        @get: NotBlank
        val title: String = "",

        @get: NotBlank
        val contents: String = ""
)
