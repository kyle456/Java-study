package chap06;

import java.lang.reflect.*;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// get information from Service.class
		Method[] declaredMethods = Service.class.getDeclaredMethods(); // reflection

		// process Method object one by one
		for (Method method : declaredMethods) {
			// check for existence of PrintAnnotation
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				// get PrintAnnotation object
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

				// print the method name
				System.out.println("[" + method.getName() + "]");

				// print the division line
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();

				try {
					method.invoke(new Service());
					// Service service = new Service();
					// service.method1();
				} catch (Exception e) {
				}

				System.out.println();

			}
		}

	}

}
