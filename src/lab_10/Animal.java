package lab_10;

public abstract class Animal {
    private String name;
    private int speed;

    public Animal() {
    }
    public abstract String getName();
    public abstract int getSpeed();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
