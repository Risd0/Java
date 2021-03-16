public class Duck extends Bird {
    public Duck() {
        name = "Duckling";
    }

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void Eat() {
        System.out.println(name + " used eating skill!");
    }

    @Override
    public void Move() {
        super.Move();
        System.out.println(name + " decided to move...");
    }

}