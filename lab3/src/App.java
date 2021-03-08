import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<Bird>();
        birds.add(new Eagle("Bo"));
        birds.add(new Duck("Perry"));

        System.out.println("What birds are really like?");
        for (Bird bird : birds) {
            System.out.println("Name: " + bird.getName());
            bird.Eat();
            bird.Move();
            System.out.println();
        }
    }
}
