
//Represents a request in our chain of responsibility
public class LeaveApplication {
	
	private String type;
	private int days;
	private String status;
	
	public LeaveApplication(String type, int days) {
		this.type = type;
		this.days = days;
	}
	
	public String getType() {
		return type;
	}
	public int getDays() {
		return days;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
}
