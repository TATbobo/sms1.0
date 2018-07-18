package com.briup.app01.dao.extend;

import java.util.List;

import com.briup.app01.VM.AnswerVM;

public interface AnswerVMMapper {
	List<AnswerVM>  findAllAnswerVM();
	AnswerVM findByIdVM(long id);
}
