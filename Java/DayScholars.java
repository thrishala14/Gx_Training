package assignment17th;

public class DayScholars extends Student{
	
	private Bus bus;
	
	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public DayScholars(String name, int rollNo, int classNo, Bus bus) {
		super(name, rollNo, classNo);
		this.bus = bus;
	}

}
