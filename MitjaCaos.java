public class MitjaCaos extends Mitja implements Caos{

    public MitjaCaos(String nom, int fOR, int cON, int vEL, int iNT, int sOR, Arma arma) {
        super(nom, fOR, cON, vEL, iNT, sOR, arma);
    }

    @Override
    public int contraatacar() {
        if (Dau.tirada() <= PA){
            return 1;
        } return 0;
    }
    
}
