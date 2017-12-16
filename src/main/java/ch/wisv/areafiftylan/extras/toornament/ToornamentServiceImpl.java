package ch.wisv.areafiftylan.extras.toornament;

import ch.wisv.toornament.ToornamentClient;
import ch.wisv.toornament.model.Tournament;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToornamentServiceImpl implements TournamentService {

    private ToornamentClient client;

    @Value("${a5l.extra.toornament.key}")
    String apikey;
    @Value("${a5l.extra.toornament.id}")
    String clientId;
    @Value("${a5l.extra.toornament.secret}")
    String clientSecret;

    @Override
    public List<Tournament> getRemoteTournaments() {
        client = new ToornamentClient(apikey, clientId, clientSecret);
        return client.tournaments().getMyTournaments();
    }
}
