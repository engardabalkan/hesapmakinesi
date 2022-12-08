import java.util.Scanner;

public class Hesapmakinesi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz:");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz:");
        select = input.nextInt();

        System.out.println(select);

        switch (select) {
            case 1:
                System.out.print("Girilen sayıların toplamı:" + (n1 + n2));
                break;
            case 2:
                System.out.print("Girilen sayıların çıkarması:" + (n1 - n2));
                break;
            case 3:
                System.out.print("Girilen sayıların çarpımı:" + (n1 * n2));
                break;
            case 4:
                switch ((int)n2){
                    case 0: System.out.print("Sayı sıfıra bölünemez");
                break;
                    default:
                        System.out.println("Girilen sayıların bölümü:" + (n1 / n2));
                }
            default:
                System.out.println("Yanlış seçim yapıldı.");
                break;
        }


    }
}