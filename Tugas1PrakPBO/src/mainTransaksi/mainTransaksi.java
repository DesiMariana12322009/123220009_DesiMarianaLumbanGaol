/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainTransaksi;

/**
 *
 * @author Lenovo
 */
public class mainTransaksi {

public class MainPenjualan {
    public static void main(String[] args) {
        Penjualan penjualan = new Penjualan();
        int jumlahBarang = 5;
        double hargaSatuan = 10000;
        double totalHarga = penjualan.hitungTotalHarga(jumlahBarang, hargaSatuan);
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}
}