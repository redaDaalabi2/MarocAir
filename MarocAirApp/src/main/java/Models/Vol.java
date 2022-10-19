package Models;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

@Getter
@Setter

public class Vol {
    private int flightid;
    private String ville_depart;
    private String ville_arrivee;
    private Time heure_depart;
    private Time heure_arrivee;
    private int nbre_place;
    private float prix;
    private Boolean stopover;
    private Date date_depart;
    private Date date_arrivee;


}
