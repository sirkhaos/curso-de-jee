/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import beans.dominio.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Tata
 */

public class ClienteEntidadPersona {
    static Logger log = LogManager.getRootLogger();
    
    public static void main (String [] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        // Inicia la transaccion
        tx.begin();
        
        Persona Persona1 = new Persona("Maria", "Gutierrez", "Esparza", "maria@mail.com.mx", "11113333");
        log.debug("Objeto a persistir: "+Persona1);
        
        //persistimos el objeto
        em.persist(Persona1);
        
        //terminamos la transaccion
        tx.commit();
        log.debug("Objeto persistido: "+Persona1);
        em.close();
    }
}
