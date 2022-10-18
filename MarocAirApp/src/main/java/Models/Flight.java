package Models;

import java.sql.Date;
import java.sql.Time;

public class Flight {
    //fields
    private int id;
    private String flightid;
    private String ville_depart;
    private String ville_arrivee;
    private Time heure_depart;
    private Time heure_arrivee;
    private Date date_depart;
    private Date date_arrivee;
    private int nbre_place;
    private float prix;
    private boolean stopover;
    private String stopover_aero;

    public Flight() {
    }

    public int getId() {
        return this.id;
    }

    public String getFlightid() {
        return this.flightid;
    }

    public String getVille_depart() {
        return this.ville_depart;
    }

    public String getVille_arrivee() {
        return this.ville_arrivee;
    }

    public Time getHeure_depart() {
        return this.heure_depart;
    }

    public Time getHeure_arrivee() {
        return this.heure_arrivee;
    }

    public Date getDate_depart() {
        return this.date_depart;
    }

    public Date getDate_arrivee() {
        return this.date_arrivee;
    }

    public int getNbre_place() {
        return this.nbre_place;
    }

    public float getPrix() {
        return this.prix;
    }

    public boolean isStopover() {
        return this.stopover;
    }

    public String getStopover_aero() {
        return this.stopover_aero;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid;
    }

    public void setVille_depart(String ville_depart) {
        this.ville_depart = ville_depart;
    }

    public void setVille_arrivee(String ville_arrivee) {
        this.ville_arrivee = ville_arrivee;
    }

    public void setHeure_depart(Time heure_depart) {
        this.heure_depart = heure_depart;
    }

    public void setHeure_arrivee(Time heure_arrivee) {
        this.heure_arrivee = heure_arrivee;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public void setDate_arrivee(Date date_arrivee) {
        this.date_arrivee = date_arrivee;
    }

    public void setNbre_place(int nbre_place) {
        this.nbre_place = nbre_place;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setStopover(boolean stopover) {
        this.stopover = stopover;
    }

    public void setStopover_aero(String stopover_aero) {
        this.stopover_aero = stopover_aero;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Flight)) return false;
        final Flight other = (Flight) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$flightid = this.getFlightid();
        final Object other$flightid = other.getFlightid();
        if (this$flightid == null ? other$flightid != null : !this$flightid.equals(other$flightid)) return false;
        final Object this$ville_depart = this.getVille_depart();
        final Object other$ville_depart = other.getVille_depart();
        if (this$ville_depart == null ? other$ville_depart != null : !this$ville_depart.equals(other$ville_depart))
            return false;
        final Object this$ville_arrivee = this.getVille_arrivee();
        final Object other$ville_arrivee = other.getVille_arrivee();
        if (this$ville_arrivee == null ? other$ville_arrivee != null : !this$ville_arrivee.equals(other$ville_arrivee))
            return false;
        final Object this$heure_depart = this.getHeure_depart();
        final Object other$heure_depart = other.getHeure_depart();
        if (this$heure_depart == null ? other$heure_depart != null : !this$heure_depart.equals(other$heure_depart))
            return false;
        final Object this$heure_arrivee = this.getHeure_arrivee();
        final Object other$heure_arrivee = other.getHeure_arrivee();
        if (this$heure_arrivee == null ? other$heure_arrivee != null : !this$heure_arrivee.equals(other$heure_arrivee))
            return false;
        final Object this$date_depart = this.getDate_depart();
        final Object other$date_depart = other.getDate_depart();
        if (this$date_depart == null ? other$date_depart != null : !this$date_depart.equals(other$date_depart))
            return false;
        final Object this$date_arrivee = this.getDate_arrivee();
        final Object other$date_arrivee = other.getDate_arrivee();
        if (this$date_arrivee == null ? other$date_arrivee != null : !this$date_arrivee.equals(other$date_arrivee))
            return false;
        if (this.getNbre_place() != other.getNbre_place()) return false;
        if (Float.compare(this.getPrix(), other.getPrix()) != 0) return false;
        if (this.isStopover() != other.isStopover()) return false;
        final Object this$stopover_aero = this.getStopover_aero();
        final Object other$stopover_aero = other.getStopover_aero();
        if (this$stopover_aero == null ? other$stopover_aero != null : !this$stopover_aero.equals(other$stopover_aero))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Flight;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        final Object $flightid = this.getFlightid();
        result = result * PRIME + ($flightid == null ? 43 : $flightid.hashCode());
        final Object $ville_depart = this.getVille_depart();
        result = result * PRIME + ($ville_depart == null ? 43 : $ville_depart.hashCode());
        final Object $ville_arrivee = this.getVille_arrivee();
        result = result * PRIME + ($ville_arrivee == null ? 43 : $ville_arrivee.hashCode());
        final Object $heure_depart = this.getHeure_depart();
        result = result * PRIME + ($heure_depart == null ? 43 : $heure_depart.hashCode());
        final Object $heure_arrivee = this.getHeure_arrivee();
        result = result * PRIME + ($heure_arrivee == null ? 43 : $heure_arrivee.hashCode());
        final Object $date_depart = this.getDate_depart();
        result = result * PRIME + ($date_depart == null ? 43 : $date_depart.hashCode());
        final Object $date_arrivee = this.getDate_arrivee();
        result = result * PRIME + ($date_arrivee == null ? 43 : $date_arrivee.hashCode());
        result = result * PRIME + this.getNbre_place();
        result = result * PRIME + Float.floatToIntBits(this.getPrix());
        result = result * PRIME + (this.isStopover() ? 79 : 97);
        final Object $stopover_aero = this.getStopover_aero();
        result = result * PRIME + ($stopover_aero == null ? 43 : $stopover_aero.hashCode());
        return result;
    }

    public String toString() {
        return "Flight(id=" + this.getId() + ", flightid=" + this.getFlightid() + ", ville_depart=" + this.getVille_depart() + ", ville_arrivee=" + this.getVille_arrivee() + ", heure_depart=" + this.getHeure_depart() + ", heure_arrivee=" + this.getHeure_arrivee() + ", date_depart=" + this.getDate_depart() + ", date_arrivee=" + this.getDate_arrivee() + ", nbre_place=" + this.getNbre_place() + ", prix=" + this.getPrix() + ", stopover=" + this.isStopover() + ", stopover_aero=" + this.getStopover_aero() + ")";
    }
}
