package java_exo_test;

import java_exo_test.bank.BankAccount;
import java_exo_test.bank.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    private Client majorClient;
    private Client minorClient;

    @BeforeEach
    void beforeEach() {
        this.majorClient = new Client(20);
        this.majorClient.getBankAccount().push(80);

        this.minorClient = new Client(17);
        this.minorClient.getBankAccount().push(80);
    }

    @Test
    void should_be_major() {
        assertTrue(this.majorClient.getClientInfo().isMajor());
    }

    @Test
    void should_be_not_major() {
        assertFalse(this.minorClient.getClientInfo().isMajor());
    }

    @Test
    void should_be_default_balance() {
        assertEquals(80, this.majorClient.getBankAccount().getBalance());
        assertEquals(80, this.minorClient.getBankAccount().getBalance());
    }

    @Test
    void should_not_add_negative_amount() {
        this.majorClient.getBankAccount().push(-30);
        assertEquals(80, this.majorClient.getBankAccount().getBalance());

        this.minorClient.getBankAccount().push(-40);
        assertEquals(80, this.minorClient.getBankAccount().getBalance());
    }

    @Test
    void balance_should_be_increased() {
        this.majorClient.getBankAccount().push(20);
        assertEquals(100, this.majorClient.getBankAccount().getBalance());

        this.minorClient.getBankAccount().push(40);
        assertEquals(120, this.minorClient.getBankAccount().getBalance());
    }

    @Test
    void balance_should_be_decreased() {
        this.majorClient.getBankAccount().pull(20);
        assertEquals(60, this.majorClient.getBankAccount().getBalance());

        this.minorClient.getBankAccount().pull(40);
        assertEquals(40, this.minorClient.getBankAccount().getBalance());
    }

    @Test
    void balance_must_be_negative() {
        this.majorClient.getBankAccount().pull(90);
        assertEquals(-10, this.majorClient.getBankAccount().getBalance());
    }

    @Test
    void balance_must_not_be_negative() {
        double money = this.minorClient.getBankAccount().pull(90);
        assertEquals(0, money);
        assertEquals(80, this.minorClient.getBankAccount().getBalance());
    }

    @Test
    void balance_must_be_max_negative() {
        double money = this.majorClient.getBankAccount().pull(580);
        assertEquals(BankAccount.MAX_NEG_BALANCE, this.majorClient.getBankAccount().getBalance());
        assertEquals(580, money);
    }

    @Test
    void pull_must_be_impossible() {
        this.majorClient.getBankAccount().pull(580);
        assertEquals(0, this.majorClient.getBankAccount().pull(100));
    }
}
