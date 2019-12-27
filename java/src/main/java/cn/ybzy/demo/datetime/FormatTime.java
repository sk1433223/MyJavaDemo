package cn.ybzy.demo.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 日期格式化
 */

/**
 * Java8 日期API
 * localDate,localTime,localDateTime...
 */
public class FormatTime {

    final static LocalDate localDate = LocalDate.now();

    final static LocalTime localTime = LocalTime.now();

    final static LocalDateTime localDateTime = LocalDateTime.now();

    final static Instant instant = Instant.now();




    public static void main(String[] args) {


        getDome();
    }

    /**
     * localDate:2019-09-25
     * localTime:17:13:13.376
     * localDateTime:2019-09-25T17:13:13.376
     */
    public static void getDome(){
        System.out.println("localDate:"+localDate);
        System.out.println("localTime:"+localTime);
        System.out.println("localDateTime:"+localDateTime);
        System.out.println("instant:"+instant);
    }

    public static void  getFormat(){
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(localDate.format(newFormat));
    }
}
