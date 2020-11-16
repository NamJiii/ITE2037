package project04_2;

public class City {
	
	private String name;
	private double lat;
	private double lon;
	
	public City() {}
	
	public City(String name, double lat, double lon) {
		this.name=name;
		this.lat = lat;
		this.lon = lon;
	}
	
	public City(String name) {
		this.name = name;
		this.lat = Math.random()*360;
		this.lon = Math.random()*360;
	}
	
	public boolean equals(City c) {
		if(this.name.equals(c.name) && this.lat==c.lat && this.lon==c.lon) return true;
		else return false;
	}
	
	public String toString() {
		String result;
		result = name+", "+Double.toString(lat)+", "+Double.toString(lon);
		return result;
	}
	
	public static double cityDistance(City b,City c) {
		double distance;
		distance = Math.sqrt((b.lon-c.lon)*(b.lon-c.lon)+(b.lat-c.lat)*(b.lat-c.lat));
		return distance;
	}
}
