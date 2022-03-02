package ru.otus.okb.first

import org.junit.Test
import kotlin.test.assertEquals

class Test {
    @Test
    fun Test () {
        assertEquals(expected = 225, actual = Rasteniya.Bush().size)
    }
}