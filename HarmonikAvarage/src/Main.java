public class Main {
    public static void main(String[] args) {

        double numbers[]={1,2,3,4,5};
        double harmonik = 0;
        for(int i = 1; i<numbers.length;i++){
            harmonik +=(1/numbers[i]);
        }
        double avarage = harmonik/numbers.length;
        System.out.println(avarage);
    }
}