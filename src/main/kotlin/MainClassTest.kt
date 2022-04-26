import org.junit.Assert
import org.junit.Test

class MainClassTest {
    private val mainClass = MainClass()

    @Test
    fun testGetLocalNumber(){
        val result = mainClass.getLocalNumber()
        Assert.assertTrue("Expected: 14 but was: $result",result==14)
    }

    @Test
    fun testGetClassNumber(){
        val result = mainClass.getClassNumber()
        Assert.assertTrue("Expected: number <= 45 but was: $result",result>45)
    }

    @Test
    fun testGetClassString(){
        val substring = "Hello"
        val substring1 = "hello"
        val result = mainClass.getClassString()
        Assert.assertTrue("Expected: string contains $substring or $substring1 but was: $result",
            result.contains(substring) || result.contains(substring1))
    }
}
