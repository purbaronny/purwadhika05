package com.purwadhika;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrencyConversion {

    private static final Map<String, Map<String, Float>> exchangeRates = new HashMap<>();

    private String source = "USD";
    private String target = "USD";
    private float amount = 1f;
    private boolean check = true;


    static {
        exchangeRates.put("USD", new HashMap<>());
        exchangeRates.put("EUR", new HashMap<>());
        exchangeRates.put("GBP", new HashMap<>());
        exchangeRates.put("JPY", new HashMap<>());

        exchangeRates.get("USD").put("EUR", 0.92f);
        exchangeRates.get("USD").put("GBP", 0.79f);
        exchangeRates.get("USD").put("JPY", 147.65f);

        exchangeRates.get("EUR").put("USD", 1 / 0.92f);
        exchangeRates.get("EUR").put("GBP", exchangeRates.get("EUR").get("USD") * 0.79f);
        exchangeRates.get("EUR").put("JPY", exchangeRates.get("EUR").get("USD") * 147.65f);

        exchangeRates.get("GBP").put("USD", 1 / 0.79f);
        exchangeRates.get("GBP").put("EUR", 1 / exchangeRates.get("EUR").get("GBP"));
        exchangeRates.get("GBP").put("JPY", exchangeRates.get("GBP").get("USD") * 147.65f);

        exchangeRates.get("JPY").put("USD", 1 / 147.65f);
        exchangeRates.get("JPY").put("EUR", 1 / exchangeRates.get("EUR").get("JPY"));
        exchangeRates.get("JPY").put("GBP", 1 / exchangeRates.get("GBP").get("JPY"));
    }

    public float conversion(String source, String target, float amount) {
        if(source == null || source.isEmpty()) {
            throw new IllegalArgumentException("source is null or empty string");
        }

        if(target == null || target.isEmpty()) {
            throw new IllegalArgumentException("source is null or empty string");
        }

        if(amount < 0) {
            throw new IllegalArgumentException("amount must be positive numbers");
        }

        if(check) {
            this.source = source;
            this.target = target;
        }
        return amount * exchangeRates.get(source).get(target);
    }

    public float reverseConversion() {
        check = false;
        float exchange = conversion(target, source, amount);
        check = true;
        return exchange;
    }
}
