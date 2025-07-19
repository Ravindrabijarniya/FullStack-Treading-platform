package com.Trading.service;

import com.Trading.model.CoinDTO;
import com.Trading.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
