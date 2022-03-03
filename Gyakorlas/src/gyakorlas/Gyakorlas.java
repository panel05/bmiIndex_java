package gyakorlas;
public class Gyakorlas {
    public static void main(String[] args) {
        
        int[] pontok  = {5,0,2,-3,9,7};
        int minErtek = pontok[0];
        
        for (int i = 0; i < pontok.length; i++) {
            if (minErtek>pontok[i]){
                minErtek = pontok[i];
            }
        }
        
        System.out.println("min érték: "+ minErtek);
        int minIndex = 0;
        for (int i = 0; i < pontok.length; i++) {
            if(pontok[i]<minIndex){
                minIndex = i;
            }
            
        }
        int maxIndex = 0;
        for (int i = 0; i < pontok.length; i++) {
            if(pontok[i]>pontok[maxIndex]){
                maxIndex=i;
            }
            
        }
        
        String[] nevek = {"Emese", "Ede", "Csanád", "Gizi", "I. Xénia", "Nagy Károly"};
        String legrovidebb = nevek[0];
        int hossz = 0;
        for (int i = 0; i < nevek.length; i++) {
            if(legrovidebb.length()>nevek[i].length()){
                legrovidebb = nevek[i];
                hossz = nevek[i].length();
            }
        }
        System.out.printf("Legrövidebb név: %s(%d betű)\n", legrovidebb, hossz);
        
        String vesztesNev = nevek[minIndex];
        int vesztesPont = pontok[minIndex];
        String nyertesNev = nevek[maxIndex];
        int nyertPont = pontok[maxIndex];
        
        System.out.printf("Vesztesneve: %s, (%d pont)\n", vesztesNev, vesztesPont);
        System.out.printf("Nyertesneve: %s, (%d pont)\n", nyertesNev, nyertPont);
    }
    
}
