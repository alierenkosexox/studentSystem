public class Student {
    Course tarih;
    Course matematik;
    Course fizik;
    String name;
    String studentNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.tarih = tarih;
        this.matematik = matematik;
        this.fizik = fizik;
        this.avarage = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.tarih.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.matematik.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.fizik.note = note3;
        }
    }
    
    void isPass() {
        this.avarage = (this.tarih.note + this.matematik.note + this.fizik.note) / 3.0;
        if (this.avarage > 55) {
            System.out.println("Sınıfı Geçtiniz ");
        } else {
            System.out.println("Sınıfta kaldınız . Yıl tekrarı.");
        }
        printNote();
    }

    void printNote() {
        System.out.println(tarih.name + "Notu      :" + tarih.note);
        System.out.println(matematik.name + "Notu  :" + matematik.note);
        System.out.println(fizik.name + "Notu      :" + fizik.note);
        System.out.println("Ortalamanız : " + this.avarage);
    }
}
