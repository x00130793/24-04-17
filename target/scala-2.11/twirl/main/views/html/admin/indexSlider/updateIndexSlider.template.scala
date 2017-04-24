
package views.html.admin.indexSlider

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateIndexSlider_Scope0 {
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

     object updateIndexSlider_Scope1 {
import models.IndexSlider
import helper._

class updateIndexSlider extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.users.User,play.data.Form[IndexSlider],Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: models.users.User, sliderForm: play.data.Form[IndexSlider], id: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.78*/("""


"""),_display_(/*6.2*/admin/*6.7*/.adminMain("Update slider in index", user)/*6.49*/ {_display_(Seq[Any](format.raw/*6.51*/("""
"""),format.raw/*7.1*/("""<!--====================== J.T. =====================-->
	<h3>Update slider in index page</h3>
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

	"""),_display_(/*20.3*/form(action = routes.AdminController.updateIndexSliderSubmit(id), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*20.147*/ {_display_(Seq[Any](format.raw/*20.149*/("""
		

		"""),_display_(/*23.4*/inputText(sliderForm("heading"), '_label -> "Heading 1",'class -> "form-control")),format.raw/*23.85*/("""
		"""),_display_(/*24.4*/inputText(sliderForm("heading2"), '_label -> "Heading 2",'class -> "form-control")),format.raw/*24.86*/("""
        """),_display_(/*25.10*/inputText(sliderForm("content"), '_label -> "Content",'class -> "form-control")),format.raw/*25.89*/("""
        """),_display_(/*26.10*/inputText(sliderForm("postLink"), '_label -> "Post link",'class -> "form-control")),format.raw/*26.92*/("""
		"""),format.raw/*27.3*/("""<!-- Image upload input -->
		<label>Image</label>
    <input class="btn btn-default get" type="file" name="upload">
	
		<br><br>

	<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Update slider" class="btn btn-default get">
			<a href=""""),_display_(/*36.14*/routes/*36.20*/.AdminController.addIndexSlider()),format.raw/*36.53*/(""""
				<button class="btn btn-default get">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*40.3*/(""" """),format.raw/*40.4*/("""<!-- End Form definition -->

""")))}),format.raw/*42.2*/(""" """),format.raw/*42.3*/("""<!-- End of page content -->
"""))
      }
    }
  }

  def render(user:models.users.User,sliderForm:play.data.Form[IndexSlider],id:Long): play.twirl.api.HtmlFormat.Appendable = apply(user,sliderForm,id)

  def f:((models.users.User,play.data.Form[IndexSlider],Long) => play.twirl.api.HtmlFormat.Appendable) = (user,sliderForm,id) => apply(user,sliderForm,id)

  def ref: this.type = this

}


}
}

/**/
object updateIndexSlider extends updateIndexSlider_Scope0.updateIndexSlider_Scope1.updateIndexSlider
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:18:43 IST 2017
                  SOURCE: /home/wdd/Desktop/project2/project2017/app/views/admin/indexSlider/updateIndexSlider.scala.html
                  HASH: ae2df8e62e69e575b4a1a3ecea0d3ecd9a210e16
                  MATRIX: 913->45|1084->121|1113->125|1125->130|1175->172|1214->174|1241->175|1363->272|1403->304|1441->305|1476->313|1544->355|1558->360|1594->375|1629->383|1673->397|1707->405|1745->434|1784->435|1819->443|1886->484|1900->489|1933->501|1968->509|2012->523|2042->527|2196->671|2237->673|2271->681|2373->762|2403->766|2506->848|2543->858|2643->937|2680->947|2783->1029|2813->1032|3116->1308|3131->1314|3185->1347|3292->1424|3320->1425|3381->1456|3409->1457
                  LINES: 31->3|36->3|39->6|39->6|39->6|39->6|40->7|42->9|42->9|42->9|43->10|44->11|44->11|44->11|45->12|46->13|47->14|47->14|47->14|48->15|49->16|49->16|49->16|50->17|51->18|53->20|53->20|53->20|56->23|56->23|57->24|57->24|58->25|58->25|59->26|59->26|60->27|69->36|69->36|69->36|73->40|73->40|75->42|75->42
                  -- GENERATED --
              */
          