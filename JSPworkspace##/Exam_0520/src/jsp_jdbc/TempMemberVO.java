package jsp_jdbc;

public class TempMemberVO {
	private String id;
	private String password;
	private String name;
	private String mem_num1;
	private String mem_num2;
	private String e_mail;
	private String phone;
	private String zipcode;
	private String address;
	private String job;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMem_num1() {
		return mem_num1;
	}

	public void setMem_num1(String mem_num1) {
		this.mem_num1 = mem_num1;
	}

	public String getMem_num2() {
		return mem_num2;
	}

	public void setMem_num2(String mem_num2) {
		this.mem_num2 = mem_num2;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public TempMemberVO(String id, String password, String name, String mem_num1, String mem_num2, String e_mail,
			String phone, String zipcode, String address, String job) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.mem_num1 = mem_num1;
		this.mem_num2 = mem_num2;
		this.e_mail = e_mail;
		this.phone = phone;
		this.zipcode = zipcode;
		this.address = address;
		this.job = job;
	}

	public TempMemberVO() {
		super();
		
	}

	
}