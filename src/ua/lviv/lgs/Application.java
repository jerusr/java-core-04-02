package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {
		Robot R = new Robot("я Robot Ц € просто працюю");
		Robot Coffe = new Robot("я CoffeRobot Ц € варю каву");
		Robot Dancer = new Robot("я RobotDancer Ц € просто танцюю");
		Robot Coocker = new Robot("я RobotCoocker Ц € просто готую");
			
// ћассив ≥ цикл for
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
		
		Animal a = new Animal("Ћеопард", 20, 7);

		System.out.print("Ќазва тварини = " + a.getName());
		System.out.print(", ¬≥к тварини = " + a.getAge());
		System.out.print(", Ўвидк≥сть тварини = " + a.getSpeed());
		System.out.println();
		
		a.setName("Ѕик");
		a.setSpeed(2);
		a.setAge(14);

		System.out.println(a);
		
	}
}
