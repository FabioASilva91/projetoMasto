/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
/**
 *
 * @author fabio
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "retrieveArmadilha",
            query = "SELECT a FROM Armadilha a"),
    @NamedQuery(name = "retrieveArmadilhaNome",
            query = "SELECT a FROM Armadilha a WHERE a.id Like :id")

})
public class Armadilha implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private double latitude;
    private double longitude;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return id+"";
    }
       
    
}
