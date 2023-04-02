package animal;

public class Canine extends Animal{
    public Canine() {
    }
    @Override
    public String getRoam(){
        return "Canine : Run";
    }
    public String toString(){
        return getRoam();
    }
}
