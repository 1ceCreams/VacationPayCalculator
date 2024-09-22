package com.app.vacationpaycalculator.source;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
public class VacationDayCounter {
    int year = LocalDate.now().getYear();
        HashSet<LocalDate> holidays = new HashSet<>(Arrays.asList(
                LocalDate.parse(year+"-01-01"),
                LocalDate.parse(year+"-01-02"),
                LocalDate.parse(year+"-01-03"),
                LocalDate.parse(year+"-01-04"),
                LocalDate.parse(year+"-01-05"),
                LocalDate.parse(year+"-01-06"),
                LocalDate.parse(year+"-01-07"),
                LocalDate.parse(year+"-01-08"),
                LocalDate.parse(year+"-02-23"),
                LocalDate.parse(year+"-03-08"),
                LocalDate.parse(year+"-05-01"),
                LocalDate.parse(year+"-05-09"),
                LocalDate.parse(year+"-06-12"),
                LocalDate.parse(year+"-11-04")

        ));


    public int getVacationDays(LocalDate startDate, LocalDate endDate){
        int vacationDays = 0;
        for(LocalDate date = startDate; date.isBefore(endDate);date = date.plusDays(1)){
            if(isHolidaysDay(date)){
                continue;
            }
            vacationDays++;

        }
        return vacationDays;
    }

    public boolean isHolidaysDay(LocalDate date){
        return this.holidays.contains(date);
    }

    public boolean isHoliday(LocalDate date){
        return (date.getDayOfWeek().equals(DayOfWeek.SATURDAY) || date.getDayOfWeek().equals(DayOfWeek.SUNDAY));
    }


}