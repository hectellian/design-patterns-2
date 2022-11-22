package design.patterns.decorator;

public class OverdueTaskDecorator extends TaskDecorator {
    public OverdueTaskDecorator(TaskUI taskUI) {
        super(taskUI);
    }

    @Override
    public void draw() {
        System.out.print("Overdue ");
        super.draw();
    }

    @Override
    public String getDescription() {
        return "Overdue " + super.getDescription();
    }
}
