/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle;

import com.mycompany.modelo.Computador;
import com.mycompany.modelo.VideoGame;
import com.mycompany.outros.Constantes;
import com.mycompany.visao.VisaoComputador;
import com.mycompany.visao.VisaoVideoGame;
import com.mycompany.visao.Visao_menu;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sthefany.1921
 */
public class Controle_Sistema {
    public static ArrayList<Object> produtos = new ArrayList<>();
    public static void cadastrar(){
        int opcaoProduto= Visao_menu.menuEscolhaProduto();
        
        if(opcaoProduto == Constantes.CATEGORIA_VIDEO_GAME){
            produtos.add(VisaoVideoGame.telaCadastroVideoGame());
        }else if(opcaoProduto == Constantes.CATEGORIA_COMPUTADOR){
            produtos.add(VisaoComputador.telaCadastroComputador());
        }
    }
    
    public static void alterar(int indiceProduto){
        indiceProduto = indiceProduto - 1;
        
        Object object = produtos.get(indiceProduto);
        
        if(object instanceof VideoGame){
            VideoGame videogame= new VideoGame();
            videogame= (VideoGame) object;
            
            System.out.println("Alterando o produto: " + videogame.toString());
            
            videogame = (VideoGame) Visao_menu.menuAlteracaoProdutoInformacoes(videogame);
            
            Controle_Sistema.produtos.set(indiceProduto, videogame);
        }else if(object instanceof Computador){
            Computador computador = new Computador();
            computador = (Computador) object;
            
            System.out.println("Alterando o produto: " +computador.toString());
            
            computador = (Computador) Visao_menu.menuAlteracaoProdutoInformacoes(computador);
            
            Controle_Sistema.produtos.set(indiceProduto, computador);
        }else{
            System.out.println(Constantes.MSG_PROD_INEXISTENTE);
        }
    }
    
    public static void listar(ArrayList<Object> produtos){
        System.out.println("========LISTAGEM DE PRODUTOS========");
        for(int i = 0; i<produtos.size(); i++){
            Object object = produtos.get(i);
            
            if(object instanceof VideoGame){
                VideoGame videogame = (VideoGame) object;
                System.out.println(videogame.toString());
            }else if( object instanceof Computador){
                Computador computador = (Computador) object;
                System.out.println(computador.toString());
            }
        }
        System.out.println("====================================");
    }
    
    public static void remover(int indiceProduto){
        indiceProduto = indiceProduto - 1;
        
        Object object= null;
        
        try{
            produtos.get(indiceProduto);
        }catch(Exception e){}
        
        if(object != null){
            if(object instanceof VideoGame){
                VideoGame videogame= new VideoGame();
                videogame= (VideoGame) object;
                System.out.println("Deseja remover o produto " + videogame.getNome() + "? (S/N)");
            }else if(object instanceof Computador){
                Computador computador= new Computador();
                computador = (Computador) object;
                System.out.println("Deseja remover o produto " + computador.getNome() + "? (S/N)");
            }

            String sn = new Scanner(System.in).next().toLowerCase();

            if(sn.equals(Constantes.REMOVER_SIM)){
                
                produtos.remove(indiceProduto);
                System.out.println("Produto removido com sucesso!");
    
            }
        }else{
                System.out.println(Constantes.MSG_PROD_INEXISTENTE);
            }
    }
}
