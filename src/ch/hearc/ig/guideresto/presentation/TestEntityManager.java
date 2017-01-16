/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.guideresto.presentation;

import ch.hearc.ig.guideresto.business.City;
import ch.hearc.ig.guideresto.business.Restaurant;
import ch.hearc.ig.guideresto.business.RestaurantType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author sebastie.quiquere
 */
public class TestEntityManager {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    public static void main(String[] args) {

        emf = Persistence.createEntityManagerFactory("RestoPersistenceUnit");
        em = emf.createEntityManager();

        EntityTransaction transaction = em.getTransaction();
        
        transaction.begin();
        Restaurant restaur = new Restaurant(Integer.SIZE, "Restaurant du moulin", "blabla", "www.salut.ch", "Rue du soleil", new City(Integer.SIZE, "2900", "Porrentuy"), new RestaurantType(Integer.SIZE, "un type", "blublu"));
        em.persist(restaur);
        transaction.commit();
        
        StringBuilder queryString = new StringBuilder();
        queryString.append("SELECT rest FROM Restaurant rest");
        //queryString.append(" WHERE rest.id = :id");
        

        TypedQuery<Restaurant> query = em.createQuery(queryString.toString(), Restaurant.class);
        
        //query.setParameter("id", 2);
        
        List<Restaurant> result = query.getResultList();
        for (Restaurant restau : result) {
            StringBuilder res = new StringBuilder();
            res.append(restau.getName());
            res.append(" - ");
            res.append(restau.getType());
            
            System.out.println(res.toString());
        }

    }

}
