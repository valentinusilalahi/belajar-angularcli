/**
 * 
 */
package com.silalahi.valentinus.angularspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.silalahi.valentinus.angularspring.entity.Candidate;

/**
 * @author valentinusilalahi
 *
 */
public interface CandidateRepo extends CrudRepository<Candidate, String> {
	@Query("SELECT s FROM Candidate s")
	public List<Candidate> findAllCandidate();

	@Query("SELECT s FROM Candidate s WHERE LOWER(s.fullName) LIKE LOWER(:name)")
	public List<Candidate> findByName(@Param("name") String name);
}
