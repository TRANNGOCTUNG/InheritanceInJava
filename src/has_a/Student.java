package has_a;

public class Student {
    private int id;
    private String name;
    Address address;

    public Student() {
    }

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    void getDisplay(){
        System.out.printf("%5s %5s %10s %10s %10s  \n",id,name,address.city,address.country,address.zipcode);
    }
}
