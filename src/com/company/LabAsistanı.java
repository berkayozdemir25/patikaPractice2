package com.company;

public class LabAsistan─▒ extends Asistan{
    public LabAsistan─▒(String adSoyad,String telefon,String eposta,String calismaSaati,String bolum,String unvan,String ofisSaati){
        super(adSoyad,telefon,eposta,calismaSaati,bolum,unvan,ofisSaati);
    }
    public void lablaraGir(){
        System.out.println(this.getAdSoyad()+" lablara girdi.");
    }
}
