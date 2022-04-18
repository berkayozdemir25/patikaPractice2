package com.company;

public class LabAsistanı extends Asistan{
    public LabAsistanı(String adSoyad,String telefon,String eposta,String calismaSaati,String bolum,String unvan,String ofisSaati){
        super(adSoyad,telefon,eposta,calismaSaati,bolum,unvan,ofisSaati);
    }
    public void lablaraGir(){
        System.out.println(this.getAdSoyad()+" lablara girdi.");
    }
}
