public class Teacher {
    String name;
    String phoneNumber;
    String branch;

    Teacher(String name, String branch, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;

    }

    void print() {
        System.out.println("Adı : " + this.name);
        System.out.println("Telefon No : " + this.phoneNumber);
        System.out.println("Bölümü : " + this.branch);
    }
}
