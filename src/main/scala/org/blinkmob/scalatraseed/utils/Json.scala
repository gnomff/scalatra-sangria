package org.blinkmob.scalatraseed.utils
import org.scalatra.ScalatraServlet
import org.json4s.DefaultFormats
import org.json4s.Formats
import org.scalatra.json.JacksonJsonSupport

/**
  * Created by tim on 8/8/16.
  */
trait Json extends  JacksonJsonSupport{
  override protected implicit val jsonFormats: Formats = DefaultFormats

  before() {
    contentType = formats("json")
  }
}
