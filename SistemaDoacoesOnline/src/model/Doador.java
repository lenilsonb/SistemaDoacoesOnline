/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadedoacaoonline_bin;

/**
 *
 * @author Eduardo Bin
 */
public class Doador {
    
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    
    private String tipo;
    private int quantidade;
    private String descricao;
    

    
    public Doador(){
        
    }
    
    public Doador(String nome, String telefone, String email, String endereco, String tipo, int quantidade, String descricao){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.descricao = descricao;  
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail (){
        return email;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void descricao(String descricao){
        this.descricao = descricao;
    }
    

    
    
}
    
