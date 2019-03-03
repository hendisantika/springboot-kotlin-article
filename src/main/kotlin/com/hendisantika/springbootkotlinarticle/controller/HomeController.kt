package com.hendisantika.springbootkotlinarticle.controller

import com.hendisantika.springbootkotlinarticle.entity.Article
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

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
    @RequestMapping(value = "/")
    fun default(): String {
        return "home"
    }

    @RequestMapping(value = "/home")
    fun home(): String {
        return "home"
    }

    @RequestMapping(value = "/login")
    fun login(): String {
        return "login"
    }


    @RequestMapping(value = "/addArticle")
    fun addArticle(model: Model): String {
        model.addAttribute("article", Article())
        return "addArticle"
    }

    @RequestMapping(value = "/search")
    fun searchArticle(): String {
        return "search"
    }

    @RequestMapping(value = "/delete")
    fun deleteArticle(): String {
        return "delete"
    }
}
