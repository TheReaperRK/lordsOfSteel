public class MitjaOrdre extends Mitja implements Ordre {

    public MitjaOrdre(String nom, int fOR, int cON, int vEL, int iNT, int sOR, Arma arma) {
        super(nom, fOR, cON, vEL, iNT, sOR, arma);
        //TODO Auto-generated constructor stub
    }

    @Override
    public int restaurarSalud() {
        return (int)(PS * 0.12);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

    public String toStringLong() {
        return toString()  + "[Ordre] LVL -> " + NIV;
    }
}
