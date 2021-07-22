package co.micol.figure;

public class Paint {

	Shape[] shape;

	public Paint() {
		shape = new Shape[6];
	}

	public void printAll() {

		for (Shape s : shape) {
			if (s instanceof Movable) {
				((Movable) s).move();
			}
			if (s instanceof Drawable) {
				((Drawable) s).draw();
			}
			s.print();
		}
	}
}

/*
 * 
  		for(Shape s : shape)
			if(s instanceof Movable) {
				((Movable)s).move();
			} else if (s instanceof Drawable) {
				((Drawable)s).draw();
				s.print();
			}
			
			else if 는 한 번 배제를 한 뒤에 하게 된 거라서 줄어든 상태에서 또 찾게 되다 보니
			다른 결과가 나온다,
  
  
  
 * */
