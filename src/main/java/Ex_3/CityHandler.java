package Ex_3;

import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class CityHandler extends DefaultHandler {

    private String citySize;
    private String streetName;
    private String houseNumber;

    private boolean inCity;
    private boolean inStreet;
    private boolean inHouse;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case "city":
                inCity = true;
                citySize = attributes.getValue("size");
                break;
            case "street":
                inStreet = true;
                streetName = attributes.getValue("name");
                break;
            case "house":
                inHouse = true;
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        switch (qName) {
            case "city":
                inCity = false;
                break;
            case "street":
                inStreet = false;
                break;
            case "house":
                inHouse = false;
                System.out.println("City: " + citySize + ", Street: " + streetName + ", House: " + houseNumber);
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        if (inHouse) {
            houseNumber = new String(ch, start, length);
        }
    }
}
