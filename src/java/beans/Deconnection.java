/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Awa
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Awa
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

/**
 *
 * @author Awa
 */
public class Deconnection implements Serializable {
    private String pseudo;
     private String mtp;
    
    
    public Deconnection  () {
    }
    
    public Deconnection ( String pseudo, String mtp) {
      
       
        this.pseudo = pseudo;
        this.mtp = mtp;
       
          
        
    }
    

    
    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    
     public String getMtp() {
        return mtp;
    }

    public void setMtp(String mtp) {
        this.mtp= mtp;
    }
    
    
    
}



