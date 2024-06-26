package com.hendisantika.springbootkotlinarticle.controller

import com.hendisantika.springbootkotlinarticle.entity.Article
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kotlin-article
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-04
 * Time: 06:20
 */
@Controller
class HomeController {
    @GetMapping(value = ["/"])
    fun default(): String {
        return "home"
    }

    @GetMapping(value = ["/home"])
    fun home(): String {
        return "home"
    }

    @GetMapping(value = ["/login"])
    fun login(): String {
        return "login"
    }


    @GetMapping(value = ["/addArticle"])
    fun addArticle(model: Model): String {
        model.addAttribute("article", Article())
        return "addArticle"
    }

    @GetMapping(value = ["/search"])
    fun searchArticle(): String {
        return "search"
    }

    @GetMapping(value = ["/delete"])
    fun deleteArticle(): String {
        return "delete"
    }
}
