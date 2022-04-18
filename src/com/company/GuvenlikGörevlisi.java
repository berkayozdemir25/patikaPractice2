package com.company;

public class GuvenlikGörevlisi extends Memur{
    private String belge;
    public GuvenlikGörevlisi(String adSoyad,String telefon,String eposta,String calismaSaati,String departman,String mesai,String belge){
        super(adSoyad,telefon,eposta,calismaSaati,departman,mesai);
        this.belge=belge;
    }
    public void nobet(){
        System.out.println(this.getAdSoyad()+" nöbeti devraldı.");
    }
}
