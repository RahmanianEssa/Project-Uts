package com.nian.project_uts.models;

public class Computer {
    private static int gambar;
    private static String nama;

    public Computer(int gambar, String nama) {
        this.gambar=gambar;
        this.nama=nama;
    }

    public static int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public static String getNama() {
        return nama;
    }

    public  void setNama(String nama) {
        this.nama = nama;
    }
}
