/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TM13;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "passwordlogin")
@NamedQueries({
    @NamedQuery(name = "Passwordlogin.findAll", query = "SELECT p FROM Passwordlogin p"),
    @NamedQuery(name = "Passwordlogin.findByUsername", query = "SELECT p FROM Passwordlogin p WHERE p.username = :username"),
    @NamedQuery(name = "Passwordlogin.findByPassword", query = "SELECT p FROM Passwordlogin p WHERE p.password = :password")})
public class Passwordlogin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;

    public Passwordlogin() {
    }

    public Passwordlogin(String username) {
        this.username = username;
    }

    public Passwordlogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Passwordlogin)) {
            return false;
        }
        Passwordlogin other = (Passwordlogin) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TM13.Passwordlogin[ username=" + username + " ]";
    }
    
}
