package com.boot.demo.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.boot.demo.model.BeerDto;

@Service("beerService")
public class BeerServiceImpl implements BeerService {
	@Override
    public BeerDto getBeer() {
        return BeerDto.builder().uuid(UUID.randomUUID())
                .type("strong")
                .price(230).build();
    }
}
