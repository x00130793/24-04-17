
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
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

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[models.Product],models.users.User,play.data.Form[models.Factory],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addProductForm: play.data.Form[models.Product], user: models.users.User, sizes: play.data.Form[models.Factory]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models._
import helper._

Seq[Any](format.raw/*1.114*/("""
"""),format.raw/*4.1*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/admin/*8.7*/.adminMain("Add Product", user)/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""
"""),format.raw/*9.1*/("""<!--====================== J.T. =====================-->
	<h3>Add a new Product</h3>
	"""),_display_(/*11.3*/if(flash.containsKey("success"))/*11.35*/{_display_(Seq[Any](format.raw/*11.36*/("""
							"""),format.raw/*12.8*/("""<div class="alert alert-success">
							"""),_display_(/*13.9*/flash/*13.14*/.get("success")),format.raw/*13.29*/("""
							"""),format.raw/*14.8*/("""</div>
						""")))}),format.raw/*15.8*/("""
						"""),_display_(/*16.8*/if(flash.containsKey("fail"))/*16.37*/{_display_(Seq[Any](format.raw/*16.38*/("""
							"""),format.raw/*17.8*/("""<div class="alert alert-danger">
							"""),_display_(/*18.9*/flash/*18.14*/.get("fail")),format.raw/*18.26*/("""
							"""),format.raw/*19.8*/("""</div>
						""")))}),format.raw/*20.8*/("""
	"""),format.raw/*21.2*/("""<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*22.3*/form(action = routes.AdminController.addProductSubmit(), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*22.138*/ {_display_(Seq[Any](format.raw/*22.140*/("""
		
		"""),format.raw/*24.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*26.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*26.81*/("""
		"""),_display_(/*27.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*27.95*/("""

        """),format.raw/*29.9*/("""<!-- Checkboxes for categories - current categories for this product are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        """),_display_(/*31.10*/for((value, name) <- Category.options) yield /*31.48*/ {_display_(Seq[Any](format.raw/*31.50*/("""
            """),format.raw/*32.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*32.63*/value),format.raw/*32.68*/("""" />"""),_display_(/*32.73*/name),format.raw/*32.77*/("""<br>        
        """)))}),format.raw/*33.10*/("""

		"""),_display_(/*35.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*35.83*/("""
		"""),_display_(/*36.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*36.83*/("""
"""),format.raw/*37.1*/("""<!--====================== J.T. end =====================-->
<!--====================== A.S. =====================-->
		"""),_display_(/*39.4*/inputText(sizes("strFormat1"), '_label -> "Size 1",'class -> "form-control")),format.raw/*39.80*/("""
		"""),_display_(/*40.4*/inputText(sizes("strFormat2"), '_label -> "Size 2",'class -> "form-control")),format.raw/*40.80*/("""
		"""),_display_(/*41.4*/inputText(sizes("strFormat3"), '_label -> "Size 3",'class -> "form-control")),format.raw/*41.80*/("""
		"""),_display_(/*42.4*/inputText(sizes("strFormat4"), '_label -> "Size 4",'class -> "form-control")),format.raw/*42.80*/("""
"""),format.raw/*43.1*/("""<!--====================== A.S. end =====================-->
<!--====================== J.T. =====================-->
		<!-- Image upload input -->
		<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

	<!-- Add a submit button -->
  <div class="actions">
      <input href=""""),_display_(/*53.21*/routes/*53.27*/.AdminController.products(0)),format.raw/*53.55*/("""" type="submit" value="Add Product" class="btn btn-primary">
			<a href=""""),_display_(/*54.14*/routes/*54.20*/.AdminController.products(0)),format.raw/*54.48*/(""""
				<button class="btn btn-primary">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*58.3*/(""" """),format.raw/*58.4*/("""<!-- End Form definition -->

""")))}),format.raw/*60.2*/(""" """),format.raw/*60.3*/("""<!-- End of page content -->
<!--====================== J.T. end =====================-->
"""))
      }
    }
  }

  def render(addProductForm:play.data.Form[models.Product],user:models.users.User,sizes:play.data.Form[models.Factory]): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user,sizes)

  def f:((play.data.Form[models.Product],models.users.User,play.data.Form[models.Factory]) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user,sizes) => apply(addProductForm,user,sizes)

  def ref: this.type = this

}


}

/**/
object addProduct extends addProduct_Scope0.addProduct
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:18:43 IST 2017
                  SOURCE: /home/wdd/Desktop/project2/project2017/app/views/admin/addProduct.scala.html
                  HASH: a2ae6e6381ea31f63f58462dabe038a5b369733d
                  MATRIX: 834->1|1073->113|1100->148|1130->251|1158->254|1170->259|1209->290|1248->292|1275->293|1388->380|1429->412|1468->413|1503->421|1571->463|1585->468|1621->483|1656->491|1700->505|1734->513|1772->542|1811->543|1846->551|1913->592|1927->597|1960->609|1995->617|2039->631|2068->633|2159->698|2304->833|2345->835|2378->841|2499->936|2597->1013|2627->1017|2739->1108|2776->1118|2971->1286|3025->1324|3065->1326|3106->1339|3183->1389|3209->1394|3241->1399|3266->1403|3319->1425|3350->1430|3450->1509|3480->1513|3580->1592|3608->1593|3755->1714|3852->1790|3882->1794|3979->1870|4009->1874|4106->1950|4136->1954|4233->2030|4261->2031|4612->2355|4627->2361|4676->2389|4777->2463|4792->2469|4841->2497|4944->2570|4972->2571|5033->2602|5061->2603
                  LINES: 27->1|33->1|34->4|36->6|38->8|38->8|38->8|38->8|39->9|41->11|41->11|41->11|42->12|43->13|43->13|43->13|44->14|45->15|46->16|46->16|46->16|47->17|48->18|48->18|48->18|49->19|50->20|51->21|52->22|52->22|52->22|54->24|56->26|56->26|57->27|57->27|59->29|61->31|61->31|61->31|62->32|62->32|62->32|62->32|62->32|63->33|65->35|65->35|66->36|66->36|67->37|69->39|69->39|70->40|70->40|71->41|71->41|72->42|72->42|73->43|83->53|83->53|83->53|84->54|84->54|84->54|88->58|88->58|90->60|90->60
                  -- GENERATED --
              */
          