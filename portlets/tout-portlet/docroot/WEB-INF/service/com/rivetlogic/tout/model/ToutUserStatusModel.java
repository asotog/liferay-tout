/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.rivetlogic.tout.model;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ToutUserStatus service. Represents a row in the &quot;rivetlogic_tout_ToutUserStatus&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rivetlogic.tout.model.impl.ToutUserStatusModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rivetlogic.tout.model.impl.ToutUserStatusImpl}.
 * </p>
 *
 * @author ronny.vargas
 * @see ToutUserStatus
 * @see com.rivetlogic.tout.model.impl.ToutUserStatusImpl
 * @see com.rivetlogic.tout.model.impl.ToutUserStatusModelImpl
 * @generated
 */
public interface ToutUserStatusModel extends BaseModel<ToutUserStatus> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a Tout Portlet Status by User model instance should use the {@link ToutUserStatus} interface instead.
	 */

	/**
	 * Returns the primary key of this Tout Portlet Status by User.
	 *
	 * @return the primary key of this Tout Portlet Status by User
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this Tout Portlet Status by User.
	 *
	 * @param primaryKey the primary key of this Tout Portlet Status by User
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the user ID of this Tout Portlet Status by User.
	 *
	 * @return the user ID of this Tout Portlet Status by User
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this Tout Portlet Status by User.
	 *
	 * @param userId the user ID of this Tout Portlet Status by User
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this Tout Portlet Status by User.
	 *
	 * @return the user uuid of this Tout Portlet Status by User
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this Tout Portlet Status by User.
	 *
	 * @param userUuid the user uuid of this Tout Portlet Status by User
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the article ID of this Tout Portlet Status by User.
	 *
	 * @return the article ID of this Tout Portlet Status by User
	 */
	public long getArticleId();

	/**
	 * Sets the article ID of this Tout Portlet Status by User.
	 *
	 * @param articleId the article ID of this Tout Portlet Status by User
	 */
	public void setArticleId(long articleId);

	/**
	 * Returns the tout dismissed of this Tout Portlet Status by User.
	 *
	 * @return the tout dismissed of this Tout Portlet Status by User
	 */
	public boolean getToutDismissed();

	/**
	 * Returns <code>true</code> if this Tout Portlet Status by User is tout dismissed.
	 *
	 * @return <code>true</code> if this Tout Portlet Status by User is tout dismissed; <code>false</code> otherwise
	 */
	public boolean isToutDismissed();

	/**
	 * Sets whether this Tout Portlet Status by User is tout dismissed.
	 *
	 * @param toutDismissed the tout dismissed of this Tout Portlet Status by User
	 */
	public void setToutDismissed(boolean toutDismissed);

	/**
	 * Returns the tout seen of this Tout Portlet Status by User.
	 *
	 * @return the tout seen of this Tout Portlet Status by User
	 */
	public boolean getToutSeen();

	/**
	 * Returns <code>true</code> if this Tout Portlet Status by User is tout seen.
	 *
	 * @return <code>true</code> if this Tout Portlet Status by User is tout seen; <code>false</code> otherwise
	 */
	public boolean isToutSeen();

	/**
	 * Sets whether this Tout Portlet Status by User is tout seen.
	 *
	 * @param toutSeen the tout seen of this Tout Portlet Status by User
	 */
	public void setToutSeen(boolean toutSeen);

	/**
	 * Returns the reminder date of this Tout Portlet Status by User.
	 *
	 * @return the reminder date of this Tout Portlet Status by User
	 */
	public Date getReminderDate();

	/**
	 * Sets the reminder date of this Tout Portlet Status by User.
	 *
	 * @param reminderDate the reminder date of this Tout Portlet Status by User
	 */
	public void setReminderDate(Date reminderDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(ToutUserStatus toutUserStatus);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ToutUserStatus> toCacheModel();

	@Override
	public ToutUserStatus toEscapedModel();

	@Override
	public ToutUserStatus toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}