package com.example.bookshop.repository

import com.example.bookshop.entity.Rent
import org.springframework.data.jpa.repository.JpaRepository

interface RentRepository : JpaRepository<Rent, Long>
