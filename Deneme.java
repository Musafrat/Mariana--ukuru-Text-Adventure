import java.util.Random;
import java.util.Scanner;

public class Deneme {
    static int oyuncuCanı = 100;
    static int canavarCanı = 150;
    static int iksirSayısı = 3;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Oyuncu karanlık bir zindanda karşına canavar çıktı");
        System.out.println("şavaşman lazım");
        int seçim;
        while (0<= oyuncuCanı && 0 <=canavarCanı ) {
            System.out.println("seçim yapınız: \n1-)normal saldırı (canavara kesin 20 hasar verir)  "+
                    "\n2-)riskli saldırı (şans faktörü devreye girer)" +
                    "\n3-)iksir iç (canı iyileştirir)" +
                    "\n4-)savaş alınıdan kaç (oyunu anında bitirir, canavar saldıramaz)");
            seçim = scan.nextInt();
            switch (seçim) {
                case 1:canavarCanı = canavarCanı -20;
                    System.out.println("canavara 20 hasar verildi canavar saglıgı: " + canavarCanı);break;
                case 2:risklisaldırı();break;
                case 3:iksiriç();break;
                case 4: System.out.println("kaçtın");System.exit(0);break;
            }
            if (canavarCanı < 0){
                System.out.println("canavar oldürüldü oyun bitti");
                break;
            }

                System.out.println("canavar hamle yapıyor");
                oyuncuCanı = oyuncuCanı - 15;
            System.out.println("oyuncunun 15 canı gitti");

        }
    }
    public static void risklisaldırı(){
        Random random = new Random();
        int hasar = random.nextInt(0,2);
        if (hasar == 1){
            canavarCanı = canavarCanı -50;
            System.out.println("canavara 50 hasar verildi " + canavarCanı);

        }else {
            canavarCanı = canavarCanı -0;
            System.out.println("saldırını ıskaladın, canavarın canı gitmedi");
        }

    }
    public static void iksiriç() {
        if (iksirSayısı > 0) {
            oyuncuCanı = oyuncuCanı + 40;
            iksirSayısı = iksirSayısı -1;
            System.out.println("saglık artırıldı " + "+" + 40 + "\n güncel oyuncu saglıgı : " + oyuncuCanı);
        } else {
            System.out.println("iksir kalmadı");
        }
    }
}
