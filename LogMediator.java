public class LogMediator implements Mediator {
    public void mediate(MessageContext context) {
        System.out.println("Logging: City = " + context.getCity());
    }
}
