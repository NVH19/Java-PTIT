
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
class Point{
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point tong(Point a){
        int c = this.x + a.x;
        int d = this.y + a.y;
        Point t = new Point(c, d);
        return t;
    }
    public Point tich(Point a){
        int c = this.x*a.x + this.y*a.y*-1;
        int d = this.x*a.y + this.y*a.x;
        Point t = new Point(c, d);
        return t;
    }
    public String out(){
        if(this.y <0){
            return this.x + " - " + (this.y * -1) + "i"; 
        }
        return this.x + " + " + this.y + "i" ;
    }
}
public class so_phuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            Point c = new Point(a, b);
            Point d = new Point(a1, b1);
            Point e = c.tong(d).tich(c);
            Point f = c.tong(d);
            f = f.tich(f);
            System.out.println(e.out() + ", " + f.out());
        }
    }
}
