/*******************************************************************************
 * Copyright (c) 1998, 2009 Oracle. All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0 
 * which accompanies this distribution. 
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * The API for this class and its comments are derived from the JPA 2.0 specification 
 * which is developed under the Java Community Process (JSR 317) and is copyright 
 * Sun Microsystems, Inc. 
 *
 * Contributors:
 *     dclarke - Java Persistence API 2.0 Public Draft
 *     			 Specification and licensing terms available from
 *     		   	 http://jcp.org/en/jsr/detail?id=317
 *
 * EARLY ACCESS - PUBLIC DRAFT
 * This is an implementation of an early-draft specification developed under the 
 * Java Community Process (JCP) and is made available for testing and evaluation 
 * purposes only. The code is not compatible with any specification of the JCP.
 ******************************************************************************/

package javax.persistence;


/**
 * Thrown by the persistence provider when a problem occurs.
 * All instances of <code>PersistenceException</code> except for instances of 
 * {@link NoResultException} and {@link NonUniqueResultException} will cause 
 * the current transaction, if one is active, to be marked for rollback.
 *
 * @since Java Persistence API 1.0
 */
public class PersistenceException extends RuntimeException {

        /** 
         * Constructs a new <code>PersistenceException</code> exception 
         * with <code>null</code> as its detail message.
         */
	public PersistenceException() {
		super();
	}

        /** 
         * Constructs a new <code>PersistenceException</code> exception 
         * with the specified detail message.
         * @param   message   the detail message.
         */
	public PersistenceException(String message) {
		super(message);
	}

        /** 
         * Constructs a new <code>PersistenceException</code> exception 
         * with the specified detail message and cause.
         * @param   message   the detail message.
         * @param   cause     the cause.
         */
	public PersistenceException(String message, Throwable cause) {
		super(message, cause);
	}
	
        /** 
         * Constructs a new <code>PersistenceException</code> exception 
         * with the specified cause.
         * @param   cause     the cause.
         */
	public PersistenceException(Throwable cause) {
		super(cause);
	}
}

