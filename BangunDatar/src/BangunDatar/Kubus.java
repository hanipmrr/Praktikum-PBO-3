package BangunDatar;

public class Kubus extends Persegi {

    @Override
    public double GetSisi(){
        return sisi;
    }
    @Override
    public void SetSisi(double sisi){
        this.sisi = sisi;
    }

    public double volume(){
        return sisi*sisi*sisi;
    }
}
