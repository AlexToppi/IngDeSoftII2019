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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
 * @author Ricardo Loidol
 */
@Entity
@Table(name = "siniestro", catalog = "siscon_og", schema = "")
@NamedQueries({
    @NamedQuery(name = "Siniestro_1.findAll", query = "SELECT s FROM Siniestro_1 s"),
    @NamedQuery(name = "Siniestro_1.findByIdSiniestro", query = "SELECT s FROM Siniestro_1 s WHERE s.idSiniestro = :idSiniestro"),
    @NamedQuery(name = "Siniestro_1.findByDescripcion", query = "SELECT s FROM Siniestro_1 s WHERE s.descripcion = :descripcion"),
    @NamedQuery(name = "Siniestro_1.findByFechaHecho", query = "SELECT s FROM Siniestro_1 s WHERE s.fechaHecho = :fechaHecho"),
    @NamedQuery(name = "Siniestro_1.findByFechaReporte", query = "SELECT s FROM Siniestro_1 s WHERE s.fechaReporte = :fechaReporte"),
    @NamedQuery(name = "Siniestro_1.findByCosto", query = "SELECT s FROM Siniestro_1 s WHERE s.costo = :costo"),
    @NamedQuery(name = "Siniestro_1.findByPolizaIdpoliza", query = "SELECT s FROM Siniestro_1 s WHERE s.polizaIdpoliza = :polizaIdpoliza")})
public class Siniestro_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSiniestro")
    private Integer idSiniestro;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha_hecho")
    @Temporal(TemporalType.DATE)
    private Date fechaHecho;
    @Column(name = "fecha_reporte")
    @Temporal(TemporalType.DATE)
    private Date fechaReporte;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "costo")
    private Double costo;
    @Basic(optional = false)
    @Column(name = "poliza_idpoliza")
    private int polizaIdpoliza;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "siniestroidSiniestro")
    private List<Detallesiniestro> detallesiniestroList;

    public Siniestro_1() {
    }

    public Siniestro_1(Integer idSiniestro) {
        this.idSiniestro = idSiniestro;
    }

    public Siniestro_1(Integer idSiniestro, int polizaIdpoliza) {
        this.idSiniestro = idSiniestro;
        this.polizaIdpoliza = polizaIdpoliza;
    }

    public Integer getIdSiniestro() {
        return idSiniestro;
    }

    public void setIdSiniestro(Integer idSiniestro) {
        Integer oldIdSiniestro = this.idSiniestro;
        this.idSiniestro = idSiniestro;
        changeSupport.firePropertyChange("idSiniestro", oldIdSiniestro, idSiniestro);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        changeSupport.firePropertyChange("descripcion", oldDescripcion, descripcion);
    }

    public Date getFechaHecho() {
        return fechaHecho;
    }

    public void setFechaHecho(Date fechaHecho) {
        Date oldFechaHecho = this.fechaHecho;
        this.fechaHecho = fechaHecho;
        changeSupport.firePropertyChange("fechaHecho", oldFechaHecho, fechaHecho);
    }

    public Date getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(Date fechaReporte) {
        Date oldFechaReporte = this.fechaReporte;
        this.fechaReporte = fechaReporte;
        changeSupport.firePropertyChange("fechaReporte", oldFechaReporte, fechaReporte);
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        Double oldCosto = this.costo;
        this.costo = costo;
        changeSupport.firePropertyChange("costo", oldCosto, costo);
    }

    public int getPolizaIdpoliza() {
        return polizaIdpoliza;
    }

    public void setPolizaIdpoliza(int polizaIdpoliza) {
        int oldPolizaIdpoliza = this.polizaIdpoliza;
        this.polizaIdpoliza = polizaIdpoliza;
        changeSupport.firePropertyChange("polizaIdpoliza", oldPolizaIdpoliza, polizaIdpoliza);
    }

    public List<Detallesiniestro> getDetallesiniestroList() {
        return detallesiniestroList;
    }

    public void setDetallesiniestroList(List<Detallesiniestro> detallesiniestroList) {
        this.detallesiniestroList = detallesiniestroList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSiniestro != null ? idSiniestro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Siniestro_1)) {
            return false;
        }
        Siniestro_1 other = (Siniestro_1) object;
        if ((this.idSiniestro == null && other.idSiniestro != null) || (this.idSiniestro != null && !this.idSiniestro.equals(other.idSiniestro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Siniestro_1[ idSiniestro=" + idSiniestro + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
