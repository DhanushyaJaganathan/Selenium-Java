package day1.classroom;

public class Mobile {
	
	public String makecall(String name) {
		return "Call is made successfully";
	}

	public String sendSMS(String name) {
		System.out.println("Sending Message to "+ name);
		return "message sent succesfully";
	}

	public void shutDown() {
		System.out.println("Shutting Down");
	}

	public static void main(String[] args) {

		Mobile operation = new Mobile();
		String makecall = operation.makecall("Sowmi");
		System.out.println(makecall);
		String sendSMS = operation.sendSMS("Monish");
		operation.shutDown();
	}

}
