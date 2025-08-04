import java.util.Random;

public class WeatherService {
    public boolean isWeatherSunny(String city) {
        
        Random random = new Random();
        return random.nextBoolean(); 
    }

    public String getWeather(String city) {
        if (city.equalsIgnoreCase("Qom")) {
            return "Sunny";
        } else if (city.equalsIgnoreCase("Rasht")) {
            return "Rainy";
        } else {
            return "Unknown";
        }
    }
}
