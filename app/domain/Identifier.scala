package domain

import play.api.libs.json.Json

/**
  * Created by 212026992 on 2016/10/12.
  */
case class Identifier(scheme: String,
                      id: String,
                      legalName: String,
                      uri: String ) {

}

object Identifier{
   implicit val identifierFmt = Json.format[Identifier]
}
