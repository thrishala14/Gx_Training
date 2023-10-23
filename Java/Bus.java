package assignment17th;

public class Bus {
	private int busNo;
	private String route;
	private String timings;

	public Bus(int busNo, String route, String timings) {
		super();
		this.busNo = busNo;
		this.route = route;
		this.timings = timings;
	}

	public int getBusNo() {
		return busNo;
	}

	public String getRoute() {
		return route;
	}

	public String getTimings() {
		return timings;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

}
