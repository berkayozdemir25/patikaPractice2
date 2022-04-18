package com.company;

public class OgretimGorevlisi extends Akademisyen{
    private String kapiNo;

    public OgretimGorevlisi(String adSoyad,String telefon,String eposta,String calismaSaati,String bolum,String unvan,String kapiNo){
        super(adSoyad,telefon,eposta,calismaSaati,bolum,unvan);
        this.kapiNo=kapiNo;
    }
}
