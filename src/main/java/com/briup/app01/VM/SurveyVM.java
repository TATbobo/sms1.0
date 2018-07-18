package com.briup.app01.VM;

import java.util.List;

import com.briup.app01.bean.Answer;
import com.briup.app01.bean.Clazz;
import com.briup.app01.bean.Course;
import com.briup.app01.bean.Questionnaire;
import com.briup.app01.bean.User;

public class SurveyVM {
	private Long id;
	private String state;
	private Double average;
	private String surveydate;
	private Long questionnaire_id;
	private Questionnaire questionnaire;
	private User user;
	private Clazz clazz;
	private Course course;
	private List<Answer> answers;
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Double getAverage() {
		return average;
	}
	public void setAverage(Double average) {
		this.average = average;
	}
	public String getSurveydate() {
		return surveydate;
	}
	public void setSurveydate(String surveydate) {
		this.surveydate = surveydate;
	}
	public Long getQuestionnaire_id() {
		return questionnaire_id;
	}
	public void setQuestionnaire_id(Long questionnaire_id) {
		this.questionnaire_id = questionnaire_id;
	}
	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}
	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
}
