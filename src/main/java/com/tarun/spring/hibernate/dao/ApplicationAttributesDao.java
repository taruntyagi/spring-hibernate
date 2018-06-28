/**
 * 
 */
package com.tarun.spring.hibernate.dao;

import java.util.List;

import com.tarun.spring.hibernate.model.ApplicationAttributes;

/**
 * The Interface ApplicationAttributesDao.
 *
 * @author taruntyagi
 */
public interface ApplicationAttributesDao {

	/**
	 * Save.
	 *
	 * @param appAttr
	 *            the app attr
	 */
	void save(ApplicationAttributes appAttr);

	/**
	 * Gets the all app attributes.
	 *
	 * @return the all app attributes
	 */
	List<ApplicationAttributes> getAllAppAttributes();

	/**
	 * Update.
	 *
	 * @param appAttr
	 *            the app attr
	 */
	void update(ApplicationAttributes appAttr);

}
