package oopsconcept;


public class OverloadingDemo {
	public static void main(String[] args) {
		Admin admin = new Admin();
		String result =admin.Admin("Yashu", "jevlas", "ka");
		System.out.println("admin" + result);
		int temp = admin.Admin(0, 1);
		System.out.println("admin" + temp);
		int temp1 = admin.Admin(32);
		System.out.println("admin" + temp1);

	}

}

class Admin {
	// super Admin
	String Admin(String readPermission, String writePermisssion, String executePermission) {
		String rolls = readPermission + writePermisssion + executePermission;
		return rolls;
	}

	// Sub admin
	int Admin(int readable, int writemode) {
		int rolls = readable + writemode;
		return rolls;
	}

	int Admin(int readmode) {
		int rolls = readmode;
		return rolls;
	}
}
