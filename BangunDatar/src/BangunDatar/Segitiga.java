package BangunDatar;

public class Segitiga extends BangunDatar {
    private double alas, tinggi;

    public double GetAlas(){
        return alas;
    }
    public double GetTinggi(){
        return tinggi;
    }

    public void SetAlas(double alas){
        this.alas = alas;
    }
    public void SetTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    @Override
    public double Luas(){
        return (alas*tinggi)/2;
    }
    @Override
    public double Keliling(){
        return 3*alas;
    }
}
