
public class Client {

	public static void main(String[] args) {
	   
	   LeaveApplication application = new LeaveApplication("sick",2);
	   System.out.println("You have applied for " + application.getDays() +" " +"days" + " " + application.getType()+" " + "leave");
	   System.out.println("*************************************************************");
	   LeaveApprover approver = createChain();
	   approver.processLeaveApplication(application);
	   System.out.println("You application for " + application.getDays() +" "+ "days" +" "+ application.getType() + " "+ "leave is " + application.getStatus());
	   
	}

	private static LeaveApprover createChain() {
		
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead lead = new ProjectLead(manager);
		return lead;
	}
	
}
