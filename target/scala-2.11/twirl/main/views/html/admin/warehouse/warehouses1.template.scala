
package views.html.admin.warehouse

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object warehouses1_Scope0 {
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

     object warehouses1_Scope1 {
import models.users.Warehouse
import models.users.User

class warehouses1 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Warehouse],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(wList: List[Warehouse], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.38*/("""

"""),format.raw/*6.1*/("""<!-- Pass page title and content """),format.raw/*6.34*/("""{"""),format.raw/*6.35*/("""html between braces"""),format.raw/*6.54*/("""}"""),format.raw/*6.55*/(""" """),format.raw/*6.56*/("""to the main view -->
"""),_display_(/*7.2*/admin/*7.7*/.adminMain("Warehouses", user)/*7.37*/ {_display_(Seq[Any](format.raw/*7.39*/("""
  """),format.raw/*8.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
          
      </div>
      <div class="col-sm-8">
          <h2 class="title text-center">Warehouses</h2>
          """),_display_(/*15.12*/if(flash.containsKey("success"))/*15.44*/ {_display_(Seq[Any](format.raw/*15.46*/("""
              """),format.raw/*16.15*/("""<div class="alert alert-success">
              """),_display_(/*17.16*/flash/*17.21*/.get("success")),format.raw/*17.36*/("""
              """),format.raw/*18.15*/("""</div>
          """)))}),format.raw/*19.12*/("""
          """),_display_(/*20.12*/if(flash.containsKey("fail"))/*20.41*/{_display_(Seq[Any](format.raw/*20.42*/("""
							"""),format.raw/*21.8*/("""<div class="alert alert-danger">
							"""),_display_(/*22.9*/flash/*22.14*/.get("fail")),format.raw/*22.26*/("""
							"""),format.raw/*23.8*/("""</div>
		  """)))}),format.raw/*24.6*/("""
          """),format.raw/*25.11*/("""<table class="table table-bordered table-hover table-condensed">
              <!--Headers-->
          <thead>

          <tr>
            <th>Status</th>
            <th>Country</th>
            <th>Email</th>
            <th>Update</th>
            <th>Delete</th>
            <th>Set as main</th>
          </tr>
          </thead>
          <tbody>
              <!--/Headers-->
              <!--List of warehouses-->
          """),_display_(/*41.12*/for(w <- wList) yield /*41.27*/ {_display_(Seq[Any](format.raw/*41.29*/("""
              """),format.raw/*42.15*/("""<tr>
                  """),_display_(/*43.20*/if(w.isMain() == false)/*43.43*/{_display_(Seq[Any](format.raw/*43.44*/("""
                      """),format.raw/*44.23*/("""<td>
                          Warehouse
                      </td>
                  """)))}/*47.22*/else/*47.27*/{_display_(Seq[Any](format.raw/*47.28*/("""
                     """),format.raw/*48.22*/("""<td> 
                         *Main warehouse
                     </td>    
                  """)))}),format.raw/*51.20*/("""
                  
                  """),format.raw/*53.19*/("""<td>"""),_display_(/*53.24*/w/*53.25*/.getCountry),format.raw/*53.36*/("""</td>
                  <td>"""),_display_(/*54.24*/w/*54.25*/.getEmail),format.raw/*54.34*/("""</td>

                  <td>
                      <a href=""""),_display_(/*57.33*/routes/*57.39*/.AdminController.updateWarehouse(w.getEmail)),format.raw/*57.83*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                  </td>
                  <!--Delete product button -->
                  """),_display_(/*61.20*/if(w.isMain() == false)/*61.43*/{_display_(Seq[Any](format.raw/*61.44*/("""
                  """),format.raw/*62.19*/("""<td>
                      <a href=""""),_display_(/*63.33*/routes/*63.39*/.AdminController.delWarehouse(w.getEmail)),format.raw/*63.80*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
                  <td>
                      <a href=""""),_display_(/*69.33*/routes/*69.39*/.AdminController.setAsMain(w.getEmail)),format.raw/*69.77*/("""" class="btn-xs btn-danger"
                        onclick="return confirmSetMain();">
                        <span class="glyphicon glyphicon-star"></span>
                      </a>
                  </td>
                  """)))}),format.raw/*74.20*/("""
              """),format.raw/*75.15*/("""</tr>
					""")))}),format.raw/*76.7*/(""" """),format.raw/*76.8*/("""<!-- END of the list -->
          </tbody>
        </table>
        <p>
          <a href=""""),_display_(/*80.21*/routes/*80.27*/.AdminController.addWarehouse()),format.raw/*80.58*/("""">
            <button class="btn btn-primary">Add warehouse</button>
          </a>
        </p>
      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*89.27*/("""{"""),format.raw/*89.28*/("""
        """),format.raw/*90.9*/("""return confirm('Are you sure you want to delete this warehouse?');
    """),format.raw/*91.5*/("""}"""),format.raw/*91.6*/("""
    """),format.raw/*92.5*/("""function confirmSetMain() """),format.raw/*92.31*/("""{"""),format.raw/*92.32*/("""
        """),format.raw/*93.9*/("""return confirm('Are you sure you want to change status of this warehouse?');
    """),format.raw/*94.5*/("""}"""),format.raw/*94.6*/("""
  """),format.raw/*95.3*/("""</script>

  <!-- End of content for main -->
""")))}),format.raw/*98.2*/("""
"""))
      }
    }
  }

  def render(wList:List[Warehouse],user:User): play.twirl.api.HtmlFormat.Appendable = apply(wList,user)

  def f:((List[Warehouse],User) => play.twirl.api.HtmlFormat.Appendable) = (wList,user) => apply(wList,user)

  def ref: this.type = this

}


}
}

/**/
object warehouses1 extends warehouses1_Scope0.warehouses1_Scope1.warehouses1
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:18:43 IST 2017
                  SOURCE: /home/wdd/Desktop/project2/project2017/app/views/admin/warehouse/warehouses1.scala.html
                  HASH: 052fc6788cfa89f22a4b99856e3dc85e3e13a082
                  MATRIX: 876->59|1007->95|1035->97|1095->130|1123->131|1169->150|1197->151|1225->152|1272->174|1284->179|1322->209|1361->211|1390->214|1627->424|1668->456|1708->458|1751->473|1827->522|1841->527|1877->542|1920->557|1969->575|2008->587|2046->616|2085->617|2120->625|2187->666|2201->671|2234->683|2269->691|2311->703|2350->714|2812->1149|2843->1164|2883->1166|2926->1181|2977->1205|3009->1228|3048->1229|3099->1252|3206->1342|3219->1347|3258->1348|3308->1370|3436->1467|3502->1505|3534->1510|3544->1511|3576->1522|3632->1551|3642->1552|3672->1561|3761->1623|3776->1629|3841->1673|4063->1868|4095->1891|4134->1892|4181->1911|4245->1948|4260->1954|4322->1995|4611->2257|4626->2263|4685->2301|4945->2530|4988->2545|5030->2557|5058->2558|5178->2651|5193->2657|5245->2688|5508->2923|5537->2924|5573->2933|5671->3004|5699->3005|5731->3010|5785->3036|5814->3037|5850->3046|5958->3127|5986->3128|6016->3131|6093->3178
                  LINES: 31->4|36->4|38->6|38->6|38->6|38->6|38->6|38->6|39->7|39->7|39->7|39->7|40->8|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|56->24|57->25|73->41|73->41|73->41|74->42|75->43|75->43|75->43|76->44|79->47|79->47|79->47|80->48|83->51|85->53|85->53|85->53|85->53|86->54|86->54|86->54|89->57|89->57|89->57|93->61|93->61|93->61|94->62|95->63|95->63|95->63|101->69|101->69|101->69|106->74|107->75|108->76|108->76|112->80|112->80|112->80|121->89|121->89|122->90|123->91|123->91|124->92|124->92|124->92|125->93|126->94|126->94|127->95|130->98
                  -- GENERATED --
              */
          