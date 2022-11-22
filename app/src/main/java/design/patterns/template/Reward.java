package design.patterns.template;

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
