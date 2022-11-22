package design.patterns.template;

public class Thanks extends Reward {
    @Override
    public String receive() {
        System.out.println("Thanks received");
        return "Thanks received";
    }

    @Override
    public String claim() {
        System.out.println("Thanks claimed");
        return "Thanks claimed";
    }

    @Override
    public String use() {
        System.out.println("Thanks used to buy reward");
        return "Thanks used to buy reward";
    }
}
