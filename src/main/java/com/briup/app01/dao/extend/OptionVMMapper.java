package com.briup.app01.dao.extend;

import java.util.List;

import com.briup.app01.VM.OptionVM;


public interface OptionVMMapper {

	List<OptionVM> findAllOptionVM();
	OptionVM findByIdVM(long id);
}
