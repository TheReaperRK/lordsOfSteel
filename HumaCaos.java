public class HumaCaos extends Huma implements Caos{

    public HumaCaos(String nom, int fOR, int cON, int vEL, int iNT, int sOR, Arma arma) {
        super(nom, fOR, cON, vEL, iNT, sOR, arma);

    }

    @Override
    public int contraatacar() {
        if (Dau.tirada() <= PA*0.6){
            return 1;
        } return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String toStringLong() {
        return toString()  + "[Caos] LVL -> " + NIV;
    }
}
