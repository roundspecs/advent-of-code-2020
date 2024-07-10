import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class Day01KtTest {

    @Test
    fun part1() {
        val input = """
            1721
            979
            366
            299
            675
            1456
        """
        assertEquals(514579, part1(input))
    }

    @Test
    fun part2() {
        val input = """
            1721
            979
            366
            299
            675
            1456
        """
        assertEquals(241861950, part2(input))
    }
}