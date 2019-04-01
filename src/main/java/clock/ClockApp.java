package clock;

import clock.analog.AnalogClock;
import clock.observers.ClockObserver;
import clock.timer.ClockTimer;

/**
 * The <code>ClockApp</code> class represents the application's main window.
 * 
 * @author Andreas Ruppen
 */
public class ClockApp {
 
    /**
     * Creates a new instance of <code>ClockApp</code>.
     */
    public ClockApp() {
		ClockTimer timer = new ClockTimer(new ClockObserver(new AnalogClock()));
		timer.start();
    }
    
    /**
     * The application's main method.
     */
    public static void main(String[] args) {
        new ClockApp();
    }
}
