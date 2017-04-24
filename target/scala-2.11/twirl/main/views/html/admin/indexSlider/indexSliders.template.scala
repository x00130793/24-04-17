
package views.html.admin.indexSlider

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object indexSliders_Scope0 {
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

     object indexSliders_Scope1 {
import models.IndexSlider
import models.users.User

class indexSliders extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[play.api.Environment,User,List[IndexSlider],IndexSlider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(env: play.api.Environment, user: User, iList: List[IndexSlider], activeI: IndexSlider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.89*/("""


"""),_display_(/*7.2*/admin/*7.7*/.adminMain("Index Sliders", user)/*7.40*/ {_display_(Seq[Any](format.raw/*7.42*/("""
"""),format.raw/*8.1*/("""<!--====================== J.T. =====================-->

    <div class="row">
			<div class="col-sm-2"></div>
        <div class="col-sm-8">
					<h2 class="title text-center">Index Sliders</h2>

            """),_display_(/*15.14*/if(flash.containsKey("success"))/*15.46*/{_display_(Seq[Any](format.raw/*15.47*/("""
							"""),format.raw/*16.8*/("""<div class="alert alert-success">
							"""),_display_(/*17.9*/flash/*17.14*/.get("success")),format.raw/*17.29*/("""
							"""),format.raw/*18.8*/("""</div>
						""")))}),format.raw/*19.8*/("""
						"""),_display_(/*20.8*/if(flash.containsKey("fail"))/*20.37*/{_display_(Seq[Any](format.raw/*20.38*/("""
							"""),format.raw/*21.8*/("""<div class="alert alert-danger">
							"""),_display_(/*22.9*/flash/*22.14*/.get("fail")),format.raw/*22.26*/("""
							"""),format.raw/*23.8*/("""</div>
						""")))}),format.raw/*24.8*/("""
          
	"""),format.raw/*26.2*/("""<section id="slider"><!--slider-->
		<div class="container">
			<div class="row">
				<div class="col-sm-9">
					<div id="slider-carousel" class="carousel slide" data-ride="carousel">


						<div class="carousel-inner" style="height: 245px;">
							<div class="item active">
								<div class="col-sm-6">
									<h1><span>"""),_display_(/*36.21*/activeI/*36.28*/.getHeading),format.raw/*36.39*/("""</span></h1>
									<h2>"""),_display_(/*37.15*/activeI/*37.22*/.getHeading2),format.raw/*37.34*/("""</h2>
									<p>"""),_display_(/*38.14*/activeI/*38.21*/.getContent),format.raw/*38.32*/("""</p>
									<a href=""""),_display_(/*39.20*/routes/*39.26*/.AdminController.updateIndexSlider(activeI.getId)),format.raw/*39.75*/("""" <button type="button" class="btn btn-info">Update</button></a>
									<a href=""""),_display_(/*40.20*/routes/*40.26*/.AdminController.deleteIndexSlider(activeI.getId)),format.raw/*40.75*/("""" <button type="button" class="btn btn-danger">Delete</button></a>
								</div>
								<div class="col-sm-6">
									<img src="/assets/images/slider/"""),_display_(/*43.43*/(activeI.getId)),format.raw/*43.58*/(""".jpg" class="girl img-responsive" alt="" />

							</div>
							</div>
							"""),_display_(/*47.9*/for(i <- iList) yield /*47.24*/{_display_(Seq[Any](format.raw/*47.25*/("""
							
								"""),format.raw/*49.9*/("""<div class="pushDown item">
									<div class="col-sm-6">
										<h1><span>"""),_display_(/*51.22*/activeI/*51.29*/.getHeading),format.raw/*51.40*/("""</span></h1>
										<h2>"""),_display_(/*52.16*/i/*52.17*/.getHeading2),format.raw/*52.29*/("""</h2>
										<p>"""),_display_(/*53.15*/i/*53.16*/.getContent),format.raw/*53.27*/("""</p>
										<a href=""""),_display_(/*54.21*/routes/*54.27*/.AdminController.updateIndexSlider(i.getId)),format.raw/*54.70*/("""" <button type="button" class="btn btn-info">Update</button></a>
									  <a href=""""),_display_(/*55.22*/routes/*55.28*/.AdminController.deleteIndexSlider(i.getId)),format.raw/*55.71*/("""" <button type="button" class="btn btn-danger">Delete</button></a>
									</div>
									<div class="col-sm-6">
										<img src="/assets/images/slider/"""),_display_(/*58.44*/(i.getId)),format.raw/*58.53*/(""".jpg" class="girl img-responsive" alt="" />
										
										<!--<img src="/assets/images/home/new.png"  class="pricing" alt="" />-->
									</div>
								</div>
							""")))}),format.raw/*63.9*/("""

						"""),format.raw/*65.7*/("""</div>

						<a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
							<i class="fa fa-angle-left"></i>
						</a>
						<a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
							<i class="fa fa-angle-right"></i>
						</a>
					</div>

				</div>
			</div>
		</div>
	</section><!--/slider-->
			<div class="actions text-center">
			<a href=""""),_display_(/*80.14*/routes/*80.20*/.AdminController.addIndexSlider()),format.raw/*80.53*/(""""
				<button class="btn btn-success">Add slider</button>
			</a>
			</div>
			
        </div>
    </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*90.27*/("""{"""),format.raw/*90.28*/("""
        """),format.raw/*91.9*/("""return confirm('Are you sure?');
    """),format.raw/*92.5*/("""}"""),format.raw/*92.6*/("""
  """),format.raw/*93.3*/("""</script>

  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(env:play.api.Environment,user:User,iList:List[IndexSlider],activeI:IndexSlider): play.twirl.api.HtmlFormat.Appendable = apply(env,user,iList,activeI)

  def f:((play.api.Environment,User,List[IndexSlider],IndexSlider) => play.twirl.api.HtmlFormat.Appendable) = (env,user,iList,activeI) => apply(env,user,iList,activeI)

  def ref: this.type = this

}


}
}

/**/
object indexSliders extends indexSliders_Scope0.indexSliders_Scope1.indexSliders
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 13:45:14 IST 2017
                  SOURCE: /home/wdd/Desktop/project/24-04-17/app/views/admin/indexSlider/indexSliders.scala.html
                  HASH: e1ae02502ee933b02931ae92939f0ed46aa6bf5d
                  MATRIX: 912->55|1094->142|1123->146|1135->151|1176->184|1215->186|1242->187|1480->398|1521->430|1560->431|1595->439|1663->481|1677->486|1713->501|1748->509|1792->523|1826->531|1864->560|1903->561|1938->569|2005->610|2019->615|2052->627|2087->635|2131->649|2171->662|2527->991|2543->998|2575->1009|2629->1036|2645->1043|2678->1055|2724->1074|2740->1081|2772->1092|2823->1116|2838->1122|2908->1171|3019->1255|3034->1261|3104->1310|3286->1465|3322->1480|3429->1561|3460->1576|3499->1577|3543->1594|3651->1675|3667->1682|3699->1693|3754->1721|3764->1722|3797->1734|3844->1754|3854->1755|3886->1766|3938->1791|3953->1797|4017->1840|4130->1926|4145->1932|4209->1975|4394->2133|4424->2142|4631->2319|4666->2327|5108->2742|5123->2748|5177->2781|5426->3002|5455->3003|5491->3012|5555->3049|5583->3050|5613->3053
                  LINES: 31->4|36->4|39->7|39->7|39->7|39->7|40->8|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|56->24|58->26|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|75->43|75->43|79->47|79->47|79->47|81->49|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|86->54|86->54|86->54|87->55|87->55|87->55|90->58|90->58|95->63|97->65|112->80|112->80|112->80|122->90|122->90|123->91|124->92|124->92|125->93
                  -- GENERATED --
              */
          