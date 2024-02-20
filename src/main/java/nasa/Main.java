package nasa;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.http.HttpClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, TelegramApiException {

        new MyNasaBot("vad_nasa_bot", "6400805539:AAEsOH4hRuCLW47qYU6CMckmwuhYeB1-Zw0");

//        String url = "https://api.nasa.gov/planetary/apod" +
//                "?api_key=nbEd71t5dJmfHXZj9C0KWQrqR0KCivrKhhoJG98U" +
//                "&date=2024-02-10";
////        String url = "https://api.nasa.gov/planetary/apod" +
////                "?api_key=nbEd71t5dJmfHXZj9C0KWQrqR0KCivrKhhoJG98U";
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        ObjectMapper mapper = new ObjectMapper();
//        HttpGet request = new HttpGet(url);
//        CloseableHttpResponse response = httpClient.execute(request);
////        Scanner scanner = new Scanner(response.getEntity().getContent());
////        System.out.println(scanner.nextLine());
//        Nasa answer = mapper.readValue(response.getEntity().getContent(), Nasa.class);
////        System.out.println(answer.url);
////        System.out.println(answer.title);
//
//        HttpGet imageGet = new HttpGet(answer.url);
//        String[] urlSplited = answer.url.split("/");
//        String fileName = urlSplited[urlSplited.length - 1];
//        CloseableHttpResponse image = httpClient.execute(imageGet);
//
//        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
//        image.getEntity().writeTo(fileOutputStream);
    }
}
