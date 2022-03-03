package gyakorlas;
public class metodus {
    private static void megValami(){
        System.out.println("Még valami");
    }
    private static void valami(){
        System.out.println("Csinál valamit");
        megValami();
    }
    public static void main(String[] args) {
        valami();
    }
}
