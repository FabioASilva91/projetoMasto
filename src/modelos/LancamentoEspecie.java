/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author fabio
 */
@Entity
public class LancamentoEspecie {
    @Id 
    @GeneratedValue
    int id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar date;
    
    @ManyToOne()
    private Especie especie;
    
    @ManyToOne()
    private Armadilha armadilha;
    
    private String autoEcologia;
    
    private String corGrauEst;
    private int GrauEst;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Armadilha getArmadilha() {
        return armadilha;
    }

    public void setArmadilha(Armadilha armadilha) {
        this.armadilha = armadilha;
    }

    public String getAutoEcologia() {
        return autoEcologia;
    }

    public void setAutoEcologia(String autoEcologia) {
        this.autoEcologia = autoEcologia;
    }

    public String getCorGrauEst() {
        return corGrauEst;
    }

    public void setCorGrauEst(String corGrauEst) {
        this.corGrauEst = corGrauEst;
    }

    public int getGrauEst() {
        return GrauEst;
    }

    public void setGrauEst(int GrauEst) {
        this.GrauEst = GrauEst;
    }

    @Override
    public String toString() {
        return "Lancamento{" + "id=" + id + ", date=" + date + ", especie=" + especie + ", armadilha=" + armadilha + ", autoEcologia=" + autoEcologia + ", corGrauEst=" + corGrauEst + ", GrauEst=" + GrauEst + '}';
    }

   

    
}
