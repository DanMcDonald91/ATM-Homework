import static org.junit.Assert.assertEquals;
import org.junit.*;


 

public class CustomerTest {

  Customer customer;
  Atm atm;

  @Before
  public void before() {
    atm = new Atm(1000, 250, "Electric Avenue");
    customer = new Customer("Solomon", 25, 200);
  }


  @Test
  public void hasName(){
    assertEquals("Solomon", customer.getName());
  }

  @Test
  public void hasAge(){
    assertEquals(25, customer.getAge());
  }

  @Test
  public void hasWalletAmount(){
    assertEquals(0, customer.getWalletAmount());
  }

  @Test 
  public void canWithdrawCash() {
    customer.canWithdrawCash(50.atm);
    assertEquals(25, customer.getWalletAmount());
    assertEquals(950, atm.getCash());
  }
  
}