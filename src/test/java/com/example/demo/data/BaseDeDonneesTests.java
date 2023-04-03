package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import static org.mockito.Mockito.when;

@SpringBootTest
public class BaseDeDonneesTests {

    @Autowired
    private VoitureRepository voitureRepository;

    Voiture car = new Voiture("Mercedes", 1000);

    @Test
    void testInsertionVoiture(){
        voitureRepository.save(car);
    }

    @Test
    void testCountVoitures(){
        voitureRepository.count();
    }

    @Test
    void isInstanceOf(){
        Assert.isInstanceOf(Voiture.class, car, "ce n'est pas une instance de voiture");
    }

    @Test
    void checkCarsInRepositoryNotNull(){
        Assert.isTrue(voitureRepository.count() != 0, "Il n'y a pas de voiture enregistré");
    }

    @Test
    void testSupressionVoiture(){
        voitureRepository.delete(car);
    }



    /*@Test
    void uneVoiture(Voiture voiture){
        // tester les méthodes de l'interface CrudRepository qui permette d'accéder à la base de données: https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
        // save, find, delete...
        voitureRepository.save(voiture);
        Iterator<Voiture> voitures = voitureRepository.findAll().iterator();
        while(voitures.hasNext()){
            int v = voitures.next().getPrix();
        }
    }*/

}
