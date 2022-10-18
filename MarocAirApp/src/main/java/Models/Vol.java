package Models;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter

public class Vol {
    private String ville_depart;
    private String ville_arrivee;
    private Time heure_depart;
    private Time heure_arrivee;
    private int nbre_place;
    private float prix;
    private Boolean stopover;


}
