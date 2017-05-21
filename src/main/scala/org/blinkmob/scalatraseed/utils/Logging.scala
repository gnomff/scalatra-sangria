package org.blinkmob.scalatraseed.utils
import org.slf4j.LoggerFactory

/**
  * Created by tim on 8/8/16.
  */
trait Logging {
  val logger =  LoggerFactory.getLogger(getClass)
}
