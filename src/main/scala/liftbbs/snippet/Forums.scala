package liftbbs.snippet

import org.squeryl._
import adapters.MySQLAdapter
import PrimitiveTypeMode._
import org.squeryl.annotations._

import liftbbs.model.BbsModel._

import scala.xml._
import net.liftweb.util.Helpers._

class Forums {
  def render =
    for (f <- forums) yield {
      <h1>{ f.name }</h1>
    }
  def list = {
    "#forum *" #> forums.map( f => "@nameLink [href]" #> {"forumdisplay?fid=" + f.id} &
                             "@nameLink *" #> {f.name} )
  }
}
