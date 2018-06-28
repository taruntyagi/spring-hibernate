package com.tarun.spring.hibernate;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tarun.spring.hibernate.config.ApplicationConfiguration;
import com.tarun.spring.hibernate.model.ApplicationAttributes;
import com.tarun.spring.hibernate.service.SpringHibernateIntegrationService;

/**
 * Unit test for simple App.
 */
public class AppTest {

	/** The context. */
	private ApplicationContext context = null;

	/** The service. */
	private SpringHibernateIntegrationService service = null;

	/**
	 * Before test.
	 */
	@Before
	public void beforeTest() {
		context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		service = (SpringHibernateIntegrationService) context.getBean("springHibernateIntegrationService");
	}

	/**
	 * Rigourous Test :-).
	 */
	public void testSave() {
		ApplicationAttributes appAttr = new ApplicationAttributes();
		//TODO: Populate object
		service.save(appAttr);
	}

	/**
	 * Test save update.
	 */
	public void testSaveUpdate() {
		ApplicationAttributes appAttr = new ApplicationAttributes();
		//TODO: Populate object
		service.save(appAttr);
		//TODO: Update object
		service.update(appAttr);
	}

	/**
	 * Test read.
	 */
	@Test
	public void testRead() {
		List<ApplicationAttributes> attributes = service.getAllAppAttributes();
		System.out.println(attributes.toString());
		Assert.assertNotNull(attributes);
	}
}
