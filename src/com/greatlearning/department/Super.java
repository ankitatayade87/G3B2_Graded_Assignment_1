package com.greatlearning.department;

public class Super {

	public String departmentName() {
		return "Super Department";
	}

	public String getTodaysWork() {
		return "No Work as of now";
	}

	public String getWorkDeadline() {
		return "Nil";
	}

	String isTodayAHoliday() {
		return "Today is not a holiday";
	}

	Super() {
		departmentName();
		getTodaysWork();
		getWorkDeadline();
		isTodayAHoliday();
	}
}
