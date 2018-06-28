/**
 * 
 */
package com.tarun.spring.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tarun.spring.hibernate.dao.ApplicationAttributesDao;
import com.tarun.spring.hibernate.model.ApplicationAttributes;

/**
 * The Class SpringHibernateIntegrationServiceImpl.
 *
 * @author taruntyagi
 */
@Transactional
@Service("springHibernateIntegrationService")
public class SpringHibernateIntegrationServiceImpl implements SpringHibernateIntegrationService {
	
	@Autowired
	ApplicationAttributesDao applicationAttributesDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarun.spring.hibernate.service.SpringHibernateIntegrationService#save
	 * (com.tarun.spring.hibernate.model.ApplicationAttributes)
	 */
	public void save(ApplicationAttributes appAttribute) {
		applicationAttributesDao.save(appAttribute);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarun.spring.hibernate.service.SpringHibernateIntegrationService#
	 * getAllAppAttributes()
	 */
	public List<ApplicationAttributes> getAllAppAttributes() {
		return applicationAttributesDao.getAllAppAttributes();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarun.spring.hibernate.service.SpringHibernateIntegrationService#
	 * update(com.tarun.spring.hibernate.model.ApplicationAttributes)
	 */
	public void update(ApplicationAttributes appAttribute) {
		applicationAttributesDao.update(appAttribute);
	}

}
