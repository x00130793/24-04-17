
package views.html.customer.profileFiles

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profileEdit_Scope0 {
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

class profileEdit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[models.users.Customer,models.users.User,List[models.Category],Form[models.Factory],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, user: models.users.User, categories: List[models.Category], c1: Form[models.Factory], catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.150*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Edit profile", user, categories, catId, filter)/*4.55*/  {_display_(Seq[Any](format.raw/*4.58*/("""
"""),format.raw/*5.1*/("""<!--====================== A.S. =====================-->

	<div class="container">
		<div class="row">
			<div class="col-sm-9 padding-right">
				"""),_display_(/*10.6*/if(flash.containsKey("success"))/*10.38*/{_display_(Seq[Any](format.raw/*10.39*/("""
							"""),format.raw/*11.8*/("""<div class="alert alert-success">
							"""),_display_(/*12.9*/flash/*12.14*/.get("success")),format.raw/*12.29*/("""
							"""),format.raw/*13.8*/("""</div>
						""")))}),format.raw/*14.8*/("""
						"""),_display_(/*15.8*/if(flash.containsKey("fail"))/*15.37*/{_display_(Seq[Any](format.raw/*15.38*/("""
							"""),format.raw/*16.8*/("""<div class="alert alert-danger">
							"""),_display_(/*17.9*/flash/*17.14*/.get("fail")),format.raw/*17.26*/("""
							"""),format.raw/*18.8*/("""</div>
						""")))}),format.raw/*19.8*/("""
				
				
				"""),format.raw/*22.5*/("""<h2 class="title text-center">Edit profile</h2>
				<div id="accordian">
					<div class="list-group">

							"""),_display_(/*26.9*/helper/*26.15*/.form(action = controllers.routes.CustomerCtrl.profileSubmit(catId, filter), 'enctype -> "multipart/form-data")/*26.126*/ {_display_(Seq[Any](format.raw/*26.128*/("""
								
								
							"""),_display_(/*29.9*/inputText(c1("strFormat1"), '_label -> "Street 1", 'class -> "form-control")),format.raw/*29.85*/("""				
						"""),format.raw/*30.7*/("""</div>

						<div class="form-group col-sm-12">
							"""),_display_(/*33.9*/inputText(c1("strFormat2"),  '_label -> "Street 2", 'class -> "form-control")),format.raw/*33.86*/("""	
						"""),format.raw/*34.7*/("""</div>

						<div class="form-group col-sm-12">
							"""),_display_(/*37.9*/inputText(c1("strFormat3"), '_label -> "Town", 'class -> "form-control")),format.raw/*37.81*/("""	
						"""),format.raw/*38.7*/("""</div>

						<div class="form-group col-sm-12">
							"""),_display_(/*41.9*/inputText(c1("strFormat4"), '_label -> "Post code", 'class -> "form-control")),format.raw/*41.86*/("""	
						"""),format.raw/*42.7*/("""</div>

						<div class="form-group col-sm-12">
							"""),_display_(/*45.9*/select(
							c1("strFormat5"),
							options(Seq("United Kingdom", "Ireland", "France", "Spain", "Germany", "Netherlands",
										"Belgium", "Portugal", "Belgium", "Poland", "Czech Republic", "Latvia", 
										"Lithuania", "Norway", "Sweden", "Denmark")),
							'_label -> "Country", 
							'_default -> "-- Select Country --"
							)),format.raw/*52.9*/("""
	
						"""),format.raw/*54.7*/("""</div>

						<div class="actions">
								<input type="submit" value="Update Profile" class="btn btn-success btn-sm" align="right">
								<a href=""""),_display_(/*58.19*/routes/*58.25*/.CustomerCtrl.profile()),format.raw/*58.48*/("""">
								</a>
							</div> 
							""")))}),format.raw/*61.9*/("""
								
					"""),format.raw/*63.6*/("""</div>
				</div>
			</div>
			</div>



""")))}),format.raw/*70.2*/("""
"""))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,categories:List[models.Category],c1:Form[models.Factory],catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,categories,c1,catId,filter)

  def f:((models.users.Customer,models.users.User,List[models.Category],Form[models.Factory],Long,String) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,categories,c1,catId,filter) => apply(customer,user,categories,c1,catId,filter)

  def ref: this.type = this

}


}

/**/
object profileEdit extends profileEdit_Scope0.profileEdit
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 15:12:04 IST 2017
                  SOURCE: /home/wdd/Desktop/project/24-04-17/app/views/customer/profileFiles/profileEdit.scala.html
                  HASH: 33db5d266854d5aa09c4fd6944810378773b271b
                  MATRIX: 867->1|1126->149|1153->167|1180->169|1241->222|1281->225|1308->226|1482->374|1523->406|1562->407|1597->415|1665->457|1679->462|1715->477|1750->485|1794->499|1828->507|1866->536|1905->537|1940->545|2007->586|2021->591|2054->603|2089->611|2133->625|2175->640|2313->752|2328->758|2449->869|2490->871|2543->898|2640->974|2678->985|2761->1042|2859->1119|2894->1127|2977->1184|3070->1256|3105->1264|3188->1321|3286->1398|3321->1406|3404->1463|3770->1809|3806->1818|3985->1970|4000->1976|4044->1999|4113->2038|4155->2053|4227->2095
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|35->5|40->10|40->10|40->10|41->11|42->12|42->12|42->12|43->13|44->14|45->15|45->15|45->15|46->16|47->17|47->17|47->17|48->18|49->19|52->22|56->26|56->26|56->26|56->26|59->29|59->29|60->30|63->33|63->33|64->34|67->37|67->37|68->38|71->41|71->41|72->42|75->45|82->52|84->54|88->58|88->58|88->58|91->61|93->63|100->70
                  -- GENERATED --
              */
          