/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogovelha;

/**
 *
 * @author José Wilson Grilo
 */
public class Jogador {

    private String desenho;
    private boolean vez_jogada;

    /**
     * @return the desenho
     */
    public String getDesenho() {
        return desenho;
    }

    /**
     * @param desenho the desenho to set
     */
    public void setDesenho(String desenho) {
        this.desenho = desenho;
    }

     /**
     * @return the vez_jogada
     */
    public boolean isVez_jogada() {
        return vez_jogada;
    }

    /**
     * @param vez_jogada the vez_jogada to set
     */
    public void setVez_jogada(boolean vez_jogada) {
        this.vez_jogada = vez_jogada;
    }
    
}
