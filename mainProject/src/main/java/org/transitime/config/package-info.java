/**
 * 
 * This file is part of Transitime.org
 * 
 * Transitime.org is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License (GPL) as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * Transitime.org is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Transitime.org .  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * Test
 * <p>
 * The classes used as part of specifying the configuration parameters for an 
 * application. These parameters can be set either through command line options
 * or through a configuration file. Default values are specified when each 
 * parameter is declared. 
 * <p>
 * Parameters are declared in a Java class as static members. An example:
 * <p>
 * <code>
 * 	public static String getProjectId() {
 *		return projectId.getValue();
 *	}
 *	private static StringConfigValue projectId = 
 *			new StringConfigValue("transitime.core.projectId", "sf-muni");
 * </code>
 * <p>
 * Such a parameter can be set either using a command line java property when the 
 * application is invoked, such as:
 * <code>
 * -Dtransitime.core.projectId=mbta
 * </code>
 * <p>
 * Or in a configuration file:
 * <p>
 * <code>
 * <?xml version="1.0"?>
 * <transitime>
 *   <core>
 *     <projectId>
 *       sf-muni
 *     </projectId>
 *     <defaultBreakTimeSec>
 *       120
 *     </defaultBreakTimeSec>
 *   </core>
 * </transitime>
 * </code>
 * <p>
 * Most parameters should be declared in org.transitimie.configData package.
 * <p>
 * Currently the configuration information is only read in at application
 * startup. In the future would like to make this dynamic.
 *  
 * @author SkiBu Smith
 *
 */
package org.transitime.config;