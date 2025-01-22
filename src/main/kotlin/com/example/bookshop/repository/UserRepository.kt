package com.example.bookshop.repository

import com.example.bookshop.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>
