package Test613;

public class example2 {

	@NotNull(name="уехЩ", order = @service(key = "007", value = "java"), request = @service(key = "123", value = "5555"))
	public void show(String name,String order,String request){
		
		System.out.println(name + "   "+order +"   "+request);
	}

	
}
