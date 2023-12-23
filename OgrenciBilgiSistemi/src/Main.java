public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "055");
        Teacher t2 = new Teacher("Grahan Bell", "FZK","0000");
        Teacher t3 = new Teacher("Kül yutmaz", "BIO", "111");

        Course tarih = new Course("Tarih", "101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101", "BIO");


        Student s1 = new Student("İnek Şaban", "123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(88,78,50);
        s1.addBulkExamSozlu(75,54,90);
        s1.isPass();

        Student s2 = new Student("Güdük necmi" , "444", "4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,70);
        s2.addBulkExamSozlu(50,30,70);
        s2.isPass();

    }
}