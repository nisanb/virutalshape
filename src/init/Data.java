package init;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public abstract class Data {

	public static void ExportData(String fileName, Object obj){
		
		
		
		
		try {
			
			FileOutputStream output = new FileOutputStream(fileName);
			ObjectOutputStream objoutput = new ObjectOutputStream(output);
			objoutput.writeObject(obj);
			objoutput.close();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void ImportData(){
		
	}
	
	
}
