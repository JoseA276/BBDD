import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "plays")
@IdClass(TimePK.class)
public class Plays {
    @Id
    int id_match;
    @Id
    int id_player;
    @Column(name = "stats")
    int Stats;
    @Column(name = "substituted")
    int Substituted;
    @Column(name = "goals")
    int goals;
    @Column(name = "yellow")
    int yellow;
    @Column(name = "red")
    boolean red;
    @ManyToOne
    @JoinColumn(name = "id_match")

    Match match;
    @ManyToOne
    @JoinColumn(name = "id_player")
    Player player;

    public Plays(int id_match, int id_player, int stats, int substituted, int goals, int yellow, boolean red, Match match, Player player) {
        this.id_match = id_match;
        this.id_player = id_player;
        Stats = stats;
        Substituted = substituted;
        this.goals = goals;
        this.yellow = yellow;
        this.red = red;
        this.match = match;
        this.player = player;
    }

    public int getId_match() {
        return id_match;
    }

    public void setId_match(int id_match) {
        this.id_match = id_match;
    }

    public int getId_player() {
        return id_player;
    }

    public void setId_player(int id_player) {
        this.id_player = id_player;
    }

    public int getStats() {
        return Stats;
    }

    public void setStats(int stats) {
        Stats = stats;
    }

    public int getSubstituted() {
        return Substituted;
    }

    public void setSubstituted(int substituted) {
        Substituted = substituted;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getYellow() {
        return yellow;
    }

    public void setYellow(int yellow) {
        this.yellow = yellow;
    }

    public boolean isRed() {
        return red;
    }

    public void setRed(boolean red) {
        this.red = red;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}

class TimePK implements Serializable {
    protected int id_match;
    protected int id_player;

    public TimePK(int id_match, int id_player) {
        this.id_match = id_match;
        this.id_player = id_player;
    }

    public int getId_match() {
        return id_match;
    }

    public void setId_match(int id_match) {
        this.id_match = id_match;
    }

    public int getId_player() {
        return id_player;
    }

    public void setId_player(int id_player) {
        this.id_player = id_player;
    }
}

