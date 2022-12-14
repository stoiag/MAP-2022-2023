package test;

public class Test extends Parent {
	private int acc;
	private String nume;
	static double PI = Math.PI;
	
	public Test() {
		super(80);
		this.acc = 0;
		this.nume = "";
	}
	
	public Test(int acc, String nume) {
		super();
		this.acc = acc;
		this.nume = nume;
	}

	public int getAcc() {
		return acc;
	}

	public void setAcc(int acc) {
		this.acc = acc;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	@Override
	public String toString() {
		return "Test [acc=" + acc + ", nume=" + nume + "] "+this.getAge();
	}
}
