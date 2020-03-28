package com.nian.project_uts.models;

public class Computer {
    private int gambar;
    private  String nama;

    public Computer(int gambar, String nama) {
        this.gambar=gambar;
        this.nama=nama;
    }


    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
