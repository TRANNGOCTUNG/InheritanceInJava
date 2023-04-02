package animal;

public class Tiger extends Feline {
    public Tiger() {
    }
    @Override
    public String getMakeNoise(){
        return "MakeNoise: Khừ Khừ";
    }
    @Override
    public String getEat(){
        return "Eat: Meat";
    }
    public String toString() {
        return getMakeNoise() +
               getEat() ;
    }


}
