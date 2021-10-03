package com.rsjava.numberstoword;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("numbers")
@RequiredArgsConstructor
public class NumberController {

    private final NumberConverter numberConverter;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String convertNumber(@RequestParam(value = "number") BigDecimal number) {
        return numberConverter.convertNumber(number);
    }
}
