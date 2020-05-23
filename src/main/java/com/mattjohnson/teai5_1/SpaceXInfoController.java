package com.mattjohnson.teai5_1;

import com.mattjohnson.teai5_1.pojo_ships.ShipSpaceX;
import com.mattjohnson.teai5_1.pojo_launches.LauchesUpcoming;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class SpaceXInfoController {

    private String baseUrl = "https://api.spacexdata.com/v3";


    private ShipSpaceX[] getShips() {
        RestTemplate restTemplate = new RestTemplate();

        ShipSpaceX[] ships = restTemplate.getForObject(baseUrl + "/ships",
                ShipSpaceX[].class);
        return ships;
    }

    @GetMapping("/launches-upcoming")
    private String getLaunches(Model model) {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<LauchesUpcoming[]> launches = restTemplate.exchange(baseUrl + "/launches/upcoming",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                LauchesUpcoming[].class);

        model.addAttribute(launches.getBody());


        return "launches-upcoming";
    }



    @GetMapping("/ships-info")
    private String get(Model model) {
        model.addAttribute("ships", getShips());
        return "ships-info";
    }
}
