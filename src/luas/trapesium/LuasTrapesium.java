/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luas.trapesium;

/**
 *
 * @author MOKLET-2
 */
public class LuasTrapesium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("<< Menghitung Luas Trapesium >>");
        System.out.println("=============================>");
        trapesium ku = new trapesium();
        ku.masukan();
        ku.hitung();

        System.out.println(ku.hasil());
    }
}

