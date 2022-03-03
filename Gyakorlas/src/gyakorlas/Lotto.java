package gyakorlas;
    import java.util.Random;
public class Lotto {
    public static void main(String[] args) {
        final int N = 5;
        Random rnd = new Random();
        int jo = 0;
        int[] lottoszelveny = new int[N];
        while(jo<5){
            int szam =rnd.nextInt(5)+1;
            int i = 0;
            while(i < 5 && !(lottoszelveny[i] == szam)){
                i++;
            }
            boolean vanBenne = i < jo;
            if(!vanBenne){
                lottoszelveny[jo] = szam;
                jo++;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.printf("%d szám %d\n", i+1, lottoszelveny[i]);
        }
        
        Random r = new Random();
        int szam = r.nextInt();

        szam = Math.abs(--szam);
        boolean prim = false;
        int i = 2;
        while(i <= szam-1 && !(szam % i == 0)){
            i++;
        }
        prim = i <= szam-1 ;
        
        String valasz = prim ? "prím" : "NEM prím";
        System.out.printf("a(z) %d az %s\n", szam, valasz);
    }
}

