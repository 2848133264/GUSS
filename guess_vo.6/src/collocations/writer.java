package collocations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writer {
	
	public static void save(String data){
		
	    File file =new File("M:/num.txt");
		
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("IO�쳣");
			}
		}
		
		try {
			FileWriter fileWriter =new FileWriter(file);
			fileWriter.write(data);
			fileWriter.close();
			System.out.println("�ɹ�д�룡");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("д��ʧ�ܣ�");
		}
		
		
	}

}
