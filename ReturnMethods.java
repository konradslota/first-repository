public class ReturnMethods{

	public static void main(String[] args){
	  ReturnMethods methods = new ReturnMethods();
	  System.out.println("Value returned: "+methods.method1());
	 // Index.main(null);
	  }

public int method1(){
  System.out.println("Method 1 here and I am calling method 2");
  return method2();
}
public int method2(){
 System.out.println("Hi method 1, from method 2, I am calling method 3");
 return method3();
// System.out.println("Method3 says hello to method 1.");
}
public int method3(){
  System.out.println("Hi method 2, from method 3, tell method 1 I say Hello");
    return 5;
}

}

