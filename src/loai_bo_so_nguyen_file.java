
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.util.Collections;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
public class loai_bo_so_nguyen_file {
    public static void main(String[] args) throws FileNotFoundException {
        File tmp = new File("DATA.in");
        Scanner sc = new Scanner(tmp);
        Vector<String> v = new Vector<>();
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                Integer.parseInt(s);
            } catch (Exception x) {
                v.add(s);
            }
        }
        Collections.sort(v);
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
    }
}
