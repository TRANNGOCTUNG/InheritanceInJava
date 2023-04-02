package has_a;

public class ShowHasA {
    public static void main(String[] args) {
        Address address = new Address("Hương Lung","Phú Thọ","ABC123");
        Student student = new Student(01,"John",address);
        System.out.printf("%5s %5s %6s %10s %10s \n","id","name","city","country","zipcode");
        student.getDisplay();
    }
}
