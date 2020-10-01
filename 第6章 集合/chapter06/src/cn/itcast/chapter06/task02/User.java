package cn.itcast.chapter06.task02;
import java.util.Date;
//�û���Ϣ
public class User {
	private String userName; // �û���
	private String password; // ����
	private Date birthday; // ����
	private String telNumber; // �ֻ�����
	private String email; // ����
	public User() {
	}
	public User(String userName, String password, Date birthday, 
			String telNumber, String email) {
		this.userName = userName;
		this.password = password;
		this.birthday = birthday;
		this.telNumber = telNumber;
		this.email = email;
	}
	// ��дhashCode��equals����
	@Override
	public int hashCode() {// ��дhashCode���������û�����Ϊ�Ƿ��ظ�������
		return userName.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {// �ж��Ƿ���ͬһ������
			return true;// �����ͬһ������ֱ�ӷ���true
		}
		if (obj == null) {// �ж���������Ƿ�Ϊ��
			return false;// ��������ǿյģ�ֱ�ӷ���false
		}
		if (getClass() != obj.getClass()) {// �ж���������Ƿ���User����
			return false;// ������ǣ�ֱ�ӷ���false
		}
		User other = (User) obj;// ������ǿתΪUser����
		if (userName == null) {// �жϼ������û����Ƿ�Ϊ��
			if (other.userName != null) {// �ж϶����е��û����Ƿ�Ϊ��
				return false;// ����������û���Ϊ�ղ��Ҷ������û�����Ϊ�գ��򷵻�false
			}
		} else if (!userName.equals(other.userName)) {// �ж��û����Ƿ���ͬ
			return false;// �����ͬ������false
		}
		return true;
	}
}