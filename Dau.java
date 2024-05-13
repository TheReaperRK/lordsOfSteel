public class Dau {
    final static int MAX = 20, MIN = 1;

    public static int tirada (){
        int rang = (MAX - MIN +1);
        
        return (int)(Math.random() * rang) + MIN;
    }
}
