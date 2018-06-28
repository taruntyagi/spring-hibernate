/**
 * 
 */
package com.tarun.spring.hibernate.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tarun.spring.hibernate.model.ApplicationAttributes;

/**
 * The Class ApplicationAttributesDaoImpl.
 *
 * @author taruntyagi
 */
@Repository("applicationAttributesDao")
public class ApplicationAttributesDaoImpl extends AbstractDao implements ApplicationAttributesDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarun.spring.hibernate.dao.ApplicationAttributesDao#save(com.tarun.
	 * spring.hibernate.model.ApplicationAttributes)
	 */
	public void save(ApplicationAttributes appAttr) {
		getSession().save(appAttr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tarun.spring.hibernate.dao.ApplicationAttributesDao#
	 * getAllAppAttributes()
	 */
	@SuppressWarnings("unchecked")
	public List<ApplicationAttributes> getAllAppAttributes() {
		return getSession().createCriteria(ApplicationAttributes.class).list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarun.spring.hibernate.dao.ApplicationAttributesDao#update(com.tarun.
	 * spring.hibernate.model.ApplicationAttributes)
	 */
	public void update(ApplicationAttributes appAttr) {
		getSession().update(appAttr);
	}

}
