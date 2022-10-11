package lab_09;

public class Animal {
    private String name;
    private int speed;
    private boolean wings;

    protected Animal(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.wings = builder.wings;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWings() {
        return wings;
    }

    public static class Builder {
        private String name;
        private int speed;
        private boolean wings;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setWings(boolean wings) {
            this.wings = wings;
            return this;
        }

        public Animal builder() {
            return new Animal(this);
        }
    }
}
