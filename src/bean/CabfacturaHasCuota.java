/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "cabfactura_has_cuota", catalog = "siscon_og", schema = "")
@NamedQueries({
    @NamedQuery(name = "CabfacturaHasCuota.findAll", query = "SELECT c FROM CabfacturaHasCuota c"),
    @NamedQuery(name = "CabfacturaHasCuota.findByCabFacturaidcabFactura", query = "SELECT c FROM CabfacturaHasCuota c WHERE c.cabfacturaHasCuotaPK.cabFacturaidcabFactura = :cabFacturaidcabFactura"),
    @NamedQuery(name = "CabfacturaHasCuota.findByCuotaIdcuota", query = "SELECT c FROM CabfacturaHasCuota c WHERE c.cabfacturaHasCuotaPK.cuotaIdcuota = :cuotaIdcuota"),
    @NamedQuery(name = "CabfacturaHasCuota.findByMonto", query = "SELECT c FROM CabfacturaHasCuota c WHERE c.monto = :monto")})
public class CabfacturaHasCuota implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CabfacturaHasCuotaPK cabfacturaHasCuotaPK;
    @Column(name = "monto")
    private Integer monto;
    @JoinColumn(name = "cabFactura_idcabFactura", referencedColumnName = "idcabFactura", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cabfactura cabfactura;

    public CabfacturaHasCuota() {
    }

    public CabfacturaHasCuota(CabfacturaHasCuotaPK cabfacturaHasCuotaPK) {
        this.cabfacturaHasCuotaPK = cabfacturaHasCuotaPK;
    }

    public CabfacturaHasCuota(int cabFacturaidcabFactura, int cuotaIdcuota) {
        this.cabfacturaHasCuotaPK = new CabfacturaHasCuotaPK(cabFacturaidcabFactura, cuotaIdcuota);
    }

    public CabfacturaHasCuotaPK getCabfacturaHasCuotaPK() {
        return cabfacturaHasCuotaPK;
    }

    public void setCabfacturaHasCuotaPK(CabfacturaHasCuotaPK cabfacturaHasCuotaPK) {
        this.cabfacturaHasCuotaPK = cabfacturaHasCuotaPK;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        Integer oldMonto = this.monto;
        this.monto = monto;
        changeSupport.firePropertyChange("monto", oldMonto, monto);
    }

    public Cabfactura getCabfactura() {
        return cabfactura;
    }

    public void setCabfactura(Cabfactura cabfactura) {
        Cabfactura oldCabfactura = this.cabfactura;
        this.cabfactura = cabfactura;
        changeSupport.firePropertyChange("cabfactura", oldCabfactura, cabfactura);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cabfacturaHasCuotaPK != null ? cabfacturaHasCuotaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CabfacturaHasCuota)) {
            return false;
        }
        CabfacturaHasCuota other = (CabfacturaHasCuota) object;
        if ((this.cabfacturaHasCuotaPK == null && other.cabfacturaHasCuotaPK != null) || (this.cabfacturaHasCuotaPK != null && !this.cabfacturaHasCuotaPK.equals(other.cabfacturaHasCuotaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.CabfacturaHasCuota[ cabfacturaHasCuotaPK=" + cabfacturaHasCuotaPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public void getMonto(Object valueAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
