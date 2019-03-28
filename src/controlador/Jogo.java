/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.util.Scanner;
import model.Tabuleiro;
import util.MyRandom;

/**
 *
 * @author Adelino Neto
 */
public class Jogo {
    Tabuleiro tabuleiro;
    
    public Jogo(Boolean servidor){
        this.tabuleiro = new Tabuleiro(3,5);
        if(servidor == true){
            this.inserirFuro(tabuleiro);
        }
    }
    
    private void inserirFuro(Tabuleiro tabuleiro) {
        int linha, coluna;
        linha = MyRandom.gerar(3);
        coluna = MyRandom.gerar(5);
        //System.out.println(linha+" "+coluna);
        tabuleiro.getMatriz().toString();
        tabuleiro.getMatriz()[linha][coluna].setFurado(true);
    }
    
    public boolean iniciar(int linha, int coluna){
        //Scanner sc = new Scanner(System.in);
        //int linha;
        //int coluna;
        boolean running = true;
        //while(running = true){
            //linha = sc.nextInt();
            //coluna = sc.nextInt();
            if(this.tabuleiro.getMatriz()[linha][coluna].isFurado() == false){
                jogar(linha, coluna);
                
                
            } else {
                running = false;
            }
        //}//System.out.println("ACABOU, BRO");
        return running;
    }
    public void jogar(int linha, int coluna){
        this.tabuleiro.getMatriz()[linha][coluna].setAberto(true);
    }

    public String furoDoChavinho() {
        return this.tabuleiro.buracoDoChavinho();
    }

    public void inserirFuro(int linha, int coluna) {
        this.tabuleiro.inserirFuro(linha,coluna);
    }
}
