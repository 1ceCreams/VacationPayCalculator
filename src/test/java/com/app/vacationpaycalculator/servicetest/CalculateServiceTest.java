package com.app.vacationpaycalculator.servicetest;

import com.app.vacationpaycalculator.services.CalculateService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class CalculateServiceTest {

    @Test
    public void calculateVacationPayTest(){
        CalculateService service = new CalculateService();
        assertEquals(15979,service.calculateVacationPay(15000,36));
    }
}
