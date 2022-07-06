
//A concrete handler
public class ProjectLead extends Employee{

	public ProjectLead(LeaveApprover successor) {
		super("Project Lead", successor);
	}
	
	@Override
	public boolean processRequest(LeaveApplication application) {
		//type is sick leave & duration is less than or equal to 2 days 
		if(application.getType() =="sick") {
			if(application.getDays() <= 2) {
				application.setStatus("approved");
				return true;
			}
		}
		return false;
	}

	
	
}
