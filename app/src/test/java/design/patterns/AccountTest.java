package design.patterns;

import design.patterns.flyweight.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println(">>> Starting AccountTest");
    }

    @Test
    @DisplayName("Account Factory")
    void testAccountFactory() {
        AccountImpl account1 = (AccountImpl)AccountFactory.getAccount("User", "user1");
        AccountImpl account2 = (AccountImpl)AccountFactory.getAccount("User", "user2");
        AccountImpl account3 = (AccountImpl)AccountFactory.getAccount("Enterprise", "user3");
        AccountImpl account4 = (AccountImpl)AccountFactory.getAccount("Enterprise", "user4");

        assertAll("Account Factory",
            () -> assertEquals("User", account1.getType()),
            () -> assertEquals("user1", account1.getUsername()),
            () -> assertEquals("User", account2.getType()),
            () -> assertEquals("user2", account2.getUsername()),
            () -> assertEquals("Enterprise", account3.getType()),
            () -> assertEquals("user3", account3.getUsername()),
            () -> assertEquals("Enterprise", account4.getType()),
            () -> assertEquals("user4", account4.getUsername()),
            () -> assertEquals("Account [User]: Username: user1 Subscription: false", account1.getInfo())
        );
    }

    @Test
    @DisplayName("Account Factory Same Account")
    void testAccountFactorySameAccount() {
        AccountImpl account1 = (AccountImpl)AccountFactory.getAccount("User", "user1");
        AccountImpl account2 = (AccountImpl)AccountFactory.getAccount("User", "user1");

        assertSame(account1, account2);
    }

    @Test
    @DisplayName("Account Factory Different Account")
    void testAccountFactoryDifferentAccount() {
        AccountImpl account1 = (AccountImpl)AccountFactory.getAccount("User", "user1");
        AccountImpl account2 = (AccountImpl)AccountFactory.getAccount("Enterprise", "user2");

        assertNotSame(account1, account2);
    }
}
