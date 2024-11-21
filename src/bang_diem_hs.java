
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
class HocSinh{
    private String name,id;
    private double a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
    private static int cnt=1;
    public HocSinh(String name, double a1, double a2, double a3, double a4, double a5, double a6, double a7, double a8, double a9, double a10) {
        this.name = name;
        this.a1 = a1;
        this.id = "HS" + String.format("%02d",cnt++);
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;
        this.a8 = a8;
        this.a9 = a9;
        this.a10 = a10;
    }
    public double tb(){
        return (a1*2+a2*2+a3+a4+a5+a6+a7+a8+a9+a10)/12;
    }
    public String xeploai(){
        double diemtb = tb();
        if(diemtb>=9) return "XUAT SAC";
        else  if(diemtb >=8) return "GIOI";
        else if(diemtb >= 7) return "KHA";
        else if(diemtb >= 5) return "TB";
        return "YEU";
    }
    public String out(){
        return id + " " + name + " " + ((double)(Math.round(tb()*10.0)/10.0)) + " " + xeploai();
    }
}
public class bang_diem_hs {
    public static void main(String[] args) {
        ArrayList<HocSinh> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            sc.nextLine();
            HocSinh x = new HocSinh(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
        }
        Collections.sort(a, new Comparator<HocSinh>(){
            @Override
            public int compare(HocSinh a, HocSinh b){
                return Double.compare(b.tb(), a.tb());
            }
        });
        for(HocSinh i : a){
            System.out.println(i.out());
        }
    }
}
