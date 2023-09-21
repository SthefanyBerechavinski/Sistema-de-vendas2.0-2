/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author sthefany.1921
 */
public class VideoGame extends Produto{
    private String plataforma;

    public VideoGame() {
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return  "Nome: " + super.getNome() +
                " | Preço: " + super.getPreco() +
                " | Plataforma: " + this.plataforma;
    }
    
    
    
}
