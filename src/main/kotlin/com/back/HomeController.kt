package com.back

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    @GetMapping("/")
    fun main(): String {
        return "배포테스트 Hello LHM"
    }
}