
public class AngleHourMin {

	public static void main(String[] args) {
		System.out.println(cal_angle(12, 30));
	}

	public static int cal_angle(int hour, int min) {
		int h_angle = (int) ((hour * 60 + min) * 0.5);
		int angle = (min * 6) - h_angle;
		// now calculate minimum angle...

		if (angle < 0)
			angle = -angle;
		return Math.min(360 - angle, angle);

	}

}

/*
 * The minute hand moves 360 degree in 60 minute(or 6 degree in one minute) and
 * hour hand moves 360 degree in 12 hours(or 0.5 degree in 1 minute). In h hours
 * and m minutes, the minute hand would move (h*60 + m)*6 and hour hand would
 * move (h*60 + m)*0.5.
 */
