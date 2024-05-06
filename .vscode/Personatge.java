public class Personatge {
    
    protected String nom;
    protected int FOR;
    protected int CON;
    protected int VEL;
    protected int INT;
    protected int SOR;

    protected Arma arma;

    public Personatge(String nom, int fOR, int cON, int vEL, int iNT, int sOR, Arma arma) {
        this.nom = nom;
        this.FOR = fOR;
        this.CON = cON;
        this.VEL = vEL;
        this.INT = iNT;
        this.SOR = sOR;
        this.arma = arma;
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

    @Override
    public String toString() {
        return nom;
    }

}
