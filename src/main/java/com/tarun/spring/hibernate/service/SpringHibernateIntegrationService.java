/**
 * 
 */
package com.tarun.spring.hibernate.service;

import java.util.List;

import com.tarun.spring.hibernate.model.ApplicationAttributes;

/**
 * The Interface SpringHibernateIntegrationService.
 *
 * @author taruntyagi
 */
public interface SpringHibernateIntegrationService {

	/**
	 * Save.
	 *
	 * @param appAttribute
	 *            the app attribute
	 */
	void save(ApplicationAttributes appAttribute);

	/**
	 * Gets the all app attributes.
	 *
	 * @return the all app attributes
	 */
	List<ApplicationAttributes> getAllAppAttributes();

	/**
	 * Update.
	 *
	 * @param appAttribute
	 *            the app attribute
	 */
	void update(ApplicationAttributes appAttribute);
}
