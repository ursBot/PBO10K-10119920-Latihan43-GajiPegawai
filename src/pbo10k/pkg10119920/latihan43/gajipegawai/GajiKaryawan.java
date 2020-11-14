/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan43.gajipegawai;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class GajiPegawai {
    
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public int getUangTransport(){
        return uangTransport;
    }
    public void setUangTransport(int uangTransport){
        this.uangTransport = uangTransport;
    }
    
    public int getUangTunjangan(){
        return uangTunjangan;
    }
    public void setUangTunjangan(int uangTunjangan){
        this.uangTunjangan = uangTunjangan;
    }
    
    public int getGajiPokok(){
        return gajiPokok;
    }
    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    public int getTotalGaji(){
        return totalGaji;
    }
    public void setTotalGaji(int totalGaji){
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        return uangTunjangan + uangTransport + gajiPokok;
    }
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji){
        System.out.println("### Gaji Karyawan PT. KAKATU ###");
        System.out.println("--------------------");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Uang Transport: Rp. " + uangTransport);
        System.out.println("Uang Tunjangan: Rp. " + uangTunjangan);
        System.out.println("Gaji Pokok: Rp. " + gajiPokok);
        System.out.println("TOTAL GAJI: Rp. " + totalGaji);
        
    }
    
}

public class GajiKaryawan {
    
    public static void main(String[] args) {
        
        GajiPegawai gp = new GajiPegawai();
        
        gp.setNama("Rizki Adam Kurniawan");
        gp.setAlamat("Jalan Semar dlm 4 No 72/66");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);
        gp.tampilData(gp.getNama(), gp.getAlamat(), gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok(), gp.totalGaji(gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok()));
    }
}