public class Main {
    static  boolean isPalindrom(int number){

        // kontrol edilen sayını temp değişkenimde işleme alacağım
        int temp = number, lastNumber, reverseNumber=0;
        // asdasd
        while (temp!=0){
            lastNumber = temp % 10;  // sayının son hanesini buluyurorum
            reverseNumber = (reverseNumber * 10) + lastNumber; //son haneyi basa atıp her seferinde 0 ekliyorum
            temp /=10; // tep değişkenimi bir sonarki döngüye alıp her defasında sıfır olana kadar 10 a bölüyorum
        }
        if (reverseNumber==number)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(101));
    }
}