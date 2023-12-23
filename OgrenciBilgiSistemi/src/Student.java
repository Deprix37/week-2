public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double avarage;
    double c1Avarage;
    double c2Avarage;
    double c3Avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1,Course c2, Course c3 ){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.c1Avarage = 0.0;
        this.c2Avarage= 0.0;
        this.c3Avarage = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3){
        if(note1>=0 && note1<=100){
            this.c1.note = note1;
        }
        if(note2>=0 && note2<=100){
            this.c2.note = note2;
        }
        if(note3>=0 && note3<=100){
            this.c3.note = note3;
        }
    }
    void addBulkExamSozlu(int sozlu1, int sozlu2, int sozlu3){
        if(sozlu1>=0 && sozlu1<=100){
            this.c1.sozlu = sozlu1;
        }
        if(sozlu2>=0 && sozlu2<=100){
            this.c2.sozlu = sozlu2;
        }
        if(sozlu3>=0 && sozlu3<=100){
            this.c3.sozlu = sozlu3;
        }

    }
    void isPass(){
        System.out.println("==================");
        this.c1Avarage = (this.c1.note *0.80) + (this.c1.sozlu*0.20);
        this.c2Avarage = (this.c2.note*0.80) + (this.c2.sozlu*0.20);
        this.c3Avarage = (this.c3.note*0.80) + (this.c3.sozlu*0.20);
        this.avarage = (this.c1Avarage + this.c2Avarage + this.c3Avarage)/3.0;
        if(this.avarage>55){
            System.out.println("Hababam Sınıfı Uyanıyor ! ");
            this.isPass=true;
        }else{
            System.out.println("Hababam Sınıfı, Sınıfta kaldı ! ");
            this.isPass = false;
        }
        printNote();
    }
    void printNote(){

        System.out.println(this.c1.name + " Notu: \t " + this.c1.note+ " " + this.c1.name +" Sözlüsü :\t " + " " +this.c1.sozlu + " Ortalaması: \t " + this.c1Avarage);
        System.out.println(this.c2.name + " Notu: \t " + this.c2.note +" " + this.c2.name +" Sözlüsü :\t " + " " +this.c2.sozlu + " Ortalaması: \t " + this.c2Avarage);
        System.out.println(this.c3.name + " Notu: \t " + this.c3.note +" " + this.c3.name +" Sözlüsü :\t " + " " +this.c3.sozlu + " Ortalaması: \t " + this.c3Avarage);
        System.out.println("Ortalamanız : " + this.avarage);
    }

}
