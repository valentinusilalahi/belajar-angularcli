/**
 * 
 */
package com.silalahi.valentinus.angularspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.silalahi.valentinus.angularspring.dto.SearchData;
import com.silalahi.valentinus.angularspring.entity.Candidate;
import com.silalahi.valentinus.angularspring.service.CandidateService;

/**
 * @author valentinusilalahi
 *
 */

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {
	@Autowired
	private CandidateService service;
	
	@RequestMapping(method = RequestMethod.POST)
	public Candidate insert(@RequestBody Candidate candidate){
		return service.insert(candidate);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
	public Candidate findById(@PathVariable String id){
		return service.findById(id);
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value="/{id}")
	public boolean deleteById(@PathVariable String id){
		return service.delete(id);
	}
	
	@RequestMapping(method= RequestMethod.GET)
	public List<Candidate> findAll(){
		return service.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/search")
	public List<Candidate> findByName(@RequestBody SearchData searchData){
		return service.findByName(searchData.getSearchKey());
	}
}
