package com.bullx.database;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.dom.DOMDocument;
import org.dom4j.dom.DOMElement;
import org.hibernate.Query;

import com.bullx.core.DataXML;


public class DatabaseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ConfigCacDAO cacDAO = new ConfigCacDAO();
		List<ConfigCac> list = cacDAO.findAll();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getCacId());
		}
		
		ConfigIedDAO iedDAO = new ConfigIedDAO();
		List<ConfigIed> iList = iedDAO.findAll();
		for (int i = 0; i < iList.size(); i++) {
			ConfigIed ied = iList.get(i);
			System.out.println(ied.getIedName() + " " + ied.getIedNameCn() + " " + ied.getConfigCac().getCacId());
		}
		*/
		/*DataMmxnDAO mmDAO = new DataMmxnDAO();
		Query qb = mmDAO.getSession().createQuery("from DataMmxn as inst where inst.lnInst=? order by inst.dataTime desc");
		qb.setInteger(0, 1);
		qb.setFirstResult(0);
		qb.setMaxResults(1);
		List<DataMmxn> ll = qb.list();
		if (ll.size() > 0) {
			System.out.println(ll.get(0).getDataTime().toString());
		} else {
			System.out.println("Syntax error!");
		}*/
		
		DataXML dataXML = new DataXML();
		System.out.println(dataXML.get());
	}

}
