package edu.ilp.sysgailp.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

public class escuela {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idescuela;

    private String denominacion;

    private String codigoEscuela;

    @OneToMany(mappedBy = "escuela")
    private List<Estudiante> estudiantes;

    public escuela() {
    }

    public escuela(Long idescuela) {
        this.idescuela = idescuela;
    }

    public escuela(Long idescuela, String denominacion, String codigoEscuela) {
        this.idescuela = idescuela;
        this.denominacion = denominacion;
        this.codigoEscuela = codigoEscuela;
    }

    public Long getIdescuela() {
        return idescuela;
    }

    public void setIdescuela(Long idescuela) {
        this.idescuela = idescuela;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getCodigoEscuela() {
        return codigoEscuela;
    }

    public void setCodigoEscuela(String codigoEscuela) {
        this.codigoEscuela = codigoEscuela;
    }

}
