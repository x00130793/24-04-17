
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

class profileEdit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[models.users.Customer,models.users.User,List[models.Category],Form[models.users.User],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, user: models.users.User, categories: List[models.Category], editProfileForm: Form[models.users.User], catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.166*/("""


"""),_display_(/*4.2*/main("Edit profile", user, categories, catId, filter)/*4.55*/  {_display_(Seq[Any](format.raw/*4.58*/("""
"""),format.raw/*5.1*/("""<!--====================== A.S. =====================-->

	<div class="container">
		<div class="row">
			<div class="col-sm-9 padding-right">
				
				
				<h2 class="title text-center">Edit profile</h2>
				<div id="accordian">
					<div class="list-group">

							"""),_display_(/*16.9*/helper/*16.15*/.form(action = controllers.routes.LoginController.editProfileForm(user.getEmail(), catId, filter), 'enctype -> "multipart/form-data")/*16.148*/ {_display_(Seq[Any](format.raw/*16.150*/("""
								"""),format.raw/*17.9*/("""<div class="well">
								"""),_display_(/*18.10*/inputText(editProfileForm("fName"), 'class -> "form-control")),format.raw/*18.71*/("""
								"""),format.raw/*19.9*/("""</div>

								
					</div>
				</div>
				<div>
				</div>
			</div>


""")))}),format.raw/*29.2*/("""
""")))}),format.raw/*30.2*/("""
"""))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,categories:List[models.Category],editProfileForm:Form[models.users.User],catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,categories,editProfileForm,catId,filter)

  def f:((models.users.Customer,models.users.User,List[models.Category],Form[models.users.User],Long,String) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,categories,editProfileForm,catId,filter) => apply(customer,user,categories,editProfileForm,catId,filter)

  def ref: this.type = this

}


}

/**/
object profileEdit extends profileEdit_Scope0.profileEdit
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:57:06 IST 2017
                  SOURCE: /home/wdd/Desktop/project2/project2017/app/views/customer/profileFiles/profileEdit.scala.html
                  HASH: a5da78109040ddf1daf0cf7decaf2e59c3a698f5
                  MATRIX: 870->1|1130->165|1159->169|1220->222|1260->225|1287->226|1582->495|1597->501|1740->634|1781->636|1817->645|1872->673|1954->734|1990->743|2094->817|2126->819
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|47->16|47->16|47->16|47->16|48->17|49->18|49->18|50->19|60->29|61->30
                  -- GENERATED --
              */
          