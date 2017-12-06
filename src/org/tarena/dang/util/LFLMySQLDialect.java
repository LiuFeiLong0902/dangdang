package org.tarena.dang.util;

import java.sql.Types;

import org.hibernate.Hibernate;
import org.hibernate.dialect.MySQLDialect;

public class LFLMySQLDialect extends MySQLDialect{

	public LFLMySQLDialect() {
		super();
		registerHibernateType(Types.DECIMAL,Hibernate.BIG_DECIMAL.getName());
		registerHibernateType(-1,Hibernate.STRING.getName());
	}
    
}
