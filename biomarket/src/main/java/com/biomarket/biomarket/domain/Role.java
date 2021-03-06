package com.biomarket.biomarket.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Role {
    
/*------------------------------ATTRIBUTS--------------------------------------*/

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int role_id;
    String nom;
    String statut;

/*------------------------------GETTER/SETTER--------------------------------------*/


    public int getRole_id() {
        return this.role_id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getStatut() {
        return this.statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }


}
