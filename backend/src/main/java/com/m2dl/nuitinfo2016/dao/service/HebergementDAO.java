package com.m2dl.nuitinfo2016.dao.service;

import com.m2dl.nuitinfo2016.model.service.Hebergement;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by walid on 02/12/2016.
 */
@Repository
public interface HebergementDAO extends PagingAndSortingRepository<Hebergement, Long> {
}
