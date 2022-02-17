package badcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegisterBusinessTest {

    @Test
    @DisplayName("ข้อมูล speaker = null จะโยน runtime exception  กลับมา "+"พร้อมกับ message speaker is null")
    public void register() {
        RegisterBusiness business = new RegisterBusiness();

        // assert exception with JUnit 5
        Exception exception= assertThrows(RuntimeException.class, ()-> {
            business.register(null,null);
        });

        assertEquals("speaker is null", exception.getMessage());
    }
}