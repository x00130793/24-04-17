
package views.html

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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[play.api.Environment,List[Category],List[Product],Long,String,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(env: play.api.Environment, categories: List[Category], products: List[Product], catId: Long, filter: String, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.123*/("""
"""),format.raw/*6.1*/("""<!--====================== J.T. =====================-->

"""),_display_(/*8.2*/main("Products", user, categories, catId: Long, filter: String)/*8.65*/ {_display_(Seq[Any](format.raw/*8.67*/("""

    """),format.raw/*10.5*/("""<div class="row">

        <div class="col-sm-12">

            """),_display_(/*14.14*/if(flash.containsKey("success"))/*14.46*/ {_display_(Seq[Any](format.raw/*14.48*/("""
                """),format.raw/*15.17*/("""<div class="alert alert-success">
                """),_display_(/*16.18*/flash/*16.23*/.get("success")),format.raw/*16.38*/("""
                """),format.raw/*17.17*/("""</div>
            """)))}),format.raw/*18.14*/("""
            """),format.raw/*19.13*/("""<div class="features_items"><!--features_items-->
                <h2 class="title text-center">Products</h2>
                """),_display_(/*21.18*/for(p <- products) yield /*21.36*/ {_display_(Seq[Any](format.raw/*21.38*/("""
                    """),format.raw/*22.21*/("""<div  class="col-sm-4">
                        <div  class="product-image-wrapper">
                            <div class="single-products">
                                <div class="productinfo text-center">
                                    """),_display_(/*26.38*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*26.126*/ {_display_(Seq[Any](format.raw/*26.128*/("""
                                        """),format.raw/*27.41*/("""<img src="/assets/images/productImages/"""),_display_(/*27.81*/(p.getId)),format.raw/*27.90*/(""".jpg"/>
                                    """)))}/*28.39*/else/*28.44*/{_display_(Seq[Any](format.raw/*28.45*/("""
                                        """),format.raw/*29.41*/("""<img src="/assets/images/productImages/thumbnails/noImage.png"/>
                                    """)))}),format.raw/*30.38*/("""

                                """),format.raw/*32.33*/("""<h2>&euro; """),_display_(/*32.45*/("%.2f".format(p.getPrice))),format.raw/*32.72*/("""</h2>
                                <h3>"""),_display_(/*33.38*/p/*33.39*/.getName),format.raw/*33.47*/("""</h3>
                               
                              
                                </div>
                                <div class="product-overlay">
                                    <div class="overlay-content">
                                        <h2>&euro; """),_display_(/*39.53*/("%.2f".format(p.getPrice))),format.raw/*39.80*/("""</h2>
                                        <a   href=""""),_display_(/*40.53*/routes/*40.59*/.HomeController.productDetails(catId, filter, p.getId)),format.raw/*40.113*/("""" <p> """),_display_(/*40.120*/p/*40.121*/.getDescription),format.raw/*40.136*/("""</p> </a>
                                        """),_display_(/*41.42*/if(user.getRole == "customer")/*41.72*/{_display_(Seq[Any](format.raw/*41.73*/("""
                                        """),format.raw/*42.41*/("""<a href=""""),_display_(/*42.51*/routes/*42.57*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*42.91*/("""" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                        """)))}),format.raw/*43.42*/("""
                                    """),format.raw/*44.37*/("""</div>
                                </div>
                            </div>
                            <div class="choose">
								<ul class="nav nav-pills nav-justified">
                                    """),_display_(/*49.38*/if(user.getRole == "customer")/*49.68*/{_display_(Seq[Any](format.raw/*49.69*/("""
                                    """),format.raw/*50.37*/("""<li><a href=""""),_display_(/*50.51*/routes/*50.57*/.HomeController.like(catId, filter, p.getId, "products")),format.raw/*50.113*/(""""><b><i class="glyphicon glyphicon-thumbs-up"></i>Like """),_display_(/*50.169*/p/*50.170*/.getPlike().getLikeCount()),format.raw/*50.196*/(""" """),format.raw/*50.197*/("""</a></b></li>
                                    <li><a href="#"><b><i class="fa fa-plus-square"></i>Add to wishlist</a></b></li>  
                                    """)))}),format.raw/*52.38*/("""
                                """),format.raw/*53.33*/("""</ul>
                            </div>
                        </div>
                    </div>
                """)))}),format.raw/*57.18*/("""

            """),format.raw/*59.13*/("""</div>
        </div>
    </div>
        <!-- End of content for main -->
""")))}),format.raw/*63.2*/("""
"""))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[Category],products:List[Product],catId:Long,filter:String,user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,products,catId,filter,user)

  def f:((play.api.Environment,List[Category],List[Product],Long,String,User) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,products,catId,filter,user) => apply(env,categories,products,catId,filter,user)

  def ref: this.type = this

}


}
}

/**/
object products extends products_Scope0.products_Scope1.products
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:18:42 IST 2017
                  SOURCE: /home/wdd/Desktop/project2/project2017/app/views/products.scala.html
                  HASH: 9c3646441d19811df24a60e426508b9c01ed8aaf
                  MATRIX: 912->75|1129->196|1156->197|1240->256|1311->319|1350->321|1383->327|1475->392|1516->424|1556->426|1601->443|1679->494|1693->499|1729->514|1774->531|1825->551|1866->564|2020->691|2054->709|2094->711|2143->732|2420->982|2518->1070|2559->1072|2628->1113|2695->1153|2725->1162|2789->1208|2802->1213|2841->1214|2910->1255|3043->1357|3105->1391|3144->1403|3192->1430|3262->1473|3272->1474|3301->1482|3616->1770|3664->1797|3749->1855|3764->1861|3840->1915|3875->1922|3886->1923|3923->1938|4001->1989|4040->2019|4079->2020|4148->2061|4185->2071|4200->2077|4255->2111|4416->2241|4481->2278|4724->2494|4763->2524|4802->2525|4867->2562|4908->2576|4923->2582|5001->2638|5085->2694|5096->2695|5144->2721|5174->2722|5375->2892|5436->2925|5583->3041|5625->3055|5730->3130
                  LINES: 32->5|37->5|38->6|40->8|40->8|40->8|42->10|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|50->18|51->19|53->21|53->21|53->21|54->22|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|62->30|64->32|64->32|64->32|65->33|65->33|65->33|71->39|71->39|72->40|72->40|72->40|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|74->42|75->43|76->44|81->49|81->49|81->49|82->50|82->50|82->50|82->50|82->50|82->50|82->50|82->50|84->52|85->53|89->57|91->59|95->63
                  -- GENERATED --
              */
          