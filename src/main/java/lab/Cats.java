package lab;

public class Cats extends Pets {
  public Cats(String name){
      super(name);
  }
    @Override
    public String species() {
        return "cat";
    }
    @Override
    public String speak() {
        return "MEOWWWWWW";
    }
}
