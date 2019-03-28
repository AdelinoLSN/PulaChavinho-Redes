/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Adelino Neto
 */
public class Celula {
    boolean aberto;
    boolean furado;

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isFurado() {
        return furado;
    }

    public void setFurado(boolean furado) {
        this.furado = furado;
    }
}
