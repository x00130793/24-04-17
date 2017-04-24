
package views.html.warehousePages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object supplyWarehouse_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object supplyWarehouse_Scope1 {
import models.productsAdditions.ProductWarehouse
import models.users.Warehouse
import helper._

class supplyWarehouse extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[models.users.User,Long,List[Warehouse],List[String],Form[models.Factory],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(user: models.users.User, id: Long, wList: List[Warehouse], tmp: List[String], c1: Form[models.Factory]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.106*/("""
"""),_display_(/*6.2*/warehousePages/*6.16*/.warehouseMain("Supply warehouse", user)/*6.56*/ {_display_(Seq[Any](format.raw/*6.58*/("""

"""),format.raw/*8.1*/("""<!--====================== J.T. =====================-->
	<h3>Supply other warehouse with product </h3>
	

	"""),_display_(/*12.3*/form(action = routes.WarehouseController.supplyWarehouseSubmit(id), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*12.149*/ {_display_(Seq[Any](format.raw/*12.151*/("""
		
		"""),_display_(/*14.4*/select(
			c1("strFormat1"),
			options = options(tmp),
			'_label -> "Choose warehouse",
			'_showConstraints -> false
		)),format.raw/*19.4*/("""

		"""),_display_(/*21.4*/inputText(c1("intFormat"), '_label -> "Amount of stock to assign to this warehouse",'class -> "form-control")),format.raw/*21.113*/("""



	"""),format.raw/*25.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input href=""""),_display_(/*27.21*/routes/*27.27*/.WarehouseController.products(0)),format.raw/*27.59*/("""" type="submit" value="Supply warehouse" class="btn btn-primary">
			<a href=""""),_display_(/*28.14*/routes/*28.20*/.WarehouseController.products(0)),format.raw/*28.52*/(""""
				<button class="btn btn-primary">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*32.3*/(""" """),format.raw/*32.4*/("""<!-- End Form definition -->

""")))}),format.raw/*34.2*/(""" """),format.raw/*34.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(user:models.users.User,id:Long,wList:List[Warehouse],tmp:List[String],c1:Form[models.Factory]): play.twirl.api.HtmlFormat.Appendable = apply(user,id,wList,tmp,c1)

  def f:((models.users.User,Long,List[Warehouse],List[String],Form[models.Factory]) => play.twirl.api.HtmlFormat.Appendable) = (user,id,wList,tmp,c1) => apply(user,id,wList,tmp,c1)

  def ref: this.type = this

}


}
}

/**/
object supplyWarehouse extends supplyWarehouse_Scope0.supplyWarehouse_Scope1.supplyWarehouse
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 13:45:14 IST 2017
                  SOURCE: /home/wdd/Desktop/project/24-04-17/app/views/warehousePages/supplyWarehouse.scala.html
                  HASH: 389de23e6c8fdd5a6aa4365fd88affb2ad800e14
                  MATRIX: 979->100|1179->204|1206->206|1228->220|1276->260|1315->262|1343->264|1478->373|1634->519|1675->521|1708->528|1851->651|1882->656|2013->765|2045->770|2145->843|2160->849|2213->881|2319->960|2334->966|2387->998|2490->1071|2518->1072|2579->1103|2607->1104
                  LINES: 32->5|37->5|38->6|38->6|38->6|38->6|40->8|44->12|44->12|44->12|46->14|51->19|53->21|53->21|57->25|59->27|59->27|59->27|60->28|60->28|60->28|64->32|64->32|66->34|66->34
                  -- GENERATED --
              */
          