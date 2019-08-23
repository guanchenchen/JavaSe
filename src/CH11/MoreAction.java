package CH11;

public enum MoreAction implements IDescription {
	TURN_LEFT {
		// 實作介面上的方法
		public String getDescription() {
			return "向左轉";
		}
	}, // 記得這邊的列舉值分隔使用 ,

	TURN_RIGHT {
		// 實作介面上的方法
		public String getDescription() {
			return "向右轉";
		}
	}, // 記得這邊的列舉值分隔使用 ,

	SHOOT {
		// 實作介面上的方法
		public String getDescription() {
			return "射擊";
		}
	}; // 記得這邊的列舉值結

}
