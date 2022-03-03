package progtetelek;

import java.util.Scanner;

public class bmiIndexSzámítás {
    public static void main(String[] args) {
        cim("BMI index kiszámítása");
        int tomeg = beker("");
        int magassag = beker("");
        double bmiIndex = bmi(tomeg,magassag);
        ertekeles();
    }

    static void cim(String szoveg) {
        System.out.println(szoveg);
    }

    static int beker(String string) {
        int magassag= 0;
        int suly = 0;
        
        Scanner sc = new Scanner(System.in);
        while(suly > 40 && suly <150){
            System.out.println("Írja be hány kilós(kg): ");
            suly = sc.nextInt();
        }
        System.out.println("Milyen magas (100-200cm): ");
        magassag = sc.nextInt();
        while(magassag>100 && magassag<200){
            System.out.println("Milyen magas(cm) újra: ");
            magassag = sc.nextInt();
        }
        return magassag, suly;
    }

    static double bmi(int tomeg, int magassag) {
        return 0;
    }

    static void ertekeles() {
        return 0.0;
    }
}
