/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c) 2005, 2006 The Sakai Foundation.
 * 
 * Licensed under the Educational Community License, Version 1.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 *      http://www.opensource.org/licenses/ecl1.php
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.webapp.cover;

import org.sakaiproject.component.cover.ComponentManager;

/**
 * <p>
 * ActiveToolManager is a static Cover for the {@link org.sakaiproject.webapp.api.ActiveToolManager ActiveToolManager}; see that interface for usage details.
 * </p>
 */
public class ActiveToolManager
{
	/** Possibly cached component instance. */
	private static org.sakaiproject.webapp.api.ActiveToolManager m_instance = null;

	/**
	 * Access the component instance: special cover only method.
	 * 
	 * @return the component instance.
	 */
	public static org.sakaiproject.webapp.api.ActiveToolManager getInstance()
	{
		if (ComponentManager.CACHE_COMPONENTS)
		{
			if (m_instance == null)
				m_instance = (org.sakaiproject.webapp.api.ActiveToolManager) ComponentManager
						.get(org.sakaiproject.webapp.api.ActiveToolManager.class);
			return m_instance;
		}
		else
		{
			return (org.sakaiproject.webapp.api.ActiveToolManager) ComponentManager
					.get(org.sakaiproject.webapp.api.ActiveToolManager.class);
		}
	}

	public static void register(org.sakaiproject.webapp.api.Tool param0)
	{
		org.sakaiproject.webapp.api.ActiveToolManager manager = getInstance();
		if (manager == null) return;

		manager.register(param0);
	}

	public static void register(org.w3c.dom.Document param0)
	{
		org.sakaiproject.webapp.api.ActiveToolManager manager = getInstance();
		if (manager == null) return;

		manager.register(param0);
	}

	public static void register(java.io.InputStream param0)
	{
		org.sakaiproject.webapp.api.ActiveToolManager manager = getInstance();
		if (manager == null) return;

		manager.register(param0);
	}

	public static void register(java.io.File param0)
	{
		org.sakaiproject.webapp.api.ActiveToolManager manager = getInstance();
		if (manager == null) return;

		manager.register(param0);
	}

	public static org.sakaiproject.webapp.api.Tool getTool(java.lang.String param0)
	{
		org.sakaiproject.webapp.api.ActiveToolManager manager = getInstance();
		if (manager == null) return null;

		return manager.getTool(param0);
	}

	public static java.util.Set findTools(java.util.Set param0, java.util.Set param1)
	{
		org.sakaiproject.webapp.api.ActiveToolManager manager = getInstance();
		if (manager == null) return null;

		return manager.findTools(param0, param1);
	}

	public static void register(org.sakaiproject.webapp.api.Tool param0, javax.servlet.ServletContext param1)
	{
		org.sakaiproject.webapp.api.ActiveToolManager manager = getInstance();
		if (manager == null) return;

		manager.register(param0, param1);
	}

	public static void register(org.w3c.dom.Document param0, javax.servlet.ServletContext param1)
	{
		org.sakaiproject.webapp.api.ActiveToolManager manager = getInstance();
		if (manager == null) return;

		manager.register(param0, param1);
	}

	public static void register(java.io.InputStream param0, javax.servlet.ServletContext param1)
	{
		org.sakaiproject.webapp.api.ActiveToolManager manager = getInstance();
		if (manager == null) return;

		manager.register(param0, param1);
	}

	public static void register(java.io.File param0, javax.servlet.ServletContext param1)
	{
		org.sakaiproject.webapp.api.ActiveToolManager manager = getInstance();
		if (manager == null) return;

		manager.register(param0, param1);
	}

	public static org.sakaiproject.webapp.api.ActiveTool getActiveTool(java.lang.String param0)
	{
		org.sakaiproject.webapp.api.ActiveToolManager manager = getInstance();
		if (manager == null) return null;

		return manager.getActiveTool(param0);
	}
}
