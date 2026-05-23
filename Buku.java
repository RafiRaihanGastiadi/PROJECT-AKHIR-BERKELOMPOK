package model;

public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private String kategori;
    private int tahunTerbit; 

    public Buku() {}

    public Buku(int id, String judul, String penulis, String kategori, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.tahunTerbit = tahunTerbit;
    }

    public Buku(String judul, String penulis, String kategori, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.tahunTerbit = tahunTerbit;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }

    public String getPenulis() { return penulis; }
    public void setPenulis(String penulis) { this.penulis = penulis; }

    public String getKategori() { return kategori; }
    public void setKategori(String kategori) { this.kategori = kategori; }

    public int getTahunTerbit() { return tahunTerbit; }
    public void setTahunTerbit(int tahunTerbit) { this.tahunTerbit = tahunTerbit; }
}