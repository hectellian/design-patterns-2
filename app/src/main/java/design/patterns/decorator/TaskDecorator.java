package design.patterns.decorator;

public abstract class TaskDecorator {
    protected TaskUI taskUI;

    public TaskDecorator(TaskUI taskUI) {
        this.taskUI = taskUI;
    }

    public void draw() {
        taskUI.draw();
    }

    public String getDescription() {
        return taskUI.getDescription();
    }
}
