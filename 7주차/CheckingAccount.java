/**
 * ���� ���� Ŭ����
 * @author 20131010 �ֿ���
 *
 */
public class CheckingAccount extends Account{
	String cardNo;

	int pay(String cardNo, int amount) throws Exception {

		if(this.cardNo == cardNo && this.balance > amount){
			return withdraw(amount);
		}else{
			throw new Exception("�ܾ��� �����մϴ�.");
		}
	}
}
