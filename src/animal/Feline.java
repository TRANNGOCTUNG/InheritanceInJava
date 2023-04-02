package animal;

public class Feline extends Animal{
    public Feline() {
    }

//    public Feline(String makeNoise, String eat, String sleep, String roam) {
//        super(makeNoise, eat, sleep,roam);
//    }

    @Override
    public String getRoam(){
        return "roam : Walk";
    }

    @Override
    public String toString() {
        return getRoam();
    }
}
