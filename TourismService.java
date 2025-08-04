public class TourismService {
    public String getTourismSuggestions(String city) {
        switch (city) {
            case "Shiraz":
                return "Visit Persepolis and enjoy the gardens.";
            case "Tehran":
                return "Visit Milad Tower and Golestan Palace.";
            case "Tabriz":
                return "Explore the Bazaar of Tabriz and nearby mountains.";
            default:
                return "No suggestions available.";
        }
    }

    private AgentMediator mediator;

    public TourismService(AgentMediator mediator) {
        this.mediator = mediator;
    }

    public String getTravelRecommendation(String city) {
    
        String weather = mediator.requestWeather(city);
        if (weather.equals("Sunny")) {
            return "Great time to visit " + city + "! Recommended sites: City Center, Old Bazaar.";
        } else if (weather.equals("Rainy")) {
            return "Not the best time to visit " + city + " due to rain.";
        } else {
            return "No recommendation available for " + city + ".";
        }
    }
}
