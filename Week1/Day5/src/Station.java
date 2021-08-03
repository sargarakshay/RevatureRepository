
public class Station {
	private String stationCode;
	private String stationName;
	private double arrivalTime;
	private double departureTime;

	public Station(String stationCode, String stationName, double arrivalTime, double departureTime) {
		this.stationCode = stationCode;
		this.stationName = stationName;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}

	public String getStationCode() {
		return stationCode;
	}
	
	public String getStationName() {
		return stationName;
	}
	
	public void printTable(int number) {
		System.out.printf("%-2d %-4S %-18s %2.2f %8.2f%n", number, stationCode, stationName, arrivalTime, departureTime);
	}
	
	
}
