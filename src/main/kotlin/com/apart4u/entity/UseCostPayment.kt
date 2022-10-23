package com.apart4u.entity
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name ="use_cost_payment")
data class UseCostPayment(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx")
    val idx : Long? = null,


    val transferType : Int? = null,

    @Column(length = 20)
    val transerUserName: String,

    val baseAmount : Int,

    val transferAmount: Int,

    val transferDate: LocalDate,

    @Column(length = 20)
    val personInCharge: String,

    val transferConfirmDate: LocalDate

)
