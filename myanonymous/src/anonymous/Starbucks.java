package anonymous;

public class Starbucks {

	public void register(Form form) {
		String[] menu = form.getMenu();
		for (int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + "." + menu[i]);
		}
		
//		���ᳪ�� ��� ���̶��, "���ᳪ�� ��� ����" ���
//		���ᳪ�� ��� ���� �ƴ϶��, �Ǹ� ��� ����
		if(form instanceof FormAdapter) {
			System.out.println("���ᳪ�� ��� ����");
		} else {
			form.sell("�Ƹ޸�ī��");
		}
	}
}
