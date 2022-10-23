package com.apart4u.entity


import javax.persistence.*


@Entity
@Table(name ="test")
data class Tesst(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq")
    val seq : Long? = null,


    val tt: String? = null,

    val sd: String




)
