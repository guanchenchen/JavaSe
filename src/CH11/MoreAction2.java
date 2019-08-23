package CH11;

public enum MoreAction2 {
	TURN_LEFT {
		// 實作抽象方法
		public String getDescription() {
			return "向左轉";
		}
	}, // 記得這邊的列舉值分隔使用 ,

	TURN_RIGHT {
		// 實作抽象方法
		public String getDescription() {
			return "向右轉";
		}
	}, // 記得這邊的列舉值分隔使用 ,

	SHOOT {
		// 實作抽象方法
		public String getDescription() {
			return "射擊";
		}
	}; // 記得這邊的列舉值結束使用 ;

	// 宣告個抽象方法
	public abstract String getDescription();
}
