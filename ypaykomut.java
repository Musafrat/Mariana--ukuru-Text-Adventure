import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;

public class ypaykomut {
    // Değişkenlerimizi tanımlıyoruz
    static int kombiModu = 0;
    static int evSicakligi = 20;
    static int saat = 0;
    static int toplamFatura = 0;
    static String camAcikmi = "false";

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
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

        // Saat 24'ten küçük olduğu sürece menü dönmeye devam eder
        while (saat < 24) {
            System.out.println("\n--- DURUM ÖZETİ ---");
            System.out.println("Saat: " + saat + ":00 | Sıcaklık: " + evSicakligi + "°C | Fatura: " + toplamFatura + " TL");
            System.out.println("-------------------");
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
            System.out.println("1- Kombi Modunu Değiştir");
            System.out.println("2- Camı Aç / Kapat");
            System.out.println("3- Saati İleri Al");

            int secim = input.nextInt();
            input.nextLine(); // Scanner'daki alt satıra geçme hatasını önlemek için

            switch (secim) {
                case 1:
                    kombi();
                    break;
                case 2:
                    cam();
                    break;
                case 3:
                    System.out.println("Kaç saat ileri almak istersin?");
                    int ilerial = input.nextInt();
                    tsaat(ilerial); // Girdiği saati metoda gönderiyoruz
                    break;
                default:
                    System.out.println("Geçersiz bir sayı girdiniz!");
                    break;
            }
        }
    }

    // SADECE KOMBİ MODUNU DEĞİŞTİRİR, BAŞKA HİÇBİR HESAP YAPMAZ
    public static void kombi() {
        System.out.println("Kombi modunu giriniz (0: Kapalı, 1: Eko Mod, 2: Performans Modu): ");
        kombiModu = input.nextInt();
        System.out.println("Kombi modu " + kombiModu + " olarak ayarlandı.");
    }

    // SADECE CAMIN DURUMUNU DEĞİŞTİRİR
    public static void cam() {
        System.out.println("Camı açmak mı istersin yoksa kapatmak mı? (true veya false giriniz): ");
        camAcikmi = input.nextLine();
        System.out.println("Cam durumu: " + camAcikmi + " olarak güncellendi.");
    }

    // BÜTÜN MATEMATİĞİN VE FİZİĞİN DÖNDÜĞÜ YER
    public static void tsaat(int ilerial) {

        // Kullanıcı "5" girdiyse, bu döngü 5 KERE dönecek. Yani zamanı saat saat yaşatıyoruz.
        for (int i = 0; i < ilerial; i++) {

            saat++; // 1 saat geçti

            // KURAL 1: Cam açık mı?
            if (camAcikmi.equals("true")) {
                evSicakligi--; // Cam açıksa ev her halükarda soğur

                // Cam açık ama kombi çalışıyorsa boşuna fatura yazar
                if (kombiModu == 1) {
                    toplamFatura = toplamFatura + 2;
                } else if (kombiModu == 2) {
                    toplamFatura = toplamFatura + 5;
                }
            }
            // KURAL 2: Cam kapalıysa
            else if (camAcikmi.equals("false")) {
                if (kombiModu == 0) {
                    evSicakligi--; // Kombi kapalı, ev doğal olarak soğur
                }
                else if (kombiModu == 1) {
                    evSicakligi = 22; // Eko mod
                    toplamFatura = toplamFatura + 2;
                }
                else if (kombiModu == 2) {
                    evSicakligi = 28; // Performans mod
                    toplamFatura = toplamFatura + 5;
                }
            }

            // KURAL 3: Alt sınır kontrolü (Ev 10 dereceden daha soğuk olamaz)
            if (evSicakligi <= 10) {
                evSicakligi = 10;
            }

            // KURAL 4: Gün Bitti mi? (Eğer saati 15 saat ileri alırsak ve o sırada 24'ü bulursa anında durur)
            if (saat == 24) {
                System.out.println("\n--- GÜN BİTTİ ---");
                System.out.println("Saat 24:00 oldu. Sistem kapatılıyor.");
                System.out.println("Gün Sonu Ev Sıcaklığı: " + evSicakligi + "°C");
                System.out.println("Gün Sonu Toplam Fatura: " + toplamFatura + " TL");
                System.exit(0);
            }
        }

        // Döngü bitti (istediği saat kadar ileri aldık), şimdi sonucu gösterelim
        System.out.println("Zaman ileri alındı!");
    }
}
