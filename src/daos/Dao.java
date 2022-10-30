/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;

/**
 *
 * @author fabio
 */
public interface Dao<T> {
    void persistir(T entidade);
    void delete(T entidade);
    T objeto(int id);
    List<T> list(String sql);
    List<T> list();
    
}
