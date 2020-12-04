/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.tandanyakamu;

/**
 * @author
 * NAMA     : Rachman Aldiansyah
 * KELAS    : IF-1
 * NIM      : 10119038
 * Deskripsi Program : Program ini berisi menghitung usia dengan pendekatan object oriented
 */

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Age usia = new Age(2018);
        
        System.out.print("Masukan Tahun Lahir Anda : ");
        usia.setYearBirth(sc.nextInt());
        
        System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + usia.getYearBirth());
        System.out.println("Hari ini Tahun : " + usia.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + usia.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu ".concat(usia.tandanyaKamu(usia.hitungUmur())));
    }
}