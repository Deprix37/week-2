public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name, double salary, int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }
    //Vergi miktarını hespladım
    public double tax() {
        if (this.salary < 1000) {
            return 0;
        }

        else {

            return this.salary *0.03;
        }

    }
    // bonus hesabı
    public double bonus(){
        if (this.workHours>40){
            int minusHours;
            minusHours = workHours-40;
            return minusHours * 30;
        }
        return 0;

    }
    // maaş artışı hesabı
    public double raiseSalary(){
        int year = 2021;
        double totalArtis;
        if((year- this.hireYear) <10 ){

            totalArtis = this.salary * 1.05;
            return totalArtis - this.salary;
        }else if((year-this.hireYear) >9 && ((year-this.salary)<20)){
            totalArtis=  this.salary * 1.10;
            return totalArtis - this.salary;
        }
        else if (year-this.salary>19){
            totalArtis =  this.salary * 1.15;
            return  totalArtis - this.salary;
        }

        return  0;

    }

    // ekrana yazdırma metodum
    @Override
    public String toString() {
        double totalSalary = this.salary + bonus() + raiseSalary() - tax();
        return ("Adı: " + this.name + "\n" + "Maaşı: " + this.salary + "\n" + "Çalışma saati: "  + this.workHours+ "\n" +"Başlangıç Yılı : " + this.hireYear
                + "\n" + "Vergi: " + tax() + "\n" +  "Bonus: " + bonus() + "\n"
                + " Maaş artışı: " + this.raiseSalary() + "\n" + "Vergi ve bonuslar ile birlikte maaş: " +  (this.salary +  bonus() - tax() )+ "\n"
                + "Toplam maaş: " + totalSalary);
    }
}