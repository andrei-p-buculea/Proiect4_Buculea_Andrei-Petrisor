/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Andrei Buculea
 */
public class Ipoteca {
    String numar_cont,tip_cont,tip_ipoteca;
    int nr_client,cod_filiala_conducere;
    Float suma_imprumutata,suma_de_restituit,rata_dobanzii;

    public Ipoteca() {
    }

    public Ipoteca(String numar_cont, String tip_cont, String tip_ipoteca, int nr_client, int cod_filiala_conducere, Float suma_imprumutata, Float suma_de_restituit, Float rata_dobanzii) {
        this.numar_cont = numar_cont;
        this.tip_cont = tip_cont;
        this.tip_ipoteca = tip_ipoteca;
        this.nr_client = nr_client;
        this.cod_filiala_conducere = cod_filiala_conducere;
        this.suma_imprumutata = suma_imprumutata;
        this.suma_de_restituit = suma_de_restituit;
        this.rata_dobanzii = rata_dobanzii;
    }

    public String getNumar_cont() {
        return numar_cont;
    }

    public void setNumar_cont(String numar_cont) {
        this.numar_cont = numar_cont;
    }

    public String getTip_cont() {
        return tip_cont;
    }

    public void setTip_cont(String tip_cont) {
        this.tip_cont = tip_cont;
    }

    public String getTip_ipoteca() {
        return tip_ipoteca;
    }

    public void setTip_ipoteca(String tip_ipoteca) {
        this.tip_ipoteca = tip_ipoteca;
    }

    public int getNr_client() {
        return nr_client;
    }

    public void setNr_client(int nr_client) {
        this.nr_client = nr_client;
    }

    public int getCod_filiala_conducere() {
        return cod_filiala_conducere;
    }

    public void setCod_filiala_conducere(int cod_filiala_conducere) {
        this.cod_filiala_conducere = cod_filiala_conducere;
    }

    public Float getSuma_imprumutata() {
        return suma_imprumutata;
    }

    public void setSuma_imprumutata(Float suma_imprumutata) {
        this.suma_imprumutata = suma_imprumutata;
    }

    public Float getSuma_de_restituit() {
        return suma_de_restituit;
    }

    public void setSuma_de_restituit(Float suma_de_restituit) {
        this.suma_de_restituit = suma_de_restituit;
    }

    public Float getRata_dobanzii() {
        return rata_dobanzii;
    }

    public void setRata_dobanzii(Float rata_dobanzii) {
        this.rata_dobanzii = rata_dobanzii;
    }

   
}
