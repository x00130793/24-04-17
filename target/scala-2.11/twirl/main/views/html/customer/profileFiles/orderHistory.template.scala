
package views.html.customer.profileFiles

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object orderHistory_Scope0 {
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

class orderHistory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[models.users.Customer,models.users.User,List[models.Category],Long,List[models.shopping.ShopOrder],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, user: models.users.User, categories: List[models.Category], catId: Long, ord: List[models.shopping.ShopOrder], filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.162*/("""
"""),format.raw/*2.1*/("""<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

"""),_display_(/*6.2*/main("Customer order history", user, categories, catId, filter)/*6.65*/  {_display_(Seq[Any](format.raw/*6.68*/("""
"""),format.raw/*7.1*/("""<!--====================== J.T. =====================-->

	<div class="container">
		<div class="row">
			<div class="col-sm-9 padding-right">
				<h2 class="title text-center">Order history</h2>
				

				<div id="accordian">
					<div class="list-group">
						<!--List-->
							 <div class="col-sm-12">
				<p>You can still cancel order while it is in warehouse. Once the product status is changed to delivered 
					order cannot be cancelled.
				</p>				 
            """),_display_(/*22.14*/if(flash.containsKey("success"))/*22.46*/{_display_(Seq[Any](format.raw/*22.47*/("""
							"""),format.raw/*23.8*/("""<div class="alert alert-success">
							"""),_display_(/*24.9*/flash/*24.14*/.get("success")),format.raw/*24.29*/("""
							"""),format.raw/*25.8*/("""</div>
						""")))}),format.raw/*26.8*/("""
						"""),_display_(/*27.8*/if(flash.containsKey("fail"))/*27.37*/{_display_(Seq[Any](format.raw/*27.38*/("""
							"""),format.raw/*28.8*/("""<div class="alert alert-danger">
							"""),_display_(/*29.9*/flash/*29.14*/.get("fail")),format.raw/*29.26*/("""
							"""),format.raw/*30.8*/("""</div>
						""")))}),format.raw/*31.8*/("""
			"""),format.raw/*32.4*/("""<table class="table table-bordered table-hover table-condensed">
				<thead>
					<!-- The header row-->
					<tr>
						<th>Order date</th>
						<th>Total Cost</th>
						<th>Order status</th>
						<th>Cancel</th>
					</tr>
         	 </thead>
			<tbody>
                """),_display_(/*43.18*/for(o <- ord) yield /*43.31*/ {_display_(Seq[Any](format.raw/*43.33*/("""
			
								"""),format.raw/*45.9*/("""<tr>	
								
									<td>"""),_display_(/*47.15*/o/*47.16*/.getOrderDate),format.raw/*47.29*/("""</td>
									<td>€"""),_display_(/*48.16*/o/*48.17*/.getOrderTotal),format.raw/*48.31*/("""</td>
									"""),_display_(/*49.11*/if(o.getStatus() != "delivered")/*49.43*/{_display_(Seq[Any](format.raw/*49.44*/("""
										"""),format.raw/*50.11*/("""<td>"""),_display_(/*50.16*/o/*50.17*/.getStatus()),format.raw/*50.29*/("""</td>
									""")))}/*51.12*/else/*51.17*/{_display_(Seq[Any](format.raw/*51.18*/("""
										"""),format.raw/*52.11*/("""<td>"""),_display_(/*52.16*/o/*52.17*/.getStatus()),format.raw/*52.29*/(""" """),format.raw/*52.30*/("""("""),_display_(/*52.32*/o/*52.33*/.getDeliveryDate()),format.raw/*52.51*/(""")</td>
									""")))}),format.raw/*53.11*/("""
									
									"""),format.raw/*55.10*/("""<td>
										"""),_display_(/*56.12*/if(o.getStatus() != "delivered")/*56.44*/{_display_(Seq[Any](format.raw/*56.45*/("""
										"""),format.raw/*57.11*/("""<a href=""""),_display_(/*57.21*/routes/*57.27*/.CustomerCtrl.cancelOrder(catId, filter, o.getId)),format.raw/*57.76*/("""" class="btn-xs btn-danger"
											onclick="return confirmDel();">
											<span class="glyphicon glyphicon-trash"></span>
										</a>
										""")))}/*61.13*/else/*61.18*/{_display_(Seq[Any](format.raw/*61.19*/("""
											"""),format.raw/*62.12*/("""N/A
										""")))}),format.raw/*63.12*/("""
									"""),format.raw/*64.10*/("""</td>
										
									</td>
									</a>
								</tr>
                """)))}),format.raw/*69.18*/("""

			"""),format.raw/*71.4*/("""</tbody>
            </div>
			</table>

					<!--end list-->
					</div>
				</div>
				<div>
				</div>
			</div>


""")))}),format.raw/*83.2*/("""

"""))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,categories:List[models.Category],catId:Long,ord:List[models.shopping.ShopOrder],filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,categories,catId,ord,filter)

  def f:((models.users.Customer,models.users.User,List[models.Category],Long,List[models.shopping.ShopOrder],String) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,categories,catId,ord,filter) => apply(customer,user,categories,catId,ord,filter)

  def ref: this.type = this

}


}

/**/
object orderHistory extends orderHistory_Scope0.orderHistory
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:18:43 IST 2017
                  SOURCE: /home/wdd/Desktop/project2/project2017/app/views/customer/profileFiles/orderHistory.scala.html
                  HASH: e05c81dc72a4b76d96c1623a3ad81d43b7ddd601
                  MATRIX: 880->1|1136->161|1163->162|1476->450|1547->513|1587->516|1614->517|2116->992|2157->1024|2196->1025|2231->1033|2299->1075|2313->1080|2349->1095|2384->1103|2428->1117|2462->1125|2500->1154|2539->1155|2574->1163|2641->1204|2655->1209|2688->1221|2723->1229|2767->1243|2798->1247|3101->1523|3130->1536|3170->1538|3210->1551|3266->1580|3276->1581|3310->1594|3358->1615|3368->1616|3403->1630|3446->1646|3487->1678|3526->1679|3565->1690|3597->1695|3607->1696|3640->1708|3675->1725|3688->1730|3727->1731|3766->1742|3798->1747|3808->1748|3841->1760|3870->1761|3899->1763|3909->1764|3948->1782|3996->1799|4044->1819|4087->1835|4128->1867|4167->1868|4206->1879|4243->1889|4258->1895|4328->1944|4503->2101|4516->2106|4555->2107|4595->2119|4641->2134|4679->2144|4787->2221|4819->2226|4968->2345
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|38->7|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|57->26|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|62->31|63->32|74->43|74->43|74->43|76->45|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|86->55|87->56|87->56|87->56|88->57|88->57|88->57|88->57|92->61|92->61|92->61|93->62|94->63|95->64|100->69|102->71|114->83
                  -- GENERATED --
              */
          