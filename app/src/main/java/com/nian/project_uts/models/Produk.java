package com.nian.project_uts.models;

public class Produk {
    private int gambar;
    private String tipe;
    private String detail;
    private String harga;

    public Produk(int gambar, String tipe, String detail, String harga) {
        this.gambar = gambar;
        this.tipe = tipe;
        this.detail = detail;
        this.harga = harga;
    }
    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }


}
