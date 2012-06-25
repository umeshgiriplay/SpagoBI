/* SpagoBI, the Open Source Business Intelligence suite

* � 2012 Engineering Ingegneria Informatica S.p.A. - SpagoBI Competency Center
* This Source Code Form is subject to the terms of the Mozilla Public
* License, v. 2.0. If a copy of the MPL was not distributed with this file,
* You can obtain one at http://mozilla.org/MPL/2.0/. */
package it.eng.spagobi.engines.weka;

import java.util.Map;

import org.apache.log4j.Logger;

/**
 * @author Andrea Gioia (andrea.gioia@eng.it)
 */
public class WekaEngine {
	
	/** Logger component. */
    public static transient Logger logger = Logger.getLogger(WekaEngine.class);
	
    
    // init engine
    private static WekaEngineConfig engineConfig;
    
    static {
    	engineConfig = WekaEngineConfig.getInstance();
    }
    
    public static WekaEngineConfig getConfig() {
    	return engineConfig;
    }
    // init engine
    
	/**
	 * Creates the instance.
	 * 
	 * @param template the template
	 * @param env the env
	 * 
	 * @return the weka engine instance
	 */
	public static WekaEngineInstance createInstance(String template, Map env) {
		WekaEngineInstance wekaEngineInstance = null;
		logger.debug("IN");
		wekaEngineInstance = new WekaEngineInstance(template, env);
		logger.debug("OUT");
		return wekaEngineInstance;	
	}
}
