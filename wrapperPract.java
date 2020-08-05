
public class wrapperPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Auto Boxing
		int a = 213; //variable of type int
		Integer b = a; //Object of type int
		System.out.println("Auto Unboxing Value - "+b);
		
//		Boxing
		int c = 325; //variable of type int
		Integer d = Integer.valueOf(c);	//Object of type int	
		System.out.println("Boxing Value : "+d.valueOf(d));
		
//		Auto Unboxing
		Integer e = 985; //Object of type int
		int f = e; //variable of type int
		System.out.println("Auto Unbboxing Value : "+f);
		
//		Unboxing
		Integer g = 756; //Object of type int
		int h = Integer.valueOf(g); //variable of type int 
		System.out.println("Unboxing Value  : "+h);
		
	}

}
