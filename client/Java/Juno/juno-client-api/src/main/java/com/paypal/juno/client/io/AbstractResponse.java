//  
//  Copyright 2023 PayPal Inc.
//  
//  Licensed to the Apache Software Foundation (ASF) under one or more
//  contributor license agreements.  See the NOTICE file distributed with
//  this work for additional information regarding copyright ownership.
//  The ASF licenses this file to You under the Apache License, Version 2.0
//  (the "License"); you may not use this file except in compliance with
//  the License.  You may obtain a copy of the License at
//  
//     http://www.apache.org/licenses/LICENSE-2.0
//  
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
//  
package com.paypal.juno.client.io;

import java.util.Arrays;

public abstract class AbstractResponse {

	private byte[] key;
	private OperationStatus status;

	/**
	 * Constructor needed for possible subclass serialization.
	 */
	protected AbstractResponse() {
	}

	protected AbstractResponse(byte[] key, OperationStatus status) {
//		String k = new String(key);
//		if (k == null || k.isEmpty()) {
//			throw new IllegalArgumentException("The Document key must not be null or empty.");
//		}
		this.key = key;
		this.status = status;
	}

	public byte[] key() {
		return key;
	}

	public OperationStatus status() {
		return status;
	}

	//public void reportException(IOException e);
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(key);
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractResponse other = (AbstractResponse) obj;
		if (!Arrays.equals(key, other.key))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AbstractRequest [key=" + Arrays.toString(key) + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}

}
