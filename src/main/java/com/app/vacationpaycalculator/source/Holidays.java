package com.app.vacationpaycalculator.source;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
public class Holidays {
        HashSet<LocalDate> holidays = new HashSet<>(Arrays.asList(
                LocalDate.parse("2024-01-01"),
                LocalDate.parse("2024-01-02"),
                LocalDate.parse("2024-01-03"),
                LocalDate.parse("2024-01-04"),
                LocalDate.parse("2024-01-05"),
                LocalDate.parse("2024-01-06"),
                LocalDate.parse("2024-01-07"),
                LocalDate.parse("2024-01-08"),
                LocalDate.parse("2024-02-23"),
                LocalDate.parse("2024-03-08"),
                LocalDate.parse("2024-05-01"),
                LocalDate.parse("2024-05-09"),
                LocalDate.parse("2024-06-12"),
                LocalDate.parse("2024-11-04")

        ));


    public int getCountHoliday(LocalDate startDate, LocalDate endDate){
        int holidayCount = 0;
        for(LocalDate date = startDate; date.isBefore(endDate);date = date.plusDays(1)){
            if(date.getDayOfWeek().equals(DayOfWeek.SATURDAY) || date.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
                holidayCount++;
            }
        }
        return holidayCount;
    }



}