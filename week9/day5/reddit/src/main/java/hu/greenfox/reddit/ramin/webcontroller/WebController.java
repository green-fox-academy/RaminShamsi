package hu.greenfox.reddit.ramin.webcontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

//  @GetMapping("/")
//  public String home(){
//    return "redirect:http://10.27.99.47:8080";   ///Here we write the FrontEnd local IP address who is in same WIFI network
//  }


  @GetMapping("/")
  public String home(){
    return "index";   ///Here we write the FrontEnd local IP address who is in same WIFI network
  }
}
