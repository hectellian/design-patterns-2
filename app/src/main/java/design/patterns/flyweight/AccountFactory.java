package design.patterns.flyweight;

import java.util.HashMap;

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
