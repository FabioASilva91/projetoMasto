/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author fabio
 */
@Entity
public class Ordem implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String nomeOrdem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeOrdem() {
        return nomeOrdem;
    }

    public void setNomeOrdem(String nomeOrdem) {
        this.nomeOrdem = nomeOrdem;
    }

    @Override
    public String toString() {
        return "Ordem{" + "id=" + id + ", nomeOrdem=" + nomeOrdem + '}';
    }
    
    
}
