/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pep.ifsp.edu.controller;

import br.pep.ifsp.edu.model.Vehicle;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author george
 */
public class VehicleController {
    
    private EntityManagerFactory emf;

    public VehicleController() {
        this.emf = Persistence.createEntityManagerFactory("atividadePU");
    }
    
    public void insertVehicle(Vehicle vehicle){
       
        try {
            EntityManager entityManager = this.emf.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(vehicle);
            entityManager.getTransaction().commit();
            entityManager.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
