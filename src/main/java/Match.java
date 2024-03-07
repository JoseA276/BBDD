import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "match")
public class Match {
    @Id
    @Column(name = "code")
    int code;
    @Column(name = "played")
    Date played;
    @Column(name = "code_home")
    int code_home;
    @Column(name = "code_away")
    int code_away;
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    Team team;

    public Match(int code, Date played, int code_home, int code_away, Team team) {
        this.code = code;
        this.played = played;
        this.code_home = code_home;
        this.code_away = code_away;
        this.team = team;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getPlayed() {
        return played;
    }

    public void setPlayed(Date played) {
        this.played = played;
    }

    public int getCode_home() {
        return code_home;
    }

    public void setCode_home(int code_home) {
        this.code_home = code_home;
    }

    public int getCode_away() {
        return code_away;
    }

    public void setCode_away(int code_away) {
        this.code_away = code_away;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
