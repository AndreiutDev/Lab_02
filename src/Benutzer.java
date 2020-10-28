import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    List<Sport> sport;

    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    public String getVorName() {
        return vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }
    public double kalkuliereZeit()
    {
        double total_zeit = 0;
        for (Sport sport : this.sport) {
            total_zeit += sport.kalkuliereZeit();
        }
        return total_zeit;
    }
    public double kalkuliereZeit(Sport sport)
    {
        return sport.kalkuliereZeit();
    }
    public double kalkuliereDurchschnittszeit()
    {
        double total_zeit = 0;
        double sport_list_anzahl = sport.size();
        for (Sport sport : this.sport) {
            total_zeit += sport.kalkuliereZeit();
        }
        return total_zeit/sport_list_anzahl;
    }
}
