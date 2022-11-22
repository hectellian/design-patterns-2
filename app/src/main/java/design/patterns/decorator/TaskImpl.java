package design.patterns.decorator;

public class TaskImpl implements TaskUI{
    @Override
    public void draw() {
        System.out.println("Task");
    }

    @Override
    public String getDescription() {
        return "Task";
    }
}
