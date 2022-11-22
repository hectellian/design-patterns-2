package design.patterns.flyweight;

public class AccountImpl implements Account{
    private String type;
    private String username;
    private Boolean isPremium = false;

    public AccountImpl(String type, String username) {
        this.type = type;
        this.username = username;
    }

    @Override
    public String getInfo() {
        return "Account [" + type + "]: Username: " + username + " Subscription: " + isPremium;
    }

    public String getType() {
        return type;
    }

    public String getUsername() {
        return username;
    }

    public void setPremium(Boolean premium) {
        isPremium = premium;
    }

    @Override
    public void display() {
        System.out.println(getInfo());
    }
}
