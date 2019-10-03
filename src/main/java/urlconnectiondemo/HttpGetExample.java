package urlconnectiondemo;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.Scanner;


public class HttpGetExample {

    public static void main(String args[]) throws Exception {

        //Creating a HttpClient object
        CloseableHttpClient httpclient = HttpClients.createDefault();

        //Creating a HttpGet object
        HttpGet httpget = new HttpGet("https://www.baidu.com");

        //Printing the method used
        System.out.println("Request Type: " + httpget.getMethod());

        System.out.println(httpget.getURI());
        System.out.println(httpget.getConfig());
        System.out.println(httpget.getProtocolVersion());
        System.out.println(httpget.getClass());
        System.out.println(httpget.getRequestLine());

        //Executing the Get request
        HttpResponse httpresponse = httpclient.execute(httpget);

        Scanner sc = new Scanner(httpresponse.getEntity().getContent());

        //Printing the status line
        System.out.println(httpresponse.getStatusLine());
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
} 