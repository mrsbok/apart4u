package com.apart4u.repository


import com.apart4u.entity.CommunityClassBase
import com.apart4u.entity.Tesst
import org.springframework.data.jpa.repository.JpaRepository


interface CommunityClassBaseRepository  : JpaRepository<CommunityClassBase, Long> {
}