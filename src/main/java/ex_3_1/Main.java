package ex_3_1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("src/ex_3_1/city.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(City.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            City city = (City) jaxbUnmarshaller.unmarshal(file);

            System.out.println("City size: " + city.getSize());

            for (Street street : city.getStreets()) {
                System.out.println("Street name: " + street.getName());

                for (House house : street.getHouses()) {
                    System.out.println("House number: " + house.getNumber());
                }
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}