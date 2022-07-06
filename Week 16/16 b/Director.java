
public class Director extends Employee {

	public Director(LeaveApprover nextApprover) {
		super("Director", nextApprover);
	}
	
	@Override
	public boolean processRequest(LeaveApplication application) {
		if(application.getType() =="sick") {
			if(application.getDays()>7) {
				application.setStatus("approved");
				return true;
			}
		}
		return false;
	}
	
}
