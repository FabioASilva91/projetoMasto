/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import modelos.Armadilha;

/**
 *
 * @author fabio
 */
public class DaoArmadilha extends HibernateDao<Armadilha> {

    public DaoArmadilha() {
        clazz = Armadilha.class;
    }

    public List<Armadilha> retrieveArmadilha() {
        return createNamedQuery("retrieveArmadilha").getResultList();
    }

    public List<Armadilha> retrieveNomeArmadilha(int nome) {
        return createNamedQuery("retrieveArmadilhaNome").setParameter("nome", "%" + nome + "%").getResultList();

    }

}
