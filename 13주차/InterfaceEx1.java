
public class InterfaceEx1 {
	public static void main(String[] args) {
		SeparateVolume obj1 =new SeparateVolume(
				"863?777��", "����","��������", null);
		AppCDInfo obj2 = new AppCDInfo(
				"2007-7001","Redhat Fedora");
		obj1.checkOut("������","2013-11-21");
		obj2.CheckOut("������","2013-11-21");
		
		obj1.checkIn();
		obj1.checkIn();
		
	}

}
