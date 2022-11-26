package design.patterns.template;

/**
* In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods. Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class. This pattern comes under behavior pattern category.
* We implemented the Reward system so that all the rewards can be used the same.
*/
public abstract class Reward {
    public abstract String receive();
    public abstract String claim();
    public abstract String use();

    public final void reward() {
        receive();
        claim();
        use();
    }
}
