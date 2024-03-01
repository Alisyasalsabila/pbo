/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymorphisme;

/**
 *
 * @author User
 */
public class Polymorphisme {

    public static void main(String[] args) {
        Manusia mn = new Manusia();
        
        Dewasa dw = new Dewasa();
        Remaja rm = new Remaja();
        AnakAnak aa = new AnakAnak();
        Bayi by = new Bayi();
        
        mn.tampilsuara();
        dw.tampilsuara();
        rm.tampilsuara();
        aa.tampilsuara();
        by.tampilsuara();
        
    }
}
