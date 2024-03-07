
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Team")
public class Team {
    @Id
    @Column(name = "code")
    int code;
    @Column(name = "name")
    String name;
    @Column(name = "stadium")
    String stadium;
    @Column(name = "city")
    String city;

    public Team(int code, String name, String stadium, String city) {
        this.code = code;
        this.name = name;
        this.stadium = stadium;
        this.city = city;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
