package xmldemo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReadFromXMLFile {
    public static void main(String[] args) throws Exception {
        ReadFromXMLFile instance = new ReadFromXMLFile();
        instance.read();

    }

    public void read() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("Book.xml"));

        NodeList list = document.getElementsByTagName("Book");

        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < list.getLength(); i++) {
            Element node = (Element) list.item(i);
            String id = node.getElementsByTagName("Id").item(0).getFirstChild().getNodeValue();
            String name = node.getElementsByTagName("Name").item(0).getFirstChild().getNodeValue();
            String author = node.getElementsByTagName("Author").item(0).getFirstChild().getNodeValue();

            System.out.println("Id: " + id);
            System.out.println("Name: " + name);
            System.out.println("Author: " + author);

            Book book = new Book(id, name, author);
            bookList.add(book);
        }
        System.out.println();
        System.out.println(bookList);

    }

}
