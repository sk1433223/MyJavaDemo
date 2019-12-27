package cn.ybzy.demo.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    final static LocalDate localDate = LocalDate.now();

    public static void main(String[] args) {

        getTime();

    }

    public static void getTime(){

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);//java.util.GregorianCalendar[time=1569340588432,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2019,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=267,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=56,SECOND=28,MILLISECOND=432,ZONE_OFFSET=28800000,DST_OFFSET=0]

        /**
         * java 8
         */
        Date date = new Date();
        System.out.println(date);//Tue Sep 24 23:56:28 CST 2019
        System.out.println(date.getTime());//1569340588450

        LocalDateTime dt =  LocalDateTime.now();
        System.out.println(dt);//2019-09-24T23:56:28.530
        System.out.println(dt.getYear());//2019
        System.out.println(dt.getDayOfWeek());//TUESDAY

        LocalDate today = LocalDate.now();
        //本月第一天
        LocalDate firstDate = LocalDate.of(today.getYear(),today.getMonth(),1);
        System.out.println(firstDate);

    }

}
