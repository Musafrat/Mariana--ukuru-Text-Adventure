import jdk.swing.interop.SwingInterOpUtils;

import java.io.EOFException;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
public class Deney {
    static String EX = "";
    static String SSSR = "";
    static String SSR = "";
    static String SR = "";
    static String SSS = "";
    static String SS = "";
    static String S = "";
    static String A = "";
    static String B = "";
    static String C = "";
    static String D = "";
    static String E = "";
    static String F = "";
    static String FF = "";
    static String aktifKAyıtDosyası = "";
    static int oyuncuenerjisi = 100;
    static String kazanılaneşya = "Yok";
    static String malzemeler = "Yok";
    public static void kaydedici() throws IOException {
        try {
            FileWriter yazıcı = new FileWriter(aktifKAyıtDosyası);
            yazıcı.write(oyuncuenerjisi +"\n");
            yazıcı.write(kazanılaneşya +"\n");
            yazıcı.write(malzemeler + "\n");
            yazıcı.write(EX + "\n");
            yazıcı.write(SSSR + "\n");
            yazıcı.write(SSR + "\n");
            yazıcı.write(SR + "\n");
            yazıcı.write(SSS + "\n");
            yazıcı.write(SS + "\n");
            yazıcı.write(S + "\n");
            yazıcı.write(A + "\n");
            yazıcı.write(B + "\n");
            yazıcı.write(C + "\n");
            yazıcı.write(D + "\n");
            yazıcı.write(E + "\n");
            yazıcı.write(F + "\n");
            yazıcı.write(FF + "\n");



            yazıcı.close();
            System.out.println("✓");
        } catch (Exception e) {
            System.out.println("Hata: Kayıt yapılamadı");
        }
    }
    public static void yükleyici() {
        try {
            File dosya =new File(aktifKAyıtDosyası);
            if(dosya.exists()) {
                Scanner scan = new Scanner(System.in);
                oyuncuenerjisi = Integer.parseInt(scan.nextLine());
                kazanılaneşya = scan.nextLine();
                malzemeler = scan.nextLine();
                SSSR = scan.nextLine();
                SSR = scan.nextLine();
                SR = scan.nextLine();
                SSS = scan.nextLine();
                SS = scan.nextLine();
                S = scan.nextLine();
                A = scan.nextLine();
                B = scan.nextLine();
                C = scan.nextLine();
                D = scan.nextLine();
                E = scan.nextLine();
                F = scan.nextLine();
                FF = scan.nextLine();

                scan.close();
                System.out.println("✓");
            }
            else {
                System.out.println("Sistem:" + aktifKAyıtDosyası + "boş.YENİ oyun başlatılıyor ");
            }
        }catch (Exception e) {
            System.out.println("Hata: kayıt noktası bozuk ya da eksik");
        }

    }
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();
    static double sayı = random.nextDouble(0.000001, 10001);


    public static final String KAN_KIRMIZISI = "\u001B[38;2;138;3;3m";
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\uu001B[01m";
    public static final String CYAN = "\u001B[36m";
    public static final String GRI = "\u001B[90m";
    public static final String MOR = "\u001B[35m";
    public static final String MAVI = "\u001B[34m";
    public static final String GERCEK_PLATIN = "\u001B[38;2;229;228;226m";
    public static final String PLATIN = "\u001B[97m";
    public static final String KAHVERENGI = "\u001B[38;2;139;69;19m";
    public static final String TURUNCU = "\u001B[38;2;255;140;0m";
    public static final String ALTIN = "\u001B[38;2;255;215;0m";
    public static final String KOYU_YESIL = "\u001B[38;2;34;139;34m";


    public static void main(String[] args) throws IOException {
        System.out.println("=== MAGARAYA OYUNUNA HOŞ GELDİNİZ ===");
        System.out.println("Hangi slottan oynamak istersin?");
        System.out.println("1 - Slot 1");
        System.out.println("2 - Slot 2");
        System.out.println("3 - Slot 3");
        System.out.print("Seçiminiz (1/2/3): ");
        String secim = scan.nextLine().trim();
        aktifKAyıtDosyası = "slot" + secim + ".sav";
        while (oyuncuenerjisi > 0) {
            int seçilen;
            System.out.println("SANS MAGRASINA HOŞGELDİNİZ:");
            System.out.println("lütfen işlem şeçiniz: " +
                    "\n1-) kazı yap git ⛏\uFE0F" +
                    "\n2-) keşfe çık \uD83D\uDD0D" +
                    "\n3-) dinlen \uD83E\uDDD8" +
                    "\n4-) eve dön \uD83D\uDE97 ");
            seçilen = scan.nextInt();
            kaydedici();
            if ( seçilen == 1){
                oyuncuenerjisi = oyuncuenerjisi -5;
            }
            switch (seçilen) {
                case 1:
                    şans();
                    break;
            }
        }
    }
        public static void şans () throws IOException {
            if (sayı < 3) {
                EX = EX +1;
                String[] t = {"EX item DOGRULUK TANRISI'NIN EMANETİ","EX MİKAİL'İN KANATLARI", "EX GİZEMLİ TANRI'NIN BİLGİSİ", "HERŞEYİ GÖREN TANRI'NIN GÖZÜ","LUCİFER'IN ANAHTARI", "HERŞEYİ YARATAN TANRININ KUTSAMASI"};
                int tanrı = random.nextInt(t.length);
                String ex = t[tanrı];
                System.out.println(KAN_KIRMIZISI +"!!!!!!! IMKANSIZ BAŞARIM ELDE EDİLDİ !!!!!!!! TEBRİKLER TANRI SINIFINDAN EŞYA ÇIKARDINIZ  !!!!!!!!! " + ex);
                kaydedici();
            }
        if (sayı >= 3  && sayı <= 12) {
                SSSR = SSSR + 1;
                String[] km = {"SSSR kılıç LEVİATHA'NIN KILICI", "SSSR kalkan ATHENA'NIN KALKANI", "SSSR mızrak POSEDİON'NUN ÜÇ BAŞLI MIZRAGI", "SSSR yay HERMES'İN CENNETİN YAYI", "SSSR item ZEUS'UN ŞİMŞEGİ \u26A1", "SSSR asa MERLİ'NİN ASASI", "SSSR çekiç SURTR'UN ÇEKİCİ", "SSSR zırh takımı CEHENNEMİN PRENSİNİN ÖZEL TAKIM ZIRHI", ""};
                int şanslısayı = random.nextInt(km.length);
                String dusenEsya = km[şanslısayı];
                System.out.println(RED + "TEBRİKLER !!! SSSR İTEM DÜŞTÜ " + dusenEsya);
                kaydedici();
                /*
            } else if (12 < sayı && sayı <=25 ) {
                SSR
            String[] çöp = {};
                System.out.println(CYAN + "Tebrikler SSR kılıç Leviathan'ın Mirasını Çıkardın;" + RESET);
                kaydedici();
            } else if (25 < sayı && sayı <= 40) {
                SR
            String[] çöp = {};
                System.out.println(GRI + "Tebrikler SR kılıç Leviathan'ın Mirasını Çıkardın" + RESET);
                kaydedici();
            } else if (40 < sayı && sayı <= 65) {
                SSS
            String[] çöp = {};
                System.out.println();
                kaydedici();
            } else if ( 65< sayı && sayı <=100) {
                SS
            String[] çöp = {};
            } else if ( 100< sayı && sayı <=150) {
                S
            String[] çöp = {};
            }else if ( 150< sayı && sayı <=200) {
                A
            String[] çöp = {};
            }else if ( 200< sayı && sayı <=300) {
                B
            String[] çöp = {};
            }else if ( 300< sayı && sayı <=500) {
                C
            String[] çöp = {};
            }else if ( 500< sayı && sayı <=1000) {
                D
            String[] çöp = {};
            }else if ( 1000< sayı && sayı <=3000) {
                E
            String[] çöp = {};
            }else if ( 3000< sayı && sayı <=6500) {
                F
            String[] çöp = {}; */
            }else if ( 0 < sayı && sayı <=10000) {
                FF = FF + 1;
                String[] çöp = {"çakıl taşı"," kırık taş"};
                int ff = random.nextInt(çöp.length);
                FF = çöp[ff];
                String ç = çöp[ff];
                System.out.println("birşeyler çıktı  "+ ç);
                kaydedici();
            }

        }
    }
