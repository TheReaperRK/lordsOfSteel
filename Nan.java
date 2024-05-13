public class Nan extends Personatge{

    public Nan(String nom, int fOR, int cON, int vEL, int iNT, int sOR, Arma arma) {
        super(nom, fOR, cON, vEL, iNT, sOR, arma);
    }
    @Override
    public String toString() {
        
        return super.toString() + " (Nan)";
    }
    @Override
    protected void calcularAtributos() {
        
        PS = CON + FOR;
        
        // Calcular PD
        PD = (FOR + arma.getWPOW() + CON) / 3;
        
        // Calcular PA
        PA = INT + SOR + arma.getWVEL();
        
        // Calcular PE
        PE = VEL + SOR + INT;
    }

    
}
