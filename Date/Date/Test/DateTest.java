import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void testGetMonth() {
    Date tester = new Date();
    assertEquals(1, tester.getMonth());
  }

  //monthOk
  @Test
  void testEqualsObject() {
    Date tester = new Date();
    assertEquals(true, tester.monthOK("January"));
  }

  //monthString
  @Test
  void testToString() {
    Date tester = new Date();
    assertEquals("January", tester.monthString(1));
  }
}
