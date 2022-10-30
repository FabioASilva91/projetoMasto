/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author fabio
 */
public class HibernateUtil {
    private static EntityManager entityManager;
    private static EntityManagerFactory entityManagerFactory;
    
    public static EntityManager getEntityManager(){
        entityManagerFactory = Persistence.createEntityManagerFactory("projetoMastofaunaPU");
        entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }
}
