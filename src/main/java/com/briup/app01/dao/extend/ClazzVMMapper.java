package com.briup.app01.dao.extend;

import java.util.List;

import com.briup.app01.VM.ClazzVM;




public interface ClazzVMMapper {
	List<ClazzVM> findAllClazzVM();
	ClazzVM findByIdVM(long id);
	
}
