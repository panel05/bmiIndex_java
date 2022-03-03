package progtetelek;

import java.util.Random;

public class PrimSzamMetodussal {
    public static void main(String[] args) {

        
        
        int szam = 10001;
        boolean prim = primE(szam);
        
        int[] sorozat = {10001, 2, 1, 10007, new Random().nextInt()};
        sorozatotKiir(sorozat);
        
        System.out.printf("%d az prím: %b\n",szam,prim);
        
        int N = sorozat.length;
        
        int dbPrim = 0;
        for (int i = 0; i < N; i++) {
            if(primE(sorozat[i])){
                dbPrim++;
            }
        }
        System.out.printf("hány db prím van a sorozatban: " + dbPrim);
        
        //eldöntés
        int i = 0;
        while(i < N && !(primE(sorozat[i]))){
            i++;
        }
        boolean vanBennePrim = i < N;
        //boolean nincsBennePrim = i > N;
        System.out.print("Van e prím a sorozatban: " + vanBennePrim);
        
        //eldontes2
        i = 0;
        while(i < N && (primE(sorozat[i]))){
            i++;
        }
        boolean mindenElemPrim = i >= N;
        System.out.print("Van e prím a sorozatban: " + mindenElemPrim);
        
        i = 0;
        while(i < N && !(primE(sorozat[i]))){
            i++;
        }
        vanBennePrim = i < N;
        if(vanBennePrim){
            System.out.println("az első prím: " + sorozat[i]);
        }else{
            System.out.println("Nincs benne prím");}
    }

    static boolean primE(int szam) {
          if (szam<2){
            //prim = false;
            return false;
        }else{
            int i = 2;
            while(i < Math.sqrt(szam) && !(szam % i == 0)){
                i++;
            }
              //prim = i > Math.sqrt(szam);
            return i > Math.sqrt(szam);

           
        }
        //System.out.printf("%d az prím: %b\n",szam,prim);
    }

    static void sorozatotKiir(int[] sorozat) {
        for (int i = 0; i < sorozat.length; i++) {
            System.out.print(sorozat[i] + " ");
        }
        System.out.println("");
    }
}
