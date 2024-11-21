
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
class DoanhNghiep{
    private String ma , name;
    private int soluong;
    public DoanhNghiep(String ma, String name, int soluong) {
        this.ma = ma;
        this.name = name;
        this.soluong = soluong;
    }

    public String getMa() {
        return ma;
    }
    public String toString(){
        return ma + " " + name + " " + soluong;
    }
}
public class ds_doanh_nghiep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> a = new ArrayList<>();
        while(t-- >0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            int soluong = Integer.parseInt(sc.nextLine());
            DoanhNghiep x = new DoanhNghiep(ma, name,soluong);
            a.add(x);
        }
        Collections.sort(a, new Comparator<DoanhNghiep>(){
            @Override
            public int compare(DoanhNghiep a, DoanhNghiep b){
                return a.getMa().compareTo(b.getMa());
            }
        });
        for(DoanhNghiep i:a){
            System.out.println(i);
        }
    }
}
