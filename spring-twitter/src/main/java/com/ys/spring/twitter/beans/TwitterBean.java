/**
 * 
 */
package com.ys.spring.twitter.beans;

import org.apache.log4j.Logger;

/**
 * @author AC70602
 * Main spring for twitter app, which will handle all user request and respond back based on that.
 *
 */

public class TwitterBean {
	static final Logger logger = Logger.getLogger(TwitterBean.class.getName());
	
	public void getBeanName(){
		logger.debug("Inside Twitter Bean.....");
	}
}
