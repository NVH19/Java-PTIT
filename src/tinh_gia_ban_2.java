
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
class MatHang{
    private String id , name ,dv ;
    private int gia, soluong;
    private static int cnt=1;
    public MatHang(String name, String dv,int gia, int soluong) {
        this.name = name;
        this.id  = "MH" + String.format("%02d", cnt++);
        this.dv = dv;
        this.gia = gia;
        this.soluong = soluong;
    }
    public double phi(){
        double tmp = gia*soluong*0.05;
        return Math.round(tmp);
    }
    public double tien(){
        double tmp = gia*soluong + phi();
        return Math.round(tmp);
    }
    public double giaban(){
        double tmp  = (tien()*1.02) / soluong;
        return Math.ceil(tmp/100.0)*100;
    }
    public String out(){
        return id + " " + name + " " + dv + " " + (int)phi() + " " + (int)tien() + " " + (int)giaban();
    }
}
public class tinh_gia_ban_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> a = new ArrayList<>();
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            sc.nextLine();
            MatHang x = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            a.add(x);
        }
        Collections.sort(a, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang a , MatHang b){
                return Double.compare(b.giaban(), a.giaban());
            }
        });
        for(MatHang i : a){
            System.out.println(i.out());
        }
    }
}
