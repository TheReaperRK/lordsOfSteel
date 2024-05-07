public class Personatge {
    
    protected String nom;
    protected int FOR;
    protected int CON;
    protected int VEL;
    protected int INT;
    protected int SOR;

    protected int PS;
    protected int PD;
    protected int PA;
    protected int PE;

    protected Arma arma;

    public Personatge(String nom, int fOR, int cON, int vEL, int iNT, int sOR, Arma arma) {
        this.nom = nom;
        this.FOR = fOR;
        this.CON = cON;
        this.VEL = vEL;
        this.INT = iNT;
        this.SOR = sOR;
        this.arma = arma;

        calcularAtributos();
    }
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getFOR() {
        return FOR;
    }
    public void setFOR(int fOR) {
        FOR = fOR;
    }
    public int getCON() {
        return CON;
    }
    public void setCON(int cON) {
        CON = cON;
    }
    public int getVEL() {
        return VEL;
    }
    public void setVEL(int vEL) {
        VEL = vEL;
    }
    public int getINT() {
        return INT;
    }
    public void setINT(int iNT) {
        INT = iNT;
    }
    public int getSOR() {
        return SOR;
    }
    public void setSOR(int sOR) {
        SOR = sOR;
    }

    public int getPS() {
        return PS;
    }

    public void setPS(int pS) {
        PS = pS;
    }

    public int getPD() {
        return PD;
    }

    public void setPD(int pD) {
        PD = pD;
    }

    public int getPA() {
        return PA;
    }

    public void setPA(int pA) {
        PA = pA;
    }

    public int getPE() {
        return PE;
    }

    public void setPE(int pE) {
        PE = pE;
    }

    // calcular los atributos adicionales
    protected void calcularAtributos() {
        // Calcular PS
        PS = CON + FOR;
        
        // Calcular PD
        PD = (FOR + arma.getWPOW()) / 3;
        
        // Calcular PA
        PA = INT + SOR + VEL;
        
        // Calcular PE
        PE = VEL + SOR + INT;
    }


    @Override
    public String toString() {
        return nom;
    }

}
