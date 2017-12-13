package b.finalize;

public class TestFinalize {

		public void finalize() {
		System.out.println("Finalize is called");
		}
		public static void main(String args[])
		 {
				TestFinalize f1 = new TestFinalize();
				TestFinalize f2 = new TestFinalize();
				f1 = null;
				f2 = null;
				System.gc();
			}
		}

