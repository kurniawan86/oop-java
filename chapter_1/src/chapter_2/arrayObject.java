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
        segitiga [] triangle;
        triangle = new segitiga[2];
        triangle[0] = new segitiga(3,2);
        System.out.println("luas Segitiga 1:"+
                triangle[0].CalculateArea());
        triangle[1] = new segitiga(10,5);
        System.out.println("luas Segitiga 2:"+
                triangle[1].CalculateArea());
    }
}





