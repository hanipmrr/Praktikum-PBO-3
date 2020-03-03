package BangunDatar;

public class PersegiPanjang extends BangunDatar {
    protected double panjang,lebar;

    public double GetPanjang(){
        return panjang;
    }

    public double GetLebar(){
        return lebar;
    }

    public void SetPanjang(double panjang){
        this.panjang = panjang;
    }
    public void SetLebar(double lebar){
        this.lebar = lebar;
    }

    @Override
    public double Luas(){
        return panjang*lebar;
    }
    
    @Override
    public double Keliling(){
        return 2*(panjang+lebar);
    }

}
