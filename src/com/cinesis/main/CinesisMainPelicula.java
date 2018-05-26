package com.cinesis.main;



import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.cinesis.controller.Controller;
import com.cinesis.dao.PeliculaDao;
import com.cinesis.model.Pelicula;

public class Cinesis {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	
	public static void main( String[] args)
	{
		Timestamp ahora = new Timestamp(System.currentTimeMillis());
		
		String estreno  = ahora.toString();
	  
		Controller cont = new Controller();
		
		List<String> list = new ArrayList();
		
		list.add("ContPeli");
		
		list.add("Vengadores");
		
		list.add("100");
		
		list.add("l");
		
		list.add("l");
		
		list.add("Tios en mallas");
		
		list.add("10");
		
		list.add("ACCION");
		
		list.add("españa");
		
		list.add(estreno);
		
		list.add("l");
		
		
		
		cont.run(list);
		
		
	}
}
