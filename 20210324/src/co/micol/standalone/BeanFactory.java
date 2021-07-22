package co.micol.standalone;

public class BeanFactory {
	// 어떤 타입이든 가능하도록 오브젝트로 둠
	public static Object getBean(String beanName) {
		if (beanName.equals("samsung")) {
			return new SamsungTV();
		} else if (beanName.equals("lg")) {
			return new LgTV();
		} else {
			return null;
		}
	}
}
