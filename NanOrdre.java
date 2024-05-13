public class NanOrdre extends Nan implements Ordre {

    public NanOrdre(String nom, int fOR, int cON, int vEL, int iNT, int sOR, Arma arma) {
        super(nom, fOR, cON, vEL, iNT, sOR, arma);
        //TODO Auto-generated constructor stub
    }

    public int restaurarSalud() {
        return (int)(PS * 0.12);
    }
    
}
