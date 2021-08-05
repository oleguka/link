package ru.wargen.link.model

import com.github.springtestdbunit.DbUnitTestExecutionListener
import org.springframework.test.context.TestExecutionListeners
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.DirtiesContext
import ru.wargen.link.LinkApplication

@TestExecutionListeners(DbUnitTestExecutionListener::class)
@SpringBootTest(classes = [LinkApplication::class])
@DirtiesContext
abstract class AbstractRepositoryTest: AbstractJUnit4SpringContextTests() {
}