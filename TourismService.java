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
}
