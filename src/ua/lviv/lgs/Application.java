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
		
		
// ������ � ���� for
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
		
		Animal a = new Animal("�������", 20, 7);

		System.out.print("����� ������� = " + a.getName());
		System.out.print(", ³� ������� = " + a.getAge());
		System.out.print(", �������� ������� = " + a.getSpeed());
		System.out.println();
		
		a.setName("���");
		a.setSpeed(2);
		a.setAge(14);

		System.out.println(a);
		
	}
}
