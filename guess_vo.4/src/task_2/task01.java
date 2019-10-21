package task_2;

/**
 * 初步设计参考类图，实现后考虑以下需求变更
1.书店为了生存开始打折销售：所有40元以上的书籍9折销售，其他的8折
销售。
2.单一经营毕竟是有风险的，于是书店新增加了计算机书籍，它不仅包含
书籍名称、作者、价格等信息，还有一个独特的属性：面向的是什么领域，
也就是它的范围，比如是和编程语言相关的，还是和数据库相关的，等等。
 * @author Administrator
 *
 */
public class task01 {

	public static void main(String[] args) {
		
		IBook nb = new NoveIBook("java",45,"mo");
		IBook nb1 = new ComputerBook("java",45,"ddd","编程");
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
			System.out.println(com.getName()+"\n"+com.getAuthor()+"\n"+"原价为："+com.getPrice()+"\n打完折的价格为："+discount(com.getPrice()));			  
		}
		if(iBook instanceof ComputerBook){
			ComputerBook com = (ComputerBook)iBook;
			System.out.println(com.getName()+"\n"+com.getAuthor()+"\n"+"原价为："+com.getPrice()+"\n打完折的价格为："+discount(com.getPrice())+"\t类型："+com.getDomain());
			  
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
	
	private String domain;//领域
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
		return "书名："+this.name;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return "书名为："+this.author;
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
		return "本书书名："+this.Nname;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		
		return this.Nprice;
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return "本书作者:"+this.Nauthor;
	}
		
}