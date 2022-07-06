
//A concrete handler

public class Manager extends Employee {

	public Manager(LeaveApprover nextApprover) {
		super("Manager", nextApprover);
	}
	
	@Override
	public boolean processRequest(LeaveApplication application) {
		if(application.getType() =="sick") {
			if(application.getDays() >= 3 && application.getDays()<=7) {
				application.setStatus("approved");
				return true;
			}
		}
		return false;
	}
	
}