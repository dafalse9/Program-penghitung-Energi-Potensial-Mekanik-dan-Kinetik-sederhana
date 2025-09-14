import java.util.Scanner;


public class EnergiPotensial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program penghitung Energi Potensial, Mekanik, dan Kinetik sederhana");
        System.out.print("Masukkan massa (kg)       : ");
        float massa = sc.nextFloat();
        System.out.print("Masukkan kecepatan (m/s)  : ");
        float kecepatan = sc.nextFloat();
        System.out.print("Masukkan ketinggian (m)   : ");
        float ketinggian = sc.nextFloat();
        float g = 10; // percepatan gravitasi
        
        float energiPotensial = massa * g * ketinggian;
        float energiKinetik = 0.5f * massa * kecepatan * kecepatan;
        float energiMekanik = energiPotensial + energiKinetik;

        System.out.println("\n");
        System.out.println("Energi Potensial       : " + energiPotensial + " J");
        System.out.println("Energi Kinetik         : " + energiKinetik + " J");
        System.out.println("Energi Mekanik         : " + energiMekanik + " J");
    }

}
