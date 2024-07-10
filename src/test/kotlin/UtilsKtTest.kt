import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import utils.*

class UtilsKtTest {

    @Test
    fun `test toIntList`() {
        val input = """
            1721
            979
            366
            299
            675
            1456
        """
        assertEquals(listOf(1721, 979, 366, 299, 675, 1456), input.toIntList())
    }
}