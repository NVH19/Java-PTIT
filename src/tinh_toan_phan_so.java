
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 * 
 */
class Point{
    private long a,b;

    public Point(long a, long b) {
        this.a = a;
        this.b = b;
    }
    public long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public void rutgon(){
        long x = gcd(Math.abs(this.a), Math.abs(this.b));
        this.a = this.a / x;
        this.b = this.b / x;
        if(this.a<0 && this.b<0){
            this.a = this.a * -1;
            this.b = this.b * -1;
        }
    }
    public Point tong(Point x){
        long tu = this.a * x.b + this.b * x.a;
        long mau = this.b * x.b;
        Point t = new Point(tu*tu,mau*mau);
        t.rutgon();
        return t;
    }
    public Point tich(Point x){
        long tu = x.a * this.a;
        long mau = x.b * this.b;
        Point t = new Point(tu,mau);
        t.rutgon();
        return t;
    }
    public String out(){
        return a + "/" + b;
    }
}
public class tinh_toan_phan_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            long a1 = sc.nextLong();
            long b1 = sc.nextLong();
            long a2 = sc.nextLong();
            long b2 = sc.nextLong();
            if(b1<0){
                a1 = a1*(-1);
                b1 = b1*(-1);
            }
            if(b2<0){
                a2 = a2*(-1);
                b2 = b2*(-1);
            }
            Point c = new Point(a1, b1);
            Point d = new Point(a2, b2);
            Point e  =c.tong(d);
            Point f = c.tich(e).tich(d);
//            System.out.println(c.out() + " " + d.out());
            System.out.println(e.out() + " " + f.out());
        }
    }
}
