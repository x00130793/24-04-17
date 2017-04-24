
package views.html.warehousePages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

     object products_Scope1 {
import models.Category
import models.Product
import models.users.User
import models.users.Warehouse
import models.productsAdditions.ProductWarehouse

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[play.api.Environment,List[Category],List[Product],User,List[ProductWarehouse],Warehouse,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(env: play.api.Environment, categories: List[Category], products: List[Product], user: User, pw: List[ProductWarehouse], warehouse: Warehouse):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.144*/("""

"""),_display_(/*9.2*/warehousePages/*9.16*/.warehouseMain("Products", user)/*9.48*/ {_display_(Seq[Any](format.raw/*9.50*/("""
"""),format.raw/*10.1*/("""<!--====================== J.T. =====================-->

  <div class="row">
      <div class="col-sm-2">
          <h4>Categories</h4>
            <div class="list-group">
                <!-- A link to display all products -->
                <a href=""""),_display_(/*17.27*/routes/*17.33*/.WarehouseController.products(0)),format.raw/*17.65*/("""" class="list-group-item">All categories</a>

                <!-- Start of For loop - For each c in categories add a list item -->
                <!-- Also show the number of products in each category -->
                """),_display_(/*21.18*/for(c <- categories) yield /*21.38*/ {_display_(Seq[Any](format.raw/*21.40*/("""
                    """),format.raw/*22.21*/("""<a href=""""),_display_(/*22.31*/routes/*22.37*/.WarehouseController.products(c.getId)),format.raw/*22.75*/("""" class="list-group-item">"""),_display_(/*22.102*/c/*22.103*/.getName),format.raw/*22.111*/("""
                      """),format.raw/*23.23*/("""<span class="badge">"""),_display_(/*23.44*/c/*23.45*/.getProducts.size()),format.raw/*23.64*/("""</span>
                    </a>
                """)))}),format.raw/*25.18*/("""
            """),format.raw/*26.13*/("""</div>
      </div>
      <div class="col-sm-10">
          <h2 class="title text-center">Products</h2>
          """),_display_(/*30.12*/if(flash.containsKey("success"))/*30.44*/ {_display_(Seq[Any](format.raw/*30.46*/("""
              """),format.raw/*31.15*/("""<div class="alert alert-success">
              """),_display_(/*32.16*/flash/*32.21*/.get("success")),format.raw/*32.36*/("""
              """),format.raw/*33.15*/("""</div>
          """)))}),format.raw/*34.12*/("""
          """),format.raw/*35.11*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
              <th></th>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
          """),_display_(/*50.12*/for(p <- pw) yield /*50.24*/ {_display_(Seq[Any](format.raw/*50.26*/("""
              """),format.raw/*51.15*/("""<tr>
                      <!-- Display each product field value in a column -->
                  """),_display_(/*53.20*/if(env.resource("public/images/productImages/thumbnails/" + p.getProduct().getId + ".jpg").isDefined)/*53.121*/ {_display_(Seq[Any](format.raw/*53.123*/("""
                      """),format.raw/*54.23*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*54.78*/(p.getProduct().getId)),format.raw/*54.100*/(""".jpg"/></td>
                  """)))}/*55.21*/else/*55.26*/{_display_(Seq[Any](format.raw/*55.27*/("""
                      """),format.raw/*56.23*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
                  """)))}),format.raw/*57.20*/("""
                  """),format.raw/*58.19*/("""<td>"""),_display_(/*58.24*/p/*58.25*/.getProduct().getId),format.raw/*58.44*/("""</td>
                  <td>"""),_display_(/*59.24*/p/*59.25*/.getProduct().getName),format.raw/*59.46*/("""</td>
                  <td>"""),_display_(/*60.24*/p/*60.25*/.getProduct().getDescription),format.raw/*60.53*/("""</td>
                  <td>"""),_display_(/*61.24*/p/*61.25*/.getStock()),format.raw/*61.36*/("""</td>
                  <td>&euro; """),_display_(/*62.31*/("%.2f".format(p.getProduct().getPrice))),format.raw/*62.71*/("""</td>
                  <!-- Edit product button -->
                  <td>"""),_display_(/*64.24*/if(warehouse.isMain() == true)/*64.54*/{_display_(Seq[Any](format.raw/*64.55*/("""
                      """),format.raw/*65.23*/("""<a href=""""),_display_(/*65.33*/routes/*65.39*/.WarehouseController.supplyWarehouse(p.getProduct().getId())),format.raw/*65.99*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                      """)))}),format.raw/*67.24*/("""
                  """),format.raw/*68.19*/("""</td>
                  <!-- Delete product button -->
                  <td>
                      <a href="" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
              </tr>
					""")))}),format.raw/*77.7*/(""" """),format.raw/*77.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
        <!--<p>
          <a href=""""),_display_(/*81.21*/routes/*81.27*/.AdminController.addProduct()),format.raw/*81.56*/("""">
            <button class="btn btn-primary">Add a Product</button>
          </a>
        </p>-->
      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*90.27*/("""{"""),format.raw/*90.28*/("""
        """),format.raw/*91.9*/("""return confirm('Are you sure?');
    """),format.raw/*92.5*/("""}"""),format.raw/*92.6*/("""
  """),format.raw/*93.3*/("""</script>

  <!-- End of content for main -->
""")))}),format.raw/*96.2*/("""
"""))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[Category],products:List[Product],user:User,pw:List[ProductWarehouse],warehouse:Warehouse): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,products,user,pw,warehouse)

  def f:((play.api.Environment,List[Category],List[Product],User,List[ProductWarehouse],Warehouse) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,products,user,pw,warehouse) => apply(env,categories,products,user,pw,warehouse)

  def ref: this.type = this

}


}
}

/**/
object products extends products_Scope0.products_Scope1.products
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:18:43 IST 2017
                  SOURCE: /home/wdd/Desktop/project2/project2017/app/views/warehousePages/products.scala.html
                  HASH: 4b5070ebe270b40b1bfc4b25f87f03a18cc2dd76
                  MATRIX: 1027->156|1265->298|1293->301|1315->315|1355->347|1394->349|1422->350|1705->606|1720->612|1773->644|2024->868|2060->888|2100->890|2149->911|2186->921|2201->927|2260->965|2315->992|2326->993|2356->1001|2407->1024|2455->1045|2465->1046|2505->1065|2586->1115|2627->1128|2769->1243|2810->1275|2850->1277|2893->1292|2969->1341|2983->1346|3019->1361|3062->1376|3111->1394|3150->1405|3636->1864|3664->1876|3704->1878|3747->1893|3874->1993|3985->2094|4026->2096|4077->2119|4159->2174|4203->2196|4254->2229|4267->2234|4306->2235|4357->2258|4481->2351|4528->2370|4560->2375|4570->2376|4610->2395|4666->2424|4676->2425|4718->2446|4774->2475|4784->2476|4833->2504|4889->2533|4899->2534|4931->2545|4994->2581|5055->2621|5158->2697|5197->2727|5236->2728|5287->2751|5324->2761|5339->2767|5420->2827|5578->2954|5625->2973|5997->3315|6025->3316|6149->3413|6164->3419|6214->3448|6480->3686|6509->3687|6545->3696|6609->3733|6637->3734|6667->3737|6744->3784
                  LINES: 34->7|39->7|41->9|41->9|41->9|41->9|42->10|49->17|49->17|49->17|53->21|53->21|53->21|54->22|54->22|54->22|54->22|54->22|54->22|54->22|55->23|55->23|55->23|55->23|57->25|58->26|62->30|62->30|62->30|63->31|64->32|64->32|64->32|65->33|66->34|67->35|82->50|82->50|82->50|83->51|85->53|85->53|85->53|86->54|86->54|86->54|87->55|87->55|87->55|88->56|89->57|90->58|90->58|90->58|90->58|91->59|91->59|91->59|92->60|92->60|92->60|93->61|93->61|93->61|94->62|94->62|96->64|96->64|96->64|97->65|97->65|97->65|97->65|99->67|100->68|109->77|109->77|113->81|113->81|113->81|122->90|122->90|123->91|124->92|124->92|125->93|128->96
                  -- GENERATED --
              */
          