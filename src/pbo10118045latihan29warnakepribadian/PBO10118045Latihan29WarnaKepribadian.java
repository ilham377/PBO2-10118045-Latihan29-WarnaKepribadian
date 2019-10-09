/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan29warnakepribadian;

import java.util.Scanner;

/**
 *
   * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : program warna kepribadian
 */
public class PBO10118045Latihan29WarnaKepribadian {

    /**
     */
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[36m";
    
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    public static void cek_kepribadian(String warna){
        if ("merah".equals(warna)){
            System.out.println("Warna Favoritmu adalah "+ANSI_RED+"MERAH");
            System.out.println("1. Periang,");
            System.out.println("2. Pemberani,");
            System.out.println("3. Berani mengambil risiko dalam setiap langkah,");
            System.out.println("4. Menyukai tantangan,");
            System.out.println("5. Kurang sabar,");
            System.out.println("6. Dapat menahan marah namun jika sudah tahap toleransi, kemarahannya akan sulit dikontrol, ");
            System.out.println("7. Memiliki energi kehangatan dan Cinta,");
       }else if ("biru".equals(warna)){
            System.out.println("Warna Favoritmu adalah "+ANSI_BLUE+"BIRU");
            System.out.println("1. Menyenangkan,");
            System.out.println("2. Bijaksana,");
            System.out.println("3. Pembawa diri tenang saat menghadapi masalah,");
            System.out.println("4. Dinamis,");
            System.out.println("5. Senang Berbagi,");
            System.out.println("6. Bersahabat, ");
            System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
            System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
       }else if ("kuning".equals(warna)){
            System.out.println("Warna Favoritmu adalah "+ANSI_YELLOW+"MERAH");
            System.out.println("1. Optimis,");
            System.out.println("2. Suka bergaul,");
            System.out.println("3. Periang,");
            System.out.println("4. Senang menolong,");
            System.out.println("5. Lincah dan aktif,");
            System.out.println("6. Tidak suka meremehkan kekurangan orang lain, ");
            System.out.println("7. Loyal,");
            System.out.println("8. Hangat,");
            System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
            System.out.println("10. Cenderung penakut,");
       }else if ("ungu".equals(warna)){
            System.out.println("Warna Favoritmu adalah "+ANSI_PURPLE+"BIRU");
            System.out.println("1. Optimis,");
            System.out.println("2. Tidak pernah ragu,");
            System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
            System.out.println("4. Memiliki ambisi yang besar,");
            System.out.println("5. Memiliki empati yang besar,");
            System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya, ");
            System.out.println("7. Terkadang bersikap keras kepala dan angkuh,");
       }else if ("hijau".equals(warna)){
            System.out.println("Warna Favoritmu adalah "+ANSI_GREEN+"BIRU");
            System.out.println("1. Romantis,");
            System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
            System.out.println("3. Teguh pada prinsip,");
            System.out.println("4. Menginginkan kesempurnaan,");
            System.out.println("5. Mudah cemburu,");
            System.out.println("6. Mudah marasa iri, ");
            System.out.println("7. Menjungjung tinggi suatu nilai toleransi dan kepercayaan,");
       }else System.out.println("Oops.. Belum teridentifikasi");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(ANSI_RED+"YUK"+ANSI_GREEN+" CEK"+ANSI_YELLOW+" KEPRIBADIAN"+ANSI_CYAN+" DARI"+ANSI_PURPLE+" WARNA"+ANSI_BLUE+" FAVORITMU");
        System.out.println("");
        System.out.println(ANSI_RED_BACKGROUND+ANSI_WHITE+"MERAH"+ANSI_RESET);
        System.out.println(ANSI_GREEN_BACKGROUND+ANSI_WHITE+"HIJAU"+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+ANSI_WHITE+"KUNING"+ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND+ANSI_WHITE+"BIRU"+ANSI_RESET);
        System.out.println(ANSI_PURPLE_BACKGROUND+ANSI_WHITE+"UNGU"+ANSI_RESET);
        System.out.println("");
        System.out.print("PILIH WARNA FAVORITMU : ");
        Scanner wrna = new Scanner(System.in);
        String color = wrna.next();
        System.out.print("Nama Kamu : ");
        Scanner a = new Scanner(System.in);
        String Nama = a.nextLine();
        System.out.println("");
        System.out.println("=== Hasil Test Kepribadian "+Nama.toUpperCase()+" ===");
        cek_kepribadian(color.toLowerCase());
        System.out.println("");
      
        
        
        
        
    }
    
}
