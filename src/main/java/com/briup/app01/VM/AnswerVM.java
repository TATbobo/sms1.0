package com.briup.app01.VM;

import com.briup.app01.bean.Question;

public class AnswerVM {
	private Long id;
	private String selection;
	private String check;
	private String content;
	private Question question;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSelection() {
		return selection;
	}
	public void setSelection(String selection) {
		this.selection = selection;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
}
