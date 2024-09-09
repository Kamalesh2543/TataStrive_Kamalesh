package day6;

public class Hosteller extends Student {
	private int roomNumber;
	private char blockName;
	private String roomType;
	


	public Hosteller(int studentId, String studentName, String department, String gender, String category,
			double collegeFee,int roomNumber, char blockName, String roomType) {
		super(studentId,studentName,department,gender,category,
				collegeFee);
		this.roomNumber = roomNumber;
		this.blockName = blockName ;
		this.roomType = roomType;
	}
	




	public int getRoomNumber() {
		return roomNumber;
	}




	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}




	public char getBlockName() {
		return blockName;
	}




	public void setBlockNumber(char blockNumber) {
		this.blockName = blockName;
	}




	public String getRoomType() {
		return roomType;
	}




	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	
	@Override
	public double calculateTotelFee() {
		
		double hostelFee=0;
		double roomTypeAmount=0;
		if(blockName=='A') {
			hostelFee+=60000;
			roomTypeAmount=roomType.equals("AC")?8000:0;
		}
		else if(blockName=='B') {
			hostelFee+=50000;
			roomTypeAmount=roomType.equals("AC")?5000:0;
		}
		
     		else if(blockName=='C') {
			hostelFee+=40000;
			roomTypeAmount=roomType.equals("AC")?2000:0;
		}

		return collegeFee+hostelFee+roomTypeAmount;

	

}
}