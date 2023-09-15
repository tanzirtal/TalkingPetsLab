package lab;

public abstract class Pets {

    private String name; //field

    public Pets(String name) { //constructor
        this.name = name;
    }

    public String getName() { //getter
        return name;
    }

    public void setName(String name) { //setter
        this.name = name;
    }

    public abstract String speak(); //speak method, will pass what the animal says through here
    public abstract String species(); //species method, will pass the type of animal through here

}
