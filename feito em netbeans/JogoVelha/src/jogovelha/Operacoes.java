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
public class Operacoes {
    private String L0C0;
    private String L0C1;
    private String L0C2;
    
    private String L1C0;
    private String L1C1;
    private String L1C2;
    
    private String L2C0;
    private String L2C1;
    private String L2C2;
    
    
    // OPERAÇÕES VERIFICAR //
    public boolean verificarDiagonalPrincipal(String L0C0, String L1C1, String L2C2, String desenho){
        if(L0C0.equals(desenho) & L1C1.equals(desenho) & L2C2.equals(desenho)){
            return true;
        }else{
            return false;
        }
    }
    public boolean verificarDiagonalSecundaria(String L0C2, String L1C1, String L2C0, String desenho){
        if(L0C2.equals(desenho) & L1C1.equals(desenho) & L2C0.equals(desenho)){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean verificarLinha0(String L0C0, String L0C1, String L0C2, String desenho){
        if(L0C0.equals(desenho) & L0C1.equals(desenho) & L0C2.equals(desenho)){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean verificarLinha1(String L1C0, String L1C1, String L1C2, String desenho){
        if(L1C0.equals(desenho) & L1C1.equals(desenho) & L1C2.equals(desenho)){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean verificarLinha2(String L2C0, String L2C1, String L2C2, String desenho){
        if(L2C0.equals(desenho) & L2C1.equals(desenho) & L2C2.equals(desenho)){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean verificarColuna0(String L0C0, String L1C0, String L2C0, String desenho){
        if(L0C0.equals(desenho) & L1C0.equals(desenho) & L2C0.equals(desenho)){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean verificarColuna1(String L0C1, String L1C1, String L2C1, String desenho){
        if(L0C1.equals(desenho) & L1C1.equals(desenho) & L2C1.equals(desenho)){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean verificarColuna2(String L0C2, String L1C2, String L2C2, String desenho){
        if(L0C2.equals(desenho) & L1C2.equals(desenho) & L2C2.equals(desenho)){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * @return the L0C0
     */
    public String getL0C0() {
        return L0C0;
    }

    /**
     * @param L0C0 the L0C0 to set
     */
    public void setL0C0(String L0C0) {
        this.L0C0 = L0C0;
    }

    /**
     * @return the L0C1
     */
    public String getL0C1() {
        return L0C1;
    }

    /**
     * @param L0C1 the L0C1 to set
     */
    public void setL0C1(String L0C1) {
        this.L0C1 = L0C1;
    }

    /**
     * @return the L0C2
     */
    public String getL0C2() {
        return L0C2;
    }

    /**
     * @param L0C2 the L0C2 to set
     */
    public void setL0C2(String L0C2) {
        this.L0C2 = L0C2;
    }

    /**
     * @return the L1C0
     */
    public String getL1C0() {
        return L1C0;
    }

    /**
     * @param L1C0 the L1C0 to set
     */
    public void setL1C0(String L1C0) {
        this.L1C0 = L1C0;
    }

    /**
     * @return the L1C1
     */
    public String getL1C1() {
        return L1C1;
    }

    /**
     * @param L1C1 the L1C1 to set
     */
    public void setL1C1(String L1C1) {
        this.L1C1 = L1C1;
    }

    /**
     * @return the L1C2
     */
    public String getL1C2() {
        return L1C2;
    }

    /**
     * @param L1C2 the L1C2 to set
     */
    public void setL1C2(String L1C2) {
        this.L1C2 = L1C2;
    }

    /**
     * @return the L2C0
     */
    public String getL2C0() {
        return L2C0;
    }

    /**
     * @param L2C0 the L2C0 to set
     */
    public void setL2C0(String L2C0) {
        this.L2C0 = L2C0;
    }

    /**
     * @return the L2C1
     */
    public String getL2C1() {
        return L2C1;
    }

    /**
     * @param L2C1 the L2C1 to set
     */
    public void setL2C1(String L2C1) {
        this.L2C1 = L2C1;
    }

    /**
     * @return the L2C2
     */
    public String getL2C2() {
        return L2C2;
    }

    /**
     * @param L2C2 the L2C2 to set
     */
    public void setL2C2(String L2C2) {
        this.L2C2 = L2C2;
    }
}
