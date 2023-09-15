package lab;

public class Dogs extends Pets{
    public Dogs(String name){
        super(name);
    }
    @Override
    public String species() {
        return "dog";
    }
    @Override
    public String speak() {
        return "BARK BARK";
    }
}
