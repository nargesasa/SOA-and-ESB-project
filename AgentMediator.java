import java.util.List;

public class AgentMediator implements Mediator {
    private WeatherService weatherService = new WeatherService();
    private TourismService tourismService;
    private Mediator logger = new LogMediator();

    public void mediate(MessageContext context) {
        logger.mediate(context);

        boolean sunny = weatherService.isWeatherSunny(context.getCity());
        context.setSunny(sunny);

        if (sunny) {
            String info = tourismService.getTourismSuggestions(context.getCity());
            context.setTourismInfo(info);
            System.out.println("The weather is sunny! :) Tourism suggestion for" + context.getCity() + ": " + info);
        } else {
            System.out.println("weather in" + context.getCity() + " Not suitable for travel.");
        }
    }

    public void mediateCities(List<String> cities) {
        for (String city : cities) {
            MessageContext context = new MessageContext(city);
            mediate(context);
            System.out.println("----------");
        }
    }

    public AgentMediator() {
        this.weatherService = new WeatherService();
        this.tourismService = new TourismService(this); 
    }

    public String requestWeather(String city) {
       // System.out.println(weatherService.getWeather(city));
        return weatherService.getWeather(city);
    }

    public String requestTourismAdvice(String city) {
        return tourismService.getTravelRecommendation(city);
    }
}
