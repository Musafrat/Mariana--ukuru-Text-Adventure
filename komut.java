import java.util.Scanner;

public class komut {
    static int a;
    static int fatura= 0;
    static int kombiModu;
    static int evSıcaklıgı = 20;
    static int ilerial;
    static int saat = 0;
    static int toplamFatura = 0;
    static String camAcıkmı = "false";
    static int seçim;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // cam acıksa ısıtamaz ama para yazar 4-acil kapatma kombi=0 -1 derece satte kombi =1 derece hemen 22 olcak ve saat başı 2 tl kombi2 = 28 derce 5tl
        //cam acıksa her saat -1 derece en az 10 derce olcak

        while (saat <= 24) {
            System.out.println("lütfen yapmak isteiginiz işlemi seciniz: \n1-kombi modu \n2-cam açma kapama \n3-saati ileri alma");
            seçim = input.nextInt();
            input.nextLine();
            switch (seçim) {
                case 1:
                    System.out.println("kombimodunu giriniz: (0: Kapalı, 1: Eko Mod, 2: Performans Modu)");
                    kombiModu = input.nextInt();
                    kombi();
                    break;
                case 2:
                    System.out.println("camı açmak mı istersin yoksa kapatmak mı: (true or false)");
                    camAcıkmı = input.nextLine();
                    break;
                case 3:
                    System.out.println("kaç saat ileri almak istersin: ");
                    ilerial = input.nextInt();
                    tsaat();
                    break;
                default:
                    System.out.println("geçerli sayı giriniz: ");
                    break;

            }


        }
        System.out.println("24 saat oldu sistem kapatılıyor");
        System.out.println("toplam tutar:" + toplamFatura);
    }

    public static void kombi() {
        if (kombiModu == 0 && ilerial !=0) {
            evSıcaklıgı = evSıcaklıgı - 1;
            System.out.println("ev sıcaklıgı : " + evSıcaklıgı + " \nsaat: " + saat);
            if (ilerial != 0) {
                saat = saat + ilerial;
                evSıcaklıgı = evSıcaklıgı - ilerial;
            }
            if (evSıcaklıgı == 10) {
                evSıcaklıgı = 10;
                System.out.println("ev sıcaklıgı: " + evSıcaklıgı);
            }
        } else if (kombiModu == 1 && ilerial !=0) {
            if (camAcıkmı.equals("true")) {
                evSıcaklıgı--;
                toplamFatura = toplamFatura + 2;
            }if (camAcıkmı.equals("false")) {
            evSıcaklıgı = 22;
            saat++;
            a = (fatura + 2) * ilerial;
            toplamFatura = a + toplamFatura;
            System.out.println("ev sıcaklıgı: " + evSıcaklıgı + "\nsaat: " + saat + "\nfaturaya eklenen miktar +" + toplamFatura);}

            if (evSıcaklıgı == 10) {
                evSıcaklıgı = 10;
                System.out.println("ev sıcaklıgı: " + evSıcaklıgı + "\nsaat: " + saat + " \nfaturaya eklenen miktar + " + toplamFatura);
            }

        } else { if (camAcıkmı.equals("false") && ilerial !=0) {
            evSıcaklıgı = 28;
            saat++;
            a = (fatura + 5) * ilerial;
            toplamFatura = a + toplamFatura;
            System.out.println("ev sıcaklıgı: " + evSıcaklıgı + " \nsaat : " + saat + "\n faturaya eklenen miktar + " + toplamFatura);}
            if (camAcıkmı.equals("true")&& ilerial !=0 ) {
                evSıcaklıgı--;
                a = (fatura + 5) * ilerial;
                toplamFatura = a + toplamFatura;
                System.out.println("ev sıcaklıgı: " + evSıcaklıgı + "\nsaat: " + saat + "\nfaturaya eklenen miktar +" + toplamFatura);
                if (evSıcaklıgı == 10) {
                    evSıcaklıgı = 10;
                    System.out.println("ev sıcaklıgı: " + evSıcaklıgı + "\nsaat: " + saat + "\nfaturaya eklenen miktar +" + toplamFatura);
                }
            }

        }
    }

    public static void tsaat() {
        saat = ilerial + saat;
        if (saat >= 24) {
            saat = 24;
            System.out.println("saat 24 oldu ");
            System.out.println("toplam tutar:" + toplamFatura);
            System.out.println("işlem bitti");
            System.exit(0);
        }
        if (saat < 24) {
            System.out.println("saat: " + saat);
        }
        if (kombiModu == 1) {
            evSıcaklıgı = 22;
            a = (fatura + 2) * ilerial;
            toplamFatura = a + toplamFatura;
            System.out.println("ev sıcaklıgı: " + evSıcaklıgı + "\nsaat: " + saat + "\nfaturaya eklenen miktar +" + toplamFatura);}
            if (kombiModu == 2) {
                evSıcaklıgı = 28;
                a = (fatura + 5) * ilerial;
                toplamFatura = a + toplamFatura;
                System.out.println("ev sıcaklıgı: " + evSıcaklıgı + "\nsaat: " + saat + "\nfaturaya eklenen miktar +" + toplamFatura);
                if (camAcıkmı.equals("true")) {
                    evSıcaklıgı--;
                    System.out.println("saat" + saat + "\nev sıcaklıgı:" + evSıcaklıgı);

                }
            }

        }
    }

