package task_2;

/**
 ��������Ҫ����һ��Ӧ�ã�ģ���ƶ��洢�豸�Ķ�д�����������U�̡�MP3���ƶ�Ӳ�̵��豸�������ݽ�����
 
��֪Ҫʵ��U�̡�MP3���������ƶ�Ӳ�������ƶ��洢�豸��Ҫ��������ͬ�������豸�������ݽ�����

�����Ժ���ܻ����µĵ��������ƶ��洢�豸�����Լ������������չ�ԣ�����Ŀǰδ֪���Ժ���ܻ���ֵĴ洢�豸�������ݽ�����

�����洢�豸�����д��ʵ�ַ�����ͬ��U�̺��ƶ�Ӳ��ֻ��������������MP3Player����һ��PlayMusic������

���ʶ��壺���ݽ���={����д}
 
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
//�洢
interface storage{
	byte [] read();
	byte write(byte[] data);
}
//������
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
//�ƶ���
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
			System.out.println("���ڲ��ţ�");
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

