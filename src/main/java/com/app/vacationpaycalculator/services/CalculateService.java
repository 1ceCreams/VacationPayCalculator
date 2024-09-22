package com.app.vacationpaycalculator.services;

import com.app.vacationpaycalculator.source.VacationDayCounter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class CalculateService {
    private final VacationDayCounter holidaysCounter;
    private final double AVERAGE_DAY_IN_MONTH = 29.4;

    public CalculateService(){
        holidaysCounter = new VacationDayCounter();
    }


    public int calculateVacationPay(double salary, int vacationsDays) {
        double averageDayEarnings = salary/AVERAGE_DAY_IN_MONTH;
        double vacationPay = averageDayEarnings* vacationsDays;
        return (int)(vacationPay - vacationPay/100*13);
    }

    public int calculateVacationPay(double salary,LocalDate start, LocalDate end){
        int vacationDays = holidaysCounter.getVacationDays(start,end);
        return calculateVacationPay(salary,vacationDays);
    }


}
