package com.Trading.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.Trading.model.Coin;

import java.util.List;

public interface CoinService {
    List<Coin> getCoinList(int page) throws Exception;
    String getMarketChart(String coinId,int days) throws Exception;
    String getCoinDetails(String coinId) throws JsonProcessingException;

    Coin findById(String coinId) throws Exception;

    String searchCoin(String keyword);

    List<Coin> getTop50CoinsByMarketCapRank() throws Exception;

    String getTreadingCoins();
}
