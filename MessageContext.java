public class MessageContext {
    private String city;
    private boolean isSunny;
    private String tourismInfo;

    public MessageContext(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public boolean isSunny() {
        return isSunny;
    }

    public void setSunny(boolean sunny) {
        isSunny = sunny;
    }

    public String getTourismInfo() {
        return tourismInfo;
    }

    public void setTourismInfo(String tourismInfo) {
        this.tourismInfo = tourismInfo;
    }
}
