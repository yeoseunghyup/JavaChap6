/**
 * ������� Ŭ����
 * @author �ֿ��� 20131010
 *
 */
class Account {
	/**
	 * ���¹�ȣ
	 */
	String accountNo;
	/**
	 * ������ �̸�
	 */
	String ownerName;
	/**
	 * �ܾ�
	 */
	int balance; 
	/**
	 * Account ������(Default Constructor)
	 */
	Account(){
	}
	
	
	/**
	 * Account ������
	 * @param accountNo 	: ���¹�ȣ
	 * @param ownerName : ������ �̸� 
	 * @param balance		: �ܾ�
	 */
	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo; 
		this.ownerName = ownerName;  
		this.balance = balance;       
	}
	/**
	 * �����Ѵ�. 
	 * @param amount : �Աݾ�
	 */
	void  deposit(int amount)  {       
		this.balance += amount;
	}
	/**
	 * ����Ѵ�.
	 * @param amount : ��ݾ�
	 * @return : ��ݾ�
	 * @throws Exception 
	 */
	int withdraw(int amount) throws Exception {
		if (this.balance < amount){
			//return 0;
			throw new Exception("�ܾ��� �����մϴ�.");
		}
		this.balance -= amount;
		return this.balance;
	}
}




