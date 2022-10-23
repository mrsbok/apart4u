package com.apart4u.entity
import javax.persistence.*

@Entity
@Table(name ="community_class_open_days")
data class CommunityClassOpenDays(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq")
    val seq : Long? = null,

    val openDays: Long,

    val operatingStart: Long,

    val operatingClose: Long,

    val closedDateType: Long,

    val closedWeek: Long,

    val closedDate: Long
)
