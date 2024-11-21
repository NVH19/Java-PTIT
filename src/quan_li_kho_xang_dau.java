
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
    private int soluong;

    public MatHang(String id, int soluong) {
        this.id = id;
        this.soluong = soluong;
    }
    public String name(){
        String tmp = id.substring(id.length()-2);
        if(tmp.equals("BP")) return "British Petro";
        if(tmp.equals("ES")) return "Esso";
        if(tmp.equals("SH")) return "Shell";
        if(tmp.equals("CA")) return "Castrol";
        if(tmp.equals("MO")) return "Mobil";
        return "Trong Nuoc";
    }
    public int dongia(){
        if(id.charAt(0)=='X') return 128000;
        if(id.charAt(0)=='D') return 11200;
        return 9700;
    }
    public long tien(){
        return soluong * dongia();
    }
    public long thue(){
        if(name().equals("Trong nuoc")) return 0;
        if(id.charAt(0)=='X') return (long) Math.ceil(tien() * 0.03);
        if(id.charAt(0)=='D') return (long) Math.ceil(tien() * 0.035);
        return (long) Math.ceil(tien() * 0.02);
    }
    public long thanhtien(){
        return tien() + thue();
    }
    public String out(){
        return id + " " + name() + " " + dongia() + " " + thue() + " " + thanhtien();
    }
}
public class quan_li_kho_xang_dau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String[] tmp = sc.nextLine().split("\\s+");
            String id = tmp[0];
            int soluong = Integer.parseInt(tmp[1]);
            MatHang x = new MatHang(id,soluong);
            a.add(x);
        }
        for(MatHang i : a){
            System.out.println(i.out());
        }
    }
}
