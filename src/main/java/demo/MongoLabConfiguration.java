package demo;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.net.UnknownHostException;

// Does not work like this either

@Configuration
@Profile("mongolab2")
public class MongoLabConfiguration {

    @Bean
    public MongoClient mongoClient() throws MongoException, UnknownHostException {
        return new MongoClient(new MongoClientURI(System.getenv("MONGOLAB_URI")));
    }

}
