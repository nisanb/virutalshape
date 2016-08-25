package comparators;

import java.io.Serializable;
import java.util.Comparator;

import core.Practice;
import core.Room;

/**
 * Class CoachComperator ~ implements Comparator
 * 
 * order coaches by amount of lessons they give and then by seniority
 * 
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class RoomComparator implements Comparator<Room> {

	@Override
	public int compare(Room p1, Room p2) {
            Integer i1 = p1.getRoomNum();
            Integer i2 = p2.getRoomNum();
            return i1.compareTo(i2);
	}


} // ~ END OF CoachComperator
