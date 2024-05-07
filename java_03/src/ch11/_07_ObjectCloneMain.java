package ch11;

// p368
public class _07_ObjectCloneMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		_07_Circle circle = new _07_Circle(10, 20, 30);
		System.out.println(circle); // circle.toString()
		System.out.println(System.identityHashCode(circle));
		System.out.println("------- clone() -------");
		// clone()을 하면 멤버변수값은 동일
		_07_Circle copy_circle = (_07_Circle) circle.clone(); //Object
		System.out.println(copy_circle);
		// clone()을 하면 실제 주소값은 다르다.(다른 곳에 복제되므로)
		System.out.println(System.identityHashCode(copy_circle)); 
	}
}
