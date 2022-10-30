/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author fabio
 */
@Entity
public class Autor implements Serializable {
    @Id 
    @GeneratedValue
    private int id;
    private String nomeAutor;
    private String ano;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nomeAutor=" + nomeAutor + ", ano=" + ano + '}';
    }
}
