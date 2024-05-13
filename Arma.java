public class Arma {
    
    private int WPOW;
    private int WVEL;
    private TipusArma tipusArma;
    
    public Arma(TipusArma tipusArma) {
        this.tipusArma = tipusArma;
        if (tipusArma == TipusArma.DAGA) {
            WPOW = 6;
            WVEL = 14;
        } else if (tipusArma == TipusArma.ESPASA){
            WPOW = 9;
            WVEL = 9;
        } else if (tipusArma == TipusArma.MARTELLCOMBAT) {
            WPOW = 14;
            WVEL = 6;
        }
    }

    public int getWPOW() {
        return WPOW;
    }

    public int getWVEL() {
        return WVEL;
    }

    public void setWPOW(int wPOW) {
        WPOW = wPOW;
    }

    public void setWVEL(int wVEL) {
        WVEL = wVEL;
    }
    
}
