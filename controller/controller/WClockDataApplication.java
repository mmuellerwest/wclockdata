/**
 *
 */
package controller;

/**
 * @author magit@mueller-westerholt.de
 *
 * Generate Word Clock data for an Arduino project
 * see e.g. http://www.mikrocontroller.net/articles/Word_Clock
 * for German, see e.g. http://www.instructables.com/id/Und-noch-eine-Wordclock/
 * Panel for German: http://www.mikrocontroller.net/wikifiles/d/d6/WordclockFront_gerV2.pdf
 * commercial version / original at http://www.qlocktwo.com
 */

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WClockDataApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(WClockDataApplication.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}

/*
 * German word list es ist fünf zehn zwanzig drei viertel nach vor halb zwölf zwei ein eins sieben drei fünf elf neun vier acht
 * zehn sechs uhr
 *
 */

// "Wessi-Modus":

// es ist ein uhr
// es ist fünf nach eins
// es ist zehn nach eins
// es ist viertel nach eins
// es ist zehn vor halb zwei
// es ist fünf vor halb zwei
// es ist halb zwei
// es ist fünf nach halb zwei
// es ist zehn nach halb zwei
// es ist viertel vor zwei
// es ist zehn vor zwei
// es ist fünf vor zwei
