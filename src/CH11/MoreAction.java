package CH11;

public enum MoreAction implements IDescription {
	TURN_LEFT {
		// ���������ϵķ���
		public String getDescription() {
			return "�����D";
		}
	}, // ӛ���@߅�����eֵ�ָ�ʹ�� ,

	TURN_RIGHT {
		// ���������ϵķ���
		public String getDescription() {
			return "�����D";
		}
	}, // ӛ���@߅�����eֵ�ָ�ʹ�� ,

	SHOOT {
		// ���������ϵķ���
		public String getDescription() {
			return "���";
		}
	}; // ӛ���@߅�����eֵ�Y

}
