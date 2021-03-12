package tasks.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public interface DateTimeService {

    Date getDateValueFromLocalDate(LocalDate localDate);

    Date getDateMergedWithTime(String time, Date noTimeDate);

    String getTimeOfTheDayFromDate(Date date);
}
