public abstract class Personatge {
    
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

    protected int NIV = 0;
    protected int PEX = 0;

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
    
    public int getNIV() {
        return NIV;
    }

    public void setNIV(int nIV) {
        NIV = nIV;
    }

    public int getPEX() {
        return PEX;
    }

    public void setPEX(int pEX) {
        PEX = pEX;
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

    // calcular els atributs adicionals
    protected void calcularAtributos() {
        // Calcular PS
        PS = CON + FOR;
        
        // Calcular PD
        PD = (FOR + arma.getWPOW()) / 3;
        
        // Calcular PA
        PA = INT + SOR + arma.getWVEL();
        
        // Calcular PE
        PE = VEL + SOR + INT;
    }


    @Override
    public String toString() {
        return nom;
    }

    public int atacar() {
        int tirada = Dau.tirada();
        System.out.println(" ha tret un " + tirada);

        if (tirada <= PA){
            return 1;
        } return 0;
    }

    public int defensar() {
        int tirada = Dau.tirada();
        System.out.println(" ha tret un " + tirada);

        if (tirada <= PE){
            return 1;
        } return 0;
    }

    public int contraatacar(){
        return -1;
    }

    public int restaurarSalud() {
        return -1;
    }

    public void actualitzarAtributs() {
        this.FOR = (FOR + (1*NIV) > 18) ? 18 : FOR;
        this.CON = (CON + (1*NIV) > 18) ? 18 : CON;
        this.VEL = (VEL + (1*NIV) > 18) ? 18 : VEL;
        this.INT = (INT + (1*NIV) > 18) ? 18 : INT;
        this.SOR = (SOR + (1*NIV) > 18) ? 18 : SOR;
    }

    public void actualizarNivell() {
        switch (NIV) {
            case 1:
                if (PEX >=100) {
                    PEX -=100;
                    NIV++;
                }
                break;
            case 2:
                if (PEX >= 200) {
                    PEX -=200;
                    NIV++;
                }
                break;
            case 3:
                if (PEX >= 400) {
                    PEX -=400;
                    NIV++;
                }
                break;
            case 4:
                if (PEX >= 500) {
                    PEX -=500;
                    NIV++;
                }
                break;
            case 5:
                break;
        }
    }
}
