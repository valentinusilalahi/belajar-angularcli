/**
 * 
 */
package com.silalahi.valentinus.angularspring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silalahi.valentinus.angularspring.entity.Candidate;
import com.silalahi.valentinus.angularspring.repository.CandidateRepo;

/**
 * @author valentinusilalahi
 *
 */

@Service("candidateService")
@Transactional
public class CandidateService {
	@Autowired
	private CandidateRepo repo;
	
	public Candidate insert(Candidate candidate){
		return repo.save(candidate);
	}
	
	public Candidate findById(String id){
		return repo.findOne(id);
	}
	
	public List<Candidate> findAll(){
		return repo.findAllCandidate();
	}
	
	public List<Candidate> findByName(String name){
		return repo.findByName("%" + name + "%");
	}
	
	public boolean delete(String id){
		repo.delete(id);
		return true;
	}
}
