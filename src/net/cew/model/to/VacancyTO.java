package net.cew.model.to;

import java.util.Date;

public class VacancyTO {
	int vacancyid;
	String jobtitle;
	String qualification;
	String experience;
	int noofvacancy;
	float package1;
	Date date=new Date();
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public VacancyTO(int vacancyid, String jobtitle, String qualification,
			String experience, int noofvacancy, float package1, Date date) {
		super();
		this.vacancyid = vacancyid;
		this.jobtitle = jobtitle;
		this.qualification = qualification;
		this.experience = experience;
		this.noofvacancy = noofvacancy;
		this.package1 = package1;
		this.date = date;
	}
	public int getVacancyid() {
		return vacancyid;
	}
	public void setVacancyid(int vacancyid) {
		this.vacancyid = vacancyid;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public int getNoofvacancy() {
		return noofvacancy;
	}
	public void setNoofvacancy(int noofvacancy) {
		this.noofvacancy = noofvacancy;
	}
	public float getPackage1() {
		return package1;
	}
	public void setPackage1(float package1) {
		this.package1 = package1;
	}
	public VacancyTO() {
		super();
	}
	
}
