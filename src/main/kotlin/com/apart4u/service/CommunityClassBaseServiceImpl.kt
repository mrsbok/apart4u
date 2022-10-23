package com.apart4u.service

import com.apart4u.entity.CommunityClassBase
import com.apart4u.repository.CommunityClassBaseRepository
import com.matching.main.service.CommunityClassBaseService
import lombok.extern.log4j.Log4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
@Log4j
class BatchServiceImpl : CommunityClassBaseService {

    @Autowired
    lateinit var communityClassBaseRepository: CommunityClassBaseRepository

    override fun save(communityClassBase: CommunityClassBase) {
        communityClassBaseRepository.save(communityClassBase)
    }


}