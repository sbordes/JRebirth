#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import org.jrebirth.af.core.service.DefaultService;
import org.jrebirth.af.core.wave.Wave;
import org.jrebirth.af.core.wave.WaveTypeBase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The class <strong>SampleService</strong>.
 * 
 * @author
 */
public final class SampleService extends DefaultService {

    /** Perform something. */
    public static final WaveTypeBase DO_SOMETHING = WaveTypeBase.build("SOMETHING");

    /** Wave type to return when something was done. */
    public static final WaveTypeBase RE_SOMETHING_DONE = WaveTypeBase.build("SOMETHING_DONE");

    /** The class logger. */
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleService.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public void initService() {

        // Define the service method
        registerCallback(DO_SOMETHING, RE_SOMETHING_DONE);
    }

    /**
     * Do something.
     * 
     * @param wave the source wave
     */
    public void something(final Wave wave) {

        LOGGER.trace("Do Something.");

        // Put code to do it !
    }

}
