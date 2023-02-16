package com;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.api.objects.Update;

public class AccademBot extends TelegramLongPollingBot {

    /**
     * Method for receiving messages.
     * @param update Contains a message from the user.
     */
    @Override
    public void onUpdateReceived(Update update) {
        // We check if the update has a message and the message has text
    }

    /**
     * This method returns the bot's name, which was specified during registration.
     * @return bot name
     */
    @Override
    public String getBotUsername() {
        return "AccademBot";
    }

    /**
     * This method returns the bot's token for communicating with the Telegram server
     * @return the bot's token
     */
    @Override
    public String getBotToken() {
        return "6084413160:AAHbYBpMehlEhzEQ_T6QvFNZb3yhTBbnngg";
    }
}
    

