public class Maia extends Personatge{

    public Maia(String nom, int fOR, int cON, int vEL, int iNT, int sOR, Arma arma) {
        super(nom, fOR, cON, vEL, iNT, sOR, arma);
    }
    @Override
    public String toString() {
        
        return super.toString() + " (Maia)";
    }
}
