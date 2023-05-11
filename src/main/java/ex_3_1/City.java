package ex_3_1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "city")
public class City {
    @XmlAttribute
    private String size;
    private List<Street> streets;

    public String getSize() {
        return size;
    }

    public List<Street> getStreets() {
        return streets;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }
}