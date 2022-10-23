package com.apart4u

import com.apart4u.entity.Tesst
import com.apart4u.repository.TestRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class Apart4uApplicationTests {


    @Autowired
    lateinit var  testRepository: TestRepository

    @Test
    fun contextLoadssd() {
        val test = Tesst(
            sd = "dg"
        )

        testRepository.save(test)
    }

}
