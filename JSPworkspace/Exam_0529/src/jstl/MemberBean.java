package jstl;
//빈즈 객체로 사용할 클래스 작성
public class MemberBean {
		private String name;
		private String userid;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUserid() {
			return userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		@Override
		public String toString() {
			return "MemberBean [name=" + name + ", userid=" + userid + "]";
		}	
}
