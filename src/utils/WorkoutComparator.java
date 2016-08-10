package utils;

import java.io.Serializable;
import java.util.Comparator;

import core.Practice;

/**
 * Class CoachComperator ~ implements Comparator<Coach>
 * 
 * order coaches by amount of lessons they give and then by seniority
 * 
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class WorkoutComparator implements Comparator<Practice>, Serializable {


	private static final long serialVersionUID = 1L;
	@Override
	public int compare(Practice p1, Practice p2) {
		if (p2.getTimeInMinute() > p1.getTimeInMinute())
			return 1;
		if (p2.getTimeInMinute() == p1.getTimeInMinute()) {
			if (p2.getStart().after(p1.getStart()))
				return 1;
			if (p2.getStart().before(p1.getStart()))
				return -1;
		}
		return -1;
	}


} // ~ END OF CoachComperator
