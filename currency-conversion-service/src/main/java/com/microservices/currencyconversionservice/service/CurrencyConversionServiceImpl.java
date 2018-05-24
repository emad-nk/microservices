package com.microservices.currencyconversionservice.service;

import com.microservices.currencyconversionservice.domain.CurrencyConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class CurrencyConversionServiceImpl implements CurrencyConversionService {

    @Autowired
    private CurrencyConversionProxyService proxy;

    @Override
    public CurrencyConversion getCurrencyExchange(String from, String to) {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);

        ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().getForEntity(
                "http://localhost:8000/currency-exchange/from/{from}/to/{to}",
                CurrencyConversion.class,
                uriVariables);

        return responseEntity.getBody();
    }

    @Override
    public CurrencyConversion getCurrencyExchangeWithFeign(String from, String to) {

        return proxy.getExchangeValue(from, to);
    }
}
