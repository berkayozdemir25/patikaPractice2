package com.company;

public class Bilgiİslem extends Memur{
    private String gorev;
    public Bilgiİslem(String adSoyad,String telefon,String eposta,String calismaSaati,String departman,String mesai,String gorev){
        super(adSoyad,telefon,eposta,calismaSaati,departman,mesai);
        this.gorev=gorev;
    }
    public void networkKurulum(){
        System.out.println(this.getAdSoyad()+" network kurulumu yaptı.");
    }
}
