package co.edu.escuelaing.arsw.portal2d.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;


@Entity
public class Sala {
    @Id
    private String codigo;
    private int players;

    public Sala(String codigo, int players) {
        this.codigo = codigo;
        this.players = players;
    }

    public Sala() {}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }
}
