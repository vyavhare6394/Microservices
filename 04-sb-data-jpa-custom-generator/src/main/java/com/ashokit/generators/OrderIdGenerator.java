package com.ashokit.generators;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		Integer seqVal = null;
		String prefix = "OD";
		Connection con = null;
		try {
			con = session.connection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT ORDER_ID_SEQ.NEXTVAL FROM DUAL");
			if (rs.next()) {
				seqVal = rs.getInt(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return prefix + seqVal;
	}

}
