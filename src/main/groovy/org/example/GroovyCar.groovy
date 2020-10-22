package org.example

import com.liferay.portal.kernel.log.Log
import com.liferay.portal.kernel.log.LogFactoryUtil

/**
 * <class short description - 1 Line!>
 *
 * <More detailed description - When to use, what it solves, etc.>
 *
 * @author Sven Fillinger
 * @since <versiontag>
 */
class GroovyCar {

  private static final Log log = LogFactoryUtil.getLog(GroovyCar.class)

  private static boolean engineOff = true

  static def start() {
    if (engineOff) {
      log.info("Starting engine...")
      log.info("Roaaarrrr!")
      engineOff = false
    } else {
      log.info("Engine is already running.")
    }
  }

}
