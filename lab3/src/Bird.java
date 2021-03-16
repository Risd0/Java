public abstract class Bird {
    protected String name;

    protected Bird() {
        name = "Bird";
    }

    public abstract void Eat();

    public void Move() {
        System.out.println(name + " flew off the ground!");
    }

    public void setName(String value) {
        name = value;
    }

    public String getName() {
        return name;
    }
}