package GUI_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class IOutil {
	
	//��ʽ��ʱ�� ��2019/06/01 08:01
	
	static SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd hh:mm");
	
	
	public static void RankscoreWriter(String data) throws IOException{
		
		File file =new File("M:/list.txt");
		
		if(!file.exists()){
			file.createNewFile();//�����µ��ļ�
		}else{
			//д������
			FileWriter fileWriter =new FileWriter(file);
//			String nn = IOutil.Rankread();//���յ�
//			System.out.println("�ϴεģ�"+nn);
			fileWriter.write(data);
			fileWriter.close();
			System.out.println("д�����ݳɹ�");
		}
		
	}
   public static String Rankread() throws IOException{
	   StringBuffer buffer =null;
	   File file =new File("M:/list.txt");
	   
	   if(!file.exists()){
		   return "0";
	   }
	   FileReader fileReader =new FileReader(file);
	   //����ָ�������ַ������ȡ��
		char [] cs = new char[20];
		buffer =new StringBuffer();
		int len = -1;
		while((len = fileReader.read(cs))!=-1){
			buffer.append(new String(cs,0,len));				
		}
		//System.out.println("�ļ�����Ϊ��"+buffer);
		fileReader.close();
	   return buffer.toString();
	   
   }
	
	
	
	
	public static String readData(){
		
		StringBuffer data = null;
		
		try{
			
			File file =new File("M:/guess.txt");
			if(!file.exists()){
				return "�ϴγɼ���0";
			}
			FileReader fileReader =new FileReader(file);
			//����ָ�������ַ������ȡ��
			char [] cs = new char[20];
			data =new StringBuffer();
			int len = -1;
			while((len = fileReader.read(cs))!=-1){
				data.append(new String(cs,0,len));				
			}
			System.out.println("�ļ�����Ϊ��"+data);
			fileReader.close();
		}catch (Exception e) {
			// TODO: handle exception
			
		}
		return data.toString();
	}

	public static void writeData(String data){
		
		//�����ļ���д�����
		File file =new File("M:/guess.txt");
		if(!file.exists()){
			try {
				file.createNewFile();// ����ļ� �����ھʹ���һ��
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		try {
			FileWriter fileWriter =new FileWriter(file);
			fileWriter.write(data);
			fileWriter.close();
			
			System.out.println("д���ļ��ɹ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("д���ļ�ʧ�ܣ�");
			//e.printStackTrace();
		}
		
	}
}
