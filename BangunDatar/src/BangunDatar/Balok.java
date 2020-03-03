package BangunDatar;

public class Balok extends PersegiPanjang {
    protected double tinggi;

    public double GetPanjang(){
        return panjang;
    }
    public double GetLebar(){
        return lebar;
    }
    public double GetTinggi(){
        return tinggi;
    }
    public void SetTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double volume(){
        return panjang*lebar*tinggi;
    }
}
