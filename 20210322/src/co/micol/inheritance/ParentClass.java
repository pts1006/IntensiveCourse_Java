package co.micol.inheritance;

public class ParentClass {

	@SuppressWarnings("unused")
	private String name;
	public String model;	//속성
	
	public void speed() {	//메소드
		System.out.println(model + "의 최고 시속 180Km/h");
		
	}
	
	public void toPrint() {
		
	}
	
	public ParentClass() {
		
	}
	
	public ParentClass(String name) {
		this.name = name;
	}
	
}
