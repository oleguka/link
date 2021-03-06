package ru.wargen.link.service

import org.junit.Test
import kotlin.math.abs
import kotlin.random.Random

class DefaultKeyConverterServiceTest {

    val service: KeyConverterService = DefaultKeyConverterService()

    @Test
    fun givenIdMustBeConvertableBothWays() {
        val rand = Random
        for (i in 0..1000L) {
            val initialId = abs(rand.nextLong())
            val key = service.idToKey(initialId)
            val id = service.keyToId(key)
            org.junit.Assert.assertEquals(initialId, id)
        }
    }
}