//DATE AND TIME API IN JAVA 8 ARE THREAD SAFE AND IMMUTABLE AND DONT REQUIRE JAVA.UTIL.PACKAHE
import java.time.*;
public class DateAndTimeAPIDemo {
    public static void main(String x[])
    {
        //TO GET CURRENT LOCAL DATE FROM SYSTEM
        LocalDate d=LocalDate.now();
        System.out.println(d);//YYYY-MM-DD
        
        System.out.println(d.getDayOfMonth());//13
        System.out.println(d.getDayOfWeek());//Sunday
        System.out.println(d.getDayOfYear());//103
        System.out.println(d.getMonth());//April
        System.out.println(d.getMonthValue());//4
        System.out.println(d.getYear());//2025
        
        //TO CREATE CUSTOM DATE IF REQUIRED
        LocalDate d2=LocalDate.of(2024,5,10);
        System.out.println(d2);//YYYY-MM-DD
        
        //TO GET LOCAL TIME
        LocalTime t=LocalTime.now();
        System.out.println(t);//MM:HH:SS.NANOSECONDS
        System.out.println(t.getHour());
        System.out.println(t.getMinute());
        System.out.println(t.getSecond());
        System.out.println(t.getNano());
        
        //TO GET CURRENT LOCAL DATE AND TIME TOGETHER FROM SYSTEM
        LocalDateTime d3=LocalDateTime.now();
        System.out.println(d3);//YYYY-MM-DD
        
        //TO GET ALL THE ZONE ID
        //for(String s1:zoneId.getAvailableZoneIds())
        //{
        //      System.out.println(s1);
        //}
        
        //TO GET OUR ZONE DATE TIME
        ZonedDateTime z=ZonedDateTime.now();
        System.out.println(z);
        
        //TO GET OUR INSTANT DATE TIME WHICH IS SIMILAR TO LOCAL DATE TIME
        Instant z2=Instant.now();
        System.out.println(z2);
        
        //TO GET THE TIME OF A PARTICULAR COUNTRY
        
        LocalTime t2=LocalTime.now(ZoneId.of("Egypt"));
        System.out.println(t2);//mm:hh:ss.miliseconds
    }
}