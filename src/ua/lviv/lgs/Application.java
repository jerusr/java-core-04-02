package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {
		Robot R = new Robot("� Robot � � ������ ������");
		Robot Coffe = new Robot("� CoffeRobot � � ���� ����");
		Robot Dancer = new Robot("� RobotDancer � � ������ ������");
		Robot Coocker = new Robot("� RobotCoocker � � ������ �����");
			
// ������ � ���� for
		Robot[] array = new Robot[4];
		array[0] = R;
		array[1] = Coffe;
		array[2] = Dancer;
		array[3] = Coocker;
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
