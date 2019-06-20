package httptest.pagemodel;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class WeekReport implements Serializable {

	private static final long serialVersionUID = 7862719318517167041L;

	private String personcode;
	private String personname;
	private int projectid;
	@JSONField(format = "yyyy-MM-dd")
	private Date inputtime;
	private double manhours;
	private String inputdesc;

	public String getPersoncode() {
		return personcode;
	}

	public void setPersoncode(String personcode) {
		this.personcode = personcode;
	}

	public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public Date getInputtime() {
		return inputtime;
	}

	public void setInputtime(Date inputtime) {
		this.inputtime = inputtime;
	}

	public double getManhours() {
		return manhours;
	}

	public void setManhours(double manhours) {
		this.manhours = manhours;
	}

	public String getInputdesc() {
		return inputdesc;
	}

	public void setInputdesc(String inputdesc) {
		this.inputdesc = inputdesc;
	}

	public WeekReport(String personcode, String personname, int projectid, Date inputtime, double manhours,
			String inputdesc) {
		super();
		this.personcode = personcode;
		this.personname = personname;
		this.projectid = projectid;
		this.inputtime = inputtime;
		this.manhours = manhours;
		this.inputdesc = inputdesc;
	}

	public WeekReport() {
		super();
	}

}
