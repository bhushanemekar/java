package a.polymorph;

public class TestCar {

	public static void main(String[] args) {
		
		
		Car b= new Audi();    //upcasting
		b.runCar();
		
		
		System.out.println(Math.min(Integer.MIN_VALUE, 0.0d));
		}
	
	public void testException(){
		try{
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			throw e;
			//throw new Exception();
		}
	}
	}

