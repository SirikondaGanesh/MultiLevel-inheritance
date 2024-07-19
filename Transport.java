//implimenting a java program with MultiLevel-inheritance

package apjfsa;

//Parent-class for RoadTransport
public class Transport {
	// instance variable
	String transportType;
	int transportNumber;
	String transportColor;

	// method declaration
	void transportInfo() {
		System.out.println("TRANSPORT DETAIL'S :" + "\nTransport Type =" + transportType + "\nTransportNumber =TS 12 "
				+ transportNumber + "\nTransport Color =" + transportColor);
	}
}


//child-class for Transport & Parent-class for FourWheeler
public class RoadTransport extends Transport {
	//instance variable
	 String feul;
   int mileAge;
   int Engine;
  //method
   void roadTranspoInfo() {
  	 System.out.println("ROAD TRANSPORT DETAIL'S :"+"\nFeul ="+feul+"\nMileAge ="+mileAge+"\nEngine CC="+Engine);
   } 
}

//child-class for RoadTransport
public class FourWheeler extends RoadTransport {
	//instance variable
	String vehicleName;
	String vehicleModel;
	int price;
	int speed; 
	//method
	void fourwheelerInfo() {
		
		System.out.println("FOUR WHEELER DETAIL'S :"+"\nVehicle Name ="+vehicleName+"\nVehicle Model ="+vehicleModel+"8"+"\n Price ="+price+"\nSpeed ="+speed);
	}
   //main-function
	public static void main(String[] args) {
		//creatimg object
		FourWheeler BMW=new FourWheeler();
		BMW.transportType="Luxury Car";
		BMW.transportNumber=1111;
		BMW.transportColor="Blue";
		BMW.feul="Petrol";
		BMW.mileAge=9;
		BMW.Engine=4395;
		BMW.vehicleName="BMW";
		BMW.vehicleModel="BMW M";
		BMW.price=24000000;
		BMW.speed=110;
		BMW.transportInfo();
		BMW.roadTranspoInfo();
		BMW.fourwheelerInfo();
	}

}
