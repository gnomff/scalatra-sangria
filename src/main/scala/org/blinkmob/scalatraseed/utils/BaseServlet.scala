package org.blinkmob.scalatraseed.utils

import org.scalatra.{CorsSupport, ScalatraServlet}

/**
  * Created by tim on 8/8/16.
  */
trait BaseServlet extends ScalatraServlet with CorsSupport with Json with Logging{

  options("/*"){
    response.setHeader("Access-Control-Allow-Headers", request.getHeader("Access-Control-Request-Headers"))
  }
}
