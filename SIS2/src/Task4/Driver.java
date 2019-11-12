package Task4;

import four.Time;

public class Driver {

	public static void main(String[] args) {
		Chocolate [] chocolate = new Chocolate [5]; 
		chocolate[0] = new Chocolate("Sneakers", 200);
		chocolate[1] = new Chocolate("Twix", 180);
		chocolate[2] = new Chocolate("KitKat", 210);
		chocolate[3] = new Chocolate("Mars", 190);
		chocolate[4] = new Chocolate("Kz", 215);
		//Sort.quickSort(chocolate);
		Sort.mergeSort(chocolate);
		for(int i = 0; i<chocolate.length; i++) {
			System.out.println(chocolate[i].toString());
		}
		
		/*Time [] time = new Time[3];
		time[0] = new Time(13, 34, 6);
		time[1] = new Time(21, 10, 54);
		time[2] = new Time(8, 45, 11);
		Sort.quickSort(time);
		for(int i = 0; i<time.length; i++) {
			System.out.println(time[i].toString());
		}*/
	}

}
