package com.apart4u.repository


import com.apart4u.entity.Tesst
import org.springframework.data.jpa.repository.JpaRepository


interface TestRepository  : JpaRepository<Tesst, Long> {
}