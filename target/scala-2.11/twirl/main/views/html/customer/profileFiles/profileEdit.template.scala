
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
import helper._

Seq[Any](format.raw/*1.166*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Edit profile", user, categories, catId, filter)/*4.55*/  {_display_(Seq[Any](format.raw/*4.58*/("""
"""),format.raw/*5.1*/("""<!--====================== A.S. =====================-->

	<div class="container">
		<div class="row">
			<div class="col-sm-9 padding-right">
				
				
				<h2 class="title text-center">Edit profile</h2>
				<div id="accordian">
					<div class="list-group">

							"""),_display_(/*16.9*/helper/*16.15*/.form(action = controllers.routes.LoginController.editProfileForm(user.getEmail(), catId, filter), 'enctype -> "multipart/form-data")/*16.148*/ {_display_(Seq[Any](format.raw/*16.150*/("""
								
								"""),format.raw/*18.9*/("""<div class="well">
								"""),_display_(/*19.10*/inputText(editProfileForm("fName"), 'class -> "form-control")),format.raw/*19.71*/("""
								"""),format.raw/*20.9*/("""</div>
							""")))}),format.raw/*21.9*/("""
								
					"""),format.raw/*23.6*/("""</div>
				</div>
				<div>
				</div>
			</div>



""")))}),format.raw/*31.2*/("""
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
                  DATE: Mon Apr 24 13:58:52 IST 2017
                  SOURCE: /home/wdd/Desktop/project/24-04-17/app/views/customer/profileFiles/profileEdit.scala.html
                  HASH: 241a3b3a01abd86a486695273d623d76c7b7ea53
                  MATRIX: 870->1|1145->165|1172->183|1199->185|1260->238|1300->241|1327->242|1622->511|1637->517|1780->650|1821->652|1866->670|1921->698|2003->759|2039->768|2084->783|2126->798|2209->851
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|35->5|46->16|46->16|46->16|46->16|48->18|49->19|49->19|50->20|51->21|53->23|61->31
                  -- GENERATED --
              */
          