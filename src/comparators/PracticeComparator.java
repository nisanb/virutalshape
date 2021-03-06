package comparators;

import java.io.Serializable;
import java.util.Comparator;

import core.Practice;

/**
 * Class CoachComperator ~ implements Comparator
 * 
 * order coaches by amount of lessons they give and then by seniority
 * 
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class PracticeComparator implements Comparator<Practice>, Serializable {


	private static final long serialVersionUID = 1L;
	@Override
	public int compare(Practice p1, Practice p2) {
		return p1.getStart().compareTo(p2.getStart());
	}


} // ~ END OF CoachComperator
