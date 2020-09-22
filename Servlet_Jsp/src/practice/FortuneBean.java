package practice;

import java.io.Serializable;
import java.util.Date;

public class FortuneBean implements Serializable{

	private Date today = new Date();
	private String fortune = "";

	public FortuneBean() {};

	public Date getToday() {
		return this.today;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public String getFortune() {
		return this.fortune;
	}

	public void setFortune(String fortune) {
		this.fortune= fortune;
	}

}
