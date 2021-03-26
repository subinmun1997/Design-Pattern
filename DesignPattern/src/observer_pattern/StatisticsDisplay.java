package observer_pattern;

public class StatisticsDisplay implements Observer, DisplayElement {
	
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private WeatherData weatherData;
	
	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		tempSum += temp;
		numReadings++;
		
		if(temp > maxTemp) {
			maxTemp = temp;
		}
		
		if(temp < minTemp) {
			minTemp = temp;
		}
		
		display();

	}

}
