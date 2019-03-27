/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 *
 * @author oem
 */
@Entity
public class ConFinal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    @Basic(optional = true)
    private String listObj;

    @ManyToOne
    private UniCopetencias uni = new UniCopetencias();

    @ManyToOne
    private EleCompetencias comp = new EleCompetencias();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getListObj() {
        return listObj;
    }

    public void setListObj(String listObj) {
        this.listObj = listObj;
    }

    public UniCopetencias getUni() {
        return uni;
    }

    public void setUni(UniCopetencias uni) {
        this.uni = uni;
    }

    public EleCompetencias getComp() {
        return comp;
    }

    public void setComp(EleCompetencias comp) {
        this.comp = comp;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ConFinal other = (ConFinal) obj;
        return this.id == other.id;
    }
}
