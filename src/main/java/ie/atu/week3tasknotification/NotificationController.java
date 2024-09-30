package ie.atu.week3tasknotification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @GetMapping("/test")
    public void test() {
        System.out.println("Hate paddy");
//        return "aijsbhbsdvbuhsdbujhsdkvb ks";
    }

}
