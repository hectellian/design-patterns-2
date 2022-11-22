/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package design.patterns;
import design.patterns.decorator.*;
import design.patterns.flyweight.*;
import design.patterns.template.*;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        // Decorator
        TaskUI taskUI = new TaskImpl();
        System.out.println("Task:");
        taskUI.draw();

        System.out.println("Urgent Decorator Task:");
        TaskDecorator urgentTaskDecorator = new UrgentTaskDecorator(taskUI);
        urgentTaskDecorator.draw();

        System.out.println("Overdue Decorator Task:");
        TaskDecorator overdueTaskDecorator = new OverdueTaskDecorator(taskUI);
        overdueTaskDecorator.draw();

        // Flyweight;
        for(int i=0; i < 10; ++i) {
            AccountImpl account = (AccountImpl)AccountFactory.getAccount(getRandomType(), getRandomUsername());
            account.setPremium(getRandomPremium());
            account.display();
        }

        // Template
        Reward reward = new Thanks();
        reward.reward();
        reward = new Coupon();
        reward.reward();

    }

    private static final String types[] = { "User", "Enterprise"};
    private static final String usernames[] = { "user1", "user2", "user3", "user4", "user5"};

    private static String getRandomUsername() {
        Random random = new Random();
        int index = random.nextInt(usernames.length);
        return usernames[index];
    }

    private static String getRandomType() {
        Random random = new Random();
        int index = random.nextInt(types.length);
        return types[index];
    }

    private static Boolean getRandomPremium() {
        return new Random().nextBoolean();
    }

}
