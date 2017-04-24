
package views.html.warehousePages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ordersW_Scope0 {
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

     object ordersW_Scope1 {
import models.users.User

class ordersW extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,List[models.shopping.ShopOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User, order: List[models.shopping.ShopOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.54*/("""


"""),_display_(/*5.2*/warehousePages/*5.16*/.warehouseMain("Orders", user)/*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""
"""),format.raw/*6.1*/("""<!--====================== J.T. =====================-->


  <div class="row">
      <div class="container">
		<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-sm-8 padding-right">
				<h2 class="title text-center">Orders</h2>
				<div id="accordian">
					<div class="list-group">
						<!--List-->
							 <div class="col-sm-12">

            """),_display_(/*20.14*/if(flash.containsKey("success"))/*20.46*/ {_display_(Seq[Any](format.raw/*20.48*/("""
                """),format.raw/*21.17*/("""<div class="alert alert-success">
                """),_display_(/*22.18*/flash/*22.23*/.get("success")),format.raw/*22.38*/("""
                """),format.raw/*23.17*/("""</div>
            """)))}),format.raw/*24.14*/("""
			"""),format.raw/*25.4*/("""<table class="table table-bordered table-hover table-condensed">
				<thead>
					<!-- The header row-->
					<tr>
						<th>Order date</th>
						<th>Order status</th>
						<th></th>
					</tr>
         	 </thead>
			<tbody>
                """),_display_(/*35.18*/for(o <- order) yield /*35.33*/ {_display_(Seq[Any](format.raw/*35.35*/("""
								"""),format.raw/*36.9*/("""<tr>	
									
									<td><a href=""""),_display_(/*38.24*/routes/*38.30*/.WarehouseController.orderDetails(o.getId())),format.raw/*38.74*/("""">"""),_display_(/*38.77*/o/*38.78*/.getOrderDate),format.raw/*38.91*/("""</a></td>
									<td>"""),_display_(/*39.15*/o/*39.16*/.getStatus()),format.raw/*39.28*/("""</td>
									
									<td>
										<a href=""""),_display_(/*42.21*/routes/*42.27*/.WarehouseController.cancelOrder(o.getId())),format.raw/*42.70*/("""" class="btn-xs btn-danger"
											onclick="return confirmDel();">
											<span class="glyphicon glyphicon-trash"></span>
										</a>	
									</td>
									
									"""),_display_(/*48.11*/if(o.getStatus() != "delivered")/*48.43*/{_display_(Seq[Any](format.raw/*48.44*/("""
									"""),format.raw/*49.10*/("""<td>
										<a href=""""),_display_(/*50.21*/routes/*50.27*/.WarehouseController.updateStatus(o.getId())),format.raw/*50.71*/("""" class="btn-xs btn-danger">
                      					<span class="glyphicon glyphicon-pencil"></span></a>
										</a>
									</td>
									""")))}),format.raw/*54.11*/("""
									
								"""),format.raw/*56.9*/("""</tr>
                """)))}),format.raw/*57.18*/("""

			"""),format.raw/*59.4*/("""</tbody>
            </div>
			</table>

					<!--end list-->
					</div>
				</div>
				<div>
				</div>
			</div>
  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*71.27*/("""{"""),format.raw/*71.28*/("""
        """),format.raw/*72.9*/("""return confirm('Are you sure?');
    """),format.raw/*73.5*/("""}"""),format.raw/*73.6*/("""
  """),format.raw/*74.3*/("""</script>

  <!-- End of content for main -->
""")))}),format.raw/*77.2*/("""

"""))
      }
    }
  }

  def render(user:User,order:List[models.shopping.ShopOrder]): play.twirl.api.HtmlFormat.Appendable = apply(user,order)

  def f:((User,List[models.shopping.ShopOrder]) => play.twirl.api.HtmlFormat.Appendable) = (user,order) => apply(user,order)

  def ref: this.type = this

}


}
}

/**/
object ordersW extends ordersW_Scope0.ordersW_Scope1.ordersW
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 13:45:14 IST 2017
                  SOURCE: /home/wdd/Desktop/project/24-04-17/app/views/warehousePages/ordersW.scala.html
                  HASH: b49e026e865c727a22f0b2d962a09331b631ff78
                  MATRIX: 849->27|996->79|1025->83|1047->97|1085->127|1124->129|1151->130|1544->496|1585->528|1625->530|1670->547|1748->598|1762->603|1798->618|1843->635|1894->655|1925->659|2196->903|2227->918|2267->920|2303->929|2369->968|2384->974|2449->1018|2479->1021|2489->1022|2523->1035|2574->1059|2584->1060|2617->1072|2694->1122|2709->1128|2773->1171|2981->1352|3022->1384|3061->1385|3099->1395|3151->1420|3166->1426|3231->1470|3411->1619|3457->1638|3511->1661|3543->1666|3801->1896|3830->1897|3866->1906|3930->1943|3958->1944|3988->1947|4065->1994
                  LINES: 30->2|35->2|38->5|38->5|38->5|38->5|39->6|53->20|53->20|53->20|54->21|55->22|55->22|55->22|56->23|57->24|58->25|68->35|68->35|68->35|69->36|71->38|71->38|71->38|71->38|71->38|71->38|72->39|72->39|72->39|75->42|75->42|75->42|81->48|81->48|81->48|82->49|83->50|83->50|83->50|87->54|89->56|90->57|92->59|104->71|104->71|105->72|106->73|106->73|107->74|110->77
                  -- GENERATED --
              */
          