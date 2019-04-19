package com.blockstorage.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;




@Repository
public class CommonDAO extends AbstractDAO {

	 public Integer create(final Object command) throws Exception
	  {
		  	final Session session = this.getSessionFactory().openSession();
			Transaction sessionTransaction = session.getTransaction();
			Integer id =null;
		  try {
			  sessionTransaction.begin();
			  id=(Integer) session.save(command);
	    	sessionTransaction.commit();
	    	session.close();
	    } catch (Exception e) {
	    	System.out.println("CommonDAO create failed");
	    	sessionTransaction.rollback();
	    	session.close();
	      e.printStackTrace();
	    }
		  return id;

	  }
	 
	 public Object findByCriteriaUniqueResultWithCritera(final Object object,
		      final Order order, final Criterion... criterions) throws Exception
		  {

		 	final Session session = this.getSessionFactory().openSession();
		 	final Criteria crit = session.createCriteria(object.getClass());

		    try {
		    	
		      for(final Criterion c : criterions) {
		        crit.add(c);
		      }
		      crit.setMaxResults(1);
		      crit.setFirstResult(0);
		      if (order != null) {
		        crit.addOrder(order);
		      }
		      final Object retObj = crit.uniqueResult();

		      return retObj;
		    } catch (final Exception e) {
		      System.out.println("find by criteria unique result with criteria failed");
		      e.printStackTrace();
		    }
		    finally{
		    	session.close();
		    }

		    return null;

		  }
	 
	 public Object findByCriteria(final Object object,
		      final Order order, final Criterion... criterions) throws Exception
		  {

		 	final Session session = this.getSessionFactory().openSession();
		 	final Criteria crit = session.createCriteria(object.getClass());

		    try {
		    	
		      for(final Criterion c : criterions) {
		        crit.add(c);
		      }
		      
		      if (order != null) {
		        crit.addOrder(order);
		      }
		      final Object retObj = crit.list();

		      return retObj;
		    } catch (final Exception e) {
		      System.out.println("find by criteria unique result with criteria failed");
		      e.printStackTrace();
		    }
		    finally{
		    	session.close();
		    }

		    return null;

		  }
	 
	 public void delete(final Object entityObj)
	  {
		 final Session session = this.getSessionFactory().openSession();
		 Transaction sessionTransaction = session.getTransaction();
		    if (!sessionTransaction.isActive()) {
		      session.beginTransaction();
		    }
		    try {
		    	session.delete(entityObj);
		    	sessionTransaction.commit();
		    } catch (Exception e) {
		      System.out.println("CommonDAO Delete failed");
		      sessionTransaction.rollback();
		      e.printStackTrace();
		    }
		    finally{
		    	session.close();
		    }
		 
	  }
	  
	  public void merge(final Object command) throws Exception
	  {
		  final Session session = this.getSessionFactory().openSession();  
		Transaction sessionTransaction = session.getTransaction();
	    if (!sessionTransaction.isActive()) {
	      session.beginTransaction();
	    }
	    try {
	      session.merge(command);
	      sessionTransaction.commit();
	    } catch (Exception e) {
	      System.out.println("CommonDAO merge failed");
	      sessionTransaction.rollback();
	      e.printStackTrace();
	    }
	    finally{
	    	session.close();
	    }
	  }
	  
	  public void saveOrUpdate(final Object command) throws Exception
	  {

		  final Session session = this.getSessionFactory().openSession();
		 Transaction sessionTransaction = session.getTransaction();
		 if (!sessionTransaction.isActive()) {
	      session.beginTransaction();
	    }

	    try {
	      session.saveOrUpdate(command);
	      sessionTransaction.commit();
	    } catch (Exception e) {
	    	sessionTransaction.rollback();
	      System.out.println("CommonDAO saveOrUpdate failed");
	      e.printStackTrace();
	    }
	    finally{
	    	session.close();
	    }
	  }
	  
	  @SuppressWarnings("rawtypes")
	public List getObjectList(final Object object) 
		{

		  final Session session = this.getSessionFactory().openSession();
			 Transaction sessionTransaction = session.getTransaction();
			 if (!sessionTransaction.isActive()) {
		      session.beginTransaction();
		    }
				List list = null;
		    try {
		    	final Criteria crit = session.createCriteria(object.getClass());
				list = crit.list();
		      sessionTransaction.commit();
		    } catch (Exception e) {
		    	sessionTransaction.rollback();
		      System.out.println("CommonDAO saveOrUpdate failed");
		      e.printStackTrace();
		    }
		    finally{
		    	session.close();
		    }
		    return list;
			
		}
	  
	
	  
	 
	  	  
		  
	 
	  
}
