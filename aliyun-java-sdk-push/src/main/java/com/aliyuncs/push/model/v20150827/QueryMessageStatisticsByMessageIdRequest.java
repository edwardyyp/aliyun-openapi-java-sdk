/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.push.model.v20150827;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryMessageStatisticsByMessageIdRequest extends RpcAcsRequest<QueryMessageStatisticsByMessageIdResponse> {
	
	public QueryMessageStatisticsByMessageIdRequest() {
		super("Push", "2015-08-27", "QueryMessageStatisticsByMessageId");
	}

	private Long appKey;

	private Long messageId;

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		putQueryParameter("AppKey", appKey);
	}

	public Long getMessageId() {
		return this.messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
		putQueryParameter("MessageId", messageId);
	}

	@Override
	public Class<QueryMessageStatisticsByMessageIdResponse> getResponseClass() {
		return QueryMessageStatisticsByMessageIdResponse.class;
	}

}