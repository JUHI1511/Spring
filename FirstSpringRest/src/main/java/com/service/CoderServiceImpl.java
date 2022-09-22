/*package com.service;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Coder;
import com.repository.CoderRepository;
@Service
public class CoderServiceImpl implements CoderService {
     @Autowired
     CoderRepository repo;
	@Override
	public Coder getCoder(int cid) {
		Optional c=repo.findById(cid);
		
		Coder c1=(Coder) c.get();
		return c1;
	}

	@Override
	public List<Coder> getCoders() {
		List<Coder>lc=repo.findAll();
		return lc;
	}

	
	@Override
	public Coder addCoder(Coder c) {
		repo.save(c);
		return c;
	}

	@Override
	public List<Coder> addCoders(List<Coder> lc) {
		repo.saveAll(lc);
		return lc;
	}

	@Override
	public Coder updateCoder(Coder c) {
		int id=c.getCid();
		Coder c1=repo.findById(id).orElseThrow();
		c1.setCname(c.getCname());
		c1.setTech(c.getTech());
		repo.save(c1);
		return c1;
	}

	@Override
	public String deleteCoder(Coder c) {
		repo.delete(c);
		return "Deleted";
	}

	@Override
	public String deleteCoderById(int cid) {
		repo.deleteById(cid);
		return "Deleted";
	}



}
*/
