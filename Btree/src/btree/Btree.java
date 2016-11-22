/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.http://www.chuidiang.com/java/JTree/ejemplo-simple-jtree.php
 */
package btree;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author curso
 */
public class Btree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Arbol Server=new Arbol();
        
      Server.Agregar_Llave("Tony");
      Server.Agregar_Llave("David");
      
      Server.agregar_chat_en_llave("Tony", "Jason");
      Server.agregar_chat_en_llave("Tony", "David");
      
      Server.agregar_chat_en_llave("David", "Tony");
      Server.agregar_llaves(18);
      Server.agregar_chat_en_llave("Cliente15", "David");
      Server.agregar_chat_en_llave("Cliente15", "Tj");
      Server.agregar_chat_en_llave("Cliente11", "David");
      Server.agregar_chat_en_llave("Cliente11", "Tj");
      Server.Agregar_msj_en_chat("Cliente15", "David", "Tony:Eaea");
      Server.Agregar_msj_en_chat("Cliente15", "David", "David:Lince+10 :V");
      Server.ver_arbol_grafico();//con esta clase se ve el arbol grafico automaticamente
      Server.ver_arbol();
    
    }   
}  

