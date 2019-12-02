package demo;

class test01{
	
}

class test2{
	
}
class test3{
	
}
class Singleton01{
	 private Singleton01() {}
	 private static Singleton01 instance;
	 public static Singleton01 instance() {
		 if(instance==null) {
			 instance=new Singleton01();
		 }
		return instance;
	 }
}
class Singleton02{
	private Singleton02() {}
	private static Singleton02 instance;
	public static Singleton02 instance() {
		synchronized (Singleton02.class) {
			if(instance==null) {
				instance=new Singleton02();
			}
		}
		return instance;
	}
}
class Singleton03{
	private Singleton03() {}
	private static Singleton03 instance = new Singleton03();
	public static Singleton03 instance() {
			if(instance==null) {
				instance=new Singleton03();
			}
		return instance;
	}
}


public class Singleton {

	public static void main(String[] args) {
//			System.out.println(Singleton01.instance());
//			System.out.println(Singleton01.instance());
//			System.out.println(Singleton01.instance());
//			System.out.println(Singleton01.instance());
			
			for(int i =1;i<10;i++) {
			Thread t =new Thread() {
				@Override
				public void run() {
					System.out.println(Singleton01.instance());
					super.run();
				}
			};
			t.start();
			}
			
			
			
			
			
			
	}

}
