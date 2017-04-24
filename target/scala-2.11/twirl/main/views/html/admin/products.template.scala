
package views.html.admin

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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[play.api.Environment,List[Category],List[Product],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(env: play.api.Environment, categories: List[Category], products: List[Product], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.94*/("""


"""),_display_(/*8.2*/admin/*8.7*/.adminMain("Products", user)/*8.35*/ {_display_(Seq[Any](format.raw/*8.37*/("""
"""),format.raw/*9.1*/("""<!--====================== J.T. =====================-->
  <div class="row">
      <div class="col-sm-2">
          <h4>Categories</h4>
            <div class="list-group">
                <!-- A link to display all products -->
                <a href=""""),_display_(/*15.27*/routes/*15.33*/.AdminController.products(0)),format.raw/*15.61*/("""" class="list-group-item">All categories</a>

                <!-- Start of For loop - For each c in categories add a list item -->
                <!-- Also show the number of products in each category -->
                """),_display_(/*19.18*/for(c <- categories) yield /*19.38*/ {_display_(Seq[Any](format.raw/*19.40*/("""
                    """),format.raw/*20.21*/("""<a href=""""),_display_(/*20.31*/routes/*20.37*/.AdminController.products(c.getId)),format.raw/*20.71*/("""" class="list-group-item">"""),_display_(/*20.98*/c/*20.99*/.getName),format.raw/*20.107*/("""
                      """),format.raw/*21.23*/("""<span class="badge">"""),_display_(/*21.44*/c/*21.45*/.getProducts.size()),format.raw/*21.64*/("""</span>
                    </a>
                """)))}),format.raw/*23.18*/("""
            """),format.raw/*24.13*/("""</div>
      </div>
      <div class="col-sm-10">
          
          <h2 class="title text-center">Products</h2>
          """),_display_(/*29.12*/if(flash.containsKey("success"))/*29.44*/{_display_(Seq[Any](format.raw/*29.45*/("""
							"""),format.raw/*30.8*/("""<div class="alert alert-success">
							"""),_display_(/*31.9*/flash/*31.14*/.get("success")),format.raw/*31.29*/("""
							"""),format.raw/*32.8*/("""</div>
						""")))}),format.raw/*33.8*/("""
						"""),_display_(/*34.8*/if(flash.containsKey("fail"))/*34.37*/{_display_(Seq[Any](format.raw/*34.38*/("""
							"""),format.raw/*35.8*/("""<div class="alert alert-danger">
							"""),_display_(/*36.9*/flash/*36.14*/.get("fail")),format.raw/*36.26*/("""
							"""),format.raw/*37.8*/("""</div>
						""")))}),format.raw/*38.8*/("""
          """),format.raw/*39.11*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
              <th></th>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
            <th>Update</th>
            <th>Delete</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
          """),_display_(/*56.12*/for(p <- products) yield /*56.30*/ {_display_(Seq[Any](format.raw/*56.32*/("""
              """),format.raw/*57.15*/("""<tr>
                      <!-- Display each product field value in a column -->
                  """),_display_(/*59.20*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*59.108*/ {_display_(Seq[Any](format.raw/*59.110*/("""
                      """),format.raw/*60.23*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*60.78*/(p.getId)),format.raw/*60.87*/(""".jpg"/></td>
                  """)))}/*61.21*/else/*61.26*/{_display_(Seq[Any](format.raw/*61.27*/("""
                      """),format.raw/*62.23*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
                  """)))}),format.raw/*63.20*/("""
                  """),format.raw/*64.19*/("""<td>"""),_display_(/*64.24*/p/*64.25*/.getId),format.raw/*64.31*/("""</td>
                  <td>"""),_display_(/*65.24*/p/*65.25*/.getName),format.raw/*65.33*/("""</td>
                  <td>"""),_display_(/*66.24*/p/*66.25*/.getDescription),format.raw/*66.40*/("""</td>
                  <td>"""),_display_(/*67.24*/p/*67.25*/.getStock),format.raw/*67.34*/("""</td>
                  <td>&euro; """),_display_(/*68.31*/("%.2f".format(p.getPrice))),format.raw/*68.58*/("""</td>
                  <!-- Edit product button -->
                  <td>
                      <a href=""""),_display_(/*71.33*/routes/*71.39*/.AdminController.updateProduct(p.getId)),format.raw/*71.78*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                      <a href=""""),_display_(/*76.33*/routes/*76.39*/.AdminController.deleteProduct(p.getId)),format.raw/*76.78*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
              </tr>
					""")))}),format.raw/*82.7*/(""" """),format.raw/*82.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
        <p>
          <a href=""""),_display_(/*86.21*/routes/*86.27*/.AdminController.addProduct()),format.raw/*86.56*/("""">
            <button class="btn btn-primary">Add a Product</button>
          </a>
        </p>
      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*95.27*/("""{"""),format.raw/*95.28*/("""
        """),format.raw/*96.9*/("""return confirm('Are you sure?');
    """),format.raw/*97.5*/("""}"""),format.raw/*97.6*/("""
  """),format.raw/*98.3*/("""</script>

  <!-- End of content for main -->
""")))}),format.raw/*101.2*/("""
"""))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[Category],products:List[Product],user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,products,user)

  def f:((play.api.Environment,List[Category],List[Product],User) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,products,user) => apply(env,categories,products,user)

  def ref: this.type = this

}


}
}

/**/
object products extends products_Scope0.products_Scope1.products
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 13:45:14 IST 2017
                  SOURCE: /home/wdd/Desktop/project/24-04-17/app/views/admin/products.scala.html
                  HASH: 353fc9041841fe1fbbfa98af9ec69f15c4c5cb40
                  MATRIX: 906->75|1093->167|1122->171|1134->176|1170->204|1209->206|1236->207|1518->462|1533->468|1582->496|1833->720|1869->740|1909->742|1958->763|1995->773|2010->779|2065->813|2119->840|2129->841|2159->849|2210->872|2258->893|2268->894|2308->913|2389->963|2430->976|2583->1102|2624->1134|2663->1135|2698->1143|2766->1185|2780->1190|2816->1205|2851->1213|2895->1227|2929->1235|2967->1264|3006->1265|3041->1273|3108->1314|3122->1319|3155->1331|3190->1339|3234->1353|3273->1364|3815->1879|3849->1897|3889->1899|3932->1914|4059->2014|4157->2102|4198->2104|4249->2127|4331->2182|4361->2191|4412->2224|4425->2229|4464->2230|4515->2253|4639->2346|4686->2365|4718->2370|4728->2371|4755->2377|4811->2406|4821->2407|4850->2415|4906->2444|4916->2445|4952->2460|5008->2489|5018->2490|5048->2499|5111->2535|5159->2562|5294->2670|5309->2676|5369->2715|5628->2947|5643->2953|5703->2992|5966->3225|5994->3226|6114->3319|6129->3325|6179->3354|6442->3589|6471->3590|6507->3599|6571->3636|6599->3637|6629->3640|6707->3687
                  LINES: 32->5|37->5|40->8|40->8|40->8|40->8|41->9|47->15|47->15|47->15|51->19|51->19|51->19|52->20|52->20|52->20|52->20|52->20|52->20|52->20|53->21|53->21|53->21|53->21|55->23|56->24|61->29|61->29|61->29|62->30|63->31|63->31|63->31|64->32|65->33|66->34|66->34|66->34|67->35|68->36|68->36|68->36|69->37|70->38|71->39|88->56|88->56|88->56|89->57|91->59|91->59|91->59|92->60|92->60|92->60|93->61|93->61|93->61|94->62|95->63|96->64|96->64|96->64|96->64|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|100->68|100->68|103->71|103->71|103->71|108->76|108->76|108->76|114->82|114->82|118->86|118->86|118->86|127->95|127->95|128->96|129->97|129->97|130->98|133->101
                  -- GENERATED --
              */
          