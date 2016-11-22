/*
 * Esta clase sirve para manejar las distinas llaves ,osea sus clientes
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btree;

//perpectiva de un usuario,tiene varios chats con personas


public class Llave {
      String Nombre_Cliente;
      Chat Chats[]={};
    public String Get_Nombre(){
        return this.Nombre_Cliente;
    }
    public Chat[] Get_Chats(){
        return this.Chats;
    }

    public void agregar_msj_en_chat(String msj,String nombre_chat){//ingresas el nombre de la persona y agregas mensaje en ese chat
        //buscar chat primero
        if(Chats.length==0){
            System.out.println("No hay chats");
        }
        else{
            for(int x=0;x<Chats.length;x++){
                if(Chats[x].get_nombre_chat()==(nombre_chat)){
                    Chats[x].msj+="\n"+msj;
                }
            }
        }
        
    }
    public Chat[] CHATS(){
        return this.Chats;
    }
    
    public void agregar_chat(Chat nombre_chat){
     if(Chats.length==0){
            
            Chat tmp[]=new Chat[Chats.length+1];//array de chats mas grande
            for(int x=0;x<Chats.length;x++){
                tmp[x]=Chats[x];
            }
            Chats=tmp;
            Chats[0]=nombre_chat;
        }
        else{
            
            Chat tmp[]=new Chat[Chats.length+1];//array de chats mas grande
            for(int x=0;x<Chats.length;x++){
                tmp[x]=Chats[x];
            }
            Chats=tmp;
            Chats[Chats.length-1]=nombre_chat;
        }
        
    }
    
}
