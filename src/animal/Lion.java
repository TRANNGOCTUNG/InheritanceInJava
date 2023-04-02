package animal;

public class Lion extends Feline {
    public Lion() {
    }
    @Override
    public String getMakeNoise(){
        return "MakeNoise: Gừ Gừ";
    }
    @Override
    public String getEat(){
        return "Eat: Meat";
    }
    public String toString(){
        return getMakeNoise() +
                getEat() ;
    }
}
