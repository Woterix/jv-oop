package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Excavator is starting to work");
    }

    @Override
    public void stopWork() {
        System.out.println("The Excavator is stopping");
    }
}
