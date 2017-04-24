
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object orders_Scope0 {
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

     object orders_Scope1 {
import models.Category
import models.Product
import models.users.User

class orders extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[play.api.Environment,List[Product],User,List[models.shopping.ShopOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(env: play.api.Environment, products: List[Product], user: User, order: List[models.shopping.ShopOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.106*/("""
"""),format.raw/*6.1*/("""<!--====================== J.T. =====================-->

"""),_display_(/*8.2*/admin/*8.7*/.adminMain("Orders", user)/*8.33*/ {_display_(Seq[Any](format.raw/*8.35*/("""
  """),format.raw/*9.3*/("""<div class="row">
      <div class="container">
		<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-sm-8 padding-right">
				<h2 class="title text-center">Order history</h2>
				<div id="accordian">
					<div class="list-group">
						<!--List-->
							 <div class="col-sm-12">

            """),_display_(/*20.14*/if(flash.containsKey("success"))/*20.46*/{_display_(Seq[Any](format.raw/*20.47*/("""
							"""),format.raw/*21.8*/("""<div class="alert alert-success">
							"""),_display_(/*22.9*/flash/*22.14*/.get("success")),format.raw/*22.29*/("""
							"""),format.raw/*23.8*/("""</div>
						""")))}),format.raw/*24.8*/("""
						"""),_display_(/*25.8*/if(flash.containsKey("fail"))/*25.37*/{_display_(Seq[Any](format.raw/*25.38*/("""
							"""),format.raw/*26.8*/("""<div class="alert alert-danger">
							"""),_display_(/*27.9*/flash/*27.14*/.get("fail")),format.raw/*27.26*/("""
							"""),format.raw/*28.8*/("""</div>
						""")))}),format.raw/*29.8*/("""
			"""),format.raw/*30.4*/("""<table class="table table-bordered table-hover table-condensed">
				<thead>
					<!-- The header row-->
					<tr>
						<th>Order date</th>
						<th>Total Cost</th>
						<th>Order status</th>
					</tr>
         	 </thead>
			<tbody>
                """),_display_(/*40.18*/for(o <- order) yield /*40.33*/ {_display_(Seq[Any](format.raw/*40.35*/("""
								"""),format.raw/*41.9*/("""<tr>	
								
									<td>"""),_display_(/*43.15*/o/*43.16*/.getOrderDate),format.raw/*43.29*/("""</td>
									<td>€"""),_display_(/*44.16*/o/*44.17*/.getOrderTotal),format.raw/*44.31*/("""</td>
									<td>"""),_display_(/*45.15*/o/*45.16*/.getStatus()),format.raw/*45.28*/("""<td>
									<td>
										<a href=""""),_display_(/*47.21*/routes/*47.27*/.AdminController.cancelOrder(o.getId)),format.raw/*47.64*/("""" class="btn-xs btn-danger"
											onclick="return confirmDel();">
											<span class="glyphicon glyphicon-trash"></span>
										</a>	
									</td>
									
									"""),_display_(/*53.11*/if(o.getStatus() != "delivered")/*53.43*/{_display_(Seq[Any](format.raw/*53.44*/("""
									"""),format.raw/*54.10*/("""<td>
										<a href=""""),_display_(/*55.21*/routes/*55.27*/.AdminController.updateStatus(o.getId)),format.raw/*55.65*/("""" class="btn-xs btn-danger">
                      					<span class="glyphicon glyphicon-pencil"></span></a>
										</a>
									</td>
									""")))}),format.raw/*59.11*/("""
								"""),format.raw/*60.9*/("""</tr>
                """)))}),format.raw/*61.18*/("""

			"""),format.raw/*63.4*/("""</tbody>
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
    function confirmDel() """),format.raw/*75.27*/("""{"""),format.raw/*75.28*/("""
        """),format.raw/*76.9*/("""return confirm('Are you sure?');
    """),format.raw/*77.5*/("""}"""),format.raw/*77.6*/("""
  """),format.raw/*78.3*/("""</script>

  <!-- End of content for main -->
""")))}),format.raw/*81.2*/("""

"""))
      }
    }
  }

  def render(env:play.api.Environment,products:List[Product],user:User,order:List[models.shopping.ShopOrder]): play.twirl.api.HtmlFormat.Appendable = apply(env,products,user,order)

  def f:((play.api.Environment,List[Product],User,List[models.shopping.ShopOrder]) => play.twirl.api.HtmlFormat.Appendable) = (env,products,user,order) => apply(env,products,user,order)

  def ref: this.type = this

}


}
}

/**/
object orders extends orders_Scope0.orders_Scope1.orders
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 13:45:14 IST 2017
                  SOURCE: /home/wdd/Desktop/project/24-04-17/app/views/admin/orders.scala.html
                  HASH: c0816b5245716803b80e1c55ab0dd280b5f485e0
                  MATRIX: 917->75|1117->179|1144->180|1228->239|1240->244|1274->270|1313->272|1342->275|1681->587|1722->619|1761->620|1796->628|1864->670|1878->675|1914->690|1949->698|1993->712|2027->720|2065->749|2104->750|2139->758|2206->799|2220->804|2253->816|2288->824|2332->838|2363->842|2644->1096|2675->1111|2715->1113|2751->1122|2807->1151|2817->1152|2851->1165|2899->1186|2909->1187|2944->1201|2991->1221|3001->1222|3034->1234|3100->1273|3115->1279|3173->1316|3381->1497|3422->1529|3461->1530|3499->1540|3551->1565|3566->1571|3625->1609|3805->1758|3841->1767|3895->1790|3927->1795|4185->2025|4214->2026|4250->2035|4314->2072|4342->2073|4372->2076|4449->2123
                  LINES: 32->5|37->5|38->6|40->8|40->8|40->8|40->8|41->9|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|56->24|57->25|57->25|57->25|58->26|59->27|59->27|59->27|60->28|61->29|62->30|72->40|72->40|72->40|73->41|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|79->47|79->47|79->47|85->53|85->53|85->53|86->54|87->55|87->55|87->55|91->59|92->60|93->61|95->63|107->75|107->75|108->76|109->77|109->77|110->78|113->81
                  -- GENERATED --
              */
          