package no.kantega.ldd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import no.kantega.ldd.modul.*;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class); 

    public static void main(
        final String[] args) 
    {
        log.info("Starter opp");
        System.out.println("Hallo, hallo, verden!");

        Modul m = new EnIModul();
        m.doSomeLogging();
        m = new AnnenIModul();
        m.doSomeLogging();

        log.error("Noe gikk galt!");
        
        log.info("Avslutter");
    }
}