package Counter;

// Lab 6: Using MVC architecture make a counter that increments and decrements number.
public class Counter {
    public static void main(String[] args) {
        Model m = new Model();
        Controller c = new Controller(m);
        View v = new View(c);
    }
}
