package com.xworkz.hibernate.tester;

import com.xworkz.hibernate.dao.TextTilesDAO;
import com.xworkz.hibernate.util.HibernateUtil;

public class criteriaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextTilesDAO dao = new TextTilesDAO();
		dao.getByUseCriteria();
		HibernateUtil.getFactory().close();

	}

}
