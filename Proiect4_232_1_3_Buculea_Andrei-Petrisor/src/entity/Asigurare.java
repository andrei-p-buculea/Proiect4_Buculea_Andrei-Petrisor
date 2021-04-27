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
public class Asigurare {
    String nrCont,tipAsigurare,codCompanieAsiguare,detaliiCompanieAsigurare;

    public Asigurare() {
    }

    public Asigurare(String nrCont, String tipAsigurare, String codCompanieAsiguare, String detaliiCompanieAsigurare) {
        this.nrCont = nrCont;
        this.tipAsigurare = tipAsigurare;
        this.codCompanieAsiguare = codCompanieAsiguare;
        this.detaliiCompanieAsigurare = detaliiCompanieAsigurare;
    }

    public String getNrCont() {
        return nrCont;
    }

    public void setNrCont(String nrCont) {
        this.nrCont = nrCont;
    }

    public String getTipAsigurare() {
        return tipAsigurare;
    }

    public void setTipAsigurare(String tipAsigurare) {
        this.tipAsigurare = tipAsigurare;
    }

    public String getCodCompanieAsiguare() {
        return codCompanieAsiguare;
    }

    public void setCodCompanieAsiguare(String codCompanieAsiguare) {
        this.codCompanieAsiguare = codCompanieAsiguare;
    }

    public String getDetaliiCompanieAsigurare() {
        return detaliiCompanieAsigurare;
    }

    public void setDetaliiCompanieAsigurare(String detaliiCompanieAsigurare) {
        this.detaliiCompanieAsigurare = detaliiCompanieAsigurare;
    }
    
    
}
