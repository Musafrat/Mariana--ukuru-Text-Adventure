import java.util.Scanner;
public class fibonacci {
    //2.yöntem bu direk yazılan sayının tekabül ettigi degeri verir
    static int fibo(int n) {

    if (n == 1 || n == 2) {
        return 1;

    } return fibo(n - 1) + fibo(n - 2);

}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayı1 = 0;
        int sayı2 = 1;
        int input;
        int toplam;
        System.out.println("bir sayı giriniz: ");
        input = scan.nextInt();
        int n = input;
        System.out.println(input + "fibonacci");
        System.out.println(fibo(n));
        for (int i = 1;i <input;i++) {
            System.out.print(sayı1 + " , ");
            toplam = sayı1 + sayı2;
            sayı1 = sayı2;
            sayı2 = toplam;
        }

    }
}
