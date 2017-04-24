
package views.html.customer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object orderConfirmed_Scope0 {
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

     object orderConfirmed_Scope1 {
import models.Category
import models.Product
import models.users.User

class orderConfirmed extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[models.users.Customer,models.users.User,List[Category],models.shopping.ShopOrder,Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(customer: models.users.Customer, user: models.users.User, categories: List[Category], order: models.shopping.ShopOrder, catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.resource
import play.api.Play.current
import models.shopping._
import models.Product._

Seq[Any](format.raw/*4.151*/("""

"""),format.raw/*10.1*/("""

"""),_display_(/*12.2*/main("Order Confirmation", customer, categories, catId, filter)/*12.65*/ {_display_(Seq[Any](format.raw/*12.67*/("""
"""),format.raw/*13.1*/("""<!--====================== J.T. =====================-->

<div class="row">

	<div class="col-md-12">
		"""),_display_(/*18.4*/if(flash.containsKey("success"))/*18.36*/ {_display_(Seq[Any](format.raw/*18.38*/("""
			  """),format.raw/*19.6*/("""<div class="alert alert-success">
			      """),_display_(/*20.11*/flash/*20.16*/.get("success")),format.raw/*20.31*/("""
			  """),format.raw/*21.6*/("""</div>
		""")))}),format.raw/*22.4*/(""" 

		"""),format.raw/*24.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Quantity</th>
                <th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*36.18*/if(order != null)/*36.35*/ {_display_(Seq[Any](format.raw/*36.37*/("""
                    """),format.raw/*37.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*38.22*/for(i <- order.getItems) yield /*38.46*/ {_display_(Seq[Any](format.raw/*38.48*/("""
                    """),format.raw/*39.21*/("""<tr>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getProduct.getName),format.raw/*40.50*/("""</td>
                        <td>"""),_display_(/*41.30*/i/*41.31*/.getProduct.getDescription),format.raw/*41.57*/("""</td>
                        <td>&euro; """),_display_(/*42.37*/("%.2f".format(i.getPrice))),format.raw/*42.64*/("""</td>
                        <td>"""),_display_(/*43.30*/i/*43.31*/.getQuantity()),format.raw/*43.45*/("""</td>
                        <td>&euro; """),_display_(/*44.37*/("%.2f".format(i.getItemTotal))),format.raw/*44.68*/("""</td>
                    </tr>
                    """)))}),format.raw/*46.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*47.16*/("""
			"""),format.raw/*48.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*52.68*/("%.2f".format(order.getOrderTotal))),format.raw/*52.104*/("""</strong></p>
            </div>  
        </div>
        </div>
</div>
""")))}),format.raw/*57.2*/("""
"""))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,categories:List[Category],order:models.shopping.ShopOrder,catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,categories,order,catId,filter)

  def f:((models.users.Customer,models.users.User,List[Category],models.shopping.ShopOrder,Long,String) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,categories,order,catId,filter) => apply(customer,user,categories,order,catId,filter)

  def ref: this.type = this

}


}
}

/**/
object orderConfirmed extends orderConfirmed_Scope0.orderConfirmed_Scope1.orderConfirmed
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 13:45:14 IST 2017
                  SOURCE: /home/wdd/Desktop/project/24-04-17/app/views/customer/orderConfirmed.scala.html
                  HASH: 38900bf2eada7a5a773e2d093dcb9e45fa304505
                  MATRIX: 965->74|1317->223|1346->337|1375->340|1447->403|1487->405|1515->406|1646->511|1687->543|1727->545|1760->551|1831->595|1845->600|1881->615|1914->621|1954->631|1986->636|2292->915|2318->932|2358->934|2407->955|2517->1038|2557->1062|2597->1064|2646->1085|2707->1119|2717->1120|2757->1139|2819->1174|2829->1175|2876->1201|2945->1243|2993->1270|3055->1305|3065->1306|3100->1320|3169->1362|3221->1393|3305->1446|3376->1486|3407->1490|3583->1639|3641->1675|3744->1748
                  LINES: 32->4|40->4|42->10|44->12|44->12|44->12|45->13|50->18|50->18|50->18|51->19|52->20|52->20|52->20|53->21|54->22|56->24|68->36|68->36|68->36|69->37|70->38|70->38|70->38|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|75->43|75->43|75->43|76->44|76->44|78->46|79->47|80->48|84->52|84->52|89->57
                  -- GENERATED --
              */
          