public class Dau {
    final static int MAX = 20, MIN = 1;

    public static int unaTirada(){
        int rang = (MAX - MIN +1);
        
        return (int)(Math.random() * rang) + MIN;
    }

    public static int tirada() {
        int valor = 0;
        for (int i = 0; i < 3 ; i++){
            valor += unaTirada();
        }
        return valor;
    }
}
