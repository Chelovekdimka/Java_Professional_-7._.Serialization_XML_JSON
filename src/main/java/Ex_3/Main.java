//Створіть клас, використовуючи SAXParser, де опишіть ієрархію XML файлу.
//        Необхідно, щоб проект створював XML-файл і будував дерево (місто, назва вулиці, будинок).
//        У місті використовуйте аттрибут (наприклад, <city size=”big>Kiev</city>).

package Ex_3;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            CityHandler handler = new CityHandler();
            saxParser.parse(new File("src/ex_3/City.xml"), handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


