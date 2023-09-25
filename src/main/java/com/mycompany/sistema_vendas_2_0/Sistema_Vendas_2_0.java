/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_vendas_2_0;

import com.mycompany.controle.Controle_Sistema;
import com.mycompany.outros.Constantes;
import com.mycompany.visao.Visao_menu;

/**
 *
 * @author sthefany.1921
 */
public class Sistema_Vendas_2_0 {

    public static void main(String[] args){
        int opcaoMenu;
        
        while(true){
            opcaoMenu= Visao_menu.menuPrincipal();
            
            if(opcaoMenu == Constantes.CADASTRAR){
                Controle_Sistema.cadastrar();
            }else if(opcaoMenu == Constantes.ALTERAR){
                Controle_Sistema.alterar(Visao_menu.menuAlteracaoProduto());
            }else if(opcaoMenu == Constantes.LISTAR){
                Controle_Sistema.listar(Controle_Sistema.produtos);
            }else if(opcaoMenu== Constantes.REMOVER){
                Controle_Sistema.remover(Visao_menu.menuRemocaoProduto());    
            }
            
        }
    }
}

