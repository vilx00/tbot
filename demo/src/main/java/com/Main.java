package com;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;


public class Main {
    public static void main(String[] args) {
        try {
            TelegramBotsApi apibots = new TelegramBotsApi();
            apibots.registerBot(new AccademBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}
