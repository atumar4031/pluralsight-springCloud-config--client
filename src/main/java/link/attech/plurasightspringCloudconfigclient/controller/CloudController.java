package link.attech.plurasightspringCloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CloudController {
    @Value("${message}")
    String message;

    @RequestMapping("/message")
    public String showMessage(Model messageModel){
        messageModel.addAttribute("message", message);
        return "index";
    }

}
