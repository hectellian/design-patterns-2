package design.patterns;

import design.patterns.decorator.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {
    TaskUI taskUI = new TaskImpl();

    @BeforeAll
    static void beforeAll() {
        System.out.println(">>> Starting DecoratorTest");
    }

    @Test
    @DisplayName("Simple Task")
    void testTask() {
        assertEquals("Task", taskUI.getDescription());
    }

    @Test
    @DisplayName("Overdue Task")
    void testOverdueTask() {
        TaskDecorator overdueTaskUI = new OverdueTaskDecorator(taskUI);
        assertEquals("Overdue Task", overdueTaskUI.getDescription());
    }

    @Test
    @DisplayName("Urgent Task")
    void testUrgentTask() {
        TaskDecorator urgentTaskUI = new UrgentTaskDecorator(taskUI);
        assertEquals("Urgent Task", urgentTaskUI.getDescription());
    }

    @AfterAll
    static void afterAll() {
        System.out.println(">>> Finished DecoratorTest");
    }
}
