package com.saraya.service;

import java.util.ArrayList;
import java.util.List;

import com.saraya.model.Formation;

public class FormationService {
	private static List<Formation> formations = new ArrayList<>();
	
	static {
		formations.add(new Formation("HTML"));
		formations.add(new Formation("CSS"));
		formations.add(new Formation("JavaScript"));
		formations.add(new Formation("Java"));
		formations.add(new Formation("Bootstrap"));
		formations.add(new Formation("Angular"));
		formations.add(new Formation("React"));
	}
	
	public List<Formation> getAllFormation(){
		return formations;
	}

	public void addFormation(Formation formation) {
		formations.add(formation);
		
	}
	
	public void deleteFormation(Formation formation) {
		formations.remove(formation);
	}
}
