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
public class Genero implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String NomeDoGenero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoGenero() {
        return NomeDoGenero;
    }

    public void setNomeDoGenero(String NomeDoGenero) {
        this.NomeDoGenero = NomeDoGenero;
    }

    @Override
    public String toString() {
        return "Genero{" + "id=" + id + ", NomeDoGenero=" + NomeDoGenero + '}';
    }
    
    
    
}
