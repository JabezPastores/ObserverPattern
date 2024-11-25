public class NewsSubscriptionService {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Subscriber Jabez = new Subscriber("Jabez");
        Subscriber Villan = new Subscriber("Villan");
        Subscriber Cruz = new Subscriber("Cruz");

        newsAgency.attach(Jabez);
        newsAgency.attach(Villan);
        newsAgency.attach(Cruz);

        newsAgency.publishNews("\n" + "NEWS FLASH! Stay away from any possible landslide areas");

        newsAgency.detach(Jabez);
        newsAgency.detach(Cruz);

        newsAgency.publishNews("\n" + "EMERGENCY! Attack on the country on going!");
    }
}
