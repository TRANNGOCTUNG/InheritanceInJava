package animal;

public class Dog extends Canine {
    private String chaseCat;

    public Dog() {
        chaseCat = "Run run";
    }

    public Dog(String chaseCat) {
        this.chaseCat = chaseCat;
    }

    public String getChaseCat() {
        return chaseCat;
    }

    public void setChaseCat(String chaseCat) {
        this.chaseCat = chaseCat;
    }
    @Override
    public String getMakeNoise(){
        return "MakeNoise : Go go ";
    }
    @Override
    public String getEat(){
        return "Eat : Rise";
    }
    public String toString(){
        return  getChaseCat() +
                 getEat() +
                 getChaseCat();

    }
}
