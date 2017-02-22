import static org.junit.Assert.assertEquals;
import org.junit.*;


public class AtmTest {

  Atm atm;

  @Before
  public void before() {

    atm = new Atm(1000, 250, "Electric Avenue");
  }

  @Test
  public void hasCash() {
    assertEquals(1000, atm.getCash());
  }

  @Test
  public void hasMaxWithdraw() {
    assertEquals(250, atm.getMaximumWithdraw());
  }

  @Test
  public void hasLocation() {
  assertEquals("Electric Avenue", atm.getLocation());
     }


}
