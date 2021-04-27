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
public class Filiala {
    
    String nume_filiala;
    int cod_filiala;

    public Filiala() {
    }

    public Filiala(String nume_filiala, int cod_filiala) {
        this.nume_filiala = nume_filiala;
        this.cod_filiala = cod_filiala;
    }

    public String getNume_filiala() {
        return nume_filiala;
    }

    public void setNume_filiala(String nume_filiala) {
        this.nume_filiala = nume_filiala;
    }

    public int getCod_filiala() {
        return cod_filiala;
    }

    public void setCod_filiala(int cod_filiala) {
        this.cod_filiala = cod_filiala;
    }
    
    


    
}
