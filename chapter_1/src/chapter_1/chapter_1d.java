/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_1;

/**
 *
 * @author Kurniawan
 */
class Bangun2D
{
    private final int len;
    private final int wid;
    public Bangun2D(int len,int width)
    {
        this.len=len;
        this.wid=width;
    }
    
    public int luasAlas()
    {
        return this.len*this.wid;
    }
    public int luasSisiSamping(int tinggi)
    {
        return this.len*tinggi;
    }
    public int luasSisiDepanBelakang(int tinggi)
    {
        return this.wid*tinggi;
    }
}
class Lingkaran
{
    private final double d;
    private final double phi=3.14;
    public Lingkaran(double diameter)
    {
        this.d=diameter;
    }
    private double calJari()
    {
        return this.d/2;
    }
    public double calLuasAlas()
    {
        return this.phi*this.phi*calJari();
    }
    public double calKeliling()
    {
        return this.d*this.phi;
    }
}
class BangunRuangPrisma
{
    int tinggi;
    public Bangun2D bgn2d;
    
    public BangunRuangPrisma(int pnj,int lbr,int tin)
    {
    tinggi=tin;
    bgn2d = new Bangun2D(pnj,lbr);
    }
    
    public int calVolumePrisma()
    {
        return bgn2d.luasAlas()*this.tinggi;
    }
    
    public int calLuasPrisma()
    {
        return (bgn2d.luasAlas()*2)+
                (bgn2d.luasSisiDepanBelakang(this.tinggi)*2)+
                (bgn2d.luasSisiSamping(this.tinggi)*2);
    }
}

class BangunRuangTabung
{
    int tinggi;
    Lingkaran lngk;
    public BangunRuangTabung(double diameter,int height)
    {
        this.tinggi=height;
        this.lngk =new Lingkaran(diameter);
    }
    public double calVolumeTabung()
    {
        return lngk.calLuasAlas()*tinggi;
    }
    public double luasTabung()
    {
        return lngk.calKeliling()*this.tinggi;
    }
}
class Logic
{
    int p,l, t;
    double d;
    BangunRuangTabung BRT;
    BangunRuangPrisma BRP;
    int luasPrisma,volPrisma;
    double luasTabung,volTabung;
    
    public Logic(int panjang,int lebar,
            double diameter, int tinggi)
    {
        BRT=new BangunRuangTabung(diameter, tinggi);
        BRP=new BangunRuangPrisma(panjang,lebar,tinggi);
        this.p=panjang;
        this.l=lebar;
        this.d=diameter;
        this.t=tinggi;
        logika();
        cetak();
    }
    private void logika()
    {
        if (p>l)
        {
            this.volPrisma=BRP.calVolumePrisma();
            this.luasPrisma=BRP.calLuasPrisma();
        }
        this.volTabung=BRT.calVolumeTabung();
        this.luasTabung=BRT.luasTabung();
    }
    private void cetak()
    {
        //mencetak Hasil Bangun Ruang 
        System.out.println("=== Hasil Bangun Ruang  ====");
        System.out.println("Panjang: "+p+" lebar: "+
                l+" tinggi: "+t+" Diameter: "+
                d);
        System.out.println("Volume Prisma ke-1 = "+this.volPrisma);
        System.out.println("Luas Prisma ke-1 = "+this.luasPrisma);
        System.out.println("Volume Tabung ke-1 = "+this.volTabung);
        System.out.println("Luas Tabung ke-1 = "+this.luasTabung);
        System.out.println("");
    }
}

public class chapter_1d
{
    public static void main (String []args) 
    {
        Logic Objek1=new Logic(4,3,10,20);
        Logic Objek2=new Logic(9,12,17,30);
    }
}

