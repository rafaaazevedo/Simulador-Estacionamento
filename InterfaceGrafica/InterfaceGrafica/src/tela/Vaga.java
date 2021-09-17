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
public class Vaga implements Serializable{
    private int identificacao;
    private int pesoMaximo;
    private float alturaMaxima;
    private float comprimentoMaximo;
    private float larguraMaxima;
    private boolean ocupada;
    private int sucesso;
    private int falha;
    private int pesado;
    private int leve;
    private float alto;
    private float baixo;
    private float longo;
    private float curto;
    private float largo;
    private float estreito;
    
    public Vaga(){
        //identificacao= 10;
        //pesoMaximo= 120;
        //alturaMaxima= (float) 2.3;
        //comprimentoMaximo= (float) 1.3;
        //larguraMaxima= (float) 3.4;
        ocupada=false;
        sucesso=0;
        falha=0;
        
        pesado=0;
        leve=0;
        alto=0;
        baixo=0;
        longo=0;
        curto=0;
        largo=0;
        estreito=0;
    }
    
    public int getidentificacao(){
        return identificacao;
    }
    
    public int getpesoMaximo(){
        return pesoMaximo;
    }
    
    public float getalturaMaxima(){
        return alturaMaxima;
    }
    
    public float getcomprimentoMaximo(){
        return comprimentoMaximo;
    }
    
    public float getlarguraMaxima(){
        return larguraMaxima;
    }
    
    public boolean getocupada(){
        return ocupada;
    }
    
    public int getsucesso(){
        return sucesso;
    }
    
    public int getfalha(){
        return falha;
    }
    
    public void setcomprimentoMaximo(int x){
        comprimentoMaximo=x;
    }
    
    public void setidentificacao(int x){
        identificacao=x;
    }
    
    public void setpesoMaximo(int x){
        pesoMaximo=x;
    }
    
    public void setalturaMaxima(float x){
        alturaMaxima=x;
    }
    
    public void setcomprimentoMaximo(float x){
        comprimentoMaximo=x;
    }
    
    public void setlarguraMaxima(float x){
        larguraMaxima=x;
    }
    
    public void setocupada(boolean x){
        ocupada=x;
    }
    
    public void setsucesso(int x){
        sucesso=x;
    }
    
    public void setfalha(int x){
        falha=x;
    }
    
    public void contaSucesso(){
        sucesso=sucesso+1;
    }
    
    public void contaFalha(){
        falha=falha+1;
    }
    
    
    
    public void contaPesado(){
        pesado++;
    }
    public void contaLeve(){
        leve++;
    }
    public void contaAlto(){
        alto++;
    }
    public void contaBaixo(){
        baixo++;
    }
    public void contaLongo(){
        longo++;
    }
    public void contaCurto(){
        curto++;
    }
    public void contaLargo(){
        largo++;
    }
    public void contaEstreito(){
        estreito++;
    }
    
    public int getPesado() {
        return pesado;
    }
    
    public void setPesado(int pesado) {
        this.pesado = pesado;
    }

    public int getLeve() {
        return leve;
    }
    
    public void setLeve(int leve) {
        this.leve = leve;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getBaixo() {
        return baixo;
    }

    public void setBaixo(float baixo) {
        this.baixo = baixo;
    }

    public float getLongo() {
        return longo;
    }

    public void setLongo(float longo) {
        this.longo = longo;
    }

    public float getCurto() {
        return curto;
    }

    public void setCurto(float curto) {
        this.curto = curto;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getEstreito() {
        return estreito;
    }

    public void setEstreito(float estreito) {
        this.estreito = estreito;
    }
    public void atributos(){
        System.out.println("Identificação:"+identificacao+", Peso máximo:"+pesoMaximo+", Altura máxima:"+alturaMaxima+", Comprimento máximo:"+comprimentoMaximo+", Largura máxima:"+larguraMaxima+", Occupada:"+ocupada);       
    }
    
    @Override
	public String toString() {
		return "Identificação: " + identificacao + ", Peso máximo: " + pesoMaximo +
			   ", Altura máxima: " + alturaMaxima + ", Comprimento máximo: " + comprimentoMaximo +
			   ", Largura máxima: " + larguraMaxima + ", Vaga ocupada:" + ocupada;
	}
}
