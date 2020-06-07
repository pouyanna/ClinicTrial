package com.project.clinicaltrials.repository;

import com.project.clinicaltrials.model.Studies;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


@Transactional
public interface StudiesRepository extends PagingAndSortingRepository<Studies, String> {

    List<Studies> findAllByStartDate(Date startDate);
    List<Studies> findByStartDateBetween(Date startDate, Date endDate);
   // List<Studies> findAllByStartDateLessThanEqual();

}
