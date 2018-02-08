package com.jiayaming.dubbo.customer;

import java.util.Map;

public interface CustomerService {
	public Map<String, Object> getCustomerInfoByMap(Map<String, Object> map) throws Exception;
}
