/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnu.anjelica.pad.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author chuchip
 */
@Embeddable
public class VAlbavecPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "avc_ano")
    private int avcAno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "emp_codi")
    private int empCodi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "avc_serie")
    private Character avcSerie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "avc_nume")
    private int avcNume;

    public VAlbavecPK() {
    }

    public VAlbavecPK(int avcAno, int empCodi, Character avcSerie, int avcNume) {
        this.avcAno = avcAno;
        this.empCodi = empCodi;
        this.avcSerie = avcSerie;
        this.avcNume = avcNume;
    }

    public int getAvcAno() {
        return avcAno;
    }

    public void setAvcAno(int avcAno) {
        this.avcAno = avcAno;
    }

    public int getEmpCodi() {
        return empCodi;
    }

    public void setEmpCodi(int empCodi) {
        this.empCodi = empCodi;
    }

    public Character getAvcSerie() {
        return avcSerie;
    }

    public void setAvcSerie(Character avcSerie) {
        this.avcSerie = avcSerie;
    }

    public int getAvcNume() {
        return avcNume;
    }

    public void setAvcNume(int avcNume) {
        this.avcNume = avcNume;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) avcAno;
        hash += (int) empCodi;
        hash += (avcSerie != null ? avcSerie.hashCode() : 0);
        hash += (int) avcNume;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VAlbavecPK)) {
            return false;
        }
        VAlbavecPK other = (VAlbavecPK) object;
        if (this.avcAno != other.avcAno) {
            return false;
        }
        if (this.empCodi != other.empCodi) {
            return false;
        }
        if ((this.avcSerie == null && other.avcSerie != null) || (this.avcSerie != null && !this.avcSerie.equals(other.avcSerie))) {
            return false;
        }
        if (this.avcNume != other.avcNume) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gnu.anjelica.pad.entity.VAlbavecPK[ avcAno=" + avcAno + ", empCodi=" + empCodi + ", avcSerie=" + avcSerie + ", avcNume=" + avcNume + " ]";
    }
    
}
