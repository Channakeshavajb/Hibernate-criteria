package com.xworkz.hibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.xworkz.hibernate.dto.TextTilesDTO;
import com.xworkz.hibernate.util.HibernateUtil;

public class TextTilesDAO {

	public TextTilesDAO() {
		// TODO Auto-generated constructor stub
		System.out.println("created...........\t" + this.getClass().getSimpleName());
	}
public void save(TextTilesDTO  dto) {
	Session ssn = HibernateUtil.getFactory().openSession();
	Transaction tx= ssn.beginTransaction();
	try {

		ssn.save(dto);
		tx.commit();
	} 
	catch (Exception e) {
		// TODO: handle exception
		System.err.println("exception created :\t");
		e.printStackTrace();
	}

	finally {

		ssn.close();
	}
}
	
	public TextTilesDTO getByUseCriteria() {
		Session session = HibernateUtil.getFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			Criteria criteria = session.createCriteria(TextTilesDTO.class);
			criteria.add(Restrictions.eq("brand", "leeParis"));
			//criteria.add(Restrictions.or(Restrictions.between("id", 1, 2), Restrictions.between("id", 4, 6)));
			//criteria.add(Restrictions.like("brand", "lee%"))
			//.add(Restrictions.between("id", 3, 6));
			
			return (TextTilesDTO) criteria.uniqueResult();
			/*List<TextTilesDTO> list =(List<TextTilesDTO>) criteria.list();
			for (TextTilesDTO textTilesDTO : list) {
				System.out.println(textTilesDTO.getBrand());
			}*/

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("exception created :\t");
			e.printStackTrace();
		}

		finally {

			session.close();
		}
		return null;

	}
	public void getCriteriaProjection() {
		Session session = HibernateUtil.getFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			Criteria criteria = session.createCriteria(TextTilesDTO.class);
			//criteria.setProjection(Projections.property("id"));
			criteria.addOrder(Order.desc("id"));
			
			List<TextTilesDTO> list =(List<TextTilesDTO>) criteria.list();
			for (TextTilesDTO textTilesDTO : list) {
				System.out.println(textTilesDTO.getBrand());
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("exception created :\t");
			e.printStackTrace();
		}

		finally {

		}

	}
}
