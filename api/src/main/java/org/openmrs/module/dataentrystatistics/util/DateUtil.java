package org.openmrs.module.dataentrystatistics.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static Date getLastDay(final Date date) {
		final Calendar instance = Calendar.getInstance();

		instance.setTime(date);
		instance.set(Calendar.DAY_OF_MONTH, instance.getActualMaximum(Calendar.DAY_OF_MONTH));

		return instance.getTime();
	}

	public static Date getFirstDay(final Date date) {
		final Calendar instance = Calendar.getInstance();

		instance.setTime(date);
		instance.set(Calendar.DAY_OF_MONTH, instance.getActualMinimum(Calendar.DAY_OF_MONTH));

		return instance.getTime();
	}
}
