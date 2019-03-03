package com.hendisantika.springbootkotlinarticle.repository

import com.hendisantika.springbootkotlinarticle.entity.Article
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kotlin-article
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-04
 * Time: 06:16
 */
interface ArticleRepository : JpaRepository<Article, Int>