package co.edu.escuelaing.arsw.portal2d.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Mapa {

    @Id
    @Column(unique = true)
    private String nombre;
    private String estructura;

    public Mapa(String nombre, String estructura) {
        this.nombre = nombre;
        this.estructura = estructura;
    }
    public Mapa() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstructura() {
        return estructura;
    }

    public void setEstructura(String estructura) {
        this.estructura = estructura;
    }
}