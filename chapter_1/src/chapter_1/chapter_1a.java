package chapter_1;

public class chapter_1a 
{
    public static void main(String[] args) 
    {
        //inisialisasi Variable
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
        
        //BANGUN RUANG 1
        //pengujian panjang > lebar
        if (panjangPersegi1>lebarPersegi1)
        {
            //menghitung luas persegi
            int luasAlas1=panjangPersegi1*lebarPersegi1;
            
            //menghitung volume prisma
            volumePrisma1=luasAlas1*tinggiBangunan1;
        }
        else
        {
            volumePrisma1=0;
        }
        
        //Menghitung Luas permukaan Prisma 1
        if (panjangPersegi1>lebarPersegi1)
        {
            int luasPermukaan1=2*(panjangPersegi1*tinggiBangunan1);
            int luasPermukaan2=2*(lebarPersegi1*tinggiBangunan1);
            luasPrisma1=luasPermukaan1+luasPermukaan2;
        }
        else
        {
            luasPrisma1=0;
        }
        
        //menghitung jari-jari lingkaran 1
        double jari=diameterLingkaran1/2;
        
        //menghitung luas lingkaran 1
        double luasLingkaran=jari*jari*3.14;
        
        //menghitung Volume Tabung1
        volumeTabung1=luasLingkaran*tinggiBangunan1;
        
        //menghitung luas permukaan tabung1
        double kelilingLingkaran=diameterLingkaran1*3.14;
        luasTabung1=kelilingLingkaran*tinggiBangunan1;
        
        //mencetak Hasil Bangun Ruang 1
        System.out.println("=== Hasil Bangun Ruang ke-1 ====");
        System.out.println("Panjang: "+panjangPersegi1+" lebar: "+
                lebarPersegi1+" tinggi: "+tinggiBangunan1+" Diameter: "+
                diameterLingkaran1);
        System.out.println("Volume Prisma ke-1 = "+volumePrisma1);
        System.out.println("Luas Prisma ke-1 = "+luasPrisma1);
        System.out.println("Volume Tabung ke-1 = "+volumeTabung1);
        System.out.println("Luas Tabung ke-1 = "+luasTabung1);
        System.out.println("");
        
        //BANGUN RUANG 2
        //pengujian panjang > lebar
        if (panjangPersegi2>lebarPersegi2)
        {
            //menghitung luas persegi
            int luasAlas2=panjangPersegi2*lebarPersegi2;
            
            //menghitung volume prisma 2
            volumePrisma2=luasAlas2*tinggiBangunan2;
        }
        else
        {
            volumePrisma2=0;
        }
        
        //Menghitung Luas permukaan Prisma 2
        if (panjangPersegi2>lebarPersegi2)
        {
            int luasPermukaan1=2*(panjangPersegi2*tinggiBangunan2);
            int luasPermukaan2=2*(lebarPersegi2*tinggiBangunan2);
            luasPrisma2=luasPermukaan1+luasPermukaan2;
        }
        else
        {
            luasPrisma2=0;
        }
        
        //menghitung jari-jari lingkaran 2
        double jari2=diameterLingkaran2/2;
        
        //menghitung luas lingkaran 2
        double luasLingkaran2=jari2*jari2*3.14;
        
        //menghitung Volume Tabung2
        volumeTabung2=luasLingkaran2*tinggiBangunan2;
        
        //menghitung luas permukaan tabung2
        double kelilingLingkaran2=diameterLingkaran2*3.14;
        luasTabung2=kelilingLingkaran2*tinggiBangunan2;
        
        //mencetak Hasil Bangun Ruang 2
        System.out.println("=== Hasil Bangun Ruang ke-2 ====");
        System.out.println("Panjang: "+panjangPersegi2+" lebar: "+
        lebarPersegi2+" tinggi: "+tinggiBangunan2+" Diameter: "+
        diameterLingkaran2);
        System.out.println("Volume Prisma ke-2 = "+volumePrisma2);
        System.out.println("Luas Prisma ke-2 = "+luasPrisma2);
        System.out.println("Volume Tabung ke-2 = "+volumeTabung2);
        System.out.println("Luas Tabung ke-2 = "+luasTabung2);
        System.out.println("");
    }
}
