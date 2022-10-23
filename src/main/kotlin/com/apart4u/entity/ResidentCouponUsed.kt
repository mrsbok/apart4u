package com.apart4u.entity
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name ="resident_coupon_used")
data class ResidentCouponUsed(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx")
    val idx : Long? = null,


    val dongNo : Int? = null,

    val hoNo : Int,

    val commUseRegIdx : Int,

    val couponUse: Int,


)
