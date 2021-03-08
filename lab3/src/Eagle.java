public class Eagle extends Bird {
    private String name;

    public Eagle() {
        name = "Eaglet";
    }

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public void Eat() {
        System.out.println(name + " used eating skill!");
    }

    @Override
    public void Move() {
        super.Move();
        System.out.println(name + " changed its position");
    }
}