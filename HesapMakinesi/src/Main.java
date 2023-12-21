import java.util.Scanner;


public class Main {



    // Her işlem için fonksiyonlarımı yazıyorum
    static int sum(int a, int b){
        int result = a+b;
        System.out.println("Toplamları : " +result);
        return result;
    }

    static int minus(int a, int b){
        int result = a-b;
        System.out.println("Çıkarma : " + result);
        return result;
    }
    static int times(int a, int b){
        int result = a*b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divided(int a , int b){
        if(b==0){
            System.out.println("İkinci sayı 0/dan farklı olmalıdır");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme : " + result);
        return result;
    }
    static int power(int a, int b){
        int result = 1;
        for (int i =1; i<=b; i++){
            result*=a;
        }
        System.out.println("Üst işlemi : " + result);
        return result;
    }
    static int mod(int a, int b){
        return a % b;
    }
    static void calc(int a, int b){
        System.out.println("Çevresi : " + (2*(a+b)));
        System.out.println("Alanı : " + a*b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"+
                "2- Çıkarma İşlemi\n"+
                "3- Çarpma İşlemi\n"+
                "4- Bölme Hesaplama\n"+
                "5- Üslü Sayı İşlemi\n"+
                "6- Mod Alma\n"+
                "7- Dikdörtgen Alan ve Çevre\n"+
                "0- Çıkış Yap";
        System.out.println(menu);
        // kullanıcı işlemini seçyior 0 a basarsa döngü başlamadan biter.
        while (true){
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();
            if (select==0){
                break;
            }
            System.out.print("İlk sayıyı giriniz: ");
            int a = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int b = input.nextInt();
            // döngünü oluşturup fonksiyonlarımı çağırıyorum.
            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    System.out.println("Mod işlemi : " + mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz !");
            }
        }


        System.out.println("Güle Güle");
    }
}

