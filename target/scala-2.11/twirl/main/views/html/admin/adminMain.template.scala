
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminMain_Scope0 {
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

     object adminMain_Scope1 {
import controllers.LoginController
import controllers.security

class adminMain extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.57*/("""
"""),format.raw/*4.1*/("""<!--====================== J.T. =====================-->
<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*8.62*/("""
        """),format.raw/*9.9*/("""<title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.versioned("images/favicon.png")),format.raw/*13.104*/("""">
           <link rel="stylesheet" media="screen" href=""""),_display_(/*14.57*/routes/*14.63*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.104*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*15.49*/routes/*15.55*/.Assets.versioned("stylesheets/animate.css")),format.raw/*15.99*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*16.49*/routes/*16.55*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*16.105*/(""""  rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*17.49*/routes/*17.55*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*17.108*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*18.49*/routes/*18.55*/.Assets.versioned("stylesheets/prettyPhoto.css")),format.raw/*18.103*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*19.49*/routes/*19.55*/.Assets.versioned("stylesheets/price-range.css")),format.raw/*19.103*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*20.49*/routes/*20.55*/.Assets.versioned("stylesheets/responsive.css")),format.raw/*20.102*/("""" rel="stylesheet">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*21.59*/routes/*21.65*/.Assets.versioned("images/favicon.png")),format.raw/*21.104*/("""">
        <script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*22.70*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*23.18*/routes/*23.24*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*23.73*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*24.18*/routes/*24.24*/.Assets.versioned("javascripts/contact.js")),format.raw/*24.67*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*25.18*/routes/*25.24*/.Assets.versioned("javascripts/gmaps.js")),format.raw/*25.65*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*26.18*/routes/*26.24*/.Assets.versioned("javascripts/hello.js")),format.raw/*26.65*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*27.18*/routes/*27.24*/.Assets.versioned("javascripts/html5shiv.js")),format.raw/*27.69*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*28.18*/routes/*28.24*/.Assets.versioned("javascripts/jquery.js")),format.raw/*28.66*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*29.18*/routes/*29.24*/.Assets.versioned("javascripts/jquery.prettyPhoto.js")),format.raw/*29.78*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*30.18*/routes/*30.24*/.Assets.versioned("javascripts/jquery.scrollUp.min.js")),format.raw/*30.79*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*31.18*/routes/*31.24*/.Assets.versioned("javascripts/price-range.js")),format.raw/*31.71*/("""" type="text/javascript"></script>
   <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link  sizes="114x114" href=""""),_display_(/*33.35*/routes/*33.41*/.Assets.versioned("images/ico/apple-touch-icon-114-precomposed.png")),format.raw/*33.109*/(""" """),format.raw/*33.110*/("""rel="apple-touch-icon-precomposed">
    <link  sizes="72x72" href=""""),_display_(/*34.33*/routes/*34.39*/.Assets.versioned("images/ico/apple-touch-icon-72-precomposed.png")),format.raw/*34.106*/(""" """),format.raw/*34.107*/("""rel="apple-touch-icon-precomposed">
    <link  href=""""),_display_(/*35.19*/routes/*35.25*/.Assets.versioned("images/ico/apple-touch-icon-57-precomposed.png")),format.raw/*35.92*/(""" """),format.raw/*35.93*/("""rel="apple-touch-icon-precomposed">
    </head>
    <body>
    <!-- start of nav section -->
    <nav class="navbar navbar-inverse">
            <!-- nav header/ branding -->
            <div class="navbar-header">
                <a class="navbar-brand" href="">Admin</a>
            </div>
            <!-- List containing nav links -->
            <ul class="nav navbar-nav">
                <li """),_display_(/*46.22*/if(title == "Products")/*46.45*/{_display_(Seq[Any](format.raw/*46.46*/("""class="active"""")))}),format.raw/*46.61*/(""">
                    <a href=""""),_display_(/*47.31*/routes/*47.37*/.AdminController.products()),format.raw/*47.64*/("""">Products</a>
                </li>
                <li """),_display_(/*49.22*/if(title == "Warehouses")/*49.47*/{_display_(Seq[Any](format.raw/*49.48*/("""class="active"""")))}),format.raw/*49.63*/(""">
                    <a href=""""),_display_(/*50.31*/routes/*50.37*/.AdminController.warehouses1()),format.raw/*50.67*/("""">Warehouses</a>
                </li>
                <li """),_display_(/*52.22*/if(title == "Orders")/*52.43*/{_display_(Seq[Any](format.raw/*52.44*/("""class="active"""")))}),format.raw/*52.59*/(""">
                    <a href=""""),_display_(/*53.31*/routes/*53.37*/.AdminController.orders()),format.raw/*53.62*/("""">Orders</a>
                </li>
                <li """),_display_(/*55.22*/if(title == "Index sliders")/*55.50*/{_display_(Seq[Any](format.raw/*55.51*/("""class="active"""")))}),format.raw/*55.66*/(""">
                    <a href=""""),_display_(/*56.31*/routes/*56.37*/.AdminController.indexSliders()),format.raw/*56.68*/("""">Index sliders</a>
                </li>
                <!-- Login/ Logout  Link - Check if user logged in-->
                <li """),_display_(/*59.22*/if(title == "Login")/*59.42*/{_display_(Seq[Any](format.raw/*59.43*/("""class="active"""")))}),format.raw/*59.58*/(""">
                    """),_display_(/*60.22*/if(user != null)/*60.38*/ {_display_(Seq[Any](format.raw/*60.40*/("""
                        """),format.raw/*61.25*/("""<a href=""""),_display_(/*61.35*/controllers/*61.46*/.routes.LoginController.logout()),format.raw/*61.78*/("""">Logout """),_display_(/*61.88*/user/*61.92*/.getfName()),format.raw/*61.103*/("""</a>
                    """)))}/*62.23*/else/*62.28*/{_display_(Seq[Any](format.raw/*62.29*/("""
                        """),format.raw/*63.25*/("""<a href=""""),_display_(/*63.35*/controllers/*63.46*/.routes.LoginController.login()),format.raw/*63.77*/("""">Login</a>
                    """)))}),format.raw/*64.22*/("""
                """),format.raw/*65.17*/("""</li>
            </ul>
    </nav>
    
    <div class="container-fluid">
        """),format.raw/*71.32*/("""
        """),_display_(/*72.10*/content),format.raw/*72.17*/("""
    """),format.raw/*73.5*/("""</div>
    <footer class="container-fluid">
         <p></p>
     </footer>

    </body>
    <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*82.19*/routes/*82.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*82.66*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*83.19*/routes/*83.25*/.Assets.versioned("javascripts/jquery.js")),format.raw/*83.67*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*84.18*/routes/*84.24*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*84.73*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*85.18*/routes/*85.24*/.Assets.versioned("javascripts/jquery.scrollUp.min.js")),format.raw/*85.79*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*86.18*/routes/*86.24*/.Assets.versioned("javascripts/price-range.js")),format.raw/*86.71*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*87.18*/routes/*87.24*/.Assets.versioned("javascripts/jquery.prettyPhoto.js")),format.raw/*87.78*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*88.18*/routes/*88.24*/.Assets.versioned("javascripts/main.js")),format.raw/*88.64*/("""" type="text/javascript"></script>
</html>

"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}
}

/**/
object adminMain extends adminMain_Scope0.adminMain_Scope1.adminMain
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:18:43 IST 2017
                  SOURCE: /home/wdd/Desktop/project2/project2017/app/views/admin/adminMain.scala.html
                  HASH: 4fa0effbd6df4a0011622d02b59358216016439c
                  MATRIX: 877->66|1027->121|1054->122|1190->284|1225->293|1259->301|1284->306|1559->554|1574->560|1637->601|1725->662|1740->668|1801->707|1887->766|1902->772|1965->813|2060->881|2075->887|2140->931|2235->999|2250->1005|2322->1055|2418->1124|2433->1130|2508->1183|2603->1251|2618->1257|2688->1305|2783->1373|2798->1379|2868->1427|2963->1495|2978->1501|3047->1548|3152->1626|3167->1632|3228->1671|3280->1696|3295->1702|3357->1743|3436->1795|3451->1801|3521->1850|3600->1902|3615->1908|3679->1951|3758->2003|3773->2009|3835->2050|3914->2102|3929->2108|3991->2149|4070->2201|4085->2207|4151->2252|4230->2304|4245->2310|4308->2352|4387->2404|4402->2410|4477->2464|4556->2516|4571->2522|4647->2577|4726->2629|4741->2635|4809->2682|4965->2811|4980->2817|5070->2885|5100->2886|5195->2954|5210->2960|5299->3027|5329->3028|5410->3082|5425->3088|5513->3155|5542->3156|5969->3556|6001->3579|6040->3580|6086->3595|6145->3627|6160->3633|6208->3660|6293->3718|6327->3743|6366->3744|6412->3759|6471->3791|6486->3797|6537->3827|6624->3887|6654->3908|6693->3909|6739->3924|6798->3956|6813->3962|6859->3987|6942->4043|6979->4071|7018->4072|7064->4087|7123->4119|7138->4125|7190->4156|7350->4289|7379->4309|7418->4310|7464->4325|7514->4348|7539->4364|7579->4366|7632->4391|7669->4401|7689->4412|7742->4444|7779->4454|7792->4458|7825->4469|7870->4496|7883->4501|7922->4502|7975->4527|8012->4537|8032->4548|8084->4579|8148->4612|8193->4629|8303->4801|8340->4811|8368->4818|8400->4823|8762->5158|8777->5164|8839->5205|8919->5258|8934->5264|8997->5306|9076->5358|9091->5364|9161->5413|9240->5465|9255->5471|9331->5526|9410->5578|9425->5584|9493->5631|9572->5683|9587->5689|9662->5743|9741->5795|9756->5801|9817->5841
                  LINES: 31->3|36->3|37->4|41->8|42->9|42->9|42->9|45->12|45->12|45->12|46->13|46->13|46->13|47->14|47->14|47->14|48->15|48->15|48->15|49->16|49->16|49->16|50->17|50->17|50->17|51->18|51->18|51->18|52->19|52->19|52->19|53->20|53->20|53->20|54->21|54->21|54->21|55->22|55->22|55->22|56->23|56->23|56->23|57->24|57->24|57->24|58->25|58->25|58->25|59->26|59->26|59->26|60->27|60->27|60->27|61->28|61->28|61->28|62->29|62->29|62->29|63->30|63->30|63->30|64->31|64->31|64->31|66->33|66->33|66->33|66->33|67->34|67->34|67->34|67->34|68->35|68->35|68->35|68->35|79->46|79->46|79->46|79->46|80->47|80->47|80->47|82->49|82->49|82->49|82->49|83->50|83->50|83->50|85->52|85->52|85->52|85->52|86->53|86->53|86->53|88->55|88->55|88->55|88->55|89->56|89->56|89->56|92->59|92->59|92->59|92->59|93->60|93->60|93->60|94->61|94->61|94->61|94->61|94->61|94->61|94->61|95->62|95->62|95->62|96->63|96->63|96->63|96->63|97->64|98->65|103->71|104->72|104->72|105->73|114->82|114->82|114->82|115->83|115->83|115->83|116->84|116->84|116->84|117->85|117->85|117->85|118->86|118->86|118->86|119->87|119->87|119->87|120->88|120->88|120->88
                  -- GENERATED --
              */
          