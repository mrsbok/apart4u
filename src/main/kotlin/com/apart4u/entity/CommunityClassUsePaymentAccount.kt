package com.apart4u.entity
import javax.persistence.*

@Entity
@Table(name ="community_class_use_payment_account")
data class CommunityClassUsePaymentAccount(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx")
    val idx : Long? = null,

    @Column(length = 32)
    val bankName: String,

    @Column(length = 16)
    val bankAccount : String,

    @Column(length = 32)
    val owner: String,

    @Column(length = 128)
    val description: String

)
