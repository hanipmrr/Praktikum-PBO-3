package BangunDatar;

public class Persegi extends BangunDatar {
    protected double sisi;

    public double GetSisi(){
        return sisi;
    }
    public void SetSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double Luas(){
        return this.sisi * this.sisi;
    }

    @Override
    public double Keliling() {
        return 4*sisi;
    }
}
