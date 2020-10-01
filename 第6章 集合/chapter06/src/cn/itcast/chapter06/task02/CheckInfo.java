package cn.itcast.chapter06.task02;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
/**
 * У����Ϣ
 */
public class CheckInfo {
	public static HashSet<User> USER_DATA = new HashSet<User>(); // �û�����
	public CheckInfo(HashSet<User> USER_DATA) {
		this.USER_DATA = USER_DATA;
	}
	// У���û���Ϣ,���ص�¼״̬��Ϣ
	public String checkAction(String userName, String password, String rePassword,
			String birthday, String phone, String email) {
		StringBuilder result = new StringBuilder();
		// 1����ɹ� 2����ʧ��
		int state = 1;
		// �����ж�
		if (!password.equals(rePassword)) {// �ж�������ظ������Ƿ���ͬ
			result.append("�����������벻һ��!\r\n");
			state = 2;
		}
		// �����ж�
		if (birthday.length() != 10) {// �ַ������Ȳ�Ϊ10������Ϊ��ʽ����
			result.append("���ո�ʽ����ȷ!\r\n");
			state = 2;
		} else {
			for (int i = 0; i < birthday.length(); i++) {
				Character thisChar = birthday.charAt(i);
				if (i == 4 || i == 7) {
					if (!(thisChar == '-')) {// ��֤��4λ�͵�7λ�Ƿ��Ƿ��š�-��
						result.append("���ո�ʽ����ȷ!\r\n");
						state = 2;
					}
				} else {// ��֤���˵�4λ�͵�7λ���ַ��Ƿ���0~9������
					if (!(Character.isDigit(thisChar))) {
						result.append("���ո�ʽ����ȷ!\r\n");
						state = 2;
					}
				}
			}
		}
		// �ֻ����ж�
		if (phone.length() != 11) {// �ж��ֻ��ų��Ȳ�����11λ����Ϊ���ֻ�����Ч
			result.append("�ֻ����벻��ȷ!\r\n");
			state = 2;
			// Ĭ����Ч�ֻ���Ϊ13��15��17��18��ͷ���ֻ���
		} else if (!(phone.startsWith("13") || phone.startsWith("15") 
				|| phone.startsWith("17") || phone.startsWith("18"))) {
			result.append("�ֻ����벻��ȷ!\r\n");
			state = 2;
		}
		// �����ж�
		if (!email.contains("@")) {// �ж������ַ��Ĭ�ϲ���@���ŵ�����Ϊ��Ч����
			result.append("���䲻��ȷ!\r\n");
			state = 2;
		}
		// ���������ϢУ�����������û����뵽����
		if (state == 1) {
			// ��ʽ�����ڷ���Date����
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");// �������ڸ�ʽ
			Date dateBirthday = null;

			try {
				dateBirthday = format.parse(birthday);// �����ո�ʽ�������ڸ�ʽ
			} catch (ParseException e) {
				e.printStackTrace();
			}
			User newUser = new User(userName, rePassword, dateBirthday, phone, email);
			// ���û���ӵ��б��У�ͬʱ�ɸ���HashSet�жϳ��û�����û���ظ�
			if (!USER_DATA.add(newUser)) {
				result.append("�û��ظ�!");
				state = 2;
			}
			if (state == 1) {
				result.append("ע��ɹ�!");
			}
		}
		return result.toString();
	}
}