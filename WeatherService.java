import java.util.Random;

public class WeatherService {
    public boolean isWeatherSunny(String city) {
        
        Random random = new Random();
        return random.nextBoolean(); 
    }

    
}
