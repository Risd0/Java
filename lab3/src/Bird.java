public abstract class Bird {
    private String name;

    public Bird() {
        name = "Bird";
    }

    public abstract void Eat();

    public void Move() {
        System.out.println(name + " Let's fly off the ground!");
    }

    public void setName(String value) {
        name = value;
    }

    public String getName() {
        return name;
    }
}