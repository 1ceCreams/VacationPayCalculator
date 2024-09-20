package com.app.vacationpaycalculator.contollers;

import com.app.vacationpaycalculator.services.CalculateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculateController {

    CalculateService calculateService;


    @GetMapping("/calculate")
    public double calculateVacationPay(double salary, int vacationsDays){
        return calculateService.calculateVacationPay(salary, vacationsDays);

    }
}
