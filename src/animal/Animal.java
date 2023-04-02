package animal;

public class Animal {
     private String makeNoise;
     private String eat;
     private String sleep;
    private String roam;

    public Animal() {
        makeNoise = "woa woa";
        eat = "Pig";
        sleep = "Yes";
        roam = "fly";
    }

    public Animal(String makeNoise, String eat, String sleep, String roam) {
        this.makeNoise = makeNoise;
        this.eat = eat;
        this.sleep = sleep;
        this.roam = roam;
    }

    public String getMakeNoise() {
        return makeNoise;
    }

    public void setMakeNoise(String makeNoise) {
        this.makeNoise = makeNoise;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public String getRoam() {
        return roam;
    }

    public void setRoam(String roam) {
        this.roam = roam;
    }

    @Override
    public String toString() {
        return " Animal {" +
                " makeNoise = '" + makeNoise + '\'' +
                ", eat = '" + eat + '\'' +
                ", sleep = '" + sleep + '\'' +
                ", roam = '" + roam + '\'' +
                '}';
    }
}
