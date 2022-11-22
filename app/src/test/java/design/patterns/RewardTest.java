package design.patterns;

import design.patterns.template.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class RewardTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println(">>> Starting RewardTest");
    }

    @Test
    @DisplayName("Coupon")
    void testCoupon() {
        Reward reward = new Coupon();
        assertEquals("Coupon received", reward.receive());
        assertEquals("Coupon claimed", reward.claim());
        assertEquals("Coupon used on next purchase", reward.use());
    }

    @Test
    @DisplayName("Thanks")
    void testThanks() {
        Reward reward = new Thanks();
        assertEquals("Thanks received", reward.receive());
        assertEquals("Thanks claimed", reward.claim());
        assertEquals("Thanks used to buy reward", reward.use());
    }

    @AfterAll
    static void afterAll() {
        System.out.println(">>> Finished RewardTest");
    }
}
