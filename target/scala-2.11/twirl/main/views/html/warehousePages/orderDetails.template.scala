
package views.html.warehousePages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object orderDetails_Scope0 {
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

     object orderDetails_Scope1 {
import models.users.User
import models.shopping.OrderItem
import models.shopping.ShopOrder

class orderDetails extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,List[OrderItem],ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(user: User, oList: List[OrderItem], order: ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.56*/("""


"""),_display_(/*8.2*/warehousePages/*8.16*/.warehouseMain("Order details", user)/*8.53*/ {_display_(Seq[Any](format.raw/*8.55*/("""
"""),format.raw/*9.1*/("""<!--====================== J.T. =====================-->

  <div class="row">
      <div class="container">
		<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-sm-8 padding-right">
				<h2 class="title text-center">Order details</h2>
				<div id="accordian">
					<div class="list-group">
						<!--List-->
							 <div class="col-sm-12">

            """),_display_(/*22.14*/if(flash.containsKey("success"))/*22.46*/ {_display_(Seq[Any](format.raw/*22.48*/("""
                """),format.raw/*23.17*/("""<div class="alert alert-success">
                """),_display_(/*24.18*/flash/*24.23*/.get("success")),format.raw/*24.38*/("""
                """),format.raw/*25.17*/("""</div>
            """)))}),format.raw/*26.14*/("""


			"""),format.raw/*29.4*/("""<table class="table table-bordered table-hover table-condensed">
				<thead>
					<tr>
						<th>Customer details</th>
					</tr>
				</thead>

				<tbody>
					<tr>
						<td><p>Name: """),_display_(/*38.21*/order/*38.26*/.getName),format.raw/*38.34*/("""</p>
						<p>Street1: """),_display_(/*39.20*/order/*39.25*/.getStreet1),format.raw/*39.36*/("""</p>
						<p>Street2: """),_display_(/*40.20*/order/*40.25*/.getStreet2),format.raw/*40.36*/("""</p>
						<p>Town: """),_display_(/*41.17*/order/*41.22*/.getTown),format.raw/*41.30*/("""</p>
						<p>Post code: """),_display_(/*42.22*/order/*42.27*/.getPostCode),format.raw/*42.39*/("""</p>
						<p>Country: """),_display_(/*43.20*/order/*43.25*/.getCountry),format.raw/*43.36*/("""</p></td>
					</tr>
				</tbody>
			</table>


			<table class="table table-bordered table-hover table-condensed">
				<thead>
					<!-- The header row-->
					
					<tr>
						<th>Product name</th>
						<th>Quantity ordered</th>
					</tr>
         	 </thead>
			<tbody>
				"""),_display_(/*59.6*/for(o <- oList) yield /*59.21*/ {_display_(Seq[Any](format.raw/*59.23*/("""
				"""),format.raw/*60.5*/("""<tr>
						<td>"""),_display_(/*61.12*/o/*61.13*/.getProduct.getName),format.raw/*61.32*/("""</td>
						<td>"""),_display_(/*62.12*/o/*62.13*/.getQuantity),format.raw/*62.25*/("""</td>
				</tr>
				""")))}),format.raw/*64.6*/("""
			"""),format.raw/*65.4*/("""</tbody>
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
    function confirmDel() """),format.raw/*77.27*/("""{"""),format.raw/*77.28*/("""
        """),format.raw/*78.9*/("""return confirm('Are you sure?');
    """),format.raw/*79.5*/("""}"""),format.raw/*79.6*/("""
  """),format.raw/*80.3*/("""</script>

  <!-- End of content for main -->
""")))}),format.raw/*83.2*/("""

"""))
      }
    }
  }

  def render(user:User,oList:List[OrderItem],order:ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(user,oList,order)

  def f:((User,List[OrderItem],ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (user,oList,order) => apply(user,oList,order)

  def ref: this.type = this

}


}
}

/**/
object orderDetails extends orderDetails_Scope0.orderDetails_Scope1.orderDetails
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:18:43 IST 2017
                  SOURCE: /home/wdd/Desktop/project2/project2017/app/views/warehousePages/orderDetails.scala.html
                  HASH: 081f8c6db34bef89a9577071e5f6138096fa2886
                  MATRIX: 924->96|1073->150|1102->154|1124->168|1169->205|1208->207|1235->208|1634->580|1675->612|1715->614|1760->631|1838->682|1852->687|1888->702|1933->719|1984->739|2017->745|2230->931|2244->936|2273->944|2324->968|2338->973|2370->984|2421->1008|2435->1013|2467->1024|2515->1045|2529->1050|2558->1058|2611->1084|2625->1089|2658->1101|2709->1125|2723->1130|2755->1141|3060->1420|3091->1435|3131->1437|3163->1442|3206->1458|3216->1459|3256->1478|3300->1495|3310->1496|3343->1508|3394->1529|3425->1533|3683->1763|3712->1764|3748->1773|3812->1810|3840->1811|3870->1814|3947->1861
                  LINES: 32->5|37->5|40->8|40->8|40->8|40->8|41->9|54->22|54->22|54->22|55->23|56->24|56->24|56->24|57->25|58->26|61->29|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|91->59|91->59|91->59|92->60|93->61|93->61|93->61|94->62|94->62|94->62|96->64|97->65|109->77|109->77|110->78|111->79|111->79|112->80|115->83
                  -- GENERATED --
              */
          