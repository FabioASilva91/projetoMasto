/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Type;

/**
 *
 * @author fabio
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "retrieveEspecie",
            query = "SELECT e FROM Especie e"),
    @NamedQuery(name = "retrieveEspecieNome",
            query = "SELECT e FROM Especie e WHERE e.nomeEspecie Like :nome")

})
public class Especie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeEspecie;
    private String tipoEspecie;
    @Lob
    @Column(columnDefinition="MEDIUMBLOB")
    private byte[] image;

   
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private Ordem ordem;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private Familia familia;
     
    @OneToOne(cascade = CascadeType.PERSIST)
    private Genero genero;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private Autor autor;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }

    public Ordem getOrdem() {
        return ordem;
    }

    public void setOrdem(Ordem ordem) {
        this.ordem = ordem;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }   

    public String getTipoEspecie() {
        return tipoEspecie;
    }

    public void setTipoEspecie(String tipoEspecie) {
        this.tipoEspecie = tipoEspecie;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

     

    @Override
    public String toString() {
        return nomeEspecie;
    }

    
}
