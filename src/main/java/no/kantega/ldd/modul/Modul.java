package no.kantega.ldd.modul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Modul {
    private static final Logger log = LoggerFactory.getLogger(Modul.class); 

    public void doSomeLogging() {
        log.info("Her er Modul.doSomeLogging som representerer {}", getClass().getSimpleName());
    }
}
