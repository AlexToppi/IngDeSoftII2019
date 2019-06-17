/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Ricardo Loidol
 */
@Entity
@Table(name = "detallesiniestro", catalog = "siscon_og", schema = "")
@NamedQueries({
    @NamedQuery(name = "Detallesiniestro.findAll", query = "SELECT d FROM Detallesiniestro d"),
    @NamedQuery(name = "Detallesiniestro.findByIddetallesiniestro", query = "SELECT d FROM Detallesiniestro d WHERE d.iddetallesiniestro = :iddetallesiniestro"),
    @NamedQuery(name = "Detallesiniestro.findByCodigoRepuesto", query = "SELECT d FROM Detallesiniestro d WHERE d.codigoRepuesto = :codigoRepuesto"),
    @NamedQuery(name = "Detallesiniestro.findByPrecio", query = "SELECT d FROM Detallesiniestro d WHERE d.precio = :precio"),
    @NamedQuery(name = "Detallesiniestro.findByDescripcion", query = "SELECT d FROM Detallesiniestro d WHERE d.descripcion = :descripcion"),
    @NamedQuery(name = "Detallesiniestro.findByTipoMantenimiento", query = "SELECT d FROM Detallesiniestro d WHERE d.tipoMantenimiento = :tipoMantenimiento"),
    @NamedQuery(name = "Detallesiniestro.findByTallerIdtaller", query = "SELECT d FROM Detallesiniestro d WHERE d.tallerIdtaller = :tallerIdtaller")})
public class Detallesiniestro implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetallesiniestro")
    private Integer iddetallesiniestro;
    @Column(name = "codigo_repuesto")
    private String codigoRepuesto;
    @Column(name = "precio")
    private Integer precio;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tipo_mantenimiento")
    private String tipoMantenimiento;
    @Basic(optional = false)
    @Column(name = "taller_idtaller")
    private int tallerIdtaller;
    @JoinColumn(name = "siniestro_idSiniestro", referencedColumnName = "idSiniestro")
    @ManyToOne(optional = false)
    private Siniestro_1 siniestroidSiniestro;

    public Detallesiniestro() {
    }

    public Detallesiniestro(Integer iddetallesiniestro) {
        this.iddetallesiniestro = iddetallesiniestro;
    }

    public Detallesiniestro(Integer iddetallesiniestro, int tallerIdtaller) {
        this.iddetallesiniestro = iddetallesiniestro;
        this.tallerIdtaller = tallerIdtaller;
    }

    public Integer getIddetallesiniestro() {
        return iddetallesiniestro;
    }

    public void setIddetallesiniestro(Integer iddetallesiniestro) {
        Integer oldIddetallesiniestro = this.iddetallesiniestro;
        this.iddetallesiniestro = iddetallesiniestro;
        changeSupport.firePropertyChange("iddetallesiniestro", oldIddetallesiniestro, iddetallesiniestro);
    }

    public String getCodigoRepuesto() {
        return codigoRepuesto;
    }

    public void setCodigoRepuesto(String codigoRepuesto) {
        String oldCodigoRepuesto = this.codigoRepuesto;
        this.codigoRepuesto = codigoRepuesto;
        changeSupport.firePropertyChange("codigoRepuesto", oldCodigoRepuesto, codigoRepuesto);
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        Integer oldPrecio = this.precio;
        this.precio = precio;
        changeSupport.firePropertyChange("precio", oldPrecio, precio);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        changeSupport.firePropertyChange("descripcion", oldDescripcion, descripcion);
    }

    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }

    public void setTipoMantenimiento(String tipoMantenimiento) {
        String oldTipoMantenimiento = this.tipoMantenimiento;
        this.tipoMantenimiento = tipoMantenimiento;
        changeSupport.firePropertyChange("tipoMantenimiento", oldTipoMantenimiento, tipoMantenimiento);
    }

    public int getTallerIdtaller() {
        return tallerIdtaller;
    }

    public void setTallerIdtaller(int tallerIdtaller) {
        int oldTallerIdtaller = this.tallerIdtaller;
        this.tallerIdtaller = tallerIdtaller;
        changeSupport.firePropertyChange("tallerIdtaller", oldTallerIdtaller, tallerIdtaller);
    }

    public Siniestro_1 getSiniestroidSiniestro() {
        return siniestroidSiniestro;
    }

    public void setSiniestroidSiniestro(Siniestro_1 siniestroidSiniestro) {
        Siniestro_1 oldSiniestroidSiniestro = this.siniestroidSiniestro;
        this.siniestroidSiniestro = siniestroidSiniestro;
        changeSupport.firePropertyChange("siniestroidSiniestro", oldSiniestroidSiniestro, siniestroidSiniestro);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetallesiniestro != null ? iddetallesiniestro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallesiniestro)) {
            return false;
        }
        Detallesiniestro other = (Detallesiniestro) object;
        if ((this.iddetallesiniestro == null && other.iddetallesiniestro != null) || (this.iddetallesiniestro != null && !this.iddetallesiniestro.equals(other.iddetallesiniestro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Detallesiniestro[ iddetallesiniestro=" + iddetallesiniestro + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
