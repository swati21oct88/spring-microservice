package com.boot.demo.model;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BeerDto {
	private UUID uuid;
	private String type;
	private int price;
}
