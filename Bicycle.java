package bicycle;

public class Bicycle {
	int speed = 0;
	int gear = 1;
	
	void ChangeGear(int newvalue) {
		
		
		if(newvalue > gear) IncrementSpeed();
		gear = newvalue;
	}
	
	void IncrementSpeed() {
		
		speed += 5;
		
	}
}
