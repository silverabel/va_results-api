package com.silverabel.resultsAPI.voteCount;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteCountRepository extends CrudRepository<VoteCount, Integer> {
}
