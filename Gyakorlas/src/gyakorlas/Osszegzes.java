package gyakorlas;
public class Osszegzes {
    public static void main(String[] args) {
        System.out.println("25 feletti első 8 páros: ");
        final int N =8;
        int[] paros = new int[N];
        int ertek = 26;
        for (int db = 0; db < N; db++) {
            paros[db] = ertek;
            ertek += 2;
            System.out.printf("[%d] = %d\n", db, ertek);
        }
        int osszeg = 0;
        for (int i = 0; i < N; i++) {
            osszeg += paros[i];
        }
        System.out.printf("Összegük: %d\n", osszeg);
    }
}
