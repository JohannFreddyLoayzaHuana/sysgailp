package edu.ilp.sysgailp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "administrativo")
@PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
public class Administrativo {
    @Column(name = "codigo_Admin", length = 10, nullable = false)
    private String codigoAdmin;

    @Column(name = "cargo", length = 10)
    private String cargo;

    public Administrativo() {
    }

    public Administrativo(String codigoAdmin, String cargo) {
        this.codigoAdmin = codigoAdmin;
        this.cargo = cargo;
    }

    public String getCodigoAdmin() {
        return codigoAdmin;
    }

    public void setCodigoAdmin(String codigoAdmin) {
        this.codigoAdmin = codigoAdmin;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
