
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object productDetails_Scope0 {
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

     object productDetails_Scope1 {
import helper._

class productDetails extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[List[models.Category],models.users.User,Long,String,models.Product,List[models.productsAdditions.Comment],Form[productsAdditions.Comment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(categories: List[models.Category], user: models.users.User, catId: Long, filter: String, prod: models.Product, cList: List[models.productsAdditions.Comment], commentForm: Form[productsAdditions.Comment]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.206*/("""
"""),_display_(/*3.2*/main("productDetails", user,  categories, catId, filter)/*3.58*/ {_display_(Seq[Any](format.raw/*3.60*/("""
				"""),format.raw/*4.5*/("""<div class="col-sm-12 padding-right">
					"""),_display_(/*5.7*/if(flash.containsKey("success"))/*5.39*/{_display_(Seq[Any](format.raw/*5.40*/("""
							"""),format.raw/*6.8*/("""<div class="alert alert-success">
							"""),_display_(/*7.9*/flash/*7.14*/.get("success")),format.raw/*7.29*/("""
							"""),format.raw/*8.8*/("""</div>
						""")))}),format.raw/*9.8*/("""
						"""),_display_(/*10.8*/if(flash.containsKey("fail"))/*10.37*/{_display_(Seq[Any](format.raw/*10.38*/("""
							"""),format.raw/*11.8*/("""<div class="alert alert-danger">
							"""),_display_(/*12.9*/flash/*12.14*/.get("fail")),format.raw/*12.26*/("""
							"""),format.raw/*13.8*/("""</div>
						""")))}),format.raw/*14.8*/("""
"""),format.raw/*15.1*/("""<!--====================== A.S. =====================-->						
					<div class="product-details"><!--product-details-->
						<div class="col-sm-5">
							<div class="view-product">
								<img src="/assets/images/productImages/"""),_display_(/*19.49*/(prod.getId)),format.raw/*19.61*/(""".jpg" alt="" />
								
							</div>
							<div id="similar-product" class="carousel slide" data-ride="carousel">
								
								  

								  <!-- Controls -->
								  <a class="left item-control" href="#similar-product" data-slide="prev">
									<i class="fa fa-angle-left"></i>
								  </a>
								  <a class="right item-control" href="#similar-product" data-slide="next">
									<i class="fa fa-angle-right"></i>
								  </a>
							</div>
							

						</div>
						<div class="col-sm-7">
							<div class="product-information"><!--/product-information-->
								
								<h2>"""),_display_(/*40.14*/prod/*40.18*/.getName),format.raw/*40.26*/("""</h2>
								
								
								<span>
									<span>€"""),_display_(/*44.18*/prod/*44.22*/.getPrice),format.raw/*44.31*/("""</span>
									
									<a href=""""),_display_(/*46.20*/routes/*46.26*/.ShoppingCtrl.addToBasket(prod.getId)),format.raw/*46.63*/("""" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
								</span>

	
								<div class="form-group ">
  								<label for="sel1">Size:</label>
								  <select class="form-control" id="sel1">
								    <option>XS</option>
								    <option>S</option>
								    <option>M</option>
								    <option>L</option>
								    <option>XL</option>
								    <option>XXL</option>
								    <option>XXXL</option>
								  </select>
								</div>
								<p><b>Availability:</b> In Stock</p>
								<p><b>Condition:</b> New</p>
								<p><b>Brand:</b> A&JS</p>
								
							</div><!--/product-information-->
						</div>
					</div><!--/product-details-->
<!--====================== A.S. end =====================-->
<!--====================== J.T. =====================-->
						<!--Comment section-->
						<div class="tab-pane fade active in" id="reviews" >
							<div class="col-sm-12">
								"""),_display_(/*74.10*/for(c <- cList) yield /*74.25*/ {_display_(Seq[Any](format.raw/*74.27*/("""
									"""),format.raw/*75.10*/("""<div class="product-information">
									<ul>
										<li><a href=""><i class="fa fa-user"></i>"""),_display_(/*77.53*/c/*77.54*/.getCustomer().getfName()),format.raw/*77.79*/("""</a></li>
										<li><a href=""><i class="fa fa-clock-o"></i>"""),_display_(/*78.56*/c/*78.57*/.getTime()),format.raw/*78.67*/("""</a></li>
										<li><a href=""><i class="fa fa-calendar-o"></i>"""),_display_(/*79.59*/c/*79.60*/.getDate()),format.raw/*79.70*/("""</a></li>
									</ul>
									<p> """),_display_(/*81.15*/c/*81.16*/.getContent),format.raw/*81.27*/("""</p>
									</div>
								""")))}),format.raw/*83.10*/("""
								"""),_display_(/*84.10*/if(user.getRole == "customer")/*84.40*/{_display_(Seq[Any](format.raw/*84.41*/("""
								"""),format.raw/*85.9*/("""<p><b>Write Your Review</b></p>



									"""),_display_(/*89.11*/form(action = routes.CustomerCtrl.comment(catId, filter, prod.getId()), 'class -> "form-horizontal", 'role -> "form")/*89.128*/ {_display_(Seq[Any](format.raw/*89.130*/("""
									"""),_display_(/*90.11*/inputText(commentForm("content"), '_label -> "Write your comment here", 'class -> "form-control")),format.raw/*90.108*/("""
										"""),format.raw/*91.11*/("""<input type="submit" value="Add comment" class="btn btn-default pull-right">
									""")))}),format.raw/*92.11*/("""
								""")))}),format.raw/*93.10*/("""	

							"""),format.raw/*95.8*/("""</div>
						</div>
						<!--End comment section-->
<!--====================== J.T. end =====================-->
					
					
				</div>
""")))}))
      }
    }
  }

  def render(categories:List[models.Category],user:models.users.User,catId:Long,filter:String,prod:models.Product,cList:List[models.productsAdditions.Comment],commentForm:Form[productsAdditions.Comment]): play.twirl.api.HtmlFormat.Appendable = apply(categories,user,catId,filter,prod,cList,commentForm)

  def f:((List[models.Category],models.users.User,Long,String,models.Product,List[models.productsAdditions.Comment],Form[productsAdditions.Comment]) => play.twirl.api.HtmlFormat.Appendable) = (categories,user,catId,filter,prod,cList,commentForm) => apply(categories,user,catId,filter,prod,cList,commentForm)

  def ref: this.type = this

}


}
}

/**/
object productDetails extends productDetails_Scope0.productDetails_Scope1.productDetails
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:18:42 IST 2017
                  SOURCE: /home/wdd/Desktop/project2/project2017/app/views/productDetails.scala.html
                  HASH: 0d911df41372ce49261ce1fc35db7e9864ce1785
                  MATRIX: 947->18|1247->222|1274->224|1338->280|1377->282|1408->287|1477->331|1517->363|1555->364|1589->372|1656->414|1669->419|1704->434|1738->442|1781->456|1815->464|1853->493|1892->494|1927->502|1994->543|2008->548|2041->560|2076->568|2120->582|2148->583|2406->814|2439->826|3067->1427|3080->1431|3109->1439|3192->1495|3205->1499|3235->1508|3299->1545|3314->1551|3372->1588|4351->2540|4382->2555|4422->2557|4460->2567|4587->2667|4597->2668|4643->2693|4735->2758|4745->2759|4776->2769|4871->2837|4881->2838|4912->2848|4978->2887|4988->2888|5020->2899|5081->2929|5118->2939|5157->2969|5196->2970|5232->2979|5304->3024|5431->3141|5472->3143|5510->3154|5629->3251|5668->3262|5786->3349|5827->3359|5864->3369
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|38->5|38->5|38->5|39->6|40->7|40->7|40->7|41->8|42->9|43->10|43->10|43->10|44->11|45->12|45->12|45->12|46->13|47->14|48->15|52->19|52->19|73->40|73->40|73->40|77->44|77->44|77->44|79->46|79->46|79->46|107->74|107->74|107->74|108->75|110->77|110->77|110->77|111->78|111->78|111->78|112->79|112->79|112->79|114->81|114->81|114->81|116->83|117->84|117->84|117->84|118->85|122->89|122->89|122->89|123->90|123->90|124->91|125->92|126->93|128->95
                  -- GENERATED --
              */
          