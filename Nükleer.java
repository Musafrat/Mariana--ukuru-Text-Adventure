import jdk.swing.interop.SwingInterOpUtils;
import java.util.Scanner;
public class Nükleer {
    static Scanner input = new Scanner(System.in);
    static int tur = 1;
    static int sıcaklık = 500;
    static int basınç = 50;
    static int suSeviyesi = 100;
    static int toplamEnerji = 0;
    static int reaksiyonHızı = 50;
    static int reaksionArtı;
    static int artıSu = 40;
    static int eksiBasınç = 30;
    static int araenerji = 0;
    static int boş;
    static int a = 1;


    static int seçim;

    public static void main(String[] args) {
        System.out.println("Bir nükleer santralde reaktör kontrol mühendisisin. Hedefin güvenli bir şekilde 10.000 MW enerji üretmek.");
        //Ancak reaksiyon hızını artırdığında sıcaklık artar; sıcaklık artarsa su buharlaşır; su buharlaşırsa sıcaklık daha da fırlar ve basınç artar. Her şeyi dengede tutmalısın!
        while (1000 > sıcaklık && 100 > basınç && 10000 > toplamEnerji) {
            System.out.println("-----GÜNCEL DURUM-----");
            System.out.println("Tur sayısı:" + tur);
            System.out.println("güncel sıcaklık: " + sıcaklık + "°C");
            System.out.println("basınç durumu: " + basınç + "P");
            System.out.println("güncel su seviyesi: %" + suSeviyesi);
            System.out.println("güncel reaksiyon hızı:" + reaksiyonHızı);
            System.out.println("üretilen toplam enerji: " + toplamEnerji);
            System.out.println("bir işlem seçiniz:  \n1-reaksiyonhızı degiştirme \n2-soguk su pompalmak \n3-basınç valfini aç \n4-hiçbir şey yapma");
            seçim = input.nextInt();

            switch (seçim) {
                case 1:
                    tekrar();
                    while (reaksionArtı > 100) {
                        System.out.println("geçersiz deger girdin");
                        tekrar();
                    }
                    break;
                case 2:
                    System.out.println("soguk su pompalanıyor");
                    break;
                case 3:
                    System.out.println("basınç valfini açılıyor");
                    break;
                case 4:
                    System.out.println("bekleniyor");
                    break;
                default:
                    System.out.println("geçersiz sayı girildi");
                    break;
            }
            araenerji = 0;
            sıcaklık = sıcaklık - (suSeviyesi / 2);
            if (seçim == 1) {

                reaksiyonHızı = reaksionArtı;
                sıcaklık = sıcaklık + reaksiyonHızı;
                araenerji = reaksiyonHızı * 10;
                toplamEnerji = toplamEnerji + araenerji;
                tur++;
            }
            if (seçim == 2) {
                suSeviyesi = suSeviyesi + artıSu;
                sıcaklık = sıcaklık + reaksiyonHızı;
                tur++;
                if (suSeviyesi <= 100) {
                    araenerji = reaksiyonHızı * 10;
                    toplamEnerji = toplamEnerji + araenerji;

                } else {
                    araenerji = reaksiyonHızı * 10;
                    toplamEnerji = toplamEnerji + araenerji;
                    suSeviyesi = 100;
                    sıcaklık = sıcaklık - (suSeviyesi / 2);
                }
            }
            if (seçim == 3) {
                tur++;
                basınç = basınç - eksiBasınç;
                sıcaklık = sıcaklık + reaksiyonHızı;
                araenerji = reaksiyonHızı * 10;
                araenerji = araenerji / 2;
                toplamEnerji = toplamEnerji + araenerji;
            }
            if (seçim == 4) {
                tur++;
                sıcaklık = sıcaklık + reaksiyonHızı;
                araenerji = reaksiyonHızı * 10;
                toplamEnerji = toplamEnerji + araenerji;

            }
            if (sıcaklık > 600) {
                basınç = basınç + 15;
            } else {
                basınç = basınç - 5;
            }
            if (sıcaklık > 700 && suSeviyesi >= 0) {
                suSeviyesi = suSeviyesi - 30;
            } else if (sıcaklık <= 700 && suSeviyesi >= 0) {
                suSeviyesi = suSeviyesi - 15;
            } else {
                suSeviyesi = 0;
            }
            if (seçim == 1 || seçim == 4 || seçim == 2) {


            } else if (basınç <= 0) {
                basınç = 0;
            }


        }
        if (toplamEnerji >= 10000) {
            System.out.println("hedefe ulaşıldı tebrikler");
        } else {
            System.out.println("aşım yapıldı kapatılıyor");
        }

    }

    public static void tekrar() {

        System.out.println("istediginiz reaksiyon hızını giriniz: (max:100 min:0)");
        reaksionArtı = input.nextInt();
    }
}