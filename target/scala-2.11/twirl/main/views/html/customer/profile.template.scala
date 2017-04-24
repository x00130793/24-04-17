
package views.html.customer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[models.users.Customer,models.users.User,List[models.Category],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, user: models.users.User, categories: List[models.Category], catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.124*/("""


"""),_display_(/*4.2*/main("Profile", user, categories, catId, filter)/*4.50*/  {_display_(Seq[Any](format.raw/*4.53*/("""
"""),format.raw/*5.1*/("""<!--====================== J.T. =====================-->

		<div class="container">
			<div class="row">
				<div class="col-sm-9 padding-right">
					"""),_display_(/*10.7*/if(flash.containsKey("success"))/*10.39*/{_display_(Seq[Any](format.raw/*10.40*/("""
							"""),format.raw/*11.8*/("""<div class="alert alert-success">
							"""),_display_(/*12.9*/flash/*12.14*/.get("success")),format.raw/*12.29*/("""
							"""),format.raw/*13.8*/("""</div>
						""")))}),format.raw/*14.8*/("""
						"""),_display_(/*15.8*/if(flash.containsKey("fail"))/*15.37*/{_display_(Seq[Any](format.raw/*15.38*/("""
							"""),format.raw/*16.8*/("""<div class="alert alert-danger">
							"""),_display_(/*17.9*/flash/*17.14*/.get("fail")),format.raw/*17.26*/("""
							"""),format.raw/*18.8*/("""</div>
						""")))}),format.raw/*19.8*/("""
					"""),format.raw/*20.6*/("""<h2 class="title text-center">Profile</h2>
					<div id="accordian">
						<strong><p>User Name: </strong> """),_display_(/*22.40*/user/*22.44*/.getfName),format.raw/*22.53*/(""" """),format.raw/*22.54*/("""</p>
						<strong><p>User Surname: </strong> """),_display_(/*23.43*/user/*23.47*/.getlName),format.raw/*23.56*/(""" """),format.raw/*23.57*/("""</p>
						<strong><p>Role: </strong> """),_display_(/*24.35*/user/*24.39*/.getRole),format.raw/*24.47*/(""" """),format.raw/*24.48*/("""</p>
						<strong><p>Street 1: </strong> """),_display_(/*25.39*/customer/*25.47*/.getStreet1),format.raw/*25.58*/(""" """),format.raw/*25.59*/("""</p>
						<strong><p>Street 2: </strong> """),_display_(/*26.39*/customer/*26.47*/.getStreet2),format.raw/*26.58*/(""" """),format.raw/*26.59*/("""</p>
						<strong><p>Town: </strong> """),_display_(/*27.35*/customer/*27.43*/.getTown),format.raw/*27.51*/(""" """),format.raw/*27.52*/("""</p>
						<strong><p>Post Code: </strong> """),_display_(/*28.40*/customer/*28.48*/.getPostCode),format.raw/*28.60*/(""" """),format.raw/*28.61*/("""</p>
						<strong><p>Country: </strong> """),_display_(/*29.38*/customer/*29.46*/.getCountry),format.raw/*29.57*/(""" """),format.raw/*29.58*/("""</p>
						
							<div class="list-group">

								<h4 class="btn btn-sm">
									<a href=""""),_display_(/*34.20*/routes/*34.26*/.CustomerCtrl.orderHistory(catId, filter)),format.raw/*34.67*/("""" class="list-group-item">Order history</a>
									
								</h4>
								
								<h4 class="btn btn-sm">
									<a href=""""),_display_(/*39.20*/routes/*39.26*/.CustomerCtrl.profileEdit(catId, filter)),format.raw/*39.66*/("""" class="list-group-item">Edit profile</a>
									
								</h4>

							

							</div>

						<div class="row">

            					


        					</div>
					</div>
				<div>
			</div>
		</div>


""")))}),format.raw/*59.2*/("""

"""))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,categories:List[models.Category],catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,categories,catId,filter)

  def f:((models.users.Customer,models.users.User,List[models.Category],Long,String) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,categories,catId,filter) => apply(customer,user,categories,catId,filter)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 15:31:53 IST 2017
                  SOURCE: /home/wdd/Desktop/project/24-04-17/app/views/customer/profile.scala.html
                  HASH: 4ef83ef44b97e118583701819414c50c7f75fe15
                  MATRIX: 825->1|1043->123|1072->127|1128->175|1168->178|1195->179|1373->331|1414->363|1453->364|1488->372|1556->414|1570->419|1606->434|1641->442|1685->456|1719->464|1757->493|1796->494|1831->502|1898->543|1912->548|1945->560|1980->568|2024->582|2057->588|2192->696|2205->700|2235->709|2264->710|2338->757|2351->761|2381->770|2410->771|2476->810|2489->814|2518->822|2547->823|2617->866|2634->874|2666->885|2695->886|2765->929|2782->937|2814->948|2843->949|2909->988|2926->996|2955->1004|2984->1005|3055->1049|3072->1057|3105->1069|3134->1070|3203->1112|3220->1120|3252->1131|3281->1132|3404->1228|3419->1234|3481->1275|3636->1403|3651->1409|3712->1449|3943->1650
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|51->20|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|65->34|65->34|65->34|70->39|70->39|70->39|90->59
                  -- GENERATED --
              */
          