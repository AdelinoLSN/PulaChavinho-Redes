/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import util.MyRandom;

/**
 *
 * @author Adelino Neto
 */
public class Tabuleiro {
    Celula[][] matriz;
    int linhas;
    int colunas;
    
    public Tabuleiro(int linhas, int colunas){
        this.linhas = linhas;
        this.colunas = colunas;
        this.matriz = new Celula[linhas][colunas];
        for(int i =0; i<linhas; i++){
            for(int j=0; j<colunas; j++){
                matriz[i][j] = new Celula();
            }
        }
    }
    public boolean verifica(int i,int j){
        if(this.matriz[i][j].isFurado() == true){
            return true;
        }
        return false;
    }

    public Celula[][] getMatriz() {
        return matriz;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public String buracoDoChavinho() {
        String retorno="";
        for(int i=0; i<this.linhas; i++){
            for(int j=0; j<this.colunas; j++){
                if(this.matriz[i][j].isFurado()){
                    retorno += ""+i+"@"+j+"\n";
                }
            }
        }
        //System.out.println(retorno);
        return retorno;
    }

    public void inserirFuro(int linha, int coluna) {
        this.getMatriz()[linha][coluna].setFurado(true);
    }

}
