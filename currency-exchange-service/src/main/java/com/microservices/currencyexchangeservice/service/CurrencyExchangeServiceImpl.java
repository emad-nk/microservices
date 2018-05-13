package com.microservices.currencyexchangeservice.service;

import com.microservices.currencyexchangeservice.domain.ExchangeValue;
import com.microservices.currencyexchangeservice.repository.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {

    @Autowired
    ExchangeValueRepository repository;

    @Override
    public ExchangeValue getExchangeValue(String from, String to) {
        return repository.findByFromAndTo(from, to);
    }
}
