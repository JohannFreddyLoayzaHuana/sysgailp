package edu.ilp.sysgailp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "docente")
@PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
public class Docente {

    @Column(name = "codigo_docente", length = 10, nullable = false)
    private String codigoDocente;

    @Column(name = "cursos", length = 10)
    private String cursos;


    public Docente() {
    }

    public Docente(String codigoDocente, String cursos) {
        this.codigoDocente = codigoDocente;
        this.cursos = cursos;
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }
}
