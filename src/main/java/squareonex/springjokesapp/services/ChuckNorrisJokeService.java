package squareonex.springjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeService implements JokeService {
    private final ChuckNorrisQuotes quotes;

    public ChuckNorrisJokeService() {
        this.quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return quotes.getRandomQuote();
    }
}
