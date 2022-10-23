package com.apart4u.entity
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name ="community_resident_coupon_amountq")
data class CommunityResidentCouponAmountQ(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx")
    val idx : Long? = null,


    val dongNo : Int? = null,

    val hoNo : Int,
    val year : Int,
    val month : Int,
    val givenCoupon : Int,

    val couponGrantDate : LocalDate,
    val usedCoupon : Int,

    val remainCoupon : Int,

    val expriedCoupon: Int,
    val expiredDate: LocalDate,


    )
