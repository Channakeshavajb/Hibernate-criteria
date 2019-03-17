package com.xworkz.hibernate.tester;

import com.xworkz.hibernate.dao.TextTilesDAO;
import com.xworkz.hibernate.dto.TextTilesDTO;
import com.xworkz.hibernate.util.HibernateUtil;

public class TextTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TextTilesDTO dto = new TextTilesDTO();
		dto.setBrand("jockey");
		dto.setName("bannians");
		dto.setQuantity(8);
		dto.setPrice(150);
		dto.setPayThroughCard(true);
		
		TextTilesDAO dao=new TextTilesDAO();
		dao.save(dto);
		HibernateUtil.getFactory().close();
	}

}
