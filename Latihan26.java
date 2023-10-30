/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan26;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author user 
 Nama              : Bintang Fajar Nusantara 
 Nim               : 22205028 
 Prodi             : Teknik Informatika 
 Kelas             : PBO 1
 Deskripsi Program : Program ini berisi program yang menampilkan Waktu Saat Ini
 */
public class Latihan26 {
    public static void main(String[] args) {
        Date tanggalWaktuSaatIni = new Date();
        SimpleDateFormat formatTanggalWaktu = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String tanggalWaktuSaatIniString = formatTanggalWaktu.format(tanggalWaktuSaatIni);

        System.out.println("Tanggal dan waktu saat ini: " + tanggalWaktuSaatIniString);
    }
    
}
