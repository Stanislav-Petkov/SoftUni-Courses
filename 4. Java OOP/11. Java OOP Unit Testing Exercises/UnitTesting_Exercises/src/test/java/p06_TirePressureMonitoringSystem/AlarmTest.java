package p06_TirePressureMonitoringSystem;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AlarmTest {

    @Test
    public void testAlarmWithHigherValue(){
        Sensor sensor = mock(Sensor.class);
        when(sensor.popNextPressurePsiValue(16)).thenReturn(21.1);
        Alarm alarm = new Alarm();
        alarm.setSensor(sensor);
        alarm.check();
        assertTrue(alarm.getAlarmOn());
    }
}
