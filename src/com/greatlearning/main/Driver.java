package com.greatlearning.main;

import com.greatlearning.department.Super;
import com.greatlearning.department.Tech;
import com.greatlearning.department.Admin;
import com.greatlearning.department.HR;

public class Driver {

	public static void main(String[] args) {

		Super AdminDepartment = new Admin();
		Super HrDepartment = new HR();
		Super TechDepartment = new Tech();
	}
}
