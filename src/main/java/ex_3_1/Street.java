package ex_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Street {
    @XmlAttribute
    private String name;
    private List<House> houses;

    public String getName() {
        return name;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }
}