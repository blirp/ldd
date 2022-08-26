package no.kantega.ldd.modul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnnenIModul extends Modul {
    private static final Logger log = LoggerFactory.getLogger(AnnenIModul.class); 

    @Override
    public void doSomeLogging() {
        super.doSomeLogging();
        log.info("{} kan også gjøre logging på egen hånd", getClass().getSimpleName());
    }
}
