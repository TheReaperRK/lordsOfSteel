public class MaiaCaos extends Maia implements Caos {

    public MaiaCaos(String nom, int fOR, int cON, int vEL, int iNT, int sOR, Arma arma) {
        super(nom, fOR, cON, vEL, iNT, sOR, arma);
        //TODO Auto-generated constructor stub
    }

    @Override
    public int contraatacar() {
        if (Dau.tirada() <= PA){
            return 1;
        } return 0;
    }
    
    @Override
    public String toString() {
        return super.toString() + "[Caos] LVL - " + NIV;
    }
    
}
