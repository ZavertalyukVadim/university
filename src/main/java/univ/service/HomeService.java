package univ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.trash.Information;
import univ.trash.MailClient;

import java.util.Arrays;
import java.util.List;

@Service
public class HomeService {
    private final MailClient mailClient;

    @Autowired
    public HomeService(MailClient mailClient) {
        this.mailClient = mailClient;
    }

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


    public List<Information> getSecondLab() {
        return Arrays.asList(
                new Information("mpz-1704","1","25.11.2017"),
                new Information("mpz-1704","2","25.11.2017"),
                new Information("mpz-1704","3","25.11.2017"),
                new Information("mpz-1704","4","25.11.2017"),
                new Information("mpz-1704","5","25.11.2017"),
                new Information("mpz-1704","6","25.11.2017"),
                new Information("mpz-1704","Zavertalyuk Vadymka","04.07.1997"),
                new Information("mpz-1704","8","25.11.2017"),
                new Information("mpz-1704","9","25.11.2017"),
                new Information("mpz-1704","10","25.11.2017"),
                new Information("mpz-1704","11","25.11.2017"),
                new Information("mpz-1704","12","25.11.2017"),
                new Information("mpz-1704","13","25.11.2017"),
                new Information("mpz-1704","14","25.11.2017"),
                new Information("mpz-1704","15","25.11.2017"),
                new Information("mpz-1704","16","25.11.2017"),
                new Information("mpz-1704","17","25.11.2017"),
                new Information("mpz-1704","18","25.11.2017"),
                new Information("mpz-1704","19","25.11.2017"),
                new Information("mpz-1704","20","25.11.2017")
        );
    }

    public void getThirdLab(String email,String title, String text) {
        mailClient.sendMail(email, title, text);
    }
}
