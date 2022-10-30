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
public class Familia implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String nomeDaFamilia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDaFamilia() {
        return nomeDaFamilia;
    }

    public void setNomeDaFamilia(String nomeDaFamilia) {
        this.nomeDaFamilia = nomeDaFamilia;
    }

    @Override
    public String toString() {
        return "Familia{" + "id=" + id + ", nomeDaFamilia=" + nomeDaFamilia + '}';
    }
    
    
}
