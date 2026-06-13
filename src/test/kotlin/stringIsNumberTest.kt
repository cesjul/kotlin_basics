import expections.stringIsNumber
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

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
}