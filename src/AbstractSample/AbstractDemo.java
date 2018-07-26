package AbstractSample;

 class Base  {
//abstract void method1();
	 void method1(){
		 System.out.println("base");
	 }
}

class derived extends Base{
	void method1(){
		this.method1();
		System.out.println("derived");
		
	}
}

public class AbstractDemo{
	
	static void StaticMethod(Base base){
		derived dobj=(derived)base;
		dobj.method1();
	}

	public static void main(String[] args){
		
		Base obj=new derived();
		obj.method1();
	}

}
