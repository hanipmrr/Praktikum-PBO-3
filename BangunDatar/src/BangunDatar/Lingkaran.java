package BangunDatar;

public class Lingkaran extends BangunDatar {
    protected final double PI = (float) 3.14;
    protected double r;

    public double GetPI(){
        return PI;
    }
    public double GetR(){
        return r;
    }
    public void SetR(double r){
        this.r = r;
    }


     @Override
     public double Luas(){
         return (float) (PI * Math.pow(this.r, 2));
     }

    @Override
    public double Keliling() {
        return (float) (PI*2*r);
    }
}
