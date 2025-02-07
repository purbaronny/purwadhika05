package com.purwadhika;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CurrencyConversion {

    private static HashMap<String, Float> USDS = new HashMap<>();
    private static HashMap<String, Float> EURS = new HashMap<>();
    private static HashMap<String, Float> GBPS = new HashMap<>();
    private static HashMap<String, Float> JPYS = new HashMap<>();
    private static List<String> CURRENCYS = new ArrayList<>();
    private String source;
    private String target;

    static {
        USDS.put("EUR", 0.85f);
        USDS.put("GBP", 0.75f);
        USDS.put("JPY", 110.0f);
        EURS.put("USD", 1.18f);
        EURS.put("GBP", 0.88f);
        EURS.put("JPY", 130.0f);
        GBPS.put("USD", 1.33f);
        GBPS.put("EUR", 1.14f);
        GBPS.put("JPY", 150.0f);
        JPYS.put("USD", 0.0091f);
        JPYS.put("EUR", 0.0077f);
        JPYS.put("GBP", 0.0067f);

        CURRENCYS.add("USD");
        CURRENCYS.add("EUR");
        CURRENCYS.add("GBP");
        CURRENCYS.add("JPY");
    }

    public float conversion(String source, String target) {
        if(source == null || source.isEmpty()) {
            throw new IllegalArgumentException("source is null or empty string");
        }

        if(target == null || target.isEmpty()) {
            throw new IllegalArgumentException("source is null or empty string");
        }

        this.source = source;
        this.target = target;
        // TODO start
        // TODO end
        throw new UnsupportedOperationException("conversion is not supported");
    }

    public float reverseConversion() {
        // TODO start
        // TODO end
        throw new UnsupportedOperationException("conversion is not supported");
    }
}
