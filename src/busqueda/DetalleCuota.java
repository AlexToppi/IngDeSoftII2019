/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;

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
 * @author Ricardo Loidol
 */
@Entity
@Table(name = "detalle_cuota", catalog = "siscon_og", schema = "")
@NamedQueries({
    @NamedQuery(name = "DetalleCuota.findAll", query = "SELECT d FROM DetalleCuota d"),
    @NamedQuery(name = "DetalleCuota.findByIdcuota", query = "SELECT d FROM DetalleCuota d WHERE d.idcuota = :idcuota"),
    @NamedQuery(name = "DetalleCuota.findByCuotaNro", query = "SELECT d FROM DetalleCuota d WHERE d.cuotaNro = :cuotaNro"),
    @NamedQuery(name = "DetalleCuota.findByEstado", query = "SELECT d FROM DetalleCuota d WHERE d.estado = :estado"),
    @NamedQuery(name = "DetalleCuota.findByMonto", query = "SELECT d FROM DetalleCuota d WHERE d.monto = :monto"),
    @NamedQuery(name = "DetalleCuota.findByFechaVencimiento", query = "SELECT d FROM DetalleCuota d WHERE d.fechaVencimiento = :fechaVencimiento"),
    @NamedQuery(name = "DetalleCuota.findByPolizaIdpoliza", query = "SELECT d FROM DetalleCuota d WHERE d.polizaIdpoliza = :polizaIdpoliza")})
public class DetalleCuota implements Serializable {

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
    private Double monto;
    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Basic(optional = false)
    @Column(name = "poliza_idpoliza")
    private int polizaIdpoliza;

    public DetalleCuota() {
    }

    public DetalleCuota(Integer idcuota) {
        this.idcuota = idcuota;
    }

    public DetalleCuota(Integer idcuota, int polizaIdpoliza) {
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

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        Double oldMonto = this.monto;
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
        if (!(object instanceof DetalleCuota)) {
            return false;
        }
        DetalleCuota other = (DetalleCuota) object;
        if ((this.idcuota == null && other.idcuota != null) || (this.idcuota != null && !this.idcuota.equals(other.idcuota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "busqueda.DetalleCuota[ idcuota=" + idcuota + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
