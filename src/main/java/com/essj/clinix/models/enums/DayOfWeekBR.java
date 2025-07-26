package com.essj.clinix.models.enums;

import java.time.DayOfWeek;
import java.util.Arrays;

public enum DayOfWeekBR {
    SEGUNDA(DayOfWeek.MONDAY),
    TERCA(DayOfWeek.TUESDAY),
    QUARTA(DayOfWeek.WEDNESDAY),
    QUINTA(DayOfWeek.THURSDAY),
    SEXTA(DayOfWeek.FRIDAY),
    SABADO(DayOfWeek.SATURDAY),
    DOMINGO(DayOfWeek.SUNDAY);


    private DayOfWeek dayOfWeek;

    DayOfWeekBR(DayOfWeek dayOfWeek){
        this.dayOfWeek = dayOfWeek;
    }

    public static DayOfWeekBR fromDayOfWeek(DayOfWeek dayOfWeek){
        return Arrays.stream(values())
                .filter(d-> d.dayOfWeek == dayOfWeek)
                .findFirst()
                .orElseThrow();
    }

}
