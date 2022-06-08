package com.app;

import com.app.email.Email;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class MainApp {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("beans.xml");

		BeanFactory bean = new XmlBeanFactory(resource);

		Email email = (Email) bean.getBean("email");

		email.sendEmail();

	}

}
