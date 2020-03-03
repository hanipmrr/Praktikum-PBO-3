package BangunDatar;

public class Silinder extends Lingkaran {
    protected double tinggi;

    @Override
    public double GetPI(){
        return PI;
    }

    @Override
    public double GetR(){
        return r;
    }

    public double GetTinggi(){
        return tinggi;
    }

    public void SetTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double volume(){
        return (double) (PI * Math.pow(this.r, 2)*tinggi);
    }



}
