package com.shopspace.shopspacewebservice.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static Integer compareDates(Date startDate, Date endDate) {
        // return 1 when startDate be greater than endDate
        // return -1 when startDate be less than endDate
        // return 0 when startDate be equal than endDate

        Date compareStartDate = getZeroTimeDate(startDate);
        Date compareEndDate = getZeroTimeDate(endDate);

        return compareStartDate.compareTo(compareEndDate);
    }

    public static Date getZeroTimeDate(Date date) {
        Date res;
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        res = calendar.getTime();

        return res;
    }
}
