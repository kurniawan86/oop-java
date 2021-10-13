package chapter_2;

class segitiga
{
    int Height;
    int Base;

    public segitiga(int tinggi, int alas)
    {
        this.Height = tinggi;
        this.Base = alas;
    }

    public double CalculateArea()
    {
        return this.Base*this.Height*0.5;
    }
}

public class arrayObject
{
    public static void main(String[]args)
    {
        segitiga [] triagle = new segitiga[2];
        triagle[0] = new segitiga(3,2);
        System.out.println("luas Segitiga 1:"+
                triagle[0].CalculateArea());
        triagle[1] = new segitiga(10,5);
        System.out.println("luas Segitiga 2:"+
                triagle[1].CalculateArea());
    }
}





