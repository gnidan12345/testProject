import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface Enviroment extends Config {

    @DefaultValue("https://github.com/janetrace")
    @Key("url")
    String myurl();


    @DefaultValue("janetrace0307@gmail.com")
    String login();


    @DefaultValue("janetrace0307")
    String password();

    @Key("name")
    @DefaultValue("janetrace")
    String accountowner();


    Enviroment testEnvironment = ConfigFactory.create(Enviroment.class);


}
