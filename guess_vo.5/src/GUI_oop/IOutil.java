package GUI_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class IOutil {
	
	//格式化时间 ：2019/06/01 08:01
	
	static SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd hh:mm");
	
	
	public static void RankscoreWriter(String data) throws IOException{
		
		File file =new File("M:/list.txt");
		
		if(!file.exists()){
			file.createNewFile();//创建新的文件
		}else{
			//写入数据
			FileWriter fileWriter =new FileWriter(file);
//			String nn = IOutil.Rankread();//接收到
//			System.out.println("上次的："+nn);
			fileWriter.write(data);
			fileWriter.close();
			System.out.println("写入数据成功");
		}
		
	}
   public static String Rankread() throws IOException{
	   StringBuffer buffer =null;
	   File file =new File("M:/list.txt");
	   
	   if(!file.exists()){
		   return "0";
	   }
	   FileReader fileReader =new FileReader(file);
	   //设置指定长度字符数组读取。
		char [] cs = new char[20];
		buffer =new StringBuffer();
		int len = -1;
		while((len = fileReader.read(cs))!=-1){
			buffer.append(new String(cs,0,len));				
		}
		//System.out.println("文件内容为："+buffer);
		fileReader.close();
	   return buffer.toString();
	   
   }
	
	
	
	
	public static String readData(){
		
		StringBuffer data = null;
		
		try{
			
			File file =new File("M:/guess.txt");
			if(!file.exists()){
				return "上次成绩：0";
			}
			FileReader fileReader =new FileReader(file);
			//设置指定长度字符数组读取。
			char [] cs = new char[20];
			data =new StringBuffer();
			int len = -1;
			while((len = fileReader.read(cs))!=-1){
				data.append(new String(cs,0,len));				
			}
			System.out.println("文件内容为："+data);
			fileReader.close();
		}catch (Exception e) {
			// TODO: handle exception
			
		}
		return data.toString();
	}

	public static void writeData(String data){
		
		//进行文件的写入操作
		File file =new File("M:/guess.txt");
		if(!file.exists()){
			try {
				file.createNewFile();// 如果文件 不存在就创建一个
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		try {
			FileWriter fileWriter =new FileWriter(file);
			fileWriter.write(data);
			fileWriter.close();
			
			System.out.println("写入文件成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("写入文件失败！");
			//e.printStackTrace();
		}
		
	}
}
