package com.app.vacationpaycalculator.contollers;

import com.app.vacationpaycalculator.services.CalculateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
public class CalculateController {

    private final CalculateService calculateService;

    
    @GetMapping("/calculate")
    public double calculateVacationPay(@RequestParam double salary,@RequestParam LocalDate startDate, @RequestParam LocalDate endDate){
        return calculateService.calculateVacationPay(salary, startDate,endDate);

    }
}
