package utils;

import java.io.Serializable;

/**
 * Enum class for coach and lesson levels
 * @author nisan
 */
public enum E_Levels implements Serializable {
    
	//-------------------------------------------------------------Values---------------------------------------------------------------------
	// levels of lessons
	BEGINNERS(1), INTERMEDIATE(2), ADVANCED(3), PROFESSIONAL(3);
	//-------------------------------------------------------------Class Members----------------------------------------------------------------
			private final int level;
			
			//-------------------------------------------------------------Constructor------------------------------------------------------------------
			E_Levels(int level){
				this.level = level;
			}
			
			//-------------------------------------------------------------Methods----------------------------------------------------------------------
			public int getLevel() { 
				return level; 
			}
                        final long serialVersionUID = 16;
}
