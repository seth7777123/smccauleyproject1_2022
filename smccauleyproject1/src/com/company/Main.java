package com.company;




import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Scanner;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {



    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        secret sec = new secret();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://imdb-api.com/en/API/Top250TVs/"+ sec.api_key)).build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept(System.out::println).join();


    }


    public static void parse(String responseBody) {

        JSONArray schools = new JSONArray(responseBody);
        for (int i = 0; i < schools.length(); i++) ;
        {






        }
    }
}


