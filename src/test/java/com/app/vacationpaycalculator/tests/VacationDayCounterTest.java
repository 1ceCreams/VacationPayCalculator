package com.app.vacationpaycalculator.tests;

import com.app.vacationpaycalculator.source.VacationDayCounter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class VacationDayCounterTest {

    @Test
    public void getVacationDayTest1(){
        VacationDayCounter vacationDayCounter = new VacationDayCounter();
        assertEquals(23,
                vacationDayCounter.getVacationDays(
                        LocalDate.parse("2024-01-01"),
                        LocalDate.parse("2024-02-01")
                ));
    }

    @Test
    public void getVacationDayTest2(){
        VacationDayCounter vacationDayCounter = new VacationDayCounter();
        assertEquals(29,
                vacationDayCounter.getVacationDays(
                        LocalDate.parse("2024-11-01"),
                        LocalDate.parse("2024-12-01")
                ));
    }
}
