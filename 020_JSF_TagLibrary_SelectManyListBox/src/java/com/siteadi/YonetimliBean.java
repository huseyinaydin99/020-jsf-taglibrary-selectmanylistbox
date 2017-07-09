/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import java.io.Serializable;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author husey
 */
@ManagedBean
@RequestScoped
public class YonetimliBean implements Serializable{

    /**
     * Creates a new instance of YonetimliBean
     */
    private Egitmen[] egitmenDizi;
    private String[] seciliEgitmen;
    public YonetimliBean() {
    }
    public static class Egitmen{
        public String adi;
        public String soyadi;

        public Egitmen(String adi, String soyadi) {
            this.adi = adi;
            this.soyadi = soyadi;
        }

        public String getAdi() {
            return adi;
        }

        public void setAdi(String adi) {
            this.adi = adi;
        }

        public String getSoyadi() {
            return soyadi;
        }

        public void setSoyadi(String soyadi) {
            this.soyadi = soyadi;
        }
    }

    public Egitmen[] getEgitmenDizi() {
        egitmenDizi = new Egitmen[3];
        egitmenDizi[0] = new Egitmen("Hüseyin", "Aydın");
        egitmenDizi[1] = new Egitmen("Hasan", "Aydın");
        egitmenDizi[2] = new Egitmen("Yasin", "Aydın");
        return egitmenDizi;
    }

    public void setEgitmenDizi(Egitmen[] egitmenDizi) {
        this.egitmenDizi = egitmenDizi;
    }

    public String[] getSeciliEgitmen() {
        return seciliEgitmen;
    }

    public void setSeciliEgitmen(String[] seciliEgitmen) {
        this.seciliEgitmen = seciliEgitmen;
    }
    
    public String seciliDegerileriAl(){
        return Arrays.toString(seciliEgitmen);
    }
    
}
