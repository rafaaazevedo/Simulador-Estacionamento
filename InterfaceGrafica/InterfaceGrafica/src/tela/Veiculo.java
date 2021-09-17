/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;
import java.io.Serializable;
/**
 *
 * @author rafael
 */
public class Veiculo implements Serializable, Comparable<Veiculo>{
    private String modelo;
    private int numeroChassi;
    private int peso;
    private float altura;
    private float comprimento;
    private float largura;
    
    public Veiculo(){
        //modelo= "Ka";
        //numeroChassi= 1234;
        //this.peso= peso;
        //altura= (float) 1.7;
        //comprimento= (float) 1.2;
        //largura= (float) 1.9;
    }
    
    public String getmodelo(){
        return modelo;
    }
    
    public int getnumeroChassi(){
        return numeroChassi;
    }
    
    public int getpeso(){
        return peso;
    }
    
    public float getaltura(){
        return altura;
    }
    
    public float getcomprimento(){
        return comprimento;
    }
    
    public float getlargura(){
        return largura;
    }
    
    public void setmodelo(String x){
        modelo=x;
    }
    
    public void setnumeroChassi(int x){
        numeroChassi=x;
    }
    
    public void setpeso(int x){
        peso=x;
    }
    
    public void setaltura(float x){
        altura=x;
    }
    
    public void setcomprimento(float x){
        comprimento=x;
    }
    
    public void setlargura(float x){
        largura=x;
    }
    
    public void atributos(){
        System.out.println("Modelo:"+modelo+", Número do chassi:"+numeroChassi+", Peso:"+peso+", Altura:"+altura+", Comprimento:"+comprimento+", Largura:"+largura);
    }
    
    @Override
	public String toString() {
		return "Modelo: " + modelo + ", Número do chassi: " + numeroChassi +
			   ", Peso: " + peso + ", Altura: " + altura +
			   ", Comprimento: " + comprimento + ", Largura:" + largura;
	}
    
    @Override
    public int compareTo(Veiculo objeto) {
        if(peso == objeto.peso){
            return 0;
        }
        if(this.peso > objeto.peso){
            return 1;
        }
        else{
            return -1;
        }             
    }

    
    
}
