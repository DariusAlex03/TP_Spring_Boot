package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.repository.CrudRepository;

@Entity
public class Voiture {

    private int prix;
    private String marque;
    private int id;

    private VoitureRepository sourceVoitures;

    public Voiture(){}
    public Voiture(String marque, int prix ){
        this.marque = marque;
        this.prix = prix;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getMarque() {
        return marque;
    }

    public int getPrix() {
        return prix;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String toString(){
        return "Car {" +
                "marque" + marque +
                "prix" + prix +
                "id" + id + "}";
    }
}
