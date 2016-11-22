/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btree;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.Arrays;


/**
 *Esta clase sirve para generar el arbol b
 * @author curso
 */
public class Arbol {
    //agregar llaves
    //agregar chats en llaves
    //agregar mensajes en chats
    //generar muchas llaves
    public static Llave clientes[]={};
    
    public void agregar_llaves(int numero){
       
        String nombres2[]={"Cliente1","Cliente2","Cliente3","Cliente4","Cliente5","Cliente6","Cliente7","Cliente8","Cliente9","Cliente10","Cliente11","Cliente12","Cliente13","Cliente14","Cliente15","Cliente16","Cliente17","Cliente18","Cliente19","Cliente20","Cliente21","Cliente22","Cliente23","Cliente24","Cliente25","Cliente26","Cliente27","Cliente28","Cliente29","Cliente30"};
        for(int x=0;x<numero;x++){
            this.Agregar_Llave(nombres2[x]);
        }
    }
    
    public void agregar_chat_en_llave(String Nombre_Cliente,String Nombre_Chat){
        Chat tmp=new Chat();
        tmp.Chat_con=Nombre_Chat;
        
         for(int x=0;x<clientes.length;x++){
            if(clientes[x].Get_Nombre()==Nombre_Cliente){
                clientes[x].agregar_chat(tmp);
            }
        }
        
    }
    public void Agregar_msj_en_chat(String Nombre_Cliente,String Chat_de_mensaje,String Mensaje){
        for(int x=0;x<clientes.length;x++){
            if(clientes[x].Get_Nombre()==Nombre_Cliente){
                clientes[x].agregar_msj_en_chat(Mensaje, Chat_de_mensaje);
            }
        }
        
    }
    
    public void Agregar_Llave(String nombre_cliente){
        Llave cliente=new Llave();
        cliente.Nombre_Cliente=nombre_cliente;
        if(clientes.length==0){
            
            Llave tmp[]=new Llave[clientes.length+1];//array de clientes mas grande
            for(int x=0;x<clientes.length;x++){
                tmp[x]=clientes[x];
            }
            clientes=tmp;
            clientes[0]=cliente;
        }
        else{
            
            Llave tmp[]=new Llave[clientes.length+1];//array de clientes mas grande
            for(int x=0;x<clientes.length;x++){
                tmp[x]=clientes[x];
            }
            clientes=tmp;
            clientes[clientes.length-1]=cliente;
            
        }
    }
    public void ver_arbol(){
        for(int x=0;x<this.clientes.length;x++){
            System.out.println("\n"+"Cliente :"+this.clientes[x].Get_Nombre()+"\n");
      
            for(int xx=0;xx<this.clientes[x].Get_Chats().length;xx++){
                this.clientes[x].Get_Chats()[xx].ver_mensajes();
                
            
        }
    }
     
    
}
      public void ver_arbol_grafico(){
          DefaultMutableTreeNode server = new DefaultMutableTreeNode("Server");
        DefaultTreeModel modelo = new DefaultTreeModel(server);
        JTree tree = new JTree(modelo);
      //primero es crear el array de DefaultMutableTreeNode
      //luego se inserta en el arbol
      
      //despues por cada llave un array de DefaultMutableTreeNode que son los chats
      //e inserto en la llave
      
      //construyo la ventana
          
        //DefaultMutableTreeNode Llaves[]=new DefaultMutableTreeNode[this.clientes.length];
        for(int x=0;x<this.clientes.length;x++){    
            DefaultMutableTreeNode LlaveTMP = new DefaultMutableTreeNode(this.clientes[x].Nombre_Cliente);
            modelo.insertNodeInto(LlaveTMP, server, x);
            for(int xx=0;xx<this.clientes[x].Get_Chats().length;xx++){
                DefaultMutableTreeNode Chat_tmp = new DefaultMutableTreeNode(this.clientes[x].Chats[xx].Chat_con);         
                modelo.insertNodeInto(Chat_tmp, LlaveTMP, xx);
                
            }
                
        }
        
        // Construccion y visualizacion de la ventana
        JFrame v = new JFrame();
        JScrollPane scroll = new JScrollPane(tree);
        v.getContentPane().add(scroll);
        v.pack();
        v.setVisible(true);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      }
}
