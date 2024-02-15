package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HelloController {
    public ListView optionsList;
    @FXML
   TextField fromText;
    @FXML
    TextField toText;
    @FXML
    TextField amountText;
    @FXML
    TextField returnText;
    @FXML
    Button calcButton;
    public void initialise(){

    }
    public void calcButtonPressed() throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://currency-exchange.p.rapidapi.com/exchange?from=getFrom&to=getTo&q=getQ"))
                .header("X-RapidAPI-Key", "da0b855fccmsh80a5b850f74bcd7p15dea4jsn0a94f89a6f3d")
                .header("X-RapidAPI-Host", "currency-exchange.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }




}