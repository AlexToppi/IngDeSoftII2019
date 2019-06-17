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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "cuota", catalog = "siscon_og", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cuota.findAll", query = "SELECT c FROM Cuota c"),
    @NamedQuery(name = "Cuota.findByIdcuota", query = "SELECT c FROM Cuota c WHERE c.idcuota = :idcuota"),
    @NamedQuery(name = "Cuota.findByCuotaNro", query = "SELECT c FROM Cuota c WHERE c.cuotaNro = :cuotaNro"),
    @NamedQuery(name = "Cuota.findByEstado", query = "SELECT c FROM Cuota c WHERE c.estado = :estado"),
    @NamedQuery(name = "Cuota.findByMonto", query = "SELECT c FROM Cuota c WHERE c.monto = :monto"),
    @NamedQuery(name = "Cuota.findByFechaVencimiento", query = "SELECT c FROM Cuota c WHERE c.fechaVencimiento = :fechaVencimiento"),
    @NamedQuery(name = "Cuota.findByPolizaIdpoliza", query = "SELECT c FROM Cuota c WHERE c.polizaIdpoliza = :polizaIdpoliza")})
public class Cuota implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcuota")
    private Integer idcuota;
    @Column(name = "cuotaNro")
    private String cuotaNro;
    @Column(name = "estado")
    private String estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto")
    private Integer monto;
    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Basic(optional = false)
    @Column(name = "poliza_idpoliza")
    private int polizaIdpoliza;

    public Cuota() {
    }

    public Cuota(Integer idcuota) {
        this.idcuota = idcuota;
    }

    public Cuota(Integer idcuota, int polizaIdpoliza) {
        this.idcuota = idcuota;
        this.polizaIdpoliza = polizaIdpoliza;
    }

    public Integer getIdcuota() {
        return idcuota;
    }

    public void setIdcuota(Integer idcuota) {
        Integer oldIdcuota = this.idcuota;
        this.idcuota = idcuota;
        changeSupport.firePropertyChange("idcuota", oldIdcuota, idcuota);
    }

    public String getCuotaNro() {
        return cuotaNro;
    }

    public void setCuotaNro(String cuotaNro) {
        String oldCuotaNro = this.cuotaNro;
        this.cuotaNro = cuotaNro;
        changeSupport.firePropertyChange("cuotaNro", oldCuotaNro, cuotaNro);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        String oldEstado = this.estado;
        this.estado = estado;
        changeSupport.firePropertyChange("estado", oldEstado, estado);
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        Integer oldMonto = this.monto;
        this.monto = monto;
        changeSupport.firePropertyChange("monto", oldMonto, monto);
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        Date oldFechaVencimiento = this.fechaVencimiento;
        this.fechaVencimiento = fechaVencimiento;
        changeSupport.firePropertyChange("fechaVencimiento", oldFechaVencimiento, fechaVencimiento);
    }

    public int getPolizaIdpoliza() {
        return polizaIdpoliza;
    }

    public void setPolizaIdpoliza(int polizaIdpoliza) {
        int oldPolizaIdpoliza = this.polizaIdpoliza;
        this.polizaIdpoliza = polizaIdpoliza;
        changeSupport.firePropertyChange("polizaIdpoliza", oldPolizaIdpoliza, polizaIdpoliza);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcuota != null ? idcuota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuota)) {
            return false;
        }
        Cuota other = (Cuota) object;
        if ((this.idcuota == null && other.idcuota != null) || (this.idcuota != null && !this.idcuota.equals(other.idcuota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "busqueda.Cuota[ idcuota=" + idcuota + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
