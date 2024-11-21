
import java.io.File;
import java.io.FileNotFoundException;
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
    private String ma,name,id;
    private float giamua,giaban;
    private static int cnt=1;
    public MatHang(String ma, String name, float giamua, float giaban) {
        this.ma = ma;
        this.id = "MH" + String.format("%02d", cnt++);
        this.name = name;
        this.giamua = giamua;
        this.giaban = giaban;
    }
    public float loinhuan(){
        return giaban-giamua;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + ma + " " + String.format("%.2f", loinhuan());
    }

    
}
public class sx_mat_hang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> a = new ArrayList<>();
        while(t-- >0){
            a.add(new MatHang(sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine())));
        
        }
        Collections.sort(a, new Comparator<MatHang>(){
            public int compare(MatHang a, MatHang b){
                return Float.compare(a.loinhuan(), b.loinhuan());
            }
        });
        for(MatHang i : a){
            System.out.println(i);
        }
    }
}
