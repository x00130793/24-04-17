
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

     object main_Scope1 {
import controllers.LoginController
import controllers.security

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,models.users.User,List[models.Category],Long,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String, user: models.users.User, categories: List[models.Category], catId: Long, filter: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.121*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*8.62*/("""
        """),format.raw/*9.9*/("""<title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.101*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*11.49*/routes/*11.55*/.Assets.versioned("stylesheets/animate.css")),format.raw/*11.99*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*12.49*/routes/*12.55*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*12.105*/(""""  rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*13.49*/routes/*13.55*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*13.108*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*14.49*/routes/*14.55*/.Assets.versioned("stylesheets/prettyPhoto.css")),format.raw/*14.103*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*15.49*/routes/*15.55*/.Assets.versioned("stylesheets/price-range.css")),format.raw/*15.103*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*16.49*/routes/*16.55*/.Assets.versioned("stylesheets/responsive.css")),format.raw/*16.102*/("""" rel="stylesheet">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*18.70*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*19.18*/routes/*19.24*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*19.73*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*20.18*/routes/*20.24*/.Assets.versioned("javascripts/contact.js")),format.raw/*20.67*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*21.18*/routes/*21.24*/.Assets.versioned("javascripts/gmaps.js")),format.raw/*21.65*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*22.18*/routes/*22.24*/.Assets.versioned("javascripts/hello.js")),format.raw/*22.65*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*23.18*/routes/*23.24*/.Assets.versioned("javascripts/html5shiv.js")),format.raw/*23.69*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*24.18*/routes/*24.24*/.Assets.versioned("javascripts/jquery.js")),format.raw/*24.66*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*25.18*/routes/*25.24*/.Assets.versioned("javascripts/jquery.prettyPhoto.js")),format.raw/*25.78*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*26.18*/routes/*26.24*/.Assets.versioned("javascripts/jquery.scrollUp.min.js")),format.raw/*26.79*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*27.18*/routes/*27.24*/.Assets.versioned("javascripts/price-range.js")),format.raw/*27.71*/("""" type="text/javascript"></script>
   <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link  sizes="144x144" href=""""),_display_(/*29.35*/routes/*29.41*/.Assets.versioned("images/ico/apple-touch-icon-144-precomposed.png")),format.raw/*29.109*/(""" """),format.raw/*29.110*/("""rel="apple-touch-icon-precomposed">
    <link  sizes="114x114" href=""""),_display_(/*30.35*/routes/*30.41*/.Assets.versioned("images/ico/apple-touch-icon-114-precomposed.png")),format.raw/*30.109*/(""" """),format.raw/*30.110*/("""rel="apple-touch-icon-precomposed">
    <link  sizes="72x72" href=""""),_display_(/*31.33*/routes/*31.39*/.Assets.versioned("images/ico/apple-touch-icon-72-precomposed.png")),format.raw/*31.106*/(""" """),format.raw/*31.107*/("""rel="apple-touch-icon-precomposed">
    <link  href=""""),_display_(/*32.19*/routes/*32.25*/.Assets.versioned("images/ico/apple-touch-icon-57-precomposed.png")),format.raw/*32.92*/(""" """),format.raw/*32.93*/("""rel="apple-touch-icon-precomposed">
   

   
   
   
   
   
    </head>
    <body>
        """),format.raw/*43.32*/("""

   
   """),format.raw/*46.4*/("""<header id="header"><!--header-->
      <div class="header_top"><!--header_top-->
         <div class="container">
            <div class="row">
               <div class="col-sm-5">
                  <div class="contactinfo">
                     <ul class="nav nav-pills">
                        <li><a href="#"><i class="fa fa-phone"></i> +2 95 01 88 821</a></li>
                        <li><a href="#"><i class="fa fa-envelope"></i> info.com</a></li>
                     </ul>
                  </div>
               </div>
               <div class="col-sm-7">
                   <div class="shop-menu pull-right">
                       <ul class="nav navbar-nav">
                           """),_display_(/*61.29*/if(user != null)/*61.45*/ {_display_(Seq[Any](format.raw/*61.47*/("""
                               """),_display_(/*62.33*/if(user.getRole == "customer")/*62.63*/{_display_(Seq[Any](format.raw/*62.64*/("""
                           """),format.raw/*63.28*/("""<li><a href=""""),_display_(/*63.42*/routes/*63.48*/.CustomerCtrl.profile(catId, filter)),format.raw/*63.84*/(""""><i class="fa fa-user"></i> Account</a></li>
                           <li><a href="#"><i class="fa fa-star"></i> Wishlist</a></li>
                           <li><a href=""""),_display_(/*65.42*/routes/*65.48*/.ShoppingCtrl.showBasket(catId, filter)),format.raw/*65.87*/(""""><i class="fa fa-shopping-cart"></i> Cart</a></li>""")))}),format.raw/*65.139*/("""
                           """),format.raw/*66.28*/("""<li """),_display_(/*66.33*/if(title == "Login")/*66.53*/{_display_(Seq[Any](format.raw/*66.54*/("""class="active"""")))}),format.raw/*66.69*/(""">  
                               <a href=""""),_display_(/*67.42*/controllers/*67.53*/.routes.LoginController.logout()),format.raw/*67.85*/("""">Logout """),_display_(/*67.95*/user/*67.99*/.getfName()),format.raw/*67.110*/("""</a>
                           """)))}/*68.30*/else/*68.35*/{_display_(Seq[Any](format.raw/*68.36*/("""
                               """),format.raw/*69.32*/("""<a href=""""),_display_(/*69.42*/controllers/*69.53*/.routes.LoginController.login()),format.raw/*69.84*/(""""><h5><b>SIGN IN or SIGN UP</b></h5></a>
                           """)))}),format.raw/*70.29*/("""

                           """),format.raw/*72.28*/("""</li>
                       </ul>
                   </div>
               </div>
            </div>
         </div>
      </div><!--/header_top-->
      
      <div class="header-middle"><!--header-middle-->
         <div class="container">
            <div class="row">
                  <!--<div class="col-sm-4">
                  <div class="logo pull-left">
                     <a href="index.html"><img src="images/home/logo.png" alt="" /></a>
                  </div>
               </div>-->
               <div class="col-sm-12">
                       <!-- Search Form -->
                  <div class="pull-right">
                      <div id="actions">
                          <form action=""""),_display_(/*92.42*/routes/*92.48*/.HomeController.products(catId)),format.raw/*92.79*/("""" method="GET">
                              <input type="search" id="searchbox" name="filter" value=""""),_display_(/*93.89*/filter),format.raw/*93.95*/("""" placeholder="">
                              <input type="submit" id="searchsubmit" value="Search" class="btn btn-default">

                          </form>
                      </div>
                  </div>
               </div>
            </div>
         </div>
      </div><!--/header-middle-->
   
      <div class="header-bottom"><!--header-bottom-->
         <div class="container">
            <div class="row">
               <div class="col-sm-9">
                  <div class="navbar-header">
                     <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                     </button>
                  </div>
                  <div class="mainmenu pull-left">
                     <ul class="nav navbar-nav collapse navbar-collapse">
                        <li><a href=""""),_display_(/*118.39*/controllers/*118.50*/.routes.HomeController.index()),format.raw/*118.80*/("""" class="active">Home</a></li>
                        <!--<li><a href="404.html">New in</a></li>
                        <li class="dropdown"><a href="#">Woman<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="shop.html">Product1</a></li>
                                    </ul>
                                </li> 
                        <li class="dropdown"><a href="#">Men<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="blog.html">Product1</a></li>
                                    </ul>
                                </li> 
                        <li><a href="">Kids</a></li>
                        <li><a href="">Accessories</a></li>-->
                     </ul>
                  </div>
               </div>

            </div>
         </div>
      </div><!--/header-bottom-->
   </header><!--/header-->
   

   
   <section>
      <div class="container">
         <div class="row">
            <div class="col-sm-3">
               <div class="left-sidebar">
                  <a href=""""),_display_(/*148.29*/routes/*148.35*/.HomeController.products(0)),format.raw/*148.62*/(""""></a><h2>Category</h2></a>
                  <div class="panel-group category-products" id="accordian"><!--category-productsr-->
                     <div class="panel panel-default">
                        <div class="list-group">
                              <!-- A link to display all products -->


                              <!-- Start of For loop - For each c in categories add a list item -->
                              <!-- Also show the number of products in each category -->
                           <div class="panel panel-default">
                              <div class="panel-heading">
                                 <h4 class="panel-title">
                              """),_display_(/*160.32*/for(c <- categories) yield /*160.52*/ {_display_(Seq[Any](format.raw/*160.54*/("""
                                 """),format.raw/*161.34*/("""<a href=""""),_display_(/*161.44*/routes/*161.50*/.HomeController.products(c.getId)),format.raw/*161.83*/("""" class="list-group-item">"""),_display_(/*161.110*/c/*161.111*/.getName),format.raw/*161.119*/("""
                                 """),format.raw/*162.34*/("""</a>
                              """)))}),format.raw/*163.32*/("""
                                 """),format.raw/*164.34*/("""</h4>
                              </div>
                           </div>
                        </div>
                     </div>
                     
                     <!--<div class="panel panel-default">
                        <div class="panel-heading">
                           <h4 class="panel-title">
                              <a data-toggle="collapse" data-parent="#accordian" href="#womens">
                                 <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                 Womens
                              </a>
                           </h4>
                        </div>
                        <div id="womens" class="panel-collapse collapse">
                           <div class="panel-body">
                              <ul>
                                 <li><a href="#">Fendi</a></li>
                                 <li><a href="#">Guess</a></li>
                                 <li><a href="#">Valentino</a></li>
                                 <li><a href="#">Dior</a></li>
                                 <li><a href="#">Versace</a></li>
                              </ul>
                           </div>
                        </div>
                     </div>
                     <div class="panel panel-default">
                        <div class="panel-heading">
                           <h4 class="panel-title"><a href="#">Kids</a></h4>
                        </div>
                     </div>-->
                  </div><!--/category-products-->
               
                  
                  
                  <!--<div class="price-range"><!--price-range
                     <h2>Price Range</h2>
                     <div class="well text-center">
                         <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600" data-slider-step="5" data-slider-value="[250,450]" id="sl2" ><br />
                         <b class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
                     </div>
                  </div><!--/price-range
                  
                  <div class="shipping text-center"><!--shipping
                     <img src="images/home/shipping.jpg" alt="" />
                  </div>//shipping-->
               
               </div>
            </div>
            
            <div class="col-sm-9 padding-right">
               
 
               """),_display_(/*218.17*/content),format.raw/*218.24*/("""
     
            
            """),format.raw/*221.13*/("""</div>
         </div>
      </div>
   </section>
   
   <footer id="footer"><!--Footer-->
      <div class="footer-top">
         <div class="container">
            <div class="row">
               <div class="col-sm-2">
                  <div class="companyinfo">
                     <h2><span>A</span>&<span>Js</span></h2>
                     <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,sed do eiusmod tempor</p>
                  </div>
               </div>
               <div class="col-sm-7">
                  <div class="col-sm-3">
                     <div class="video-gallery text-center">
                        <a href="#">
                           <div class="iframe-img">
                              <img src="images/home/iframe1.png" alt="" />
                           </div>
                           <div class="overlay-icon">
                              <i class="fa fa-play-circle-o"></i>
                           </div>
                        </a>
                        <p>Circle of Hands</p>
                        <h2>24 DEC 2014</h2>
                     </div>
                  </div>
                  
                  <div class="col-sm-3">
                     <div class="video-gallery text-center">
                        <a href="#">
                           <div class="iframe-img">
                              <img src="images/home/iframe2.png" alt="" />
                           </div>
                           <div class="overlay-icon">
                              <i class="fa fa-play-circle-o"></i>
                           </div>
                        </a>
                        <p>Circle of Hands</p>
                        <h2>24 DEC 2014</h2>
                     </div>
                  </div>
                  
                  <div class="col-sm-3">
                     <div class="video-gallery text-center">
                        <a href="#">
                           <div class="iframe-img">
                              <img src="images/home/iframe3.png" alt="" />
                           </div>
                           <div class="overlay-icon">
                              <i class="fa fa-play-circle-o"></i>
                           </div>
                        </a>
                        <p>Circle of Hands</p>
                        <h2>24 DEC 2014</h2>
                     </div>
                  </div>
                  
                  <div class="col-sm-3">
                     <div class="video-gallery text-center">
                        <a href="#">
                           <div class="iframe-img">
                              <img src="images/home/iframe4.png" alt="" />
                           </div>
                           <div class="overlay-icon">
                              <i class="fa fa-play-circle-o"></i>
                           </div>
                        </a>
                        <p>Circle of Hands</p>
                        <h2>24 DEC 2014</h2>
                     </div>
                  </div>
               </div>
               <div class="col-sm-3">
                  <div class="address">
                     <img src="images/home/map.png" alt="" />
                     <p>Dublin, Ireland</p>
                  </div>
               </div>
            </div>
         </div>
      </div>
      
      <div class="footer-widget">
         <div class="container">
            <div class="row">
               <div class="col-sm-2">
                  <div class="single-widget">
                     <h2>Service</h2>
                     <ul class="nav nav-pills nav-stacked">
                        <li><a href="#">Online Help</a></li>
                        <li><a href="#">Contact Us</a></li>
                        <li><a href="#">Order Status</a></li>
                        <li><a href="#">Change Location</a></li>
                        <li><a href="#">FAQ’s</a></li>
                     </ul>
                  </div>
               </div>
               <div class="col-sm-2">
                  <div class="single-widget">
                     <h2>Quock Shop</h2>
                     <ul class="nav nav-pills nav-stacked">
                        <li><a href="#">T-Shirt</a></li>
                        <li><a href="#">Mens</a></li>
                        <li><a href="#">Womens</a></li>
                        <li><a href="#">Gift Cards</a></li>
                        <li><a href="#">Shoes</a></li>
                     </ul>
                  </div>
               </div>
               <div class="col-sm-2">
                  <div class="single-widget">
                     <h2>Policies</h2>
                     <ul class="nav nav-pills nav-stacked">
                        <li><a href="#">Terms of Use</a></li>
                        <li><a href="#">Privecy Policy</a></li>
                        <li><a href="#">Refund Policy</a></li>
                        <li><a href="#">Billing System</a></li>
                        <li><a href="#">Ticket System</a></li>
                     </ul>
                  </div>
               </div>
               <div class="col-sm-2">
                  <div class="single-widget">
                     <h2>About Shopper</h2>
                     <ul class="nav nav-pills nav-stacked">
                        <li><a href="#">Company Information</a></li>
                        <li><a href="#">Careers</a></li>
                        <li><a href="#">Store Location</a></li>
                        <li><a href="#">Affillate Program</a></li>
                        <li><a href="#">Copyright</a></li>
                     </ul>
                  </div>
               </div>
               <div class="col-sm-3 col-sm-offset-1">
                  <div class="single-widget">
                     <h2>About Shopper</h2>
                     <form action="#" class="searchform">
                        <input type="text" placeholder="Your email address" />
                        <button type="submit" class="btn btn-default"><i class="fa fa-arrow-circle-o-right"></i></button>
                        <p>Get the most recent updates from <br />our site and be updated your self...</p>
                     </form>
                  </div>
               </div>
               
            </div>
         </div>
      </div>
      
      <div class="footer-bottom">
         <div class="container">
            <div class="row">
               <p class="pull-left">Copyright © 2017 The lads.</p>
               <p class="pull-right">Designed by <span><a target="_blank" href="http://www.it-tallaght.ie/">ITT Students</a></span></p>
            </div>
         </div>
      </div>
      
   </footer><!--/Footer-->
   

  
        
   
   
        
        

   <script src=""""),_display_(/*392.18*/routes/*392.24*/.Assets.versioned("javascripts/jquery.js")),format.raw/*392.66*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*393.18*/routes/*393.24*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*393.73*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*394.18*/routes/*394.24*/.Assets.versioned("javascripts/jquery.scrollUp.min.js")),format.raw/*394.79*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*395.18*/routes/*395.24*/.Assets.versioned("javascripts/price-range.js")),format.raw/*395.71*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*396.18*/routes/*396.24*/.Assets.versioned("javascripts/jquery.prettyPhoto.js")),format.raw/*396.78*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*397.18*/routes/*397.24*/.Assets.versioned("javascripts/main.js")),format.raw/*397.64*/("""" type="text/javascript"></script>

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,categories:List[models.Category],catId:Long,filter:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user,categories,catId,filter)(content)

  def f:((String,models.users.User,List[models.Category],Long,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user,categories,catId,filter) => (content) => apply(title,user,categories,catId,filter)(content)

  def ref: this.type = this

}


}
}

/**/
object main extends main_Scope0.main_Scope1.main
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 13:45:14 IST 2017
                  SOURCE: /home/wdd/Desktop/project/24-04-17/app/views/main.scala.html
                  HASH: 4bad3779498b3d11d4cc25e8f8c7e82a832d4c44
                  MATRIX: 890->66|1105->185|1133->187|1212->292|1247->301|1281->309|1306->314|1395->376|1410->382|1473->423|1568->491|1583->497|1648->541|1743->609|1758->615|1830->665|1926->734|1941->740|2016->793|2111->861|2126->867|2196->915|2291->983|2306->989|2376->1037|2471->1105|2486->1111|2555->1158|2660->1236|2675->1242|2736->1281|2788->1306|2803->1312|2865->1353|2944->1405|2959->1411|3029->1460|3108->1512|3123->1518|3187->1561|3266->1613|3281->1619|3343->1660|3422->1712|3437->1718|3499->1759|3578->1811|3593->1817|3659->1862|3738->1914|3753->1920|3816->1962|3895->2014|3910->2020|3985->2074|4064->2126|4079->2132|4155->2187|4234->2239|4249->2245|4317->2292|4473->2421|4488->2427|4578->2495|4608->2496|4705->2566|4720->2572|4810->2640|4840->2641|4935->2709|4950->2715|5039->2782|5069->2783|5150->2837|5165->2843|5253->2910|5282->2911|5402->3093|5438->3102|6167->3804|6192->3820|6232->3822|6292->3855|6331->3885|6370->3886|6426->3914|6467->3928|6482->3934|6539->3970|6741->4145|6756->4151|6816->4190|6900->4242|6956->4270|6988->4275|7017->4295|7056->4296|7102->4311|7174->4356|7194->4367|7247->4399|7284->4409|7297->4413|7330->4424|7382->4458|7395->4463|7434->4464|7494->4496|7531->4506|7551->4517|7603->4548|7703->4617|7760->4646|8498->5357|8513->5363|8565->5394|8696->5498|8723->5504|9838->6591|9859->6602|9911->6632|11170->7863|11186->7869|11235->7896|11966->8599|12003->8619|12044->8621|12107->8655|12145->8665|12161->8671|12216->8704|12272->8731|12284->8732|12315->8740|12378->8774|12446->8810|12509->8844|14988->11295|15017->11302|15078->11334|21951->18179|21967->18185|22031->18227|22111->18279|22127->18285|22198->18334|22278->18386|22294->18392|22371->18447|22451->18499|22467->18505|22536->18552|22616->18604|22632->18610|22708->18664|22788->18716|22804->18722|22866->18762
                  LINES: 31->3|36->3|38->5|41->8|42->9|42->9|42->9|43->10|43->10|43->10|44->11|44->11|44->11|45->12|45->12|45->12|46->13|46->13|46->13|47->14|47->14|47->14|48->15|48->15|48->15|49->16|49->16|49->16|50->17|50->17|50->17|51->18|51->18|51->18|52->19|52->19|52->19|53->20|53->20|53->20|54->21|54->21|54->21|55->22|55->22|55->22|56->23|56->23|56->23|57->24|57->24|57->24|58->25|58->25|58->25|59->26|59->26|59->26|60->27|60->27|60->27|62->29|62->29|62->29|62->29|63->30|63->30|63->30|63->30|64->31|64->31|64->31|64->31|65->32|65->32|65->32|65->32|75->43|78->46|93->61|93->61|93->61|94->62|94->62|94->62|95->63|95->63|95->63|95->63|97->65|97->65|97->65|97->65|98->66|98->66|98->66|98->66|98->66|99->67|99->67|99->67|99->67|99->67|99->67|100->68|100->68|100->68|101->69|101->69|101->69|101->69|102->70|104->72|124->92|124->92|124->92|125->93|125->93|150->118|150->118|150->118|180->148|180->148|180->148|192->160|192->160|192->160|193->161|193->161|193->161|193->161|193->161|193->161|193->161|194->162|195->163|196->164|250->218|250->218|253->221|424->392|424->392|424->392|425->393|425->393|425->393|426->394|426->394|426->394|427->395|427->395|427->395|428->396|428->396|428->396|429->397|429->397|429->397
                  -- GENERATED --
              */
          