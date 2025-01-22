package com.example.bookshop.controller

import com.example.bookshop.service.RentService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/rents")
class RentController(private val rentService: RentService) {
    @GetMapping
    fun listRents() = rentService.listAllRents()
}
