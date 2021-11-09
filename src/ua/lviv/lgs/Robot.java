package ua.lviv.lgs;

public class Robot {
	
	private String act;
	private String name;
	
	Robot (String act, String name){
		this.act = act;
		this.name = name;

	}
	
	public Robot() {
		this.name = "Robot";
		this.act = "просто працюю";
	}

	public void work () {
		System.out.println("Я " + this.name + " - я " + this.act);
	}
}
