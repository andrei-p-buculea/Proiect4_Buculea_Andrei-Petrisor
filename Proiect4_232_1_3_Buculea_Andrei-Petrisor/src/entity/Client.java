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
public class Client {
    int nr_client;
    String adresa_client,nume_client;

    public Client(int nr_client, String adresa_client, String nume_client) {
        this.nr_client = nr_client;
        this.adresa_client = adresa_client;
        this.nume_client = nume_client;
    }

    public Client() {
    }

    public int getNr_client() {
        return nr_client;
    }

    public void setNr_client(int nr_client) {
        this.nr_client = nr_client;
    }

    public String getAdresa_client() {
        return adresa_client;
    }

    public void setAdresa_client(String adresa_client) {
        this.adresa_client = adresa_client;
    }

    public String getNume_client() {
        return nume_client;
    }

    public void setNume_client(String nume_client) {
        this.nume_client = nume_client;
    }
    
    
    
}
