public class Mitja extends Personatge{

    public Mitja(String nom, int fOR, int cON, int vEL, int iNT, int sOR, Arma arma) {
        super(nom, fOR, cON, vEL, iNT, sOR, arma);
    }
    @Override
    public String toString() {
        
        return super.toString() + " (Mitja)";
    }
    @Override
    protected void calcularAtributos() {
        
        PS = CON + FOR;
        
        // Calcular PD
        PD = (FOR + arma.getWPOW()) / 3;
        
        // Calcular PA
        PA = INT + SOR + arma.getWVEL();
        
        // Calcular PE
        PE = VEL + SOR + INT + FOR;
    }

    
}
