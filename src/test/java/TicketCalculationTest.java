import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketCalculationTest {
    private static final TicketCalculation ticketCalculation = new TicketCalculation();

    @Test
    @DisplayName("(-1, -1)")
    void testcase1(){
        int age = -1;
        int distance = -1;
        String expected = "Invalid";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> ticketCalculation.calculateTicketPrice(age, distance));
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(-1, 10)")
    void testcase2(){
        int age = -1;
        int distance = 10;
        String expected = "Invalid";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> ticketCalculation.calculateTicketPrice(age, distance));
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(-1, 70)")
    void testcase3(){
        int age = -1;
        int distance = 70;
        String expected = "Invalid";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> ticketCalculation.calculateTicketPrice(age, distance));
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(-1, 190)")
    void testcase4(){
        int age = -1;
        int distance = 190;
        String expected = "Invalid";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> ticketCalculation.calculateTicketPrice(age, distance));
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(3, -1)")
    void testcase5(){
        int age = 3;
        int distance = -1;
        String expected = "Invalid";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> ticketCalculation.calculateTicketPrice(age, distance));
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(3, 10)")
    void testcase6(){
        int age = 3;
        int distance = 10;
        double expected = 5;
        double actual = ticketCalculation.calculateTicketPrice(age, distance);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(3, 70)")
    void testcase7(){
        int age = 3;
        int distance = 70;
        double expected = 9;
        double actual = ticketCalculation.calculateTicketPrice(age, distance);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(3, 190)")
    void testcase8(){
        int age = 3;
        int distance = 190;
        double expected = 12;
        double actual = ticketCalculation.calculateTicketPrice(age, distance);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(15, -1)")
    void testcase9(){
        int age = 15;
        int distance = -1;
        String expected = "Invalid";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> ticketCalculation.calculateTicketPrice(age, distance));
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(15, 10)")
    void testcase10(){
        int age = 15;
        int distance = 10;
        double expected = 7;
        double actual = ticketCalculation.calculateTicketPrice(age, distance);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(15, 70)")
    void testcase11(){
        int age = 15;
        int distance = 70;
        double expected = 11;
        double actual = ticketCalculation.calculateTicketPrice(age, distance);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(15, 190)")
    void testcase12(){
        int age = 15;
        int distance = 190;
        double expected = 14;
        double actual = ticketCalculation.calculateTicketPrice(age, distance);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(32, -1)")
    void testcase13(){
        int age = 15;
        int distance = -1;
        String expected = "Invalid";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> ticketCalculation.calculateTicketPrice(age, distance));
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(32, 10)")
    void testcase14(){
        int age = 32;
        int distance = 10;
        double expected = 9;
        double actual = ticketCalculation.calculateTicketPrice(age, distance);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(32, 70)")
    void testcase15(){
        int age = 32;
        int distance = 70;
        double expected = 13;
        double actual = ticketCalculation.calculateTicketPrice(age, distance);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("(32, 190)")
    void testcase16(){
        int age = 32;
        int distance = 190;
        double expected = 16;
        double actual = ticketCalculation.calculateTicketPrice(age, distance);
        assertEquals(expected, actual);
    }
}