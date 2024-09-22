package com.app.vacationpaycalculator.contollers;

import com.app.vacationpaycalculator.services.CalculateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculateController {

    final private CalculateService calculateService;


    @GetMapping("/calculate/")
    public double calculateVacationPay(@RequestParam double salary, @RequestParam int vacationDays){
        return calculateService.calculateVacationPay(salary, vacationDays);

    }
}
