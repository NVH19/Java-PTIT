
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
    private String name ;
    private int ac, sub;

    public SinhVien(String name, int ac, int sub) {
        this.name = name;
        this.ac = ac;
        this.sub = sub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }
    public String out(){
        return name + " " + ac + " " + sub;
    }
}
public class bang_xep_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        for(int i=0; i<t; i++){
            String name = sc.nextLine();
            String[] tmp = sc.nextLine().split(" ");
            int ac = Integer.parseInt(tmp[0]);
            int sub = Integer.parseInt(tmp[1]);
            SinhVien x = new SinhVien(name,ac, sub);
            a.add(x);
        }
        Collections.sort(a, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien a, SinhVien b){
                if(a.getAc()==b.getAc()){
                   if(a.getSub()==b.getSub()){
                       return a.getName().compareTo(b.getName());
                   }
                   return Integer.compare(a.getSub(), b.getSub());
                }
                return Integer.compare(b.getAc(), a.getAc());
            }
        });
        for(SinhVien i : a){
            System.out.println(i.out());
        }
    }
}
