package co.micol.generic;

public class GenericType<T, M> {	// T는 class 생성시 결정한다.
	
	private T t;
	private M m;
	
	public M getM() {
		return m;
	}

	public void setM(M m) {
		this.m = m;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
	
}
