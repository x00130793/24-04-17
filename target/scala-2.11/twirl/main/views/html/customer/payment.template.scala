
package views.html.customer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object payment_Scope0 {
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

class payment extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[models.users.Customer,models.users.User,List[models.Category],Long,String,Form[models.Factory],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Customer: models.users.Customer, user: models.users.User, categories: List[models.Category], catId: Long, filter: String, c1: Form[models.Factory]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.150*/("""

"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("Payment", user, categories, catId, filter)/*6.50*/  {_display_(Seq[Any](format.raw/*6.53*/("""
"""),format.raw/*7.1*/("""<!--====================== A.S. =====================-->
	"""),_display_(/*8.3*/form(action = routes.ShoppingCtrl.paymentSubmit(catId, filter), 'class -> "form-horizontal", 'role -> "form")/*8.112*/ {_display_(Seq[Any](format.raw/*8.114*/("""
	"""),format.raw/*9.2*/("""<div class="container">
		<div class="row">
			<div class="col-sm-9">
				"""),_display_(/*12.6*/if(flash.containsKey("success"))/*12.38*/{_display_(Seq[Any](format.raw/*12.39*/("""
							"""),format.raw/*13.8*/("""<div class="alert alert-success">
							"""),_display_(/*14.9*/flash/*14.14*/.get("success")),format.raw/*14.29*/("""
							"""),format.raw/*15.8*/("""</div>
						""")))}),format.raw/*16.8*/("""
						"""),_display_(/*17.8*/if(flash.containsKey("fail"))/*17.37*/{_display_(Seq[Any](format.raw/*17.38*/("""
							"""),format.raw/*18.8*/("""<div class="alert alert-danger">
							"""),_display_(/*19.9*/flash/*19.14*/.get("fail")),format.raw/*19.26*/("""
							"""),format.raw/*20.8*/("""</div>
						""")))}),format.raw/*21.8*/("""
				"""),format.raw/*22.5*/("""<h2 class="title text-center">Payment</h2>
				<div id="accordian">
					<div class="col-sm-6">

					
						<div class="form-group col-sm-12">
						<h2 class="title text-center">Card details</h2>
							<label for="usr">Card Number:</label>
							<input type="text" class="form-control" id="usr">
						</div>
					

				
						<div class="form-group col-sm-12">
							<label for="usr">Expiration Date:</label>
							<select class="form-control" id="sel1">
   							<option>1</option>
   							<option>2</option>
   							<option>3</option>
  							<option>4</option>
   							<option>5</option>
   							<option>6</option>
   							<option>7</option>
  							<option>8</option>
   							<option>9</option>
   							<option>10</option>
   							<option>11</option>
  							<option>12</option>
 						</select>
						</div>

						<div class="form-group col-sm-12">
						<select class="form-control " id="sel1">
   							<option>2017</option>
   							<option>2018</option>
   							<option>2019</option>
  							<option>2020</option>
   							<option>2021</option>
   							
 						</select>
						</div>
						
										
									

					
						<div class="form-group col-sm-12">
							<label for="usr">First Name:</label>
							<input type="text" value="""),_display_(/*70.34*/user/*70.38*/.getfName()),format.raw/*70.49*/(""" """),format.raw/*70.50*/("""class="form-control" id="usr">
						</div>
								
						<div class="form-group col-sm-12">
							<label for="usr">Last Name:</label>
							<input type="text" value="""),_display_(/*75.34*/user/*75.38*/.getlName()),format.raw/*75.49*/(""" """),format.raw/*75.50*/("""class="form-control" id="usr">
						</div>

						<div class="form-group col-sm-12">
							<label for="usr">Security Code:</label>
							<input type="text" class="form-control" id="usr">
						</div>
					</div>
					<div class="col-sm-6">
						<!---->
							
						
						<!---->

						<div class="form-group col-sm-12">
						<h2 class="title text-center">Address</h2>
							"""),_display_(/*91.9*/inputText(c1("strFormat1"), '_label -> "Street 1", 'class -> "form-control")),format.raw/*91.85*/("""				
						"""),format.raw/*92.7*/("""</div>

						<div class="form-group col-sm-12">
							"""),_display_(/*95.9*/inputText(c1("strFormat2"),  '_label -> "Street 2", 'class -> "form-control")),format.raw/*95.86*/("""	
						"""),format.raw/*96.7*/("""</div>

						<div class="form-group col-sm-12">
							"""),_display_(/*99.9*/inputText(c1("strFormat3"), '_label -> "Town", 'class -> "form-control")),format.raw/*99.81*/("""	
						"""),format.raw/*100.7*/("""</div>

						<div class="form-group col-sm-12">
							"""),_display_(/*103.9*/inputText(c1("strFormat4"), '_label -> "Post code", 'class -> "form-control")),format.raw/*103.86*/("""	
						"""),format.raw/*104.7*/("""</div>

						<div class="form-group col-sm-12">
							"""),_display_(/*107.9*/select(
							c1("strFormat5"),
							options(Seq("United Kingdom", "Ireland", "France", "Spain", "Germany", "Netherlands",
										"Belgium", "Portugal", "Belgium", "Poland", "Czech Republic", "Latvia", 
										"Lithuania", "Norway", "Sweden", "Denmark")),
							'_label -> "Country", 
							'_default -> "-- Select Country --"
							)),format.raw/*114.9*/("""
	
						"""),format.raw/*116.7*/("""</div>
						
						
						<div class="form-group col-sm-12">
							<!--<p class="text-left">
										<a type="submit" href=""""),_display_(/*121.35*/routes/*121.41*/.ShoppingCtrl.placeOrder()),format.raw/*121.67*/("""" class="btn btn-success btn-sm">
										<span class="glyphicon glyphicon-euro"></span> Place Order</a>
							</p>	 -->
							<div class="actions">
								<input type="submit" value="Place Order" class="btn btn-success btn-sm" align="right">
								<a href=""""),_display_(/*126.19*/routes/*126.25*/.ShoppingCtrl.placeOrder()),format.raw/*126.51*/("""">
								</a>
							</div>  
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>





						
						

		

	""")))}),format.raw/*145.3*/("""
""")))}),format.raw/*146.2*/("""
"""),format.raw/*147.1*/("""<!-- Create file payment, change routes -->
"""))
      }
    }
  }

  def render(Customer:models.users.Customer,user:models.users.User,categories:List[models.Category],catId:Long,filter:String,c1:Form[models.Factory]): play.twirl.api.HtmlFormat.Appendable = apply(Customer,user,categories,catId,filter,c1)

  def f:((models.users.Customer,models.users.User,List[models.Category],Long,String,Form[models.Factory]) => play.twirl.api.HtmlFormat.Appendable) = (Customer,user,categories,catId,filter,c1) => apply(Customer,user,categories,catId,filter,c1)

  def ref: this.type = this

}


}

/**/
object payment extends payment_Scope0.payment
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:18:43 IST 2017
                  SOURCE: /home/wdd/Desktop/project2/project2017/app/views/customer/payment.scala.html
                  HASH: fa975c82deaa490720d769688a9bebad3cce308b
                  MATRIX: 846->1|1105->149|1133->168|1161->171|1217->219|1257->222|1284->223|1368->282|1486->391|1526->393|1554->395|1655->470|1696->502|1735->503|1770->511|1838->553|1852->558|1888->573|1923->581|1967->595|2001->603|2039->632|2078->633|2113->641|2180->682|2194->687|2227->699|2262->707|2306->721|2338->726|3647->2008|3660->2012|3692->2023|3721->2024|3918->2194|3931->2198|3963->2209|3992->2210|4403->2595|4500->2671|4538->2682|4621->2739|4719->2816|4754->2824|4837->2881|4930->2953|4966->2961|5050->3018|5149->3095|5185->3103|5269->3160|5636->3506|5673->3515|5830->3644|5846->3650|5894->3676|6188->3942|6204->3948|6252->3974|6404->4095|6437->4097|6466->4098
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|38->8|38->8|38->8|39->9|42->12|42->12|42->12|43->13|44->14|44->14|44->14|45->15|46->16|47->17|47->17|47->17|48->18|49->19|49->19|49->19|50->20|51->21|52->22|100->70|100->70|100->70|100->70|105->75|105->75|105->75|105->75|121->91|121->91|122->92|125->95|125->95|126->96|129->99|129->99|130->100|133->103|133->103|134->104|137->107|144->114|146->116|151->121|151->121|151->121|156->126|156->126|156->126|175->145|176->146|177->147
                  -- GENERATED --
              */
          