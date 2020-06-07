package com.project.clinicaltrials.repository;


import com.project.clinicaltrials.model.ResultGroups;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ResultGroupsRepository extends PagingAndSortingRepository<ResultGroups,Integer> {

}
