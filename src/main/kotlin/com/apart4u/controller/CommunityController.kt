package com.matching.main.controller


import com.apart4u.entity.CommunityClassBase
import com.matching.main.service.CommunityClassBaseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("test")
class CommunityController {


    @Autowired
    lateinit var communityClassBaseService: CommunityClassBaseService

    @PostMapping("/comm-base-save")
    fun save(@RequestBody communityClassBase: CommunityClassBase) {

        kotlin.runCatching {
            //쿼리실행
            communityClassBaseService.save(communityClassBase)
        }.onFailure {
            it.printStackTrace()
        }.onSuccess {
            println(it)
        }

    }





}
