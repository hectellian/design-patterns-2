package design.patterns.decorator;

/**
 * Decorator class for Task
 * allows us to dynamically add functionality and behavior to an object without affecting the behavior of other existing objects within the same class. We use inheritance to extend the behavior of the class. This takes place at compile-time, and all the instances of that class get the extended behavior.
 * Implementing the Task UI so that we can add colors or other features when task is urgent or important
 */
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
