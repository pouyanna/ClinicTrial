package com.project.clinicaltrials.repository;

import com.project.clinicaltrials.model.Conditions;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ConditionsRepository extends PagingAndSortingRepository<Conditions, Integer> {


}
