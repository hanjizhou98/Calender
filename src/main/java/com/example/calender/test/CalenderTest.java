package com.example.calender.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalenderTest {

    public static void main(String[] args) throws ParseException {

//        // 使用默认时区和语言环境获得一个日历
//        Calendar cal = Calendar.getInstance();
//        // 赋值时年月日时分秒常用的6个值，注意月份下标从0开始，所以取月份要+1
//        System.out.println("年:" + cal.get(Calendar.YEAR));
//        System.out.println("月:" + (cal.get(Calendar.MONTH) + 1));
//        System.out.println("日:" + cal.get(Calendar.DAY_OF_MONTH));
//        System.out.println("时:" + cal.get(Calendar.HOUR_OF_DAY));
//        System.out.println("分:" + cal.get(Calendar.MINUTE));
//        System.out.println("秒:" + cal.get(Calendar.SECOND));


//        Calendar calendar = Calendar.getInstance();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
//        String now = sdf.format(calendar.getTime());
//        System.out.println(now);


//        Calendar calendar = Calendar.getInstance();
//        calendar.add(calendar.MONTH, -1);
//        String lastMonth = new SimpleDateFormat("yyyy-MM").format(calendar.getTime());
//        System.out.println(lastMonth);


//        Calendar calendar = Calendar.getInstance();
//        calendar.add(calendar.DATE, -1);
//        String yesterday = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
//        System.out.println(yesterday);

//        Calendar cal = Calendar.getInstance();
//        // 如果想设置为某个日期，可以一次设置年月日时分秒，由于月份下标从0开始赋值月份要-1
//        // cal.set(year, month, date, hourOfDay, minute, second);
//        cal.set(2022, 1, 15, 23, 59, 59);
//        System.out.println(cal.getTime());

//        Calendar cal = Calendar.getInstance();
//        cal.set(Calendar.YEAR, 2022);
//        cal.set(Calendar.MONTH, Calendar.FEBRUARY);
//        cal.set(Calendar.DAY_OF_MONTH, 15);
//        cal.set(Calendar.HOUR_OF_DAY, 23);
//        cal.set(Calendar.MINUTE, 59);
//        cal.set(Calendar.SECOND, 59);
//        System.out.println(cal.getTime());

//        Calendar cal=Calendar.getInstance();
//        cal.set(Calendar.YEAR, 2021);
//        cal.set(Calendar.MONTH, 8);
//        cal.set(Calendar.DAY_OF_MONTH, 3);
//        int weekno=cal.get(Calendar.WEEK_OF_YEAR);
//        System.out.println(weekno);

//        Calendar time=Calendar.getInstance();
//        time.clear();
//        time.set(Calendar.YEAR,2022);
//        time.set(Calendar.MONTH,1);//注意,Calendar对象默认一月为0 6表示7月份
//        int day=time.getActualMaximum(Calendar.DAY_OF_MONTH);//本月份的天数
//        System.out.println(day);
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//        Date parse = sdf.parse("20220601");
//        System.out.println(parse);
//
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format1 = sdf1.format(parse);
//        System.out.println(format1);
//
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
//        String format2 = sdf2.format(parse);
//        System.out.println(format2);
//
//        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMdd");
//        String format3 = sdf3.format(parse);
//        System.out.println(format3);
//
//        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyyMM");
//        String format4 = sdf4.format(parse);
//        System.out.println(format4);
//
//        SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy");
//        String format5 = sdf5.format(parse);
//        System.out.println(format5);

//        Date date = DateUtils.parseDate("20201015 00:00:00", "yyyyMMdd HH:mm:ss");
//        String format1 = DateFormatUtils.format(date, "yyyy-MM-dd HH:mm:ss");
//        Date date1 = DateUtils.parseDate(format1, "yyyy-MM-dd HH:mm:ss");
//        System.out.println(date1);

//        Date date = DateUtils.parseDate("20201015", "yyyyMMdd");
//        String format1 = DateFormatUtils.format(date, "yyyy-MM-dd");
//        Date date1 = DateUtils.parseDate(format1, "yyyy-MM-dd");
//        System.out.println(date1);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
        Date date1 = sdf1.parse("20220703");
        System.out.println(date1);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date2 = sdf2.parse("2022-07-03");
        System.out.println(date2);

    }
}
