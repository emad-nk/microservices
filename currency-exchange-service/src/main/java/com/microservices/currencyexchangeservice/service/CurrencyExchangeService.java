package com.microservices.currencyexchangeservice.service;

import com.microservices.currencyexchangeservice.domain.ExchangeValue;

public interface CurrencyExchangeService {

    ExchangeValue getExchangeValue(String from, String to);
}
