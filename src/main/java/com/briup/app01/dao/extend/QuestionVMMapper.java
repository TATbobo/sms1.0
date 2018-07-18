package com.briup.app01.dao.extend;

import java.util.List;

import com.briup.app01.VM.QuestionVM;

public interface QuestionVMMapper {
  List<QuestionVM> findAllQuestionVM();
  QuestionVM findByIdVM(long id);
}
