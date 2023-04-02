package animal;

public class Wolf extends Canine {
    public Wolf() {
    }
    @Override
    public String getMakeNoise() {
        return "MakeNoise : Hú Hú ";
    }
    @Override
    public String getEat(){
        return "Eat : Chicken";
    }
    public String toString() {
        return getMakeNoise() +
                getEat();
    }
}
