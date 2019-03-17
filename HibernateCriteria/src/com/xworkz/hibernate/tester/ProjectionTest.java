package com.xworkz.hibernate.tester;

import com.xworkz.hibernate.dao.TextTilesDAO;
import com.xworkz.hibernate.util.HibernateUtil;

public class ProjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		TextTilesDAO dao = new TextTilesDAO();
		dao.getCriteriaProjection();
		HibernateUtil.getFactory().close();
	}

}
