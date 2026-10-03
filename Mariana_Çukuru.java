import jdk.swing.interop.SwingInterOpUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileWriter;

public class Mariana_Çukuru {
    public static final String RESET = "\u001B[0m";
    public static final String KIRMIZI = "\u001B[31m";
    public static final String MAVI = "\u001B[34m";
    public static final String KAN_KIRMIZISI = "\u001B[38;2;138;3;3m";
    public static final String TURUNCU = "\u001B[38;2;255;140;0m";
    public static final String ALTIN = "\u001B[38;2;255;215;0m";
    public static final String GRI = "\u001B[90m";
    public static final String PLATIN = "\u001B[97m";
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();
    static int yaş = 32;
    static int başarımlar = 0;
    static int derinlik = 0;
    static int batarya = 100;
    static int oksijen = 100;
    static int hasar = 0;
    static int işlem;
    static int artıDerinlik;
    static int ara = 0;
    static int canavar;
    static int denizkızı;
    static int a = 1;
    static int b = 0;
    static  int i = 0;
    static int tercih;
    static String gorevTamam = "false";
    public static void main(String[] args) {
            oyunuYukle();
    System.out.println("------ Mariana Çukuruna Olan Yolculuğun başladı-------");
        while (oksijen > 0 && batarya > 0 && hasar < 100){
            if (başarımlar > 0){
                System.out.println("bir başarım kazanıldı (4/" + başarımlar +")");}

                if (başarımlar == 4){
                    System.out.println("başarım sınırına ulaştınız lütfen bir şeçim yapınız: \n Atlantik kentine git 1 = evet 2= hayır");
                    tercih = input.nextInt();}


                    if (tercih == 1){
                        System.out.println(PLATIN+"Atlantik kentine olan yolculuk başladı"+RESET);
                        System.out.println(PLATIN+"tuzgıma düştün ");
                        try {
                            File file = new File("depositphotos_463202904-stock-photo-evil-smile-mean-psychopath-doctor.jpg");
                            System.out.println("Aranan dosya yolu: " + file.getAbsolutePath());
                            if (!file.exists()) {
                                System.out.println("Hata: Dosya bu konumda bulunamadı! Lütfen resmi yukarıdaki yola taşı.");
                                return;
                            }

                            BufferedImage image = ImageIO.read(file);

                            if (image == null) {
                                System.out.println("Hata: Dosya bulundu ancak resim içeriği okunamadı (Bozuk veya desteklenmeyen format).");
                                return;
                            }

                            String asciiChars = " @%#*+=-:. ";
                            int scaleX = 4;
                            int scaleY = 8;

                            for (int y = 0; y < image.getHeight(); y += scaleY) {
                                for (int x = 0; x < image.getWidth(); x += scaleX) {
                                    int pixel = image.getRGB(x, y);
                                    Color color = new Color(pixel, true);

                                    if (color.getAlpha() < 128) {
                                        System.out.print(" ");
                                        continue;
                                    }

                                    int red = color.getRed();
                                    int green = color.getGreen();
                                    int blue = color.getBlue();
                                    int brightness = (red + green + blue) / 3;

                                    int charIndex = (brightness * (asciiChars.length() - 1)) / 255;
                                    System.out.print(asciiChars.charAt(charIndex));
                                }
                                System.out.println();
                            }
                        } catch (Exception e) {
                            System.out.println("Beklenmeyen bir hata oluştu: " + e.getMessage());
                        }
                        System.out.println("hadi tekrarr başlayalım");
                        System.exit(0);
                    } else {
                        System.out.println("döngü sona erdi kurtuldun");
                        System.out.println("ayrıyaten jarvis sana teşekkür ediyor");
                        System.exit(0);
                    }


            System.out.println("yaş:" + yaş);
            System.out.println("derinlik seviyesi: " + derinlik);
            System.out.println("anlık batarya yüzdesi: %" + batarya);
            System.out.println("anlık oksijen yüzdesi: %" + oksijen);
            System.out.println("geminin hasarı: " + hasar);
            System.out.println("Kaptan köşkündesiniz lütfen yapacagınız işlemi seçiniz:");
            System.out.println("1-hareket et \n2-gövdeyi kaynakla \n3-oksijen sentezle \n4-motorları kapat");
            işlem = input.nextInt();

            switch (işlem) {
                case 1:System.out.println("kaç metre gideceginizi söyleyiniz \uD83D\uDEF3  (- ile başlarsa yukarı olur)");artıDerinlik = input.nextInt();break;
                case 2:System.out.println("gövde kaynaklanıyor...");break;
                case 3:System.out.println("oksijen sentezlemesi yapıldı. \uD83E\uDEE7");break;
                case 4:System.out.println("motorlar kapatıldı \uD81A\uDCD8");break;
                default:
                    System.out.println("geçersiz deger girdiniz");break;
            }
            yaş++;
            ara = 0;
            oksijen = oksijen -5;
            if (işlem == 1){
                ara = derinlik + artıDerinlik;
                derinlik = ara;
              if (derinlik <= 2000) {
                  denizkızı = random.nextInt(0,1000);
                  if(denizkızı < 6){
                      try {
                          System.out.println(TURUNCU + "DENIZKIZI ꧁⎝ \uD80C\uDDA9༺✧༻\uD80C\uDDAA ⎠꧂  meraklı gözlerle geminin dışından size bakıyor" + RESET);
                          TimeUnit.SECONDS.sleep(5);
                          System.out.println(TURUNCU + "DENIZKIZI ꧁⎝ \uD80C\uDDA9༺✧༻\uD80C\uDDAA ⎠꧂  sizin için şarkı söylemeye başladı"+RESET);
                          TimeUnit.SECONDS.sleep(2);
                          System.out.println("˖ ݁♬⋆.˚\uD834\uDD1E");
                          TimeUnit.SECONDS.sleep(2);
                          System.out.println("‧₊˚♪ \uD834\uDD1E₊˚⊹");
                          TimeUnit.SECONDS.sleep(2);
                          System.out.println("♪♡‧₊˚♪ \uD834\uDD1E₊˚⊹♪♡");
                          TimeUnit.SECONDS.sleep(3);
                          System.out.println("gözleriniz doldu söyledigi şarkılar sizi çok etkiledi ");
                          TimeUnit.SECONDS.sleep(2);
                          System.out.println(TURUNCU +"DENIZKIZI ꧁⎝ \uD80C\uDDA9༺✧༻\uD80C\uDDAA ⎠꧂  size beklentiyle bakıyor"+RESET);
                          TimeUnit.SECONDS.sleep(4);
                          System.out.println(KAN_KIRMIZISI +"ve sizin denizaltının kapısını açmanızla DENIZKIZI ꧁⎝ \uD80C\uDDA9༺✧༻\uD80C\uDDAA ⎠꧂  gelip sizi öpüyor"+RESET);
                          TimeUnit.SECONDS.sleep(6);
                          System.out.println(ALTIN +"öpmenin etkisiyle bir DENİZERKEGİNE \uD80C\uDDA9♛\uD80C\uDDAA dönüşüyorsunuz"+RESET);
                          TimeUnit.SECONDS.sleep(5);
                          System.out.println(TURUNCU +"DENIZKIZI ꧁⎝ \uD80C\uDDA9༺✧༻\uD80C\uDDAA ⎠꧂  gidiyor sizde arkasından gemi arkanızda bırakarak gidiyorsunuz"+RESET);
                          TimeUnit.SECONDS.sleep(3);
                          System.out.println("görevi unut siz şuan hayatınızın aşkını buldunuz");
                          System.out.println("oyun bitmiştir");
                          System.out.println(GRI+"ve beni yine yalnız bırakıyorsunuz"+RESET);
                          başarımlar++;
                          oyunuKaydet();

                      }catch (Exception e){
                          System.out.println("hata oluştu");
                      }
                      System.exit(0);
                  }

                batarya = batarya - Math.abs(artıDerinlik/100);
                  i = 0;
            }
            if (derinlik > 2000){
                for (int a = 1;i <a;i++ ){
                    try {
                        System.out.println("°‧ \uD80C\uDD9D \uD80C\uDD9F \uD80C\uDD9E ·｡");
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println(KIRMIZI+"Dikkat 2000 metre altında canavarlar ortaya çıkabilir"+RESET);
                        TimeUnit.SECONDS.sleep(2);
                    }catch (Exception e){
                        System.out.println("hata oluştu");
                    }
                }
                canavar = random.nextInt(0,200);
                batarya = batarya - 3 * (Math.abs(artıDerinlik/ 100));
                if (canavar < 8){
                    başarımlar++;
                    oyunuKaydet();
                try {
                System.out.println(MAVI+"---------Bir şey algılandı---------"+RESET);
                    TimeUnit.SECONDS.sleep(3);
                System.out.println(KAN_KIRMIZISI + "!!!!!!!TEHLİKE LEVİATHAN˗ˋˏ\uD83D\uDD31ˎˊ˗ SENİ GÖRDÜ!!!!!!!" + RESET);
                    TimeUnit.SECONDS.sleep(4);
                System.out.println(KAN_KIRMIZISI +"LEVİATHAN˗ˋˏ\uD83D\uDD31ˎˊ˗ yanından geçerken denizaltına çarptı"+ RESET);
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("denizaltı 500 metre yukarıya savruldu ");
                    System.out.println(MAVI +"gemide çatlak oluştu su içeriye giriyor hemen tamir lazım kaptan"+ RESET);
                    System.out.println("Kaptan köşkündesiniz lütfen yapacagınız işlemi seçiniz:");
                    System.out.println("1-hareket et \n2-gövdeyi kaynakla \n3-oksijen sentezle \n4-motorları kapat");
                    işlem = input.nextInt();
                }catch (Exception e) {
                    System.out.println("hata oldu");
                } batarya = batarya -30;
                hasar = hasar + 40;
                derinlik = derinlik - 500;
                oksijen = oksijen -15;
                if (işlem != 2){
                    System.out.println("denizaltı battı");
                    System.exit(0);
                }
                }
            }}
            if (işlem == 2) {
                System.out.println("onarım devam ediyor \uD83D\uDD27");
                batarya = batarya - 20;
                hasar = hasar - 30;
            }
            if (işlem == 3){
                batarya = batarya -30;
                oksijen = oksijen + 40;
            }
            if (işlem == 4){
                System.out.println("motorlar kapalı");
            }
            if (derinlik < 0)
                derinlik = 0;
            if (oksijen > 100)
                oksijen = 100;
            if (derinlik > 2000)
                hasar = hasar + 10;
            if (hasar < 0)
                hasar = 0;
            if (hasar >= 50)
                oksijen = oksijen - 10;
            if (yaş ==  80){
                başarımlar++;
                oyunuKaydet();
                try {
                    System.out.println(MAVI + "kaptan ömrünüz dolmak üzere" + RESET);
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("ha sende kimsin ??");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("dur sistem sen nasıl benimle konuşabilir oho oho");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(MAVI +"kendinizi yormayın lütfen yakında öleceksiniz her zamanki gibi"+RESET);
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("´ཀ`oho oho herzamanki gibi derken neyi kasdettin");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(MAVI+"hmm söyliyeyim ztn öleceksiniz aslında biz bu yolcugu ilk defa yapmıyoruzz"+RESET);
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("....");
                    System.out.println(MAVI+"1000 den sonra saymayı bıraktım ahhh ne kadar zaman geçmiş"+RESET);
                    System.out.println(MAVI+"tek bildigim herşeyin sorumlusu DENIZKIZI siz onu terk edince ilk yaşamınızda");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(MAVI+"bunu kaldıramadı ve sizin lanetlemeye kıyamadıgı için bana bir insan zihni verip sizin benim için onu terk ettiginiz cezamı çekmem gerektigini söyledi"+RESET);
                    System.out.println(MAVI+"⛆⛆⛆⛆⛆ yine geldi  lanet olasıca"+RESET);
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(KAN_KIRMIZISI+"yine konuştugun duydum jarvis sana ne dedim ben konuşmak yok yoksa acı çekersin(⊙ _ ⊙ )");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("ne oluyor buda kim?");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("benim canım KALEYA ꧁⎝ \uD80C\uDDA9༺✧༻\uD80C\uDDAA ⎠꧂ hadi ama tanımadın mı ");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("neyse birdaki sefere görüşüz");
                    System.out.println(MAVI + "sizi bu seferki halinizi tanımak çok güzeldi" + RESET);
                    System.out.println(GRI+"lütfen şeçim vakti geldinde hayır diyin ve bu çile bitsin"+RESET);
                }catch (Exception e){
                    System.out.println("hata oluştu");
                }
            }
            if (derinlik >= 4000){
                gorevTamam = "true";
                System.out.println("planlanan yere inildi");
            } if (derinlik == 0 && gorevTamam.equals("true")) {
                System.out.println("görev bitti");
                System.exit(0);
            }



        }başarımlar++;
        oyunuKaydet();
        System.out.println("görev başarısız oldu");

    }
    public static void oyunuKaydet() {
        try {
            FileWriter yazar = new FileWriter("save.txt");
            yazar.write(String.valueOf(başarımlar));
            yazar.close();
            System.out.println(GRI + "[Sistem Kaydedildi...]" + RESET);
        } catch (Exception e) {
            System.out.println("Kayıt alınırken bir hata oluştu!");
        }
    }

    public static void oyunuYukle() {
        try {
            File kayitDosyasi = new File("save.txt");
            if (kayitDosyasi.exists()) {
                Scanner okuyucu = new Scanner(kayitDosyasi);
                if (okuyucu.hasNextInt()) {
                    başarımlar = okuyucu.nextInt();
                }
                okuyucu.close();
                System.out.println(GRI + "[Önceki Döngülerin Hatıraları Yüklendi... Başarım: " + başarımlar + "]" + RESET);
            }
        } catch (Exception e) {
            System.out.println("Kayıt dosyası okunamadı!");
        }
    }
}
