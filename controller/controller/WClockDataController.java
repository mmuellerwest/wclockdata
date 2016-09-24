/**
 * Word Clock data service controller
 */

/**
 * @author magit@mueller-westerholt.de
 *
 */
package controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WClockDataController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
