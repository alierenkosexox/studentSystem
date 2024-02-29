public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("İlber Ortaylı", "TRH", "5341234567");
        Teacher t2 = new Teacher("Cahit Arf", "MAT", "5351234567");
        Teacher t3 = new Teacher("Albert Einstein","FZK","5361234567");

        Course tarih = new Course("Tarih", "101", "TRH", t1);
        tarih.addTeacher(t1);

        Course matematik = new Course("Matematik", "102", "MAT",t2);
        matematik.addTeacher(t2);

        Course fizik = new Course("Fizik","103","FZK",t3);
        fizik.addTeacher(t3);

        Student s1 = new Student("Ali Eren", "284", "4",tarih,matematik,fizik);
        s1.addBulkExamNote(100,80,92);
        s1.isPass();
    }

}
