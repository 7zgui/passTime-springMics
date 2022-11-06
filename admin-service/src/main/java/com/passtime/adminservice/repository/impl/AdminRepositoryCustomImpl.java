package com.passtime.adminservice.repository.impl;

import com.passtime.adminservice.repository.AdminRepositoryCustom;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Mohamed ouokki on 10/27/22
 * @project eureka-server
 */
@Service
@Transactional
public class AdminRepositoryCustomImpl implements AdminRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;


}
