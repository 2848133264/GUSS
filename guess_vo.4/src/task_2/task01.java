package task_2;

/**
 * ������Ʋο���ͼ��ʵ�ֺ�������������
1.���Ϊ�����濪ʼ�������ۣ�����40Ԫ���ϵ��鼮9�����ۣ�������8��
���ۡ�
2.��һ��Ӫ�Ͼ����з��յģ���������������˼�����鼮������������
�鼮���ơ����ߡ��۸����Ϣ������һ�����ص����ԣ��������ʲô����
Ҳ�������ķ�Χ�������Ǻͱ��������صģ����Ǻ����ݿ���صģ��ȵȡ�
 * @author Administrator
 *
 */
public class task01 {

	public static void main(String[] args) {
		
		IBook nb = new NoveIBook("java",45,"mo");
		IBook nb1 = new ComputerBook("java",45,"ddd","���");
		BookStore bsStore = new BookStore(nb);
		BookStore bsStore1 = new BookStore(nb1);
		
	}
}

//bookStore 

class BookStore{
	
	
	public BookStore(IBook iBook) {
		// TODO Auto-generated constructor stub
		
		if(iBook instanceof NoveIBook){
			NoveIBook com = (NoveIBook)iBook;
			System.out.println(com.getName()+"\n"+com.getAuthor()+"\n"+"ԭ��Ϊ��"+com.getPrice()+"\n�����۵ļ۸�Ϊ��"+discount(com.getPrice()));			  
		}
		if(iBook instanceof ComputerBook){
			ComputerBook com = (ComputerBook)iBook;
			System.out.println(com.getName()+"\n"+com.getAuthor()+"\n"+"ԭ��Ϊ��"+com.getPrice()+"\n�����۵ļ۸�Ϊ��"+discount(com.getPrice())+"\t���ͣ�"+com.getDomain());
			  
		}
		
	}
	double discount(int numb){
		double discont = 0;
		if( numb >40 ){
			discont = numb * 0.9;
		}else{
			discont = numb * 0.8;
		}
		return discont;
	}
	
	
}

interface IBook{
	
	String getName();
	int getPrice();
	String getAuthor();
	
	
}

class ComputerBook implements IBook{

	private String name ;
	private int price ;
	private String author;
	
	private String domain;//����
	public ComputerBook(String name,int price,String author) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price =price;
		this.author = author;
		
	}
	public ComputerBook(String name,int price,String author,String domain) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price =price;
		this.author = author;
		this.setDomain(domain);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "������"+this.name;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return "����Ϊ��"+this.author;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	

}

class NoveIBook implements IBook{

	private String Nname ;
	private int Nprice ;
	private String Nauthor;

	NoveIBook(String name,int price,String author){
		this.Nname = name;
		this.Nprice = price ;
		this.Nauthor = author;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "����������"+this.Nname;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		
		return this.Nprice;
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return "��������:"+this.Nauthor;
	}
		
}