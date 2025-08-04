import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AgentMediator mediator = new AgentMediator();

        //First scenario

        List<String> cities = Arrays.asList("Tehran", "Shiraz", "Mashhad", "Tabriz");
        mediator.mediateCities(cities);

        //Second scenario

        
        String city1 = "Qom";
        String tourismAdvice1 = mediator.requestTourismAdvice(city1);
        System.out.println("Tourism agent says about " + city1 + ": " + tourismAdvice1);

        String city2 = "Rasht";
        String tourismAdvice2 = mediator.requestTourismAdvice(city2);
        System.out.println("Tourism agent says about " + city2 + ": " + tourismAdvice2);
    }  
}
