package c.ThreadActivities;

public class TestGarbageCollection {
			/**
			 * Finalize() is called each time before garbage collection for each object
			 */
		 public void finalize()
		 {
			 System.out.println("object is garbage collected");
		 }
		 
		 
		 public static void main(String args[]){  
		  TestGarbageCollection s1=new TestGarbageCollection();  
		  TestGarbageCollection s2=new TestGarbageCollection();
		  s1=null;  
		  s2=null;  
		  System.gc();  
		 }  
		}  
