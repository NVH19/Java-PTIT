
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
class MatHang{
    private String id;
    private int nhap;

    public MatHang(String id, int nhap) {
        this.id = id;
        this.nhap = nhap;
    }
    public int xuat(){
        if(id.charAt(0)=='A') return (int) Math.round(0.6 * nhap);
        return (int) Math.round(0.7 * nhap);
    }
    public int dongia(){
        if(id.charAt(id.length()-1)=='Y') return 110000;
        return 135000;
    }
    public long tien(){
        return xuat() * dongia();
    }
    public long thue(){
        if(id.charAt(0)=='A' && id.charAt(id.length()-1)=='Y') return (long) Math.round(0.08 * tien());
        else if(id.charAt(0)=='A' && id.charAt(id.length()-1)=='N') return (long) Math.round(0.11 * tien());
        else if(id.charAt(0)=='B' && id.charAt(id.length()-1)=='Y') return (long) Math.round(0.17 * tien());
        return (long) Math.round(0.22 * tien());
    }
    public String out(){
        return id + " " + nhap + " " + xuat() + " " + dongia() + " " + tien() + " " + thue();
    }
}
public class bang_theo_doi_nhap_xuat_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> a = new ArrayList<>();
        while(t-- >0){
            String id = sc.nextLine();
            int nhap = Integer.parseInt(sc.nextLine());
            MatHang x = new MatHang(id, nhap);
            a.add(x);
        }
        for(MatHang i : a){
            System.out.println(i.out());
        }
    }
}
