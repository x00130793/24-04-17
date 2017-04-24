
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Form[models.users.Login],Form[models.users.User],models.users.User,List[models.Category],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], addUserForm: Form[models.users.User], user: models.users.User,  categories: List[models.Category], catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.167*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.73*/("""
"""),_display_(/*5.2*/main("Login", user, categories, catId, filter)/*5.48*/ {_display_(Seq[Any](format.raw/*5.50*/("""
"""),format.raw/*6.1*/("""<!--====================== A.S. =====================-->

	<section id="form"><!--form-->
		<div class="container">
			<div class="row">
				"""),_display_(/*11.6*/if(flash.containsKey("success"))/*11.38*/{_display_(Seq[Any](format.raw/*11.39*/("""
							"""),format.raw/*12.8*/("""<div class="alert alert-success">
							"""),_display_(/*13.9*/flash/*13.14*/.get("success")),format.raw/*13.29*/("""
							"""),format.raw/*14.8*/("""</div>
						""")))}),format.raw/*15.8*/("""
						"""),_display_(/*16.8*/if(flash.containsKey("fail"))/*16.37*/{_display_(Seq[Any](format.raw/*16.38*/("""
							"""),format.raw/*17.8*/("""<div class="alert alert-danger">
							"""),_display_(/*18.9*/flash/*18.14*/.get("fail")),format.raw/*18.26*/("""
							"""),format.raw/*19.8*/("""</div>
						""")))}),format.raw/*20.8*/("""
				"""),format.raw/*21.5*/("""<div class="col-sm-4 col-sm-offset-1">
					<div class="login-form"><!--login form-->
						<h2>Login to your account</h2>
						"""),_display_(/*24.8*/if(loginForm.hasGlobalErrors)/*24.37*/ {_display_(Seq[Any](format.raw/*24.39*/("""
            						"""),format.raw/*25.19*/("""<p class="alert alert-warning">
            					"""),_display_(/*26.19*/loginForm/*26.28*/.globalError.message),format.raw/*26.48*/("""
           				"""),format.raw/*27.16*/("""</p>
						""")))}),format.raw/*28.8*/("""
						"""),_display_(/*29.8*/if(flash.containsKey("error"))/*29.38*/ {_display_(Seq[Any](format.raw/*29.40*/("""
						    """),format.raw/*30.11*/("""<div class="alert alert-warning">
						    """),_display_(/*31.12*/flash/*31.17*/.get("loginRequired")),format.raw/*31.38*/("""
						    """),format.raw/*32.11*/("""</div>
						""")))}),format.raw/*33.8*/("""
						

							"""),format.raw/*36.8*/("""<!-- The login form -->
							"""),_display_(/*37.9*/helper/*37.15*/.form(action = controllers.routes.LoginController.loginSubmit(catId, filter))/*37.92*/ {_display_(Seq[Any](format.raw/*37.94*/("""

								"""),format.raw/*39.9*/("""<div class="form-group">
								"""),_display_(/*40.10*/inputText(loginForm("email"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*40.113*/("""
								"""),format.raw/*41.9*/("""</div>
								<div class="form-group">
								"""),_display_(/*43.10*/inputPassword(loginForm("password"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*43.123*/("""
								"""),format.raw/*44.9*/("""</div>
							"""),format.raw/*45.18*/("""
								"""),format.raw/*46.54*/("""
								"""),format.raw/*47.30*/("""
							"""),format.raw/*48.19*/("""
							"""),format.raw/*49.88*/("""
							"""),format.raw/*50.8*/("""<div class="form-group"> <input type="submit" value="Sign In" class="btn btn-primary"> </div>
						""")))}),format.raw/*51.8*/("""
					
					"""),format.raw/*53.6*/("""</div><!--/login form-->
				</div>
				<div class="col-sm-1">
					<h2 class="or">OR</h2>
				</div>
				<div class="col-sm-4">
					<div class="signup-form"><!--sign up form-->
						<h2>New User? Signup!</h2>
						<h4>Password must have: </h4>
						<ul>
							<li>At least 8 characters</li>
							<li>One uppercase letter</li>
							<li>One lowercase letter</li>
							<li>A number</li>
							
						</ul>

						
					</div>
					"""),_display_(/*72.7*/form(action = routes.HomeController.addUserSubmit(catId, filter), 'class -> "form-horizontal", 'role->"form")/*72.116*/ {_display_(Seq[Any](format.raw/*72.118*/("""

						"""),format.raw/*74.7*/("""<div class="form-row">
							<label>
							"""),_display_(/*76.9*/inputText(addUserForm("fName"), '_label -> "Fisrt Name",'class -> "form-control ")),format.raw/*76.91*/("""
							"""),format.raw/*77.8*/("""</label>
						</div>

						<div class="form-row">
							<label>
							"""),_display_(/*82.9*/inputText(addUserForm("lName"), '_label -> "Second Name",'class -> "form-control")),format.raw/*82.91*/("""
							"""),format.raw/*83.8*/("""</label>
						</div>

						<div class="form-row">
							<label>
							"""),_display_(/*88.9*/inputText(addUserForm("email"), '_label -> "E-mail",'class -> "form-control")),format.raw/*88.86*/("""
							"""),format.raw/*89.8*/("""</label>
						</div>

						<div class="form-row">
							<label>
							"""),_display_(/*94.9*/inputText(addUserForm("password"), '_label -> "Password",'class -> "form-control", 'type -> "password")),format.raw/*94.112*/("""
							"""),format.raw/*95.8*/("""</label>
						</div>
					
						<div class="form-row">
							<label>
							"""),_display_(/*100.9*/inputText(addUserForm("password2"), '_label -> "Repeat Password",'class -> "form-control", 'type -> "password")),format.raw/*100.120*/("""
							"""),format.raw/*101.8*/("""</label>
						</div>



						<div class="actions">
							<input type="submit" value="Save" class="btn btn-primary">
							<a href=""""),_display_(/*108.18*/routes/*108.24*/.LoginController.login(catId, filter)),format.raw/*108.61*/("""">
							</a>
						</div>


					</div>
					</div><!--/sign up form-->
				</div>
			</div>
		</div>
	</section><!--/form-->
<!--====================== A.S. end =====================-->
""")))}),format.raw/*120.2*/("""
""")))}),format.raw/*121.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],addUserForm:Form[models.users.User],user:models.users.User,categories:List[models.Category],catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,addUserForm,user,categories,catId,filter)

  def f:((Form[models.users.Login],Form[models.users.User],models.users.User,List[models.Category],Long,String) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,addUserForm,user,categories,catId,filter) => apply(loginForm,addUserForm,user,categories,catId,filter)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 13:45:13 IST 2017
                  SOURCE: /home/wdd/Desktop/project/24-04-17/app/views/login.scala.html
                  HASH: 5eaac0c288c63f6e4922d42dda98c03890fb1957
                  MATRIX: 839->1|1115->166|1142->184|1170->257|1197->259|1251->305|1290->307|1317->308|1485->450|1526->482|1565->483|1600->491|1668->533|1682->538|1718->553|1753->561|1797->575|1831->583|1869->612|1908->613|1943->621|2010->662|2024->667|2057->679|2092->687|2136->701|2168->706|2324->836|2362->865|2402->867|2449->886|2526->936|2544->945|2585->965|2629->981|2671->993|2705->1001|2744->1031|2784->1033|2823->1044|2895->1089|2909->1094|2951->1115|2990->1126|3034->1140|3077->1156|3135->1188|3150->1194|3236->1271|3276->1273|3313->1283|3374->1317|3499->1420|3535->1429|3611->1478|3746->1591|3782->1600|3824->1624|3861->1678|3898->1708|3934->1727|3970->1815|4005->1823|4136->1924|4175->1936|4643->2378|4762->2487|4803->2489|4838->2497|4910->2543|5013->2625|5048->2633|5149->2708|5252->2790|5287->2798|5388->2873|5486->2950|5521->2958|5622->3033|5747->3136|5782->3144|5889->3224|6023->3335|6059->3343|6223->3479|6239->3485|6298->3522|6519->3712|6552->3714
                  LINES: 27->1|32->1|33->3|34->4|35->5|35->5|35->5|36->6|41->11|41->11|41->11|42->12|43->13|43->13|43->13|44->14|45->15|46->16|46->16|46->16|47->17|48->18|48->18|48->18|49->19|50->20|51->21|54->24|54->24|54->24|55->25|56->26|56->26|56->26|57->27|58->28|59->29|59->29|59->29|60->30|61->31|61->31|61->31|62->32|63->33|66->36|67->37|67->37|67->37|67->37|69->39|70->40|70->40|71->41|73->43|73->43|74->44|75->45|76->46|77->47|78->48|79->49|80->50|81->51|83->53|102->72|102->72|102->72|104->74|106->76|106->76|107->77|112->82|112->82|113->83|118->88|118->88|119->89|124->94|124->94|125->95|130->100|130->100|131->101|138->108|138->108|138->108|150->120|151->121
                  -- GENERATED --
              */
          