package com.example.ec.explorecali.repo;

import com.example.ec.explorecali.domain.TourRating;
import com.example.ec.explorecali.domain.TourRatingPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(exported = false)
public interface TourRatingRepository extends CrudRepository<TourRating, TourRatingPK> {

    List<TourRating> findByTourId(Integer tourId);
    Optional<TourRating> findByTourIdAndPkCustomerId(Integer tourId, Integer customerId);
}
