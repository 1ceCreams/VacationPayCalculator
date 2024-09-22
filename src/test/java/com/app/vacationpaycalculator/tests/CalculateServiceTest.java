package com.app.vacationpaycalculator.tests;

import com.app.vacationpaycalculator.services.CalculateService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class CalculateServiceTest {

    @Test
    public void calculateVacationPayTest1(){
        CalculateService service = new CalculateService();
        assertEquals(15979,service.calculateVacationPay(15000,36));
    }
    @Test
    public void calculateVacationPayForPeriodTest(){
        CalculateService service = new CalculateService();
        assertEquals(10209,
                service.calculateVacationPay(
                        15000,
                        LocalDate.parse("2024-01-01"),
                        LocalDate.parse("2024-02-01")));
    }
}
