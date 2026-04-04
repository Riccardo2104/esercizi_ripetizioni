package esercizi_02_04_26.tracciaesame.model;

import esercizi_21_03_26.bibliotecav2.Libro;

import java.util.Objects;

public class Competenza  {
    private String nomeCompetenza;
    private int identificativo;

    public Competenza(String nomeCompetenza, int identificativo) {
        this.nomeCompetenza = nomeCompetenza;
        this.identificativo = identificativo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Competenza competenza = (Competenza) o;
        return Objects.equals(identificativo, competenza.identificativo);
    }


}
