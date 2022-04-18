package com.company;

public class Asistan extends Akademisyen{
    private String ofisSaati;
    public Asistan(String adSoyad,String telefon,String eposta,String calismaSaati,String bolum,String unvan,String ofisSaati){
        super(adSoyad,telefon,eposta,calismaSaati,bolum,unvan);
        this.ofisSaati=ofisSaati;
    }
    public void quizYap(){
        System.out.println(this.getAdSoyad()+" quiz yaptı.");
    }

}
