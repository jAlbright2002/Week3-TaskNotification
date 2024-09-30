package ie.atu.week3tasknotification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class NotificationController {

    @GetMapping
    public String test() {
        return "aijsbhbsdvbuhsdbujhsdkvb ks";
    }

}
