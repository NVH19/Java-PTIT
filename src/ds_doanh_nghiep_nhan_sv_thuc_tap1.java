
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
    private String id, name;
    private int soluong;

    public DoanhNghiep(String id, String name, int soluong) {
        this.id = id;
        this.name = name;
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String out(){
        return id + " " + name + " " + soluong;
    }
}
public class ds_doanh_nghiep_nhan_sv_thuc_tap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DoanhNghiep> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            DoanhNghiep x = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            a.add(x);
        }
        Collections.sort(a, new Comparator<DoanhNghiep>(){
            @Override
            public int compare(DoanhNghiep a , DoanhNghiep b){
                if(a.getSoluong()==b.getSoluong()) return a.getId().compareTo(b.getId());
                return Integer.compare(b.getSoluong(), a.getSoluong());
            }
        });
        for(DoanhNghiep i : a){
            System.out.println(i.out());
        }
    }
}
