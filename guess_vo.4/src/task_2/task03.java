package task_2;

/**
 现在我们要开发一个应用，模拟移动存储设备的读写，即计算机与U盘、MP3、移动硬盘等设备进行数据交换。
 
已知要实现U盘、MP3播放器、移动硬盘三种移动存储设备，要求计算机能同这三种设备进行数据交换，

并且以后可能会有新的第三方的移动存储设备，所以计算机必须有扩展性，能与目前未知而以后可能会出现的存储设备进行数据交换。

各个存储设备间读、写的实现方法不同，U盘和移动硬盘只有这两个方法，MP3Player还有一个PlayMusic方法。

名词定义：数据交换={读，写}
 
 * @author Administrator
 *
 */

public class task03 {

	public static void main(String[] args) {
		MP3player mp3 = new MP3player();
		byte [] data = new byte[1024] ;
		mp3.write(data);
		mp3.playMusic();
	}
}
//存储
interface storage{
	byte [] read();
	byte write(byte[] data);
}
//播放器
interface player extends storage{
	byte playMusic();
}

class Disk implements storage{

	byte [] data;
	@Override
	public byte[] read() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public byte write(byte[] data) {
		// TODO Auto-generated method stub
		try{
			this.data = data ;
		}catch (Exception e) {
			// TODO: handle exception
			return -1;
		}
		
		return 0;
	}
	
}
//移动端
class Mobilestorage implements storage{
	private byte [] data;

	@Override
	public byte[] read() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public byte write(byte[] data) {
		// TODO Auto-generated method stub
		try{
			this.data = data ;
		}catch (Exception e) {
			// TODO: handle exception
			return -1;
		}	
		return 0;

	}
	
}

//MP3
class MP3player implements storage,player{

	private byte [] data;
	
	@Override
	public byte playMusic() {
		// TODO Auto-generated method stub
		try{
			System.out.println("正在播放！");
		}catch (Exception e) {
			// TODO: handle exception
			return -1;
		}
		
		return 0;
		
	}

	@Override
	public byte[] read() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public byte write(byte[] data) {
		// TODO Auto-generated method stub
		try{
			this.data =data;
		}catch (Exception e) {
			
		return -1;
		}
		return 0;
	}
	
}

