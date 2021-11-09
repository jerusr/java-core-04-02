package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {
		
		Robot R = new Robot ();
		CoffeRobot coffeRobot = new CoffeRobot();
		RobotDancer robotDancer = new RobotDancer();
		RobotCoocker robotCoocker = new RobotCoocker();
		
		R.work();
		coffeRobot.work();
		robotDancer.work();
		robotCoocker.work();
		
		
// Массив і цикл for
		Robot[] array = new Robot[4];
		array[0] = R;
		array[1] = coffeRobot;
		array[2] = robotDancer;
		array[3] = robotCoocker;
		for (int i = 0; i < 4; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		System.out.println();
		
		Animal a = new Animal("Леопард", 20, 7);

		System.out.print("Назва тварини = " + a.getName());
		System.out.print(", Вік тварини = " + a.getAge());
		System.out.print(", Швидкість тварини = " + a.getSpeed());
		System.out.println();
		
		a.setName("Бик");
		a.setSpeed(2);
		a.setAge(14);

		System.out.println(a);
		
	}
}
