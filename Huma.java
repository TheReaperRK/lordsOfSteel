public class Huma extends Personatge {

    public Huma(String nom, int fOR, int cON, int vEL, int iNT, int sOR, Arma armes) {
        super(nom, fOR, cON, vEL, iNT, sOR, armes);
    }

    @Override
    public String toString() {
        
        return super.toString() + " (Humà)";
    }

    
}
