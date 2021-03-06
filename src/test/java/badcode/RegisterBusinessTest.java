package badcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegisterBusinessTest {

    @Test
    @DisplayName("ข้อมูล speaker = null จะโยน runtime exception  กลับมา "+"พร้อมกับ message speaker is null")
    public void case01() {
        RegisterBusiness business = new RegisterBusiness();

        // assert exception with JUnit 5
        Exception exception= assertThrows(RuntimeException.class, ()-> {
            business.register(null,null);
        });
        assertEquals("Speaker is null", exception.getMessage());
    }

    @Test
    @DisplayName("First name = null ดังนั้นจะ โยน argumentNullexception ออกมา " + "พร้อมกับคำว่า first name is required")
    public void case02() {
        RegisterBusiness business = new RegisterBusiness();
        Exception exception= assertThrows(ArgumentNullException.class, ()-> {
            business.register(null,new Speaker());
        });
       assertEquals("First name is required.",exception.getMessage());
    }

    @Test
    @DisplayName("Last name = null ดังนั้นจะ โยน argumentNullexception ออกมา " + "พร้อมกับคำว่า Last name is required.")
    public void case03() {
        RegisterBusiness business = new RegisterBusiness();

        Exception exception= assertThrows(ArgumentNullException.class, ()-> {
            Speaker speaker = new Speaker();
            speaker.setFirstName("jirawan");
            business.register(null, speaker);
        });
        assertEquals("Last name is required.",exception.getMessage());
    }

    @Test
    @DisplayName("Email = null ดังนั้นจะ โยน argumentNullexception ออกมา " + "พร้อมกับคำว่า Email is required.")
    public void case04() {
        RegisterBusiness business = new RegisterBusiness();

        Exception exception= assertThrows(ArgumentNullException.class, ()-> {
            Speaker speaker = new Speaker();
            speaker.setFirstName("jirawan");
            speaker.setLastName("chuapradit");
            business.register(null, speaker);
        });
        assertEquals("Email is required.",exception.getMessage());
    }

    @Test
    @DisplayName("Speaker doesn't meet our standard rules = null ดังนั้นจะ โยน argumentNullexception ออกมา " + "พร้อมกับคำว่า Speaker doesn't meet our standard rules.")
    public void case05() {
        RegisterBusiness business = new RegisterBusiness();
        Exception exception =  assertThrows(RuntimeException.class, () -> {
            Speaker speaker = new Speaker();
            speaker.setFirstName("jirawan");
            speaker.setLastName("chuapradit");
            speaker.setEmail("jirawan.c@kbtg.tech");
            business.register(null, speaker);
        });
        assertEquals("Speaker doesn't meet our standard rules.", exception.getMessage());
    }

    @Test
    @DisplayName("exp = null ดังนั้นจะ โยน argumentNullexception ออกมา " + "พร้อมกับคำว่า Can't save a speaker.")
    public void case06() {
        RegisterBusiness business = new RegisterBusiness();
        Exception exception =  assertThrows(RuntimeException.class, () -> {
            Speaker speaker = new Speaker();
            speaker.setFirstName("jirawan");
            speaker.setLastName("chuapradit");
            speaker.setEmail("jirawan.c@gmail.com");
            business.register(null, speaker);
        });
        assertEquals("Can't save a speaker.", exception.getMessage());
    }
}