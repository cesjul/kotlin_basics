import expections.stringIsNumber
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assumptions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.fail

class StringIsNumberTest {
    @Test
    @DisplayName("Test whether string has a number or not")
    fun testStringIsNumber(){
        Assertions.assertAll(
            {Assertions.assertTrue(stringIsNumber("1"))},
            {Assertions.assertFalse(stringIsNumber("j"))},
            {Assertions.assertFalse(stringIsNumber(""))}
        )
    }

    @Test
    @Disabled
    fun toBeImplemented(){

    }

    @Test
    fun willFail(){
        fail("This test will fail")
    }

    @Test
    fun conditionalTest(){
        Assumptions.assumeTrue(stringIsNumber("1"))

        Assertions.assertFalse { stringIsNumber("i") }
    }

    @Test
    fun throws(){
        assertThrows<NotImplementedError> { throw NotImplementedError("") }
    }

    @Test
    fun notNull(){
        Assertions.assertNotNull(stringIsNumber("1"))
    }
}