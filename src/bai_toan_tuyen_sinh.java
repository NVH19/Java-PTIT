
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
class ThiSinh{
    private String id , name;
    private double t,l,h;

    public ThiSinh(String id, String name, double t, double l, double h) {
        this.id = id;
        this.name = name;
        this.t = t;
        this.l = l;
        this.h = h;
    }
    public double diemUuTien(){
        String tmp = id.substring(0,3);
        if(tmp.equals("KV1")) return 0.5;
        else if(tmp.equals("KV2")) return 1;
        return 1.5;
    }
    public double  tong(){
        return (2*t+l+h);
    }
    public String kiemTra(){
        if(tong() + diemUuTien() >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }
    public String reset(double a){
        if(a%1==0){
            int x = (int)a;
            return Integer.toString(x);
        }
        else return Double.toString(a);
    }
    public String toString(){
        return id + " " + name + " " + reset(diemUuTien()) + " " + reset(tong()) + " " + kiemTra();
    }
}
public class bai_toan_tuyen_sinh {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String id = sc.nextLine();
         String name = sc.nextLine();
         double t = sc.nextDouble();
         double l = sc.nextDouble();
         double h = sc.nextDouble();
         ThiSinh a = new ThiSinh(id, name, t, l, h);
         System.out.println(a);
    }
}
