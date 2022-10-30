/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daos;

import java.util.List;
import modelos.Especie;

/**
 *
 * @author fabio
 */
public class DaoEspecie extends HibernateDao<Especie>{

    public DaoEspecie() {
        clazz = Especie.class;
    }
     public List<Especie> retrieveEspecie() {
        return createNamedQuery("retrieveEspecie").getResultList();
    }

    public List<Especie> retrieveNomeEspecie(String nome) {
        return createNamedQuery("retrieveEspecieNome").setParameter("nome", "%" + nome + "%").getResultList();

    }
}
