package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Moiz","Israr");		//Can call the method from the other class for alternate emails/mailbox capacity.
		System.out.println(em1.showInfo());
	}

}
