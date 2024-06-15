package Counter;

public class Controller {
    Model m;

    public Controller(Model m){
        this.m = m;
        this.m.setCount(0);
    }

    public int increment(){
        m.setCount(m.getCount() + 1);
        return m.getCount();
    }

    public int decrement(){
        m.setCount(m.getCount() -1);
        return m.getCount();
    }
}
