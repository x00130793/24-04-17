
package views.html.admin.warehouse

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateWarehouse_Scope0 {
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

class updateWarehouse extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,play.data.Form[models.users.Warehouse],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(email: String, wForm: play.data.Form[models.users.Warehouse], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.89*/("""
"""),format.raw/*3.1*/("""

"""),format.raw/*5.1*/("""<!-- Pass page title and content """),format.raw/*5.34*/("""{"""),format.raw/*5.35*/("""html between braces"""),format.raw/*5.54*/("""}"""),format.raw/*5.55*/(""" """),format.raw/*5.56*/("""to the main view -->
"""),_display_(/*6.2*/admin/*6.7*/.adminMain("Update Warehouse", user)/*6.43*/ {_display_(Seq[Any](format.raw/*6.45*/("""
    """),format.raw/*7.5*/("""<h3>Update Warehouse</h3>
    """),_display_(/*8.6*/if(flash.containsKey("success"))/*8.38*/{_display_(Seq[Any](format.raw/*8.39*/("""
							"""),format.raw/*9.8*/("""<div class="alert alert-success">
							"""),_display_(/*10.9*/flash/*10.14*/.get("success")),format.raw/*10.29*/("""
							"""),format.raw/*11.8*/("""</div>
						""")))}),format.raw/*12.8*/("""
						"""),_display_(/*13.8*/if(flash.containsKey("fail"))/*13.37*/{_display_(Seq[Any](format.raw/*13.38*/("""
							"""),format.raw/*14.8*/("""<div class="alert alert-danger">
							"""),_display_(/*15.9*/flash/*15.14*/.get("fail")),format.raw/*15.26*/("""
							"""),format.raw/*16.8*/("""</div>
						""")))}),format.raw/*17.8*/("""


	"""),format.raw/*20.2*/("""<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*21.3*/form(action = routes.AdminController.updateWarehouseSubmit(email), 'class -> "form-horizontal", 'role->"form")/*21.113*/ {_display_(Seq[Any](format.raw/*21.115*/("""
		
		"""),_display_(/*23.4*/inputText(wForm("fName"), '_label -> "Fisrt Name",'class -> "form-control ")),format.raw/*23.80*/("""
		"""),_display_(/*24.4*/inputText(wForm("lName"), '_label -> "Second Name",'class -> "form-control")),format.raw/*24.80*/("""
		"""),_display_(/*25.4*/inputText(wForm("email"), '_label -> "E-mail",'class -> "form-control")),format.raw/*25.75*/("""
		"""),_display_(/*26.4*/inputText(wForm("password"), '_label -> "Password",'class -> "form-control", 'type -> "password")),format.raw/*26.101*/("""
		"""),_display_(/*27.4*/inputText(wForm("password2"), '_label -> "Repeat Password",'class -> "form-control", 'type -> "password")),format.raw/*27.109*/("""
							
		"""),_display_(/*29.4*/inputText(wForm("street1"), '_label -> "Street 1",'class -> "form-control")),format.raw/*29.79*/("""
		"""),_display_(/*30.4*/inputText(wForm("street2"), '_label -> "street 2",'class -> "form-control")),format.raw/*30.79*/("""
		"""),_display_(/*31.4*/inputText(wForm("town"), '_label -> "Town",'class -> "form-control")),format.raw/*31.72*/("""
		"""),_display_(/*32.4*/select(
		wForm("country"),
		options(Seq("United Kingdom", "Ireland", "France", "Spain", "Germany", "Netherlands",
					"Belgium", "Portugal", "Belgium", "Poland", "Czech Republic", "Latvia", 
					"Lithuania", "Norway", "Sweden", "Denmark")),
					'_label -> "Country", 
					'_default -> "-- Select Country --"
					)),format.raw/*39.7*/("""	

				
	"""),format.raw/*42.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input href=""""),_display_(/*44.21*/routes/*44.27*/.AdminController.warehouses1()),format.raw/*44.57*/("""" type="submit" value="Update warehouse" class="btn btn-primary">
			<a href=""""),_display_(/*45.14*/routes/*45.20*/.AdminController.warehouses1()),format.raw/*45.50*/(""""
				<button class="btn btn-primary">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*49.3*/(""" """),format.raw/*49.4*/("""<!-- End Form definition -->

""")))}),format.raw/*51.2*/(""" """),format.raw/*51.3*/("""<!-- End of page content -->"""))
      }
    }
  }

  def render(email:String,wForm:play.data.Form[models.users.Warehouse],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(email,wForm,user)

  def f:((String,play.data.Form[models.users.Warehouse],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (email,wForm,user) => apply(email,wForm,user)

  def ref: this.type = this

}


}

/**/
object updateWarehouse extends updateWarehouse_Scope0.updateWarehouse
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 13:45:14 IST 2017
                  SOURCE: /home/wdd/Desktop/project/24-04-17/app/views/admin/warehouse/updateWarehouse.scala.html
                  HASH: c98cb6341aef51f3edd8f7942df98a2ff44d6979
                  MATRIX: 838->1|1035->88|1062->106|1090->108|1150->141|1178->142|1224->161|1252->162|1280->163|1327->185|1339->190|1383->226|1422->228|1453->233|1509->264|1549->296|1587->297|1621->305|1689->347|1703->352|1739->367|1774->375|1818->389|1852->397|1890->426|1929->427|1964->435|2031->476|2045->481|2078->493|2113->501|2157->515|2188->519|2279->584|2399->694|2440->696|2473->703|2570->779|2600->783|2697->859|2727->863|2819->934|2849->938|2968->1035|2998->1039|3125->1144|3163->1156|3259->1231|3289->1235|3385->1310|3415->1314|3504->1382|3534->1386|3874->1706|3910->1715|4010->1788|4025->1794|4076->1824|4182->1903|4197->1909|4248->1939|4351->2012|4379->2013|4440->2044|4468->2045
                  LINES: 27->1|32->1|33->3|35->5|35->5|35->5|35->5|35->5|35->5|36->6|36->6|36->6|36->6|37->7|38->8|38->8|38->8|39->9|40->10|40->10|40->10|41->11|42->12|43->13|43->13|43->13|44->14|45->15|45->15|45->15|46->16|47->17|50->20|51->21|51->21|51->21|53->23|53->23|54->24|54->24|55->25|55->25|56->26|56->26|57->27|57->27|59->29|59->29|60->30|60->30|61->31|61->31|62->32|69->39|72->42|74->44|74->44|74->44|75->45|75->45|75->45|79->49|79->49|81->51|81->51
                  -- GENERATED --
              */
          