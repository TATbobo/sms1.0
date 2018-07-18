package com.briup.app01.dao.extend;

import java.util.List;

import com.briup.app01.VM.SurveyVM;


public interface SurveyVMMapper {
	List<SurveyVM> findAllSurveyVM();
	SurveyVM findByIdVM(long id);
}
