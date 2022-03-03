package gyakorlas;
public class OsszeadasJobb_met1 {
    public static void main(String[] args) {
        int szam1 = 3;
        int szam2 = 5;
        int eredmeny = osszead(szam1,szam2);
        //System.out.printf("%d + %d = %d\n",szam1, szam2, szam1 + szam2);
        //eredmenyKiir(szam1,szam2,eredmeny);
        int ujEredmeny = osszead(eredmeny,2);
        //System.out.println("%d + %d = %d\n",eredmeny,2,eredmeny + 2);
        //eredmenyKiir(eredmeny,2,ujEredmeny);
    }

    static int osszead(int a, int b) {
        return a+b;
    }

    static void eredmenyKiir(int szam1, int szam2) {
        System.out.println("-------------");
        System.out.printf("| %d + %d = %d |\n",szam1, szam2, osszead(szam1,szam2));
    }
    
}
