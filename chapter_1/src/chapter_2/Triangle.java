package chapter_2;

public class Triangle
{
    int Height;
    int Base;

    double calculateArea()
    {
       return this.Base*this.Height*0.5;
    }

    public static void main(String[] args)
    {
        //create objek ke-1
        Triangle obj1=new Triangle();
        obj1.Base=5;obj1.Height=10;
        System.out.println("luas Objek Segitiga ke-1: "+
                obj1.calculateArea());
        //create objek ke-2
        Triangle obj2=new Triangle();
        obj2.Base=4;obj2.Height=6;
        System.out.println("luas Objek Segitiga ke-2: "+
                obj2.calculateArea());
    }
}
