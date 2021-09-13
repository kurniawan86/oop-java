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
public class chapter_1b 
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
        //mencetak Hasil Bangun Ruang 1
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
        //inisialisasi Variabl
        int panjangPersegi1=4;
        int lebarPersegi1=3;
        double diameterLingkaran1=10;
        int tinggiBangunan1=20;
        int panjangPersegi2=9;
        int lebarPersegi2=12;
        double diameterLingkaran2=17;
        int tinggiBangunan2=30;
        int volumePrisma1,volumePrisma2;
        double volumeTabung1,volumeTabung2;
        int luasPrisma1,luasPrisma2;
        double luasTabung1,luasTabung2;
        
        if (panjangPersegi1>lebarPersegi1)
        {
            volumePrisma1=volume(panjangPersegi1,lebarPersegi1,
                    tinggiBangunan1);
        }
        else
        {
            volumePrisma1=0;
        }
        if (panjangPersegi1>lebarPersegi1)
        {
            luasPrisma1=luasBangun(panjangPersegi1,lebarPersegi1,
                    tinggiBangunan1);
        }
        else
        {
            luasPrisma1=0;
        }
        volumeTabung1=volumeTabung(
                diameterLingkaran1,tinggiBangunan1);
        luasTabung1=luasTabung(diameterLingkaran1,tinggiBangunan1);
        
        cetak(panjangPersegi1,lebarPersegi1,tinggiBangunan1,
                diameterLingkaran1,volumePrisma1,luasPrisma1,
                volumeTabung1,luasTabung1);
        
        //BANGUN RUANG 2
        //pengujian panjang > lebar
        if (panjangPersegi2>lebarPersegi2)
        {
            volumePrisma2=volume(panjangPersegi2,lebarPersegi2,
                    tinggiBangunan2);
        }
        else
        {
            volumePrisma2=0;
        }
        
        if (panjangPersegi2>lebarPersegi2)
        {
            luasPrisma2=luasBangun(panjangPersegi2,lebarPersegi2,
                    tinggiBangunan2);
        }
        else
        {
            luasPrisma2=0;
        }
        
         volumeTabung2=volumeTabung(
                diameterLingkaran2,tinggiBangunan2);
        luasTabung2=luasTabung(diameterLingkaran2,tinggiBangunan2);
        
        cetak(panjangPersegi2,lebarPersegi2,tinggiBangunan2,
                diameterLingkaran2,volumePrisma2,luasPrisma2,
                volumeTabung2,luasTabung2);
    }
}
