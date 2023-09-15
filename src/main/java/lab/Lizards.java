package lab;

public class Lizards extends Pets{
    public Lizards(String name){
        super(name);
    }
    @Override
    public String species() {
        return "lizard";
    }
    @Override
    public String speak() {
        return "We are your ssssscaly overlordssss";
    }
}
