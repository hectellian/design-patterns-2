package design.patterns.decorator;

public class UrgentTaskDecorator extends TaskDecorator {
    public UrgentTaskDecorator(TaskUI taskUI) {
        super(taskUI);
    }

    @Override
    public void draw() {
        System.out.print("Urgent ");
        super.draw();
    }

    @Override
    public String getDescription() {
        return "Urgent " + super.getDescription();
    }
}
