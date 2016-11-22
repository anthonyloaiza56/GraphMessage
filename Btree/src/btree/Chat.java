/*
 * Esta clase funciona para manejar los mensajes de chats de cada llave
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btree;

/**
 *
 * @author curso
 */
public class Chat {
      String msj="";
      String Chat_con="";
      public String get_nombre_chat(){
          return this.Chat_con;
      }
       public String get_chat(){
          return this.msj;
      }
    public void ver_mensajes(){
        String t="Chat con :"+this.Chat_con+"\n"+msj;
        System.out.println(t);
    }
    public void agregar_mensaje(String nuevo_msj){
        msj+="\n"+nuevo_msj;
    }
}
