package co.micol.main;

import co.micol.inheritance.ChildClass;
import co.micol.inheritance.ParentClass;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass parent = new ParentClass("현대자동차");
		parent.model = "sonata";
		parent.speed();
		parent.toString();
		
		ChildClass child = new ChildClass();
		child.model = "sm5";
		child.speed();		
		child.toPrint();	// 여기까지, 상위 클래스에서 상속.
		child.setColor("red");
		System.out.println(child.getColor());
		child.run();	//여기까지, 자신이 갖고 있는 속성.
		
	}

}
