package tw.idv.cwchen.patterns.multi_dispatch.instance_of;

public class Component {
	
	//第一個方案: 型態判斷
	public void process(Parent parent) {
			if(parent instanceof Child1) {
					processChild1((Child1)parent);
			}else if(parent instanceof Child2) {
					processChild2((Child2)parent);
			}else if(parent instanceof Child3) {
					processChild3((Child3)parent);
			}
	}
	//缺點: 1. 冗長,複雜,容易出錯; 2. 加入一個新的型態不僅需要修改處理事件的程式碼, 而且需要修改相應的條件轉移語句, 不符合開閉原則.
	
	private void processChild1(Child1 child) {
		
	}
	
	private void processChild2(Child2 child) {
		
	}

	private void processChild3(Child3 child) {
		
	}
}
