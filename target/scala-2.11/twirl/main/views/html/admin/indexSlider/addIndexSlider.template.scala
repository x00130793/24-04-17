
package views.html.admin.indexSlider

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addIndexSlider_Scope0 {
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

     object addIndexSlider_Scope1 {
import models.IndexSlider
import helper._

class addIndexSlider extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.User,play.data.Form[IndexSlider],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: models.users.User, sliderForm: play.data.Form[IndexSlider]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.68*/("""



"""),_display_(/*7.2*/admin/*7.7*/.adminMain("Add slider in index", user)/*7.46*/ {_display_(Seq[Any](format.raw/*7.48*/("""
"""),format.raw/*8.1*/("""<!--====================== J.T. =====================-->
	<h3>Add Slider in index page</h3>
	"""),_display_(/*10.3*/if(flash.containsKey("success"))/*10.35*/{_display_(Seq[Any](format.raw/*10.36*/("""
							"""),format.raw/*11.8*/("""<div class="alert alert-success">
							"""),_display_(/*12.9*/flash/*12.14*/.get("success")),format.raw/*12.29*/("""
							"""),format.raw/*13.8*/("""</div>
						""")))}),format.raw/*14.8*/("""
						"""),_display_(/*15.8*/if(flash.containsKey("fail"))/*15.37*/{_display_(Seq[Any](format.raw/*15.38*/("""
							"""),format.raw/*16.8*/("""<div class="alert alert-danger">
							"""),_display_(/*17.9*/flash/*17.14*/.get("fail")),format.raw/*17.26*/("""
							"""),format.raw/*18.8*/("""</div>
						""")))}),format.raw/*19.8*/("""

	"""),_display_(/*21.3*/form(action = routes.AdminController.addIndexSliderSubmit(), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*21.142*/ {_display_(Seq[Any](format.raw/*21.144*/("""
		

		"""),_display_(/*24.4*/inputText(sliderForm("heading"), '_label -> "Heading 1",'class -> "form-control")),format.raw/*24.85*/("""
		"""),_display_(/*25.4*/inputText(sliderForm("heading2"), '_label -> "Heading 2",'class -> "form-control")),format.raw/*25.86*/("""
		"""),_display_(/*26.4*/inputText(sliderForm("content"), '_label -> "Content",'class -> "form-control")),format.raw/*26.83*/("""
	  """),_display_(/*27.5*/inputText(sliderForm("postLink"), '_label -> "Post link",'class -> "form-control")),format.raw/*27.87*/("""
		"""),format.raw/*28.3*/("""<!-- Image upload input -->
		<label>Image</label>
    <input class="btn btn-default get" type="file" name="upload">
	
		<br><br>

	<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Add slider" class="btn btn-default get">
			<a href=""""),_display_(/*37.14*/routes/*37.20*/.AdminController.addIndexSlider()),format.raw/*37.53*/(""""
				<button class="btn btn-default get">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*41.3*/(""" """),format.raw/*41.4*/("""<!-- End Form definition -->

""")))}),format.raw/*43.2*/(""" """),format.raw/*43.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(user:models.users.User,sliderForm:play.data.Form[IndexSlider]): play.twirl.api.HtmlFormat.Appendable = apply(user,sliderForm)

  def f:((models.users.User,play.data.Form[IndexSlider]) => play.twirl.api.HtmlFormat.Appendable) = (user,sliderForm) => apply(user,sliderForm)

  def ref: this.type = this

}


}
}

/**/
object addIndexSlider extends addIndexSlider_Scope0.addIndexSlider_Scope1.addIndexSlider
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:18:43 IST 2017
                  SOURCE: /home/wdd/Desktop/project2/project2017/app/views/admin/indexSlider/addIndexSlider.scala.html
                  HASH: f1b4f04168353bdaf398ca9572dddd2421363b99
                  MATRIX: 899->45|1060->111|1090->116|1102->121|1149->160|1188->162|1215->163|1335->257|1376->289|1415->290|1450->298|1518->340|1532->345|1568->360|1603->368|1647->382|1681->390|1719->419|1758->420|1793->428|1860->469|1874->474|1907->486|1942->494|1986->508|2016->512|2165->651|2206->653|2240->661|2342->742|2372->746|2475->828|2505->832|2605->911|2636->916|2739->998|2769->1001|3069->1274|3084->1280|3138->1313|3245->1390|3273->1391|3334->1422|3362->1423
                  LINES: 31->3|36->3|40->7|40->7|40->7|40->7|41->8|43->10|43->10|43->10|44->11|45->12|45->12|45->12|46->13|47->14|48->15|48->15|48->15|49->16|50->17|50->17|50->17|51->18|52->19|54->21|54->21|54->21|57->24|57->24|58->25|58->25|59->26|59->26|60->27|60->27|61->28|70->37|70->37|70->37|74->41|74->41|76->43|76->43
                  -- GENERATED --
              */
          