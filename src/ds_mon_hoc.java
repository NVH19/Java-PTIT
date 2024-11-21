
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
class KhachHang{
    private String id,name ;
    private int sotin;

    public KhachHang(String id, String name, int sotin) {
        this.id = id;
        this.name = name;
        this.sotin = sotin;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return id + ' ' + name + ' ' + sotin;
    }
}
public class ds_mon_hoc {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("MONHOC.in");
        Scanner sc = new Scanner(x);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> a = new ArrayList<>();
        while(t-- >0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int sotin = Integer.parseInt(sc.nextLine());
            KhachHang tmp = new KhachHang(id, name, sotin);
            a.add(tmp);
        }
        Collections.sort(a, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang a, KhachHang b){
                return a.getName().compareTo(b.getName());
            }
        });
        for(KhachHang i: a){
            System.out.println(i);
        }
    }
}
