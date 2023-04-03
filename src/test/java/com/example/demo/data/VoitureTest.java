package com.example.demo.data;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        Voiture voiture = new Voiture("Audi", 9000);
    }
    Voiture voiture = new Voiture("Mercedes", 33000);
    @Test
    void voitureQuiExiste(){
        Assert.notNull(voiture, "Il y a aucune voiture qui existe");
    }
    @Test
    void voitureExistePas(){
        Assert.isNull(voiture, "Il ne devrais pas avoir une voiture qui existe");
    }
    @Test
    void voitureVide(){
        Voiture voitureVide = new Voiture();
        Assert.notNull(voitureVide, "Il y a pas de voiture vide");
    }

    @Test
    void verifierPrix(){
        Voiture voiture1 = new Voiture();

        Assert.isTrue(voiture1.getPrix() == 0, "Il n'est pâs égal à 0");
        Assert.isTrue(voiture1.getId() == 0, "Il n'est pas égal à 0");
    }

    @Test
    void verificationVoitureComplet(){
        Assert.notNull(voiture.getMarque(), "Ne doit pas être nul");
        Assert.isTrue(voiture.getPrix() != 0, "ne doit pas être égal à 0");
        Assert.isTrue(voiture.getId() == 0, "ne doit pas être égal à 0");
    }

    @Test
    void verificationGetteursSetteurs(){
        voiture.getMarque();
        voiture.getPrix();
        voiture.getId();
        voiture.setMarque("Mercedes");
        voiture.setPrix(2000);
        voiture.setId(2);
    }
}
