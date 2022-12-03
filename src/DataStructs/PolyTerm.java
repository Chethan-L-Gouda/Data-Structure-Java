package DataStructs;

public class PolyTerm {
    private double coef;
    private int expon;
    PolyTerm(double coef,int expon){
        this.coef=coef;
        this.expon=expon;
    }
    public double getCoef(){return coef;}
    public int getExpon(){return expon;}
}
