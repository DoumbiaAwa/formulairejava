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


import java.io.Serializable;

/**
 *
 * @author Awa
 */
public class Inscription implements Serializable {
    private String nom;
    private String prenom;
    private String pseudo;
    private String email;
    private String mtp;
    private String confirmation;  
    
    public Inscription () {
    }
    
    public Inscription(String nom, String prenom, String pseudo, String email,String mtp, String confirmation) {
      
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.email = email;
        this.mtp = mtp;
        this.confirmation = confirmation;
          
        
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email= email;
    }
     public String getMtp() {
        return email;
    }

    public void setMtp(String mtp) {
        this.mtp= mtp;
    }
    
     public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation= confirmation;
    }
    
}


