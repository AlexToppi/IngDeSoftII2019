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
 * @author Ricardo Loidol
 */
@Entity
@Table(name = "usuario", catalog = "siscon_og", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usuario_1.findAll", query = "SELECT u FROM Usuario_1 u"),
    @NamedQuery(name = "Usuario_1.findByIdUsuario", query = "SELECT u FROM Usuario_1 u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuario_1.findByNombreApellido", query = "SELECT u FROM Usuario_1 u WHERE u.nombreApellido = :nombreApellido"),
    @NamedQuery(name = "Usuario_1.findByCi", query = "SELECT u FROM Usuario_1 u WHERE u.ci = :ci"),
    @NamedQuery(name = "Usuario_1.findByTelefono", query = "SELECT u FROM Usuario_1 u WHERE u.telefono = :telefono"),
    @NamedQuery(name = "Usuario_1.findByUser", query = "SELECT u FROM Usuario_1 u WHERE u.user = :user"),
    @NamedQuery(name = "Usuario_1.findByContrase\u00f1a", query = "SELECT u FROM Usuario_1 u WHERE u.contrase\u00f1a = :contrase\u00f1a"),
    @NamedQuery(name = "Usuario_1.findByEstado", query = "SELECT u FROM Usuario_1 u WHERE u.estado = :estado")})
public class Usuario_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Column(name = "nombre_apellido")
    private String nombreApellido;
    @Column(name = "ci")
    private String ci;
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "user")
    private String user;
    @Basic(optional = false)
    @Column(name = "contrase\u00f1a")
    private String contraseña;
    @Column(name = "estado")
    private String estado;

    public Usuario_1() {
    }

    public Usuario_1(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario_1(Integer idUsuario, String user, String contraseña) {
        this.idUsuario = idUsuario;
        this.user = user;
        this.contraseña = contraseña;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        Integer oldIdUsuario = this.idUsuario;
        this.idUsuario = idUsuario;
        changeSupport.firePropertyChange("idUsuario", oldIdUsuario, idUsuario);
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        String oldNombreApellido = this.nombreApellido;
        this.nombreApellido = nombreApellido;
        changeSupport.firePropertyChange("nombreApellido", oldNombreApellido, nombreApellido);
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        String oldCi = this.ci;
        this.ci = ci;
        changeSupport.firePropertyChange("ci", oldCi, ci);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        String oldTelefono = this.telefono;
        this.telefono = telefono;
        changeSupport.firePropertyChange("telefono", oldTelefono, telefono);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        String oldUser = this.user;
        this.user = user;
        changeSupport.firePropertyChange("user", oldUser, user);
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        String oldContraseña = this.contraseña;
        this.contraseña = contraseña;
        changeSupport.firePropertyChange("contrase\u00f1a", oldContraseña, contraseña);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        String oldEstado = this.estado;
        this.estado = estado;
        changeSupport.firePropertyChange("estado", oldEstado, estado);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario_1)) {
            return false;
        }
        Usuario_1 other = (Usuario_1) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Usuario_1[ idUsuario=" + idUsuario + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
