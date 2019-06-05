/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "cabfactura", catalog = "siscon_og", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cabfactura.findAll", query = "SELECT c FROM Cabfactura c"),
    @NamedQuery(name = "Cabfactura.findByIdcabFactura", query = "SELECT c FROM Cabfactura c WHERE c.idcabFactura = :idcabFactura"),
    @NamedQuery(name = "Cabfactura.findByIdCliente", query = "SELECT c FROM Cabfactura c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Cabfactura.findByFecha", query = "SELECT c FROM Cabfactura c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Cabfactura.findByTotal", query = "SELECT c FROM Cabfactura c WHERE c.total = :total"),
    @NamedQuery(name = "Cabfactura.findByTipoFact", query = "SELECT c FROM Cabfactura c WHERE c.tipoFact = :tipoFact")})
public class Cabfactura implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idcabFactura")
    private Integer idcabFactura;
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "total")
    private Integer total;
    @Column(name = "tipoFact")
    private String tipoFact;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cabfactura")
    private List<CabfacturaHasCuota> cabfacturaHasCuotaList;

    public Cabfactura() {
    }

    public Cabfactura(Integer idcabFactura) {
        this.idcabFactura = idcabFactura;
    }

    public Integer getIdcabFactura() {
        return idcabFactura;
    }

    public void setIdcabFactura(Integer idcabFactura) {
        Integer oldIdcabFactura = this.idcabFactura;
        this.idcabFactura = idcabFactura;
        changeSupport.firePropertyChange("idcabFactura", oldIdcabFactura, idcabFactura);
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        Integer oldIdCliente = this.idCliente;
        this.idCliente = idCliente;
        changeSupport.firePropertyChange("idCliente", oldIdCliente, idCliente);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        Date oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        Integer oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    public String getTipoFact() {
        return tipoFact;
    }

    public void setTipoFact(String tipoFact) {
        String oldTipoFact = this.tipoFact;
        this.tipoFact = tipoFact;
        changeSupport.firePropertyChange("tipoFact", oldTipoFact, tipoFact);
    }

    public List<CabfacturaHasCuota> getCabfacturaHasCuotaList() {
        return cabfacturaHasCuotaList;
    }

    public void setCabfacturaHasCuotaList(List<CabfacturaHasCuota> cabfacturaHasCuotaList) {
        this.cabfacturaHasCuotaList = cabfacturaHasCuotaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcabFactura != null ? idcabFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabfactura)) {
            return false;
        }
        Cabfactura other = (Cabfactura) object;
        if ((this.idcabFactura == null && other.idcabFactura != null) || (this.idcabFactura != null && !this.idcabFactura.equals(other.idcabFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Cabfactura[ idcabFactura=" + idcabFactura + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
