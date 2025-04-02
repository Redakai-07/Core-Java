package com.Interface.Sagar;

public class MylaunchInterfcmethodRule3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//abstract class Demo{  will get error if not marked abstract
//		abstract void clsUser();
	//}
	
	}

}
interface MyDemo{
	void clsUser();
}


class Launch implements MyDemo{ //the type Launch must implement the inherited abstract method MyDemo.clsUser()
	@Override
	public void clsUser() {
		// TODO Auto-generated method stub
		
	}
}