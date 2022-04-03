package br.com.classroom.utils;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.beanutils.BeanUtils;

public class BeanUtilities {
	public static void populateBean(Object formBean, HttpServletRequest request) {
		populateBean(formBean, request.getParameterMap());
	}

	public static void populateBean(Object bean, Map propertyMap) {
		try {
			BeanUtils.populate(bean, propertyMap);
		} catch (Exception e) {
		}
	}
}