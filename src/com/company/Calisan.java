package com.company;

public class Calisan {
    private String adSoyad;
    private String telefon;
    private String eposta;
    private String calismaSaati;

    public Calisan() {

    }

    public Calisan(String adSoyad, String telefon, String eposta, String calismaSaati) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta;
        this.calismaSaati = calismaSaati;
    }

    public String getAdSoyad() {
        return this.adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return this.telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return this.eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void giris() {
        System.out.println(this.adSoyad + " giriş yaptı.");
    }
}
