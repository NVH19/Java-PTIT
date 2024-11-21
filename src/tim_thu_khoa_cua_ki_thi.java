
import java.util.ArrayList;
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
    private String name,ngaysinh;
    private int id;
    private double t,l,h;
    private static int cnt=1;
    public ThiSinh(String name, String ngaysinh, double t, double l, double h) {
        this.name = name;
        this.id = cnt++;
        this.ngaysinh = ngaysinh;
        this.t = t;
        this.l = l;
        this.h = h;
    }
    public double tong(){
        return t+l+h;
    }
    public String out(){
        return id + " " + name + " " + ngaysinh + " " + tong();
    }
}
public class tim_thu_khoa_cua_ki_thi {
    public static void main(String[] args) {
        ArrayList<ThiSinh> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double max = 0;
        for(int i=0; i<t; i++){
            sc.nextLine();
            ThiSinh x = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(),sc.nextDouble());
            a.add(x);
            if(x.tong() > max) max = x.tong();
        }
        for(ThiSinh i : a){
            if(i.tong() == max){
                System.out.println(i.out());
            }
        }
    }
}
