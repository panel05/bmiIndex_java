package gyakorlas;
public class OsszeadasMajdnemLegjobb_met1 {
    
    static int szam1 = 3;
    static int szam2 = 5;
    
    public static void main(String[] args) {
        //int szam1 = 3;
        //int szam2 = 5;
        int eredmeny = osszead();
        eredmenyKiir();
        //System.out.printf("%d + %d = %d\n",szam1, szam2, szam1 + szam2)
        szam1 = eredmeny;
        szam2 = 2;
        int ujEredmeny = osszead();
        eredmenyKiir();
        //System.out.println("%d + %d = %d\n",eredmeny,2,eredmeny + 2);
        //eredmenyKiir(eredmeny,2,ujEredmeny);
    }

    //static int osszead(int szam1, int szam2) {
    static int osszead() {
        return szam1 + szam2;
    }

    static void eredmenyKiir() {
        System.out.println("-------------");
        System.out.printf("| %d + %d = %d |\n",szam1, szam2, osszead());
    }
    
}
