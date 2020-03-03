package BangunDatar;


public class Main {
    public static void main(String[] args){


        System.out.println("\n\n");
        Persegi p = new Persegi();
        p.SetSisi(5);
        System.out.println("PERSEGI");
        System.out.println("Sisi = " + p.GetSisi());
        System.out.println("Luas = " + p.Luas());
        System.out.println("Keliling = " + p.Keliling());
        System.out.println("\n");
        
        Lingkaran l = new Lingkaran();
        l.SetR(10);
        System.out.println("LINGKARAN");
        System.out.println("Jari-jari = " + l.GetR());
        System.out.println("Luas = " + l.Luas());
        System.out.println("Keliling = " + l.Keliling());
        System.out.println("\n");
        
        PersegiPanjang pp = new PersegiPanjang();
        pp.SetPanjang(10);
        pp.SetLebar(5);
        System.out.println("PERSEGI PANJANG");
        System.out.println("Panjang = " + pp.GetPanjang());
        System.out.println("Lebar = " + pp.GetLebar());
        System.out.println("Luas = " + pp.Luas());
        System.out.println("Keliling = " + pp.Keliling());
        System.out.println("\n");
        
        Segitiga segitiga = new Segitiga();
        segitiga.SetAlas(8);
        segitiga.SetTinggi(10);
        System.out.println("SEGITIGA");
        System.out.println("Alas\t\t= " + segitiga.GetAlas());
        System.out.println("Tinggi\t\t= "+ segitiga.GetTinggi());
        System.out.println("Luas\t\t= " + segitiga.Luas());
        System.out.println("Keliling\t= " + segitiga.Keliling());
        
        Kubus kubus = new Kubus();
        kubus.SetSisi(5);
        System.out.println("KUBUS");
        System.out.println("Sisi\t= " + kubus.GetSisi());
        System.out.println("Volume\t= " + kubus.volume());
                
        Balok balok = new Balok();
        balok.SetPanjang(20);
        balok.SetLebar(10);
        balok.SetTinggi(5);
        System.out.println("BALOK");
        System.out.println("Panjang\t= " + balok.GetPanjang());
        System.out.println("Lebar\t= " + balok.GetLebar());
        System.out.println("Tinggi\t= " + balok.GetTinggi());
        System.out.println("Volume\t= " + balok.volume());
        
        Silinder silinder = new Silinder();
        silinder.SetR((float)10);
        silinder.SetTinggi(15);
        System.out.println("SILINDER");        
        System.out.println("Tinggi\t= " + silinder.GetTinggi());
        System.out.println("Jari-jari\t= " + silinder.GetR());
        System.out.println("Volume\t= " + silinder.volume());
       
        

    }
}
