package com.apart4u.entity
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name ="community_use_register")
data class CommunityUseRegister(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx")
    val idx : Long? = null,


    val dongNo: String,


    val hoNo: String,


    val userIndex: Int,


    val userName: String,
    @Column(length = 20)
    val commClassId: Int,

    val commUseType: Int,

    val commUseStartDate: LocalDate,

    val commUseEndDate: LocalDate,

    val commUseStartTime: Int,
    val commUseEndTime: Int,
    val commUseCost: Int,
    val couponUsed: Int,
    val totalPayAmount: Int,
    val commUseCostPayment: Int,
    val commUseRegDate: LocalDateTime,
    val commUseRegState: Int,
    val commUseApprovalDate: LocalDateTime,
    val commUseCancelDate: LocalDateTime,
    val commUseCancelState: Int,
    val commUseCancelApproval: LocalDateTime,
    @Column(length = 512)
    val notApprovalReason: String,
    val commUseStopDate: LocalDate,




)
