
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
							<div class="list-group">

								<h4 class="panel-title">
									<a href=""""),_display_(/*25.20*/routes/*25.26*/.CustomerCtrl.orderHistory(catId, filter)),format.raw/*25.67*/("""" class="list-group-item">Order history</a>
									<a href=""""),_display_(/*26.20*/routes/*26.26*/.CustomerCtrl.profileEdit(catId, filter)),format.raw/*26.66*/("""" class="list-group-item">Edit profile</a>
								</h4>

							</div>
					</div>
				<div>
			</div>
		</div>


""")))}),format.raw/*36.2*/("""

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
                  DATE: Mon Apr 24 13:45:14 IST 2017
                  SOURCE: /home/wdd/Desktop/project/24-04-17/app/views/customer/profile.scala.html
                  HASH: 416e4a375df581ac2fa5a586270ee45aa15e2501
                  MATRIX: 825->1|1043->123|1072->127|1128->175|1168->178|1195->179|1373->331|1414->363|1453->364|1488->372|1556->414|1570->419|1606->434|1641->442|1685->456|1719->464|1757->493|1796->494|1831->502|1898->543|1912->548|1945->560|1980->568|2024->582|2057->588|2238->742|2253->748|2315->789|2405->852|2420->858|2481->898|2627->1014
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|51->20|56->25|56->25|56->25|57->26|57->26|57->26|67->36
                  -- GENERATED --
              */
          