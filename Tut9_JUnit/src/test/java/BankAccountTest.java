import org.junit.*;

import static org.junit.Assert.*;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Runs once before all test methods");
    }

    @Before
    public void setUp() throws Exception {
        bankAccount = new BankAccount(20000.0);
    }

    @Test
    public void testWithdraw() {
        bankAccount.withdraw(300.0);
        Double expectedBalance = 19700.0;
        Double actualBalance = bankAccount.getBalance();
        assertTrue(expectedBalance.equals(actualBalance));
    }

    @Test
    public void testDeposit() {
        bankAccount.deposit(2000.0);
        Double expectedBalance = 22000.0;
        Double actualBalance = bankAccount.getBalance();
        assertEquals(expectedBalance,actualBalance);
    }

    @Test
    public void testGetBalance() {
        Double expectedBalance = bankAccount.getBalance();
        assertNotNull(expectedBalance);
    }

    @Test
    public void testSetBalance() {
        bankAccount.setBalance(3000.0);
        Double expectedBalance = 3000.0;
        Double actualBalance = bankAccount.getBalance();
        assertTrue(expectedBalance.equals(actualBalance));
    }

    @After
    public void tearDown() throws Exception {
        bankAccount = null;
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Runs once after all test methods");
    }
}