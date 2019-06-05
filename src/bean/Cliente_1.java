/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.Transient;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "cliente", catalog = "siscon_og", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cliente_1.findAll", query = "SELECT c FROM Cliente_1 c"),
    @NamedQuery(name = "Cliente_1.findByIdCliente", query = "SELECT c FROM Cliente_1 c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Cliente_1.findByNombre", query = "SELECT c FROM Cliente_1 c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Cliente_1.findByApellido", query = "SELECT c FROM Cliente_1 c WHERE c.apellido = :apellido"),
    @NamedQuery(name = "Cliente_1.findByCi", query = "SELECT c FROM Cliente_1 c WHERE c.ci = :ci"),
    @NamedQuery(name = "Cliente_1.findByTipoPersona", query = "SELECT c FROM Cliente_1 c WHERE c.tipoPersona = :tipoPersona"),
    @NamedQuery(name = "Cliente_1.findByRuc", query = "SELECT c FROM Cliente_1 c WHERE c.ruc = :ruc"),
    @NamedQuery(name = "Cliente_1.findByDv", query = "SELECT c FROM Cliente_1 c WHERE c.dv = :dv"),
    @NamedQuery(name = "Cliente_1.findByTelefono", query = "SELECT c FROM Cliente_1 c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "Cliente_1.findByCelular", query = "SELECT c FROM Cliente_1 c WHERE c.celular = :celular"),
    @NamedQuery(name = "Cliente_1.findByEmail", query = "SELECT c FROM Cliente_1 c WHERE c.email = :email"),
    @NamedQuery(name = "Cliente_1.findByNacionalidad", query = "SELECT c FROM Cliente_1 c WHERE c.nacionalidad = :nacionalidad"),
    @NamedQuery(name = "Cliente_1.findByCiudad", query = "SELECT c FROM Cliente_1 c WHERE c.ciudad = :ciudad"),
    @NamedQuery(name = "Cliente_1.findByBarrio", query = "SELECT c FROM Cliente_1 c WHERE c.barrio = :barrio"),
    @NamedQuery(name = "Cliente_1.findByDireccion", query = "SELECT c FROM Cliente_1 c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Cliente_1.findByEstado", query = "SELECT c FROM Cliente_1 c WHERE c.estado = :estado"),
    @NamedQuery(name = "Cliente_1.findByNombreRef", query = "SELECT c FROM Cliente_1 c WHERE c.nombreRef = :nombreRef"),
    @NamedQuery(name = "Cliente_1.findByCelularRef", query = "SELECT c FROM Cliente_1 c WHERE c.celularRef = :celularRef")})
public class Cliente_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCliente")
    private Integer idCliente;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "ci")
    private String ci;
    @Column(name = "tipo_persona")
    private String tipoPersona;
    @Column(name = "ruc")
    private Integer ruc;
    @Column(name = "dv")
    private Integer dv;
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "celular")
    private String celular;
    @Column(name = "email")
    private String email;
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "barrio")
    private String barrio;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "estado")
    private Integer estado;
    @Column(name = "nombre_ref")
    private String nombreRef;
    @Column(name = "celular_ref")
    private String celularRef;

    public Cliente_1() {
    }

    public Cliente_1(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente_1(Integer idCliente, String nombre, String celular) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.celular = celular;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        Integer oldIdCliente = this.idCliente;
        this.idCliente = idCliente;
        changeSupport.firePropertyChange("idCliente", oldIdCliente, idCliente);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        String oldApellido = this.apellido;
        this.apellido = apellido;
        changeSupport.firePropertyChange("apellido", oldApellido, apellido);
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        String oldCi = this.ci;
        this.ci = ci;
        changeSupport.firePropertyChange("ci", oldCi, ci);
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        String oldTipoPersona = this.tipoPersona;
        this.tipoPersona = tipoPersona;
        changeSupport.firePropertyChange("tipoPersona", oldTipoPersona, tipoPersona);
    }

    public Integer getRuc() {
        return ruc;
    }

    public void setRuc(Integer ruc) {
        Integer oldRuc = this.ruc;
        this.ruc = ruc;
        changeSupport.firePropertyChange("ruc", oldRuc, ruc);
    }

    public Integer getDv() {
        return dv;
    }

    public void setDv(Integer dv) {
        Integer oldDv = this.dv;
        this.dv = dv;
        changeSupport.firePropertyChange("dv", oldDv, dv);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        String oldTelefono = this.telefono;
        this.telefono = telefono;
        changeSupport.firePropertyChange("telefono", oldTelefono, telefono);
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        String oldCelular = this.celular;
        this.celular = celular;
        changeSupport.firePropertyChange("celular", oldCelular, celular);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        String oldNacionalidad = this.nacionalidad;
        this.nacionalidad = nacionalidad;
        changeSupport.firePropertyChange("nacionalidad", oldNacionalidad, nacionalidad);
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        String oldCiudad = this.ciudad;
        this.ciudad = ciudad;
        changeSupport.firePropertyChange("ciudad", oldCiudad, ciudad);
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        String oldBarrio = this.barrio;
        this.barrio = barrio;
        changeSupport.firePropertyChange("barrio", oldBarrio, barrio);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        String oldDireccion = this.direccion;
        this.direccion = direccion;
        changeSupport.firePropertyChange("direccion", oldDireccion, direccion);
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        Integer oldEstado = this.estado;
        this.estado = estado;
        changeSupport.firePropertyChange("estado", oldEstado, estado);
    }

    public String getNombreRef() {
        return nombreRef;
    }

    public void setNombreRef(String nombreRef) {
        String oldNombreRef = this.nombreRef;
        this.nombreRef = nombreRef;
        changeSupport.firePropertyChange("nombreRef", oldNombreRef, nombreRef);
    }

    public String getCelularRef() {
        return celularRef;
    }

    public void setCelularRef(String celularRef) {
        String oldCelularRef = this.celularRef;
        this.celularRef = celularRef;
        changeSupport.firePropertyChange("celularRef", oldCelularRef, celularRef);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente_1)) {
            return false;
        }
        Cliente_1 other = (Cliente_1) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Cliente_1[ idCliente=" + idCliente + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

//    public Collection<Vehiculo_1> getVehiculo_1Collection() {
//        return vehiculo_1Collection;
//    }
//
//    public void setVehiculo_1Collection(Collection<Vehiculo_1> vehiculo_1Collection) {
//        this.vehiculo_1Collection = vehiculo_1Collection;
//    }
//    
}
