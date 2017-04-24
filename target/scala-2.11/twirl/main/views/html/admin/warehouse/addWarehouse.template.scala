
package views.html.admin.warehouse

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addWarehouse_Scope0 {
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

class addWarehouse extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.users.Warehouse],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(wForm: play.data.Form[models.users.Warehouse], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import models.users.User;

Seq[Any](format.raw/*1.74*/("""
"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/admin/*6.7*/.adminMain("Add Warehouse", user)/*6.40*/ {_display_(Seq[Any](format.raw/*6.42*/("""
	"""),format.raw/*7.2*/("""<h3>Add a new Warehouse</h3>

	"""),_display_(/*9.3*/if(flash.containsKey("success"))/*9.35*/{_display_(Seq[Any](format.raw/*9.36*/("""
							"""),format.raw/*10.8*/("""<div class="alert alert-success">
							"""),_display_(/*11.9*/flash/*11.14*/.get("success")),format.raw/*11.29*/("""
							"""),format.raw/*12.8*/("""</div>
						""")))}),format.raw/*13.8*/("""
						"""),_display_(/*14.8*/if(flash.containsKey("fail"))/*14.37*/{_display_(Seq[Any](format.raw/*14.38*/("""
							"""),format.raw/*15.8*/("""<div class="alert alert-danger">
							"""),_display_(/*16.9*/flash/*16.14*/.get("fail")),format.raw/*16.26*/("""
							"""),format.raw/*17.8*/("""</div>
						""")))}),format.raw/*18.8*/("""


	"""),format.raw/*21.2*/("""<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*22.3*/form(action = routes.AdminController.addWarehouseSubmit(), 'class -> "form-horizontal", 'role->"form")/*22.105*/ {_display_(Seq[Any](format.raw/*22.107*/("""
		
		"""),_display_(/*24.4*/inputText(wForm("fName"), '_label -> "Fisrt Name",'class -> "form-control ")),format.raw/*24.80*/("""
		"""),_display_(/*25.4*/inputText(wForm("lName"), '_label -> "Second Name",'class -> "form-control")),format.raw/*25.80*/("""
		"""),_display_(/*26.4*/inputText(wForm("email"), '_label -> "E-mail",'class -> "form-control")),format.raw/*26.75*/("""
		"""),_display_(/*27.4*/inputText(wForm("password"), '_label -> "Password",'class -> "form-control", 'type -> "password")),format.raw/*27.101*/("""
		"""),_display_(/*28.4*/inputText(wForm("password2"), '_label -> "Repeat Password",'class -> "form-control", 'type -> "password")),format.raw/*28.109*/("""
							
		"""),_display_(/*30.4*/inputText(wForm("street1"), '_label -> "Street 1",'class -> "form-control")),format.raw/*30.79*/("""
		"""),_display_(/*31.4*/inputText(wForm("street2"), '_label -> "street 2",'class -> "form-control")),format.raw/*31.79*/("""
		"""),_display_(/*32.4*/inputText(wForm("town"), '_label -> "Town",'class -> "form-control")),format.raw/*32.72*/("""
		"""),_display_(/*33.4*/select(
		wForm("country"),
		options(Seq("United Kingdom", "Ireland", "France", "Spain", "Germany", "Netherlands",
					"Belgium", "Portugal", "Belgium", "Poland", "Czech Republic", "Latvia", 
					"Lithuania", "Norway", "Sweden", "Denmark")),
					'_label -> "Country", 
					'_default -> "-- Select Country --"
					)),format.raw/*40.7*/("""	
		
	"""),format.raw/*42.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input 
				href=""""),_display_(/*45.12*/routes/*45.18*/.AdminController.warehouses1()),format.raw/*45.48*/(""""  type="submit" value="Add Warehouse" class="btn btn-primary">

			<a href=""""),_display_(/*47.14*/routes/*47.20*/.AdminController.warehouses1()),format.raw/*47.50*/(""""
				<button class="btn btn-primary">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*51.3*/(""" """),format.raw/*51.4*/("""<!-- End Form definition -->

""")))}),format.raw/*53.2*/(""" """),format.raw/*53.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(wForm:play.data.Form[models.users.Warehouse],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(wForm,user)

  def f:((play.data.Form[models.users.Warehouse],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (wForm,user) => apply(wForm,user)

  def ref: this.type = this

}


}

/**/
object addWarehouse extends addWarehouse_Scope0.addWarehouse
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 13:45:14 IST 2017
                  SOURCE: /home/wdd/Desktop/project/24-04-17/app/views/admin/warehouse/addWarehouse.scala.html
                  HASH: 715510e6e5a2dc1e3511b1a1e01f4d02a1592489
                  MATRIX: 825->1|1033->73|1060->118|1088->121|1100->126|1141->159|1180->161|1208->163|1265->195|1305->227|1343->228|1378->236|1446->278|1460->283|1496->298|1531->306|1575->320|1609->328|1647->357|1686->358|1721->366|1788->407|1802->412|1835->424|1870->432|1914->446|1945->450|2036->515|2148->617|2189->619|2222->626|2319->702|2349->706|2446->782|2476->786|2568->857|2598->861|2717->958|2747->962|2874->1067|2912->1079|3008->1154|3038->1158|3134->1233|3164->1237|3253->1305|3283->1309|3623->1629|3656->1635|3761->1713|3776->1719|3827->1749|3932->1827|3947->1833|3998->1863|4101->1936|4129->1937|4190->1968|4218->1969
                  LINES: 27->1|33->1|34->4|36->6|36->6|36->6|36->6|37->7|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|43->13|44->14|44->14|44->14|45->15|46->16|46->16|46->16|47->17|48->18|51->21|52->22|52->22|52->22|54->24|54->24|55->25|55->25|56->26|56->26|57->27|57->27|58->28|58->28|60->30|60->30|61->31|61->31|62->32|62->32|63->33|70->40|72->42|75->45|75->45|75->45|77->47|77->47|77->47|81->51|81->51|83->53|83->53
                  -- GENERATED --
              */
          