import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AgentMediator mediator = new AgentMediator();

        List<String> cities = Arrays.asList("Tehran", "Shiraz", "Mashhad", "Tabriz");
        mediator.mediateCities(cities);
    }
}
