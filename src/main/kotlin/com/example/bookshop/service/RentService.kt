package com.example.bookshop.service

import com.example.bookshop.entity.Rent
import com.example.bookshop.repository.RentRepository
import org.springframework.stereotype.Service

@Service
class RentService(private val rentRepository: RentRepository) {
    fun listAllRents(): List<Rent> = rentRepository.findAll()
}
