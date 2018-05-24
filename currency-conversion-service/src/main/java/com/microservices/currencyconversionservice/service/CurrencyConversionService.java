package com.microservices.currencyconversionservice.service;

import com.microservices.currencyconversionservice.domain.CurrencyConversion;

import java.math.BigDecimal;

public interface CurrencyConversionService {

    CurrencyConversion getCurrencyExchange(String from, String to);
    CurrencyConversion getCurrencyExchangeWithFeign(String from, String to);
}
