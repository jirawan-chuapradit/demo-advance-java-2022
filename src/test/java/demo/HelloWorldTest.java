package demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    @DisplayName("เรากำลังทดสอบ Hello function ส่งJJ เข้าไป ต้องได้ Hello JJ")
    public void case01() {
        // Arrange, Given
        HelloWorld helloWorld =  new HelloWorld();
        // Act, When
        String actualResult = helloWorld.hi("JJ");
        // Assert/ verify, Then
        assertEquals("Hello JJ",actualResult);
    }



    @Test
    public void case02() {
    }
}