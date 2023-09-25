/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.controle.Controle_Sistema;
import com.mycompany.modelo.Computador;
import com.mycompany.modelo.VideoGame;
import java.util.Scanner;

/**
 *
 * @author sthefany.1921
 */
public class Visao_menu {
    public static int menuPrincipal(){
        System.out.println("========SISTEMA DE VENDAS 2.0========");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Alterar Produto");
        System.out.println("3 - Remover Produto");
        System.out.println("4 - Listar Produtos");
        System.out.println("=====================================");
        int opcaoMenu=new Scanner(System.in).nextInt(); 
        
        return opcaoMenu;
    }
    public static int menuEscolhaProduto(){
        System.out.println("=============CADASTRAR PRODUTO=============");
        System.out.println("Qual categoria de produto deseja cadastrar?");
        System.out.println("1 - Vídeo Game");
        System.out.println("2 - Computador");
        System.out.println("===========================================");
        int opcaoProduto= new Scanner(System.in).nextInt();
        
        return opcaoProduto;
        
    }
    
    public static int menuAlteracaoProduto(){
        System.out.println("=============ALTERAR PRODUTO=============");
        System.out.println("Qual produto deseja alterar?");
        
        for(int i=0; i<Controle_Sistema.produtos.size(); i++){
        System.out.println(i + 1 + " | " + Controle_Sistema.produtos.get(i));
        }
        
        System.out.println("=========================================");
        int produtoAlterar= new Scanner(System.in).nextInt();
        
        return produtoAlterar;
    }
    
    public static Object menuAlteracaoProdutoInformacoes(Object object){
        System.out.println("========ALTERAÇÃO DE PRODUTO========");
        if(object instanceof VideoGame){
            System.out.println("Novo nome: ");
            ((VideoGame) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");
            ((VideoGame) object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova plataforma: ");
            ((VideoGame) object).setPlataforma(new Scanner(System.in).nextLine());
        }else if(object instanceof Computador){
            System.out.println("Novo nome: ");
            ((Computador) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");
            ((Computador) object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova quantidade de memória Ram: ");
            ((Computador) object).setMemoriaRam(new Scanner(System.in).nextDouble());
            System.out.println("Processador: ");
            ((Computador) object).setProcessador(new Scanner(System.in).nextLine());
            System.out.println("================================");
        }
        return object;
    }
    
    public static int menuRemocaoProduto(){
        System.out.println("=============REMOVER PRODUTO=============");
        System.out.println("Qual produto deseja remover?");
        
        for(int i=0; i<Controle_Sistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " + Controle_Sistema.produtos.get(i));
        }
        
        System.out.println("=========================================");
        int produtoRemover = new Scanner(System.in).nextInt();
        
        return produtoRemover;
    }
    
}
