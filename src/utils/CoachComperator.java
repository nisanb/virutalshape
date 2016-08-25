package utils;

import java.io.Serializable;
import java.util.Comparator;

import core.Coach;

/**
 * Class CoachComperator ~ implements Comparator
 * 
 * order coaches by amount of lessons they give and then by seniority
 * 
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class CoachComperator implements Comparator<Coach>, Serializable {

	@Override
	public int compare(Coach coach1, Coach coach2) {
		if (((Integer) coach1.getLessons().size()).compareTo(coach2
				.getLessons().size()) == 0)
			return coach1.getEmployeeSeniority()
					- coach2.getEmployeeSeniority();
		else
			return ((Integer) coach1.getLessons().size()).compareTo(coach2
					.getLessons().size());
	}

} // ~ END OF CoachComperator
