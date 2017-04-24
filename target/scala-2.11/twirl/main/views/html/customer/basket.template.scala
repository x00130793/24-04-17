
package views.html.customer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object basket_Scope0 {
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

class basket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[models.users.Customer,models.users.User,List[models.Category],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, user: models.users.User, categories: List[models.Category], catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.resource
import play.api.Play.current
import models.shopping._
import models._

Seq[Any](format.raw/*1.124*/("""

"""),format.raw/*7.1*/("""

"""),_display_(/*9.2*/main("Shopping Basket", user, categories, catId, filter)/*9.58*/ {_display_(Seq[Any](format.raw/*9.60*/("""
"""),format.raw/*10.1*/("""<!--====================== J.T. =====================-->

<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 

		"""),format.raw/*21.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Total</th>
				<th>Quantity</th>
                <th>dec.</th>
                <th>inc.</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*35.18*/if(customer.getBasket() != null)/*35.50*/ {_display_(Seq[Any](format.raw/*35.52*/("""
                    """),format.raw/*36.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*37.22*/for(i <- customer.getBasket().getBasketItems()) yield /*37.69*/ {_display_(Seq[Any](format.raw/*37.71*/("""
                    """),format.raw/*38.21*/("""<tr>
                        <td>"""),_display_(/*39.30*/i/*39.31*/.getProduct.getName),format.raw/*39.50*/("""</td>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getProduct.getDescription()),format.raw/*40.59*/("""</td>
                        <td>&euro; """),_display_(/*41.37*/("%.2f".format(i.getPrice))),format.raw/*41.64*/("""</td>
                        <td>&euro; """),_display_(/*42.37*/("%.2f".format(i.getItemTotal))),format.raw/*42.68*/("""</td>
                        <td>"""),_display_(/*43.30*/i/*43.31*/.getQuantity()),format.raw/*43.45*/("""</td>
                        <td><a href=""""),_display_(/*44.39*/routes/*44.45*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*44.77*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        """),_display_(/*45.26*/if(i.getQuantity != i.getProduct.getStock)/*45.68*/{_display_(Seq[Any](format.raw/*45.69*/("""
                            """),format.raw/*46.29*/("""<td><a href=""""),_display_(/*46.43*/routes/*46.49*/.ShoppingCtrl.addOne(i.getId)),format.raw/*46.78*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                        """)))}/*47.27*/else/*47.32*/{_display_(Seq[Any](format.raw/*47.33*/("""
                            """),format.raw/*48.29*/("""<td>Max</td>
                        """)))}),format.raw/*49.26*/("""
                    """),format.raw/*50.21*/("""</tr>
                    """)))}),format.raw/*51.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*52.16*/("""
			"""),format.raw/*53.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*57.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*57.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*63.31*/routes/*63.37*/.ShoppingCtrl.emptyBasket()),format.raw/*63.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*69.31*/routes/*69.37*/.ShoppingCtrl.payment(catId, filter)),format.raw/*69.73*/("""" class="btn btn-success btn-sm">
                    </span> Go To Payment</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*79.24*/("""{"""),format.raw/*79.25*/("""
		"""),format.raw/*80.3*/("""return confirm('Are you sure?');
	"""),format.raw/*81.2*/("""}"""),format.raw/*81.3*/("""
"""),format.raw/*82.1*/("""</script>
""")))}),format.raw/*83.2*/("""
"""))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,categories:List[models.Category],catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,categories,catId,filter)

  def f:((models.users.Customer,models.users.User,List[models.Category],Long,String) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,categories,catId,filter) => apply(customer,user,categories,catId,filter)

  def ref: this.type = this

}


}

/**/
object basket extends basket_Scope0.basket
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:18:43 IST 2017
                  SOURCE: /home/wdd/Desktop/project2/project2017/app/views/customer/basket.scala.html
                  HASH: 546f56da46ec25e299f708474e0afc7305171d58
                  MATRIX: 823->1|1140->123|1168->229|1196->232|1260->288|1299->290|1327->291|1458->396|1499->428|1539->430|1572->436|1643->480|1657->485|1693->500|1726->506|1766->516|1798->521|2152->848|2193->880|2233->882|2282->903|2392->986|2455->1033|2495->1035|2544->1056|2605->1090|2615->1091|2655->1110|2717->1145|2727->1146|2776->1174|2845->1216|2893->1243|2962->1285|3014->1316|3076->1351|3086->1352|3121->1366|3192->1410|3207->1416|3260->1448|3376->1537|3427->1579|3466->1580|3523->1609|3564->1623|3579->1629|3629->1658|3736->1747|3749->1752|3788->1753|3845->1782|3914->1820|3963->1841|4021->1868|4092->1908|4123->1912|4300->2062|4372->2112|4579->2292|4594->2298|4642->2325|4964->2620|4979->2626|5036->2662|5326->2924|5355->2925|5385->2928|5446->2962|5474->2963|5502->2964|5543->2975
                  LINES: 27->1|35->1|37->7|39->9|39->9|39->9|40->10|45->15|45->15|45->15|46->16|47->17|47->17|47->17|48->18|49->19|51->21|65->35|65->35|65->35|66->36|67->37|67->37|67->37|68->38|69->39|69->39|69->39|70->40|70->40|70->40|71->41|71->41|72->42|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46|76->46|76->46|77->47|77->47|77->47|78->48|79->49|80->50|81->51|82->52|83->53|87->57|87->57|93->63|93->63|93->63|99->69|99->69|99->69|109->79|109->79|110->80|111->81|111->81|112->82|113->83
                  -- GENERATED --
              */
          