package com.app.vacationpaycalculator.services;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {
    final double AVERAGE_DAY_IN_MONTH = 29.4;
    public int calculateVacationPay(double salary, int vacationsDays) {
        double averageDayEarnings = salary/AVERAGE_DAY_IN_MONTH;
        double vacationPay = averageDayEarnings* vacationsDays;
        return (int)(vacationPay - vacationPay/100*13);
    }


}
