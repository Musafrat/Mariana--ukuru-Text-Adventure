import java.util.Scanner;
public class ort {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input1;
        int input2;
        System.out.println("iki sayı giriniz: ");
        input1 = scan.nextInt();
        input2 = scan.nextInt();
        if (input1 > 0 && input2 > 0){
            int toplam = input1 + input2;
            System.out.println(toplam/2);
        }else {
            System.out.println("lütfen pozitif ve sıfırdan büyük bir sayı giriniz");
        }
    }
}
