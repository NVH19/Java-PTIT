
import java.io.DataInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
public class so_khac_nhau_trong_file2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream x = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] a = new int[10002];
        for (int i = 0; i < 100000; i++) {
            a[x.readInt()]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (a[i] > 0) {
                System.out.println(i + " " + a[i]);
            }
        }
        
    }
}
