/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author usuario
 */
@Embeddable
public class CabfacturaHasCuotaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "cabFactura_idcabFactura")
    private int cabFacturaidcabFactura;
    @Basic(optional = false)
    @Column(name = "cuota_idcuota")
    private int cuotaIdcuota;

    public CabfacturaHasCuotaPK() {
    }

    public CabfacturaHasCuotaPK(int cabFacturaidcabFactura, int cuotaIdcuota) {
        this.cabFacturaidcabFactura = cabFacturaidcabFactura;
        this.cuotaIdcuota = cuotaIdcuota;
    }

    public int getCabFacturaidcabFactura() {
        return cabFacturaidcabFactura;
    }

    public void setCabFacturaidcabFactura(int cabFacturaidcabFactura) {
        this.cabFacturaidcabFactura = cabFacturaidcabFactura;
    }

    public int getCuotaIdcuota() {
        return cuotaIdcuota;
    }

    public void setCuotaIdcuota(int cuotaIdcuota) {
        this.cuotaIdcuota = cuotaIdcuota;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cabFacturaidcabFactura;
        hash += (int) cuotaIdcuota;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CabfacturaHasCuotaPK)) {
            return false;
        }
        CabfacturaHasCuotaPK other = (CabfacturaHasCuotaPK) object;
        if (this.cabFacturaidcabFactura != other.cabFacturaidcabFactura) {
            return false;
        }
        if (this.cuotaIdcuota != other.cuotaIdcuota) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.CabfacturaHasCuotaPK[ cabFacturaidcabFactura=" + cabFacturaidcabFactura + ", cuotaIdcuota=" + cuotaIdcuota + " ]";
    }
    
}
