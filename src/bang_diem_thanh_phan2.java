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
class SinhVien{
    private String msv , name , lop;
    private double t,l,h;
    private int id;
    private static int cnt=1;
    public SinhVien(String msv, String name, String lop, double t, double l, double h) {
        this.msv = msv;
        this.id = cnt++;
        this.name = name;
        this.lop = lop;
        this.t = t;
        this.l = l;
        this.h = h;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String out(){
        return " " + msv + " " + name + " " + lop + " " + String.format("%.1f", t) + " " + String.format("%.1f", l) + " " +String.format("%.1f", h);
    }
}
public class bang_diem_thanh_phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> a = new ArrayList<>();
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            sc.nextLine();
            SinhVien x;
            x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), sc.nextDouble());
            a.add(x);
        }
        Collections.sort(a, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien a , SinhVien b){
                return a.getName().compareTo(b.getName());
            }
        });
        for(int i=0; i<t; i++){
            System.out.print(i+1);
            System.out.println(a.get(i).out());
        }
    }
}
