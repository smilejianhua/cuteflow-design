package com.wondersgroup.cuteflow.engine.calender;

import java.util.Date;

public interface CalenderService {

	/**
	 * 获得fromDate后相隔duration的某个日期 Get the date after the duration
	 * 
	 * @param duration
	 * @return
	 */
	public Date dateAfter(Date fromDate, Duration duration);

	/**
	 * 缺省实现，周六周日都是非工作日，其他的都为工作日。 
	 * 实际应用中，可以在数据库中建立一张非工作日表，将周末以及法定节假日录入其中，
	 * 然后在该方法中读该表的数据来判断工作日和非工作日。
	 * 
	 * @param 
	 * @return
	 */
	public boolean isBusinessDay(Date d);

	/**
	 * 获得系统时间
	 * 
	 * @return
	 */
	public Date getSysDate();
}
