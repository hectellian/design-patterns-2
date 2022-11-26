package design.patterns.flyweight;

import java.util.HashMap;

/**
* Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. This type of design pattern comes under structural pattern as this pattern provides ways to decrease object count thus improving the object structure of application.
* Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found.
* We implemented this on the account creation so it checks if the account already exists before creating one.
*/
public class AccountFactory {
    // @SuppressWarnings("unchecked")
    private static final HashMap<String, Account> accountMap = new HashMap<String, Account>();

    public static Account getAccount(String type, String username) {
        AccountImpl account = (AccountImpl)accountMap.get(username);

        if (account == null) {
            account = new AccountImpl(type, username);
            accountMap.put(username, account);
            System.out.println("Creating account: " + username);
        }
        return account;
    }
}
