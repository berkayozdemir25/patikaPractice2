package com.company;

public class Akademisyen extends Calisan {
    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, String telefon, String eposta, String calismaSaati, String bolum, String unvan) {
        super(adSoyad, telefon, eposta, calismaSaati);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public void derseGir() {
        System.out.println(this.getAdSoyad() + " derse giriş yaptı.");
    }
}
