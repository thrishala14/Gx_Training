package javaDemo;

public class DecisionMaking {

	public static void main(String[] args) {
		String cityName = "bng";
		String state = "";
		if(cityName.equals("bng")) {
			state = "KA";
		}
		else if (cityName.equals("hyd")){
			state = "AP";
		}
		else if (cityName.equals("chennai")) {
			state = "TN";
		}
		else {
			state ="???";
		}
		System.out.println(state);
	}

}
