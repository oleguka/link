package ru.wargen.link


import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration

@TestPropertySource(locations = ["classpath:repositories-test.properties"])
@RunWith(SpringJUnit4ClassRunner::class)
@SpringBootTest(classes = [LinkApplication::class])
@WebAppConfiguration
class LinkApplicationTests {

    @Test
    fun contextLoads() {
    }

}