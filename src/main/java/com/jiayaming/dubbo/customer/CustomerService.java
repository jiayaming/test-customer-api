package com.jiayaming.dubbo.customer;

import java.util.Map;

public interface CustomerService {
	public Map<String, Object> getCustomerInfoByMap(Map<String, Object> map) throws Exception;
	
	public Map<String, Object> validatePasswordByUserInfo(Map<String, Object> param) throws Exception;
	
	public Map<String, Object> getValidateCodePicture() throws Exception;
	
	public Map<String, Object> saveRegisterInfo(Map<String, Object> map) throws Exception;
	
	public int saveCustomerInfo(Map<String, Object> map) throws Exception;
}
