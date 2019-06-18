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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "taller", catalog = "siscon_og", schema = "")
@NamedQueries({
    @NamedQuery(name = "Taller_1.findAll", query = "SELECT t FROM Taller_1 t")
    , @NamedQuery(name = "Taller_1.findByIdtaller", query = "SELECT t FROM Taller_1 t WHERE t.idtaller = :idtaller")
    , @NamedQuery(name = "Taller_1.findByNombreTaller", query = "SELECT t FROM Taller_1 t WHERE t.nombreTaller = :nombreTaller")
    , @NamedQuery(name = "Taller_1.findByPropietario", query = "SELECT t FROM Taller_1 t WHERE t.propietario = :propietario")
    , @NamedQuery(name = "Taller_1.findByDireccion", query = "SELECT t FROM Taller_1 t WHERE t.direccion = :direccion")
    , @NamedQuery(name = "Taller_1.findByContacto", query = "SELECT t FROM Taller_1 t WHERE t.contacto = :contacto")
    , @NamedQuery(name = "Taller_1.findByRubro", query = "SELECT t FROM Taller_1 t WHERE t.rubro = :rubro")})
public class Taller_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtaller")
    private Integer idtaller;
    @Column(name = "nombre_taller")
    private String nombreTaller;
    @Column(name = "propietario")
    private String propietario;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "contacto")
    private String contacto;
    @Column(name = "Rubro")
    private String rubro;

    public Taller_1() {
    }

    public Taller_1(Integer idtaller) {
        this.idtaller = idtaller;
    }

    public Integer getIdtaller() {
        return idtaller;
    }

    public void setIdtaller(Integer idtaller) {
        Integer oldIdtaller = this.idtaller;
        this.idtaller = idtaller;
        changeSupport.firePropertyChange("idtaller", oldIdtaller, idtaller);
    }

    public String getNombreTaller() {
        return nombreTaller;
    }

    public void setNombreTaller(String nombreTaller) {
        String oldNombreTaller = this.nombreTaller;
        this.nombreTaller = nombreTaller;
        changeSupport.firePropertyChange("nombreTaller", oldNombreTaller, nombreTaller);
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        String oldPropietario = this.propietario;
        this.propietario = propietario;
        changeSupport.firePropertyChange("propietario", oldPropietario, propietario);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        String oldDireccion = this.direccion;
        this.direccion = direccion;
        changeSupport.firePropertyChange("direccion", oldDireccion, direccion);
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        String oldContacto = this.contacto;
        this.contacto = contacto;
        changeSupport.firePropertyChange("contacto", oldContacto, contacto);
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        String oldRubro = this.rubro;
        this.rubro = rubro;
        changeSupport.firePropertyChange("rubro", oldRubro, rubro);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtaller != null ? idtaller.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Taller_1)) {
            return false;
        }
        Taller_1 other = (Taller_1) object;
        if ((this.idtaller == null && other.idtaller != null) || (this.idtaller != null && !this.idtaller.equals(other.idtaller))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Taller_1[ idtaller=" + idtaller + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
