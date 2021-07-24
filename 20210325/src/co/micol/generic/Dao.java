package co.micol.generic;

public abstract class Dao<T> {	// 상위 클래스의 추상 클래스나 인터페이스 객체에 사용한다.

	public T t;
	
	public abstract <T> Dao <T> select();
	
	public abstract int insert(T t);
	
	public abstract int delete(T t);
	
	public abstract int update(T t);
	
}
