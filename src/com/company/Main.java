package com.company;

public class Main {

    public static void main(String[] args) {
        Akademisyen a1 = new Akademisyen("Akademisyen", "123123", "abcd123@gmail.com", "09.00-17.00", "bilgisayar", "akademisyen");
        a1.giris();
        a1.getAdSoyad();
        a1.derseGir();
        OgretimGorevlisi og1 = new OgretimGorevlisi("Berkay", "Özdemir", "berkay2544@gmail.com", "09:00-18:00", "Yazılım Müh.", "Boş işler müdürü", "25");
        GuvenlikGörevlisi g1 = new GuvenlikGörevlisi("Berkay Özdemir", "123", "berkayozdemir1903@hotmail.com", "17:00-09:00", "Memur", "16", "Güvenlik belgesi");
        g1.nobet();
    }

}
