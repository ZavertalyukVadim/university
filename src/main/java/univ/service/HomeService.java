package univ.service;

import org.springframework.stereotype.Service;
import univ.trash.Information;

import java.util.Arrays;
import java.util.List;

@Service
public class HomeService {

    public List<Information> getFirstLab() {
        return Arrays.asList(
                new Information("mpz-1704","Zavertalyuk Vadym","04.07.1997"),
                new Information("mpz-1704","Zavertalyuk Vadym","04.07.1997"),
                new Information("mpz-1704","Zavertalyuk Vadym","04.07.1997"),
                new Information("mpz-1704","Zavertalyuk Vadym","04.07.1997"),
                new Information("mpz-1704","Zavertalyuk Vadym","04.07.1997"),
                new Information("mpz-1704","Zavertalyuk Vadym","04.07.1997"),
                new Information("mpz-1704","Zavertalyuk Vadym","04.07.1997")
        );
    }
}
