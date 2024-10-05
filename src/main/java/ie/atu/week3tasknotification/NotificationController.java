package ie.atu.week3tasknotification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @GetMapping("/updated")
    public String updatedTask() {
        System.out.println("Updated");
        return "Updated Task";
    }

    @GetMapping("/removed")
    public String removedTask() {
        System.out.println("Removed");
        return "Removed Task";
    }

    @GetMapping("/added")
    public String addedTask() {
        System.out.println("Added");
        return "Added Task";
    }

}
