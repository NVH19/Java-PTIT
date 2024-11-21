
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
    private String name,nhomhang;
    private int id;
    private double giamua,giaban;
    private static int cnt=1;
    public MatHang(String name, String nhomhang, double giamua, double giaban) {
        this.name = name;
        this.id = cnt++;
        this.nhomhang = nhomhang;
        this.giamua = giamua;
        this.giaban = giaban;
    }
    public double lai(){
        return giaban-giamua;
    }
    public String out(){
        return id + " " + name + " " + nhomhang + " " + String.format("%.2f", lai());
    }
}
public class sx_danh_sach_mat_hang {
    public static void main(String[] args) {
        ArrayList<MatHang> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            sc.nextLine();
            MatHang x = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
        }
        Collections.sort(a, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang a, MatHang b){
                return  Double.compare(b.lai(), a.lai());
            }
        });
        for(MatHang i : a){
            System.out.println(i.out());
        }
    }
}
