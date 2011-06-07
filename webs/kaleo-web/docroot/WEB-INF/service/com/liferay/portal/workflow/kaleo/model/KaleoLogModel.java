/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the KaleoLog service. Represents a row in the &quot;KaleoLog&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoLogModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoLogImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoLog
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoLogImpl
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoLogModelImpl
 * @generated
 */
public interface KaleoLogModel extends BaseModel<KaleoLog>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a kaleo log model instance should use the {@link KaleoLog} interface instead.
	 */

	/**
	 * Returns the primary key of this kaleo log.
	 *
	 * @return the primary key of this kaleo log
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this kaleo log.
	 *
	 * @param primaryKey the primary key of this kaleo log
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the kaleo log ID of this kaleo log.
	 *
	 * @return the kaleo log ID of this kaleo log
	 */
	public long getKaleoLogId();

	/**
	 * Sets the kaleo log ID of this kaleo log.
	 *
	 * @param kaleoLogId the kaleo log ID of this kaleo log
	 */
	public void setKaleoLogId(long kaleoLogId);

	/**
	 * Returns the group ID of this kaleo log.
	 *
	 * @return the group ID of this kaleo log
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this kaleo log.
	 *
	 * @param groupId the group ID of this kaleo log
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this kaleo log.
	 *
	 * @return the company ID of this kaleo log
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this kaleo log.
	 *
	 * @param companyId the company ID of this kaleo log
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this kaleo log.
	 *
	 * @return the user ID of this kaleo log
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this kaleo log.
	 *
	 * @param userId the user ID of this kaleo log
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this kaleo log.
	 *
	 * @return the user uuid of this kaleo log
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this kaleo log.
	 *
	 * @param userUuid the user uuid of this kaleo log
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this kaleo log.
	 *
	 * @return the user name of this kaleo log
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this kaleo log.
	 *
	 * @param userName the user name of this kaleo log
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this kaleo log.
	 *
	 * @return the create date of this kaleo log
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this kaleo log.
	 *
	 * @param createDate the create date of this kaleo log
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this kaleo log.
	 *
	 * @return the modified date of this kaleo log
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this kaleo log.
	 *
	 * @param modifiedDate the modified date of this kaleo log
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the kaleo definition ID of this kaleo log.
	 *
	 * @return the kaleo definition ID of this kaleo log
	 */
	public long getKaleoDefinitionId();

	/**
	 * Sets the kaleo definition ID of this kaleo log.
	 *
	 * @param kaleoDefinitionId the kaleo definition ID of this kaleo log
	 */
	public void setKaleoDefinitionId(long kaleoDefinitionId);

	/**
	 * Returns the kaleo instance ID of this kaleo log.
	 *
	 * @return the kaleo instance ID of this kaleo log
	 */
	public long getKaleoInstanceId();

	/**
	 * Sets the kaleo instance ID of this kaleo log.
	 *
	 * @param kaleoInstanceId the kaleo instance ID of this kaleo log
	 */
	public void setKaleoInstanceId(long kaleoInstanceId);

	/**
	 * Returns the kaleo instance token ID of this kaleo log.
	 *
	 * @return the kaleo instance token ID of this kaleo log
	 */
	public long getKaleoInstanceTokenId();

	/**
	 * Sets the kaleo instance token ID of this kaleo log.
	 *
	 * @param kaleoInstanceTokenId the kaleo instance token ID of this kaleo log
	 */
	public void setKaleoInstanceTokenId(long kaleoInstanceTokenId);

	/**
	 * Returns the kaleo task instance token ID of this kaleo log.
	 *
	 * @return the kaleo task instance token ID of this kaleo log
	 */
	public long getKaleoTaskInstanceTokenId();

	/**
	 * Sets the kaleo task instance token ID of this kaleo log.
	 *
	 * @param kaleoTaskInstanceTokenId the kaleo task instance token ID of this kaleo log
	 */
	public void setKaleoTaskInstanceTokenId(long kaleoTaskInstanceTokenId);

	/**
	 * Returns the kaleo node ID of this kaleo log.
	 *
	 * @return the kaleo node ID of this kaleo log
	 */
	public long getKaleoNodeId();

	/**
	 * Sets the kaleo node ID of this kaleo log.
	 *
	 * @param kaleoNodeId the kaleo node ID of this kaleo log
	 */
	public void setKaleoNodeId(long kaleoNodeId);

	/**
	 * Returns the kaleo node name of this kaleo log.
	 *
	 * @return the kaleo node name of this kaleo log
	 */
	@AutoEscape
	public String getKaleoNodeName();

	/**
	 * Sets the kaleo node name of this kaleo log.
	 *
	 * @param kaleoNodeName the kaleo node name of this kaleo log
	 */
	public void setKaleoNodeName(String kaleoNodeName);

	/**
	 * Returns the terminal kaleo node of this kaleo log.
	 *
	 * @return the terminal kaleo node of this kaleo log
	 */
	public boolean getTerminalKaleoNode();

	/**
	 * Determines if this kaleo log is terminal kaleo node.
	 *
	 * @return <code>true</code> if this kaleo log is terminal kaleo node; <code>false</code> otherwise
	 */
	public boolean isTerminalKaleoNode();

	/**
	 * Sets whether this kaleo log is terminal kaleo node.
	 *
	 * @param terminalKaleoNode the terminal kaleo node of this kaleo log
	 */
	public void setTerminalKaleoNode(boolean terminalKaleoNode);

	/**
	 * Returns the kaleo action ID of this kaleo log.
	 *
	 * @return the kaleo action ID of this kaleo log
	 */
	public long getKaleoActionId();

	/**
	 * Sets the kaleo action ID of this kaleo log.
	 *
	 * @param kaleoActionId the kaleo action ID of this kaleo log
	 */
	public void setKaleoActionId(long kaleoActionId);

	/**
	 * Returns the kaleo action name of this kaleo log.
	 *
	 * @return the kaleo action name of this kaleo log
	 */
	@AutoEscape
	public String getKaleoActionName();

	/**
	 * Sets the kaleo action name of this kaleo log.
	 *
	 * @param kaleoActionName the kaleo action name of this kaleo log
	 */
	public void setKaleoActionName(String kaleoActionName);

	/**
	 * Returns the kaleo action description of this kaleo log.
	 *
	 * @return the kaleo action description of this kaleo log
	 */
	@AutoEscape
	public String getKaleoActionDescription();

	/**
	 * Sets the kaleo action description of this kaleo log.
	 *
	 * @param kaleoActionDescription the kaleo action description of this kaleo log
	 */
	public void setKaleoActionDescription(String kaleoActionDescription);

	/**
	 * Returns the previous kaleo node ID of this kaleo log.
	 *
	 * @return the previous kaleo node ID of this kaleo log
	 */
	public long getPreviousKaleoNodeId();

	/**
	 * Sets the previous kaleo node ID of this kaleo log.
	 *
	 * @param previousKaleoNodeId the previous kaleo node ID of this kaleo log
	 */
	public void setPreviousKaleoNodeId(long previousKaleoNodeId);

	/**
	 * Returns the previous kaleo node name of this kaleo log.
	 *
	 * @return the previous kaleo node name of this kaleo log
	 */
	@AutoEscape
	public String getPreviousKaleoNodeName();

	/**
	 * Sets the previous kaleo node name of this kaleo log.
	 *
	 * @param previousKaleoNodeName the previous kaleo node name of this kaleo log
	 */
	public void setPreviousKaleoNodeName(String previousKaleoNodeName);

	/**
	 * Returns the previous assignee class name of this kaleo log.
	 *
	 * @return the previous assignee class name of this kaleo log
	 */
	@AutoEscape
	public String getPreviousAssigneeClassName();

	/**
	 * Sets the previous assignee class name of this kaleo log.
	 *
	 * @param previousAssigneeClassName the previous assignee class name of this kaleo log
	 */
	public void setPreviousAssigneeClassName(String previousAssigneeClassName);

	/**
	 * Returns the previous assignee class p k of this kaleo log.
	 *
	 * @return the previous assignee class p k of this kaleo log
	 */
	public long getPreviousAssigneeClassPK();

	/**
	 * Sets the previous assignee class p k of this kaleo log.
	 *
	 * @param previousAssigneeClassPK the previous assignee class p k of this kaleo log
	 */
	public void setPreviousAssigneeClassPK(long previousAssigneeClassPK);

	/**
	 * Returns the current assignee class name of this kaleo log.
	 *
	 * @return the current assignee class name of this kaleo log
	 */
	@AutoEscape
	public String getCurrentAssigneeClassName();

	/**
	 * Sets the current assignee class name of this kaleo log.
	 *
	 * @param currentAssigneeClassName the current assignee class name of this kaleo log
	 */
	public void setCurrentAssigneeClassName(String currentAssigneeClassName);

	/**
	 * Returns the current assignee class p k of this kaleo log.
	 *
	 * @return the current assignee class p k of this kaleo log
	 */
	public long getCurrentAssigneeClassPK();

	/**
	 * Sets the current assignee class p k of this kaleo log.
	 *
	 * @param currentAssigneeClassPK the current assignee class p k of this kaleo log
	 */
	public void setCurrentAssigneeClassPK(long currentAssigneeClassPK);

	/**
	 * Returns the type of this kaleo log.
	 *
	 * @return the type of this kaleo log
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this kaleo log.
	 *
	 * @param type the type of this kaleo log
	 */
	public void setType(String type);

	/**
	 * Returns the comment of this kaleo log.
	 *
	 * @return the comment of this kaleo log
	 */
	@AutoEscape
	public String getComment();

	/**
	 * Sets the comment of this kaleo log.
	 *
	 * @param comment the comment of this kaleo log
	 */
	public void setComment(String comment);

	/**
	 * Returns the start date of this kaleo log.
	 *
	 * @return the start date of this kaleo log
	 */
	public Date getStartDate();

	/**
	 * Sets the start date of this kaleo log.
	 *
	 * @param startDate the start date of this kaleo log
	 */
	public void setStartDate(Date startDate);

	/**
	 * Returns the end date of this kaleo log.
	 *
	 * @return the end date of this kaleo log
	 */
	public Date getEndDate();

	/**
	 * Sets the end date of this kaleo log.
	 *
	 * @param endDate the end date of this kaleo log
	 */
	public void setEndDate(Date endDate);

	/**
	 * Returns the duration of this kaleo log.
	 *
	 * @return the duration of this kaleo log
	 */
	public long getDuration();

	/**
	 * Sets the duration of this kaleo log.
	 *
	 * @param duration the duration of this kaleo log
	 */
	public void setDuration(long duration);

	/**
	 * Returns the workflow context of this kaleo log.
	 *
	 * @return the workflow context of this kaleo log
	 */
	@AutoEscape
	public String getWorkflowContext();

	/**
	 * Sets the workflow context of this kaleo log.
	 *
	 * @param workflowContext the workflow context of this kaleo log
	 */
	public void setWorkflowContext(String workflowContext);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(KaleoLog kaleoLog);

	public int hashCode();

	public KaleoLog toEscapedModel();

	public String toString();

	public String toXmlString();
}