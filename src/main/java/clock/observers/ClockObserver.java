package clock.observers;

import clock.analog.AnalogClock;

public class ClockObserver {

    private AnalogClock clock;

    public ClockObserver(AnalogClock clock){
        this.clock = clock;
    }

    public void update(int Hour, int Minute, int Second){
        clock.update(Hour,Minute, Second);
    }

}
