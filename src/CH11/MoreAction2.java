package CH11;

public enum MoreAction2 {
	TURN_LEFT {
		// �������󷽷�
		public String getDescription() {
			return "�����D";
		}
	}, // ӛ���@߅�����eֵ�ָ�ʹ�� ,

	TURN_RIGHT {
		// �������󷽷�
		public String getDescription() {
			return "�����D";
		}
	}, // ӛ���@߅�����eֵ�ָ�ʹ�� ,

	SHOOT {
		// �������󷽷�
		public String getDescription() {
			return "���";
		}
	}; // ӛ���@߅�����eֵ�Y��ʹ�� ;

	// ���悀���󷽷�
	public abstract String getDescription();
}
