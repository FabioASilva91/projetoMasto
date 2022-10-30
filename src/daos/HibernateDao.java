/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author fabio
 */
public class HibernateDao<T> implements Dao<T> {

    EntityManager em = HibernateUtil.getEntityManager();
    protected Class clazz;

    @Override
    public void persistir(T entidade) {
        em.getTransaction().begin();
        em.persist(entidade);
        em.getTransaction().commit();
    }

    @Override
    public void delete(T entidade) {
        em.getTransaction().begin();
        em.remove(entidade);
        em.getTransaction().commit();
    }

    @Override
    public T objeto(int id) {
        em.getTransaction().begin();
        T object = (T) em.find(clazz, id);
        em.getTransaction().commit();
        return object;
    }

    @Override
    public List<T> list(String sql) {
        return em.createQuery(sql).getResultList();
    }

    @Override
    public List<T> list() {
        em.getTransaction().begin();
        Query q = em.createQuery("FROM " + clazz.getSimpleName());
        List<T> result = q.getResultList();
        em.getTransaction().commit();
        return result;
    }

    public Query createQuery(String query) {
        return em.createQuery(query);
    }

    public Query createNamedQuery(String queryName) {
        return em.createNamedQuery(queryName);
    }

    public Query createNativeQuery(String query) {
        return em.createNativeQuery(query);
    }
}
