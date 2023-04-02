package animal;

public class Hippo extends Animal{

    public Hippo() {

    }

//    public Hippo(String makeNoise, String eat, String sleep, String roam) {
//        super(makeNoise, eat, sleep,roam);
//    }

    @Override
    public String getMakeNoise() {
        return "MakeNoise : Goa goa";
    }
    @Override
    public String getEat(){
        return "Eat : Grass";
    }

    @Override
    public String toString() {
        return  getMakeNoise() +
                 getEat() ;
    }
}
