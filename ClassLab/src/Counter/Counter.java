package Counter;

public class Counter {
    public static void main(String[] args) {
        Model m = new Model();
        Controller c = new Controller(m);
        View v = new View(c);
    }
}
