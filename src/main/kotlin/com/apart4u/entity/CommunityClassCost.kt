package com.apart4u.entity
import javax.persistence.*

@Entity
@Table(name ="community_class_cost")
data class CommunityClassCost(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq")
    val seq : Long? = null,

    val useType: Long,

    val usePeriod: Long,

    val cost: Long,

    val cancelLimit: Long
)
