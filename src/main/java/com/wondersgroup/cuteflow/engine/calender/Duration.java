package com.wondersgroup.cuteflow.engine.calender;

public class Duration {
	
	public static final String DAY = "DAY";
	public static final String MONTH = "MONTH";
	public static final String YEAR = "YEAR";
	public static final String HOUR = "HOUR";
	public static final String MINUTE = "MINUTE";
	public static final String SECOND = "SECOND";
	public static final String WEEK = "WEEK";// private static final Log log =
	// LogFactory.getLog(Duration.class);
	private int value;
	private String unit;
	private boolean isBusinessTime = true;

	/**
	 * 创建时间间隔对象
	 * 
	 * @param value
	 *            时间值
	 * @param unit
	 *            时间单位
	 */
	public Duration(int value, String unit) {
		this.value = value;
		this.unit = unit;

		// log.debug("Duration(" + value + ", " + unit + ")");
	}

	/**
	 * 获取时间值
	 * 
	 * @return
	 */
	public int getValue() {
		return value;
	}

	public void setValue(int v) {
		value = v;
	}

	/**
	 * 获取时间单位
	 * 
	 * @return
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * 设置时间单位
	 * 
	 * @param u
	 */
	public void setUnit(String u) {
		unit = u;
	}

	/**
	 * 获取时间单位，如果时间单位为null，则返回defaultUnit
	 * 
	 * @param defaultUnit
	 * @return
	 */
	public String getUnit(String defaultUnit) {
		if (unit == null) {
			return defaultUnit;
		}
		else {
			return unit;
		}
	}

	/**
	 * 获取换算成毫秒的时间间隔值
	 * 
	 * @param defaultUnit
	 * @return
	 */
	public long getDurationInMilliseconds(String defaultUnit) {
		int value = getValue();
		String unit = getUnit(defaultUnit);

		if (value == 0) {
			return value;
		}
		else {
			long duration = value * toMilliseconds(unit);
			return duration;
		}
	}

	public long toMilliseconds(String unit) {
		if (unit == null) {
			return 0l;
		}
		else if (unit.equals(SECOND)) {
			return 1 * 1000l;
		}
		else if (unit.equals(MINUTE)) {
			return 60 * 1000l;
		}
		else if (unit.equals(HOUR)) {
			return 60 * 60 * 1000l;
		}
		else if (unit.equals(DAY)) {
			return 24 * 60 * 60 * 1000l;
		}
		else if (unit.equals(MONTH)) {
			return 30 * 24 * 60 * 60 * 1000l;
		}
		else if (unit.equals(YEAR)) {
			return 365 * 30 * 24 * 60 * 60 * 1000l;
		}
		else if (unit.equals(WEEK)) {
			return 7 * 24 * 60 * 60 * 1000l;
		}
		else {
			return 0l;
		}
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(value);
		if (unit != null) {
			buffer.append(unit);
		}
		return buffer.toString();
	}

	/**
	 * 时间间隔是否指工作时间
	 * 
	 * @return
	 */
	public boolean isBusinessTime() {
		return isBusinessTime;
	}

	/**
	 * 设置时间间隔的属性，isBusinessTime==true表示时间间隔指工作时间
	 * 
	 * @param isBusinessTime
	 */
	public void setBusinessTime(boolean isBusinessTime) {
		this.isBusinessTime = isBusinessTime;
	}

}
