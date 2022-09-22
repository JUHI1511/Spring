package com.controller;

import java.util.List;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Coder;
import com.service.CoderService;

@RestController
@RequestMapping("api")
public class CoderController {
   Log logger=LogFactory.getLog(CoderController.class);
	@Autowired
	CoderService coderservice;
	
	
	@GetMapping("/getCoder/{cid}")   // it can be request mapping
	public Coder getCoder(@PathVariable int cid) throws Throwable{
		Coder c1=coderservice.getCoderById(cid);
		return c1;
	}
	
	
	@GetMapping("/getCoders")   // it can be request mapping
	public List<Coder> getCoders() {
		List<Coder>lc=coderservice.getCoders();
		logger.info("Get Coders successfully");
		return lc;		
	}
	
	@PostMapping("addcoders")
	public List<Coder> addCoders(@RequestBody List<Coder> lc)
	{
		List<Coder> lc1=coderservice.addCoders(lc);
		return lc1;
	}
	
	@PostMapping("addcoder")
	public Coder addCoders(@RequestBody Coder c)
	{
		Coder c1=coderservice.addCoder(c);
		return c1;
	}
	
	@PutMapping("/updatecoder") 
	public Coder updateCoder(@RequestBody  Coder c) throws Throwable
	{
		Coder c1=coderservice.updateCoder(c);
		return c1;
	}
	
	@DeleteMapping("/deletecoder")
	public ResponseEntity<String> deleteCoder(@RequestBody  Coder c)
	{
		coderservice.deleteCoder(c);
	    ResponseEntity<String> re=new ResponseEntity<String>("Deleted",HttpStatus.OK);
	    return re;
	}
	
	@DeleteMapping("/deletecoderById/{cid}")
	public String deleteCoderById(@PathVariable  int cid)
	{
	   coderservice.deleteCoderById(cid);
		return "Deleted";
	}
	
	
	@GetMapping("getcoderbyname/{cname}")
	public Coder getCoderByCname(@PathVariable String cname) {
		Coder c2=coderservice.getCoderByCname(cname);
		return c2;
	}
	
	@GetMapping("getcoderbytech/{tech}")
	public List<Coder> getCoderByTechSorted(@PathVariable String tech){
		List<Coder>lc=coderservice.getCoderByTechSorted(tech);
	return lc;
	}

}
	
	
	

