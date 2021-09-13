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
class bangunRuang
{
    int panjang;
    int lebar;
    int tinggi;
    double diameter;
    
    public bangunRuang(int pnj,int lbr,int tin,double dm)
    {
    panjang=pnj;
    lebar=lbr;
    diameter=dm;
    tinggi=tin;
    }
}

public class chapter_1c 
{
    public static int luasAlas(int pjg, int lbr)
    {
       return  pjg*lbr;
    }
    public static int volume(int pjg,int lbr,int tinggi)
    {
        int luasAlas=pjg*lbr;
        return luasAlas*tinggi;
    }
    public static double luasLingkaran(double diameter)
    {
        double jari=diameter/2;
        return jari*jari*3.14;
    }
    public static int luasBangun(int pjg,int lbr,int tinggi)
    {
        int luasPermukaan1=2*pjg*tinggi;
        int luasPermukaan2=2*lbr*tinggi;
        int luasPermukaan3=2*luasAlas(pjg,lbr);
        int luas=luasPermukaan1+luasPermukaan2+
                luasPermukaan3;
        return luas;
    }
    public static double volumeTabung(double diameter,int tinggi)
    {
        return luasLingkaran(diameter*tinggi);
    }
    public static double luasTabung(double diameter,int tinggi)
    {
        return diameter*3.14*tinggi;
    }
    public static void cetak(int pjg,int lbr,int tinggi,
            double diameter,int volp,int luasp,double volt,double luast)
    {
        //mencetak Hasil Bangun Ruang 
        System.out.println("=== Hasil Bangun Ruang ke-1 ====");
        System.out.println("Panjang: "+pjg+" lebar: "+
                lbr+" tinggi: "+tinggi+" Diameter: "+
                diameter);
        System.out.println("Volume Prisma ke-1 = "+volp);
        System.out.println("Luas Prisma ke-1 = "+luasp);
        System.out.println("Volume Tabung ke-1 = "+volt);
        System.out.println("Luas Tabung ke-1 = "+luast);
        System.out.println("");
    }
    
    public static void main (String []args) 
    {
        int volumePrisma1,volumePrisma2;
        double volumeTabung1,volumeTabung2;
        int luasPrisma1,luasPrisma2;
        double luasTabung1,luasTabung2;
        
        bangunRuang br1=new bangunRuang(4,3,20,10);
        
        if (br1.panjang>br1.lebar)
        {
            volumePrisma1=volume(br1.panjang,br1.lebar,
                    br1.tinggi);
        }
        else
        {
            volumePrisma1=0;
        }
        if (br1.panjang>br1.lebar)
        {
            luasPrisma1=luasBangun(br1.panjang,br1.lebar,
                    br1.tinggi);
        }
        else
        {
            luasPrisma1=0;
        }
        volumeTabung1=volumeTabung(
                br1.diameter,br1.tinggi);
        luasTabung1=luasTabung(br1.diameter,br1.tinggi);
        
        cetak(br1.panjang,br1.lebar,br1.tinggi,
                br1.diameter,volumePrisma1,luasPrisma1,
                volumeTabung1,luasTabung1);
        
        //BANGUN RUANG 2
        bangunRuang br2=new bangunRuang(9,12,30,17);
        if (br2.panjang>br2.lebar)
        {
            volumePrisma2=volume(br2.panjang,br2.lebar,
                    br2.tinggi);
        }
        else
        {
            volumePrisma2=0;
        }
        if (br2.panjang>br2.lebar)
        {
            luasPrisma2=luasBangun(br2.panjang,br2.lebar,
                    br2.tinggi);
        }
        else
        {
            luasPrisma2=0;
        }
        volumeTabung2=volumeTabung(
                br2.diameter,br2.tinggi);
        luasTabung2=luasTabung(br2.diameter,br2.tinggi);
        
        cetak(br2.panjang,br2.lebar,br2.tinggi,
                br2.diameter,volumePrisma2,luasPrisma2,
                volumeTabung2,luasTabung2);
    }
}

