package com.apart4u.entity
import javax.persistence.*

@Entity
@Table(name ="community_class_base")
data class CommunityClassBase(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq")
    val seq : Long? = null,

    @Column(length = 64)
    val name: String,

    @Column(length = 256)
    val description: String,


    val useTerm: Int,


    val useMax: Int,

    val costPayment: Int,

    val approvalType: Int,

    @Column(length = 256)
    val icon: String,

    @Column(length = 1024)
    val notice: String,

    val auto_rereg: Int,

    val type: Int,




)
