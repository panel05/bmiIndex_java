package gyakorlas;
import java.util.Random;
public class KeresesKivalasztas {
    public static void main(String[] args) {
        
        final int N = 5;
        int[] sorozat = new int[N];
        Random rnd = new Random();
        for (int i = 0; i < N; i++) {
            sorozat[i] = rnd.nextInt(99-10+1)+10;
            System.out.print(sorozat[i] + " ");
        }
        System.out.println("");
        int i =0;
        while(i<N && !(sorozat[i] % 2 == 1)){
            i++;
        }
        boolean vanparatlan = i < N;
        
        if(vanparatlan){
            int hely = i+1;
            int ertek = sorozat[i];
            System.out.println("az 1. páratlan helye: "+hely);
            System.out.println("az 1. páratlan értéke: "+ertek);
        }else{
            System.out.println("Nincs benne páratlan");
        }
        
    }
}
