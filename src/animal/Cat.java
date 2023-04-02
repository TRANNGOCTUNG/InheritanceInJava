package animal;

public class Cat extends Feline {
    public Cat() {
    }
    @Override
    public String getMakeNoise(){
         return "MakeNoise : Meo Meo";
    }
    public String toString(){
        return  getMakeNoise();
    }
}
