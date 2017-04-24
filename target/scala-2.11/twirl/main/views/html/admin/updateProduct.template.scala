
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateProduct_Scope0 {
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

class updateProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Long,Form[models.Product],models.users.User,play.data.Form[models.Factory],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateProductForm: Form[models.Product], user: models.users.User, sizes: play.data.Form[models.Factory]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models._
import helper._

Seq[Any](format.raw/*1.117*/("""

"""),format.raw/*4.1*/("""

"""),format.raw/*7.1*/("""

"""),format.raw/*9.1*/("""<!-- Pass page title and content """),format.raw/*9.34*/("""{"""),format.raw/*9.35*/("""html between braces"""),format.raw/*9.54*/("""}"""),format.raw/*9.55*/(""" """),format.raw/*9.56*/("""to the main view -->
"""),_display_(/*10.2*/admin/*10.7*/.adminMain("Update product", user)/*10.41*/ {_display_(Seq[Any](format.raw/*10.43*/("""
"""),format.raw/*11.1*/("""<!--====================== J.T. =====================-->
    <h3>Update Product</h3>
    """),_display_(/*13.6*/if(flash.containsKey("success"))/*13.38*/{_display_(Seq[Any](format.raw/*13.39*/("""
							"""),format.raw/*14.8*/("""<div class="alert alert-success">
							"""),_display_(/*15.9*/flash/*15.14*/.get("success")),format.raw/*15.29*/("""
							"""),format.raw/*16.8*/("""</div>
						""")))}),format.raw/*17.8*/("""
						"""),_display_(/*18.8*/if(flash.containsKey("fail"))/*18.37*/{_display_(Seq[Any](format.raw/*18.38*/("""
							"""),format.raw/*19.8*/("""<div class="alert alert-danger">
							"""),_display_(/*20.9*/flash/*20.14*/.get("fail")),format.raw/*20.26*/("""
							"""),format.raw/*21.8*/("""</div>
						""")))}),format.raw/*22.8*/("""
        """),format.raw/*23.9*/("""<!-- Use the views.html.helpers package to create the form -->
    """),_display_(/*24.6*/form(action = routes.AdminController.updateProductSubmit(id), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*24.146*/ {_display_(Seq[Any](format.raw/*24.148*/("""

        """),_display_(/*26.10*/inputText(updateProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*26.90*/("""
        """),_display_(/*27.10*/inputText(updateProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*27.104*/("""


        """),_display_(/*30.10*/for((value, name) <- Category.options) yield /*30.48*/ {_display_(Seq[Any](format.raw/*30.50*/("""
            """),format.raw/*31.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*31.63*/value),format.raw/*31.68*/(""""
            """),_display_(/*32.14*/if(Category.inCategory(value.toLong, id))/*32.55*/ {_display_(Seq[Any](format.raw/*32.57*/("""
                """),format.raw/*33.17*/("""checked
            """)))}),format.raw/*34.14*/("""
            """),format.raw/*35.13*/("""/>"""),_display_(/*35.16*/name),format.raw/*35.20*/("""<br>
        """)))}),format.raw/*36.10*/("""

    """),_display_(/*38.6*/inputText(updateProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*38.88*/("""
    """),_display_(/*39.6*/inputText(updateProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*39.88*/("""
"""),format.raw/*40.1*/("""<!--====================== J.T. end =====================-->
<!--====================== A.S. =====================-->
		"""),_display_(/*42.4*/inputText(sizes("strFormat1"), '_label -> "Size 1",'class -> "form-control")),format.raw/*42.80*/("""
		"""),_display_(/*43.4*/inputText(sizes("strFormat2"), '_label -> "Size 2",'class -> "form-control")),format.raw/*43.80*/("""
		"""),_display_(/*44.4*/inputText(sizes("strFormat3"), '_label -> "Size 3",'class -> "form-control")),format.raw/*44.80*/("""
		"""),_display_(/*45.4*/inputText(sizes("strFormat4"), '_label -> "Size 4",'class -> "form-control")),format.raw/*45.80*/("""
"""),format.raw/*46.1*/("""<!--====================== A.S. end =====================-->
<!--====================== J.T. =====================-->
        <!-- Image upload input -->
    <label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">

    <br><br>

        <!-- Update a submit button -->
    <div class="actions">
        <input href=""""),_display_(/*56.23*/routes/*56.29*/.AdminController.products(0)),format.raw/*56.57*/("""" type="submit" value="Update" class="btn btn-primary">
        <a href=""""),_display_(/*57.19*/routes/*57.25*/.AdminController.products(0)),format.raw/*57.53*/(""""
        <button class="btn btn-primary" role="button">Cancel</button>
        </a>
    </div>
    """)))}),format.raw/*61.6*/(""" """),format.raw/*61.7*/("""<!-- End Form definition -->

    """)))}),format.raw/*63.6*/(""" """),format.raw/*63.7*/("""<!-- End of page content -->
<!--====================== J.T. end =====================-->"""))
      }
    }
  }

  def render(id:Long,updateProductForm:Form[models.Product],user:models.users.User,sizes:play.data.Form[models.Factory]): play.twirl.api.HtmlFormat.Appendable = apply(id,updateProductForm,user,sizes)

  def f:((Long,Form[models.Product],models.users.User,play.data.Form[models.Factory]) => play.twirl.api.HtmlFormat.Appendable) = (id,updateProductForm,user,sizes) => apply(id,updateProductForm,user,sizes)

  def ref: this.type = this

}


}

/**/
object updateProduct extends updateProduct_Scope0.updateProduct
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:18:43 IST 2017
                  SOURCE: /home/wdd/Desktop/project2/project2017/app/views/admin/updateProduct.scala.html
                  HASH: 4420cf1bab6933ab0dc144e6d36a3107a67f8063
                  MATRIX: 835->1|1077->116|1105->135|1133->154|1161->156|1221->189|1249->190|1295->209|1323->210|1351->211|1399->233|1412->238|1455->272|1495->274|1523->275|1639->365|1680->397|1719->398|1754->406|1822->448|1836->453|1872->468|1907->476|1951->490|1985->498|2023->527|2062->528|2097->536|2164->577|2178->582|2211->594|2246->602|2290->616|2326->625|2420->693|2570->833|2611->835|2649->846|2750->926|2787->936|2903->1030|2942->1042|2996->1080|3036->1082|3077->1095|3154->1145|3180->1150|3222->1165|3272->1206|3312->1208|3357->1225|3409->1246|3450->1259|3480->1262|3505->1266|3550->1280|3583->1287|3686->1369|3718->1375|3821->1457|3849->1458|3996->1579|4093->1655|4123->1659|4220->1735|4250->1739|4347->1815|4377->1819|4474->1895|4502->1896|4876->2243|4891->2249|4940->2277|5041->2351|5056->2357|5105->2385|5236->2486|5264->2487|5329->2522|5357->2523
                  LINES: 27->1|33->1|35->4|37->7|39->9|39->9|39->9|39->9|39->9|39->9|40->10|40->10|40->10|40->10|41->11|43->13|43->13|43->13|44->14|45->15|45->15|45->15|46->16|47->17|48->18|48->18|48->18|49->19|50->20|50->20|50->20|51->21|52->22|53->23|54->24|54->24|54->24|56->26|56->26|57->27|57->27|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|64->34|65->35|65->35|65->35|66->36|68->38|68->38|69->39|69->39|70->40|72->42|72->42|73->43|73->43|74->44|74->44|75->45|75->45|76->46|86->56|86->56|86->56|87->57|87->57|87->57|91->61|91->61|93->63|93->63
                  -- GENERATED --
              */
          