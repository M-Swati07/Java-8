package com.swati.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeApi {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		d = LocalDate.of(1998, Month.JANUARY, 04);
		System.out.println(d);
		
		LocalTime t = LocalTime.now();
		t = LocalTime.of(10, 55, 55, 111);
		System.out.println(t);
		
		for(String s : ZoneId.getAvailableZoneIds())
			System.out.println(s);
		
		
		LocalDateTime dt = LocalDateTime.now(ZoneId.of("America/Indiana/Petersburg"));
		System.out.println(dt);		//human readable
		
		Instant i = Instant.now();	//Instant will give you GMT time
		System.out.println(i);    	//machine readable at the end Z is printed
	}

}
