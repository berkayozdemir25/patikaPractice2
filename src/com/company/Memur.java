package com.company;

public class Memur extends Calisan{
    private String departman;
    private String mesai;

    public Memur(String adSoyad,String telefon,String eposta,String calismaSaati,String departman,String mesai){
        super(adSoyad,telefon,eposta,calismaSaati);
        this.departman=departman;
        this.mesai=mesai;
    }
    public String getDepartman(){
        return this.departman;
    }
    public void setDepartman(String departman){
        this.departman=departman;
    }
    public String getMesai(){
        return this.mesai;
    }
    public void setMesai(String mesai){
        this.mesai=mesai;
    }
    public void calis(){
        System.out.println(this.getAdSoyad()+" çalışmaya başladı.");
    }

}
