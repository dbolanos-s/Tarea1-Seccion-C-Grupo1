package singleton_aop;

public class MainSingletonAOP {
    public static void main(String[] args) {
        System.out.println("--- Test Singleton AOP ---");

        GestorConfiguracion c1 = new GestorConfiguracion(); 
        c1.setUrlDatabase("DATABASE_PRODUCCION");

        GestorConfiguracion c2 = new GestorConfiguracion(); 

        System.out.println("Url en C1: " + c1.getUrlDatabase());
        System.out.println("Url en C2: " + c2.getUrlDatabase());

        if (c1 == c2) {
            System.out.println("EXITO: Es el mismo objeto.");
        } else {
            System.out.println("FALLO: Objetos diferentes.");
        }
    }
}