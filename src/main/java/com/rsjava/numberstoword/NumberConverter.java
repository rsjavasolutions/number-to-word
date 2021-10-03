package com.rsjava.numberstoword;
import static io.netty.util.internal.StringUtil.EMPTY_STRING;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.allegro.finance.tradukisto.MoneyConverters;

import java.math.BigDecimal;

@Slf4j
@Service
@RequiredArgsConstructor
public class NumberConverter {

    private static final String PLN = "PLN";

    public String convertNumber(BigDecimal number) {

        MoneyConverters converters = MoneyConverters.POLISH_BANKING_MONEY_VALUE;

        return converters.asWords(number).replaceAll(PLN, EMPTY_STRING);
    }
}
