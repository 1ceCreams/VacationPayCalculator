package com.app.vacationpaycalculator.servicetest;

import com.app.vacationpaycalculator.services.CalculateService;
import com.app.vacationpaycalculator.source.Holidays;
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
}
