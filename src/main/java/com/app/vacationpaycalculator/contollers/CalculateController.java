package com.app.vacationpaycalculator.contollers;

import com.app.vacationpaycalculator.services.CalculateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculateController {

    private final CalculateService calculateService;


    @GetMapping("/calculate/{salary}&{vacationsDays}")
    public double calculateVacationPay(@PathVariable double salary, @PathVariable int vacationsDays){
        return calculateService.calculateVacationPay(salary, vacationsDays);

    }
}
