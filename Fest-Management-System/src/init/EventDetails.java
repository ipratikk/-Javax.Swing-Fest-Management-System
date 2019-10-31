package init;

public class EventDetails {
	String event_name[] = {"Dance","Drama","Music","Coding","Robotics","Development"};
	String event_coordinator[]= {"abc","def","ghi","jkl","mno","pqr"};
	String event_fees[]= {"400","500","300","1000","1200","1500"};
	String event_venue[]= {"1","2","3","4","5","6"};
	String event_details[]= {"1","2","3","4","5","6"};
	String event;
	int ind;
	EventDetails(String event)
	{
		this.event=event;
		for (int i=0;i<event_name.length;i++) {
		    if (event_name[i].equals(event)) {
		        ind = i;
		        break;
		    }
		}
	}
	public String name() {
		return event_name[ind];
	}
	public String coordinator()
	{
		return event_coordinator[ind];
	}
	public String fees()
	{
		return event_fees[ind];
	}
	public String venue()
	{
		return event_venue[ind];
	}
	public String details()
	{
		return event_details[ind];
	}
}
