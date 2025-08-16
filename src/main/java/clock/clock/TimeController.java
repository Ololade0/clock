package clock.clock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
public class TimeController {

    @GetMapping("/server-time")
    public String serverTime() {
        Instant now = Instant.now(); // UTC time
        ZonedDateTime zdt = ZonedDateTime.now(); // default server timezone
        return "Instant (UTC): " + now.toString() +
                " | ZonedDateTime (server timezone): " + zdt.toString();
    }
}
