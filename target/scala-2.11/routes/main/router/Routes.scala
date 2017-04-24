
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/project2/project2017/conf/routes
// @DATE:Mon Apr 24 12:48:20 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  HomeController_3: controllers.HomeController,
  // @LINE:21
  CustomerCtrl_6: controllers.CustomerCtrl,
  // @LINE:25
  LoginController_8: controllers.LoginController,
  // @LINE:31
  ShoppingCtrl_5: controllers.ShoppingCtrl,
  // @LINE:47
  AdminController_0: controllers.AdminController,
  // @LINE:108
  WarehouseController_2: controllers.WarehouseController,
  // @LINE:122
  CountController_1: controllers.CountController,
  // @LINE:124
  AsyncController_4: controllers.AsyncController,
  // @LINE:127
  Assets_7: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    HomeController_3: controllers.HomeController,
    // @LINE:21
    CustomerCtrl_6: controllers.CustomerCtrl,
    // @LINE:25
    LoginController_8: controllers.LoginController,
    // @LINE:31
    ShoppingCtrl_5: controllers.ShoppingCtrl,
    // @LINE:47
    AdminController_0: controllers.AdminController,
    // @LINE:108
    WarehouseController_2: controllers.WarehouseController,
    // @LINE:122
    CountController_1: controllers.CountController,
    // @LINE:124
    AsyncController_4: controllers.AsyncController,
    // @LINE:127
    Assets_7: controllers.Assets
  ) = this(errorHandler, HomeController_3, CustomerCtrl_6, LoginController_8, ShoppingCtrl_5, AdminController_0, WarehouseController_2, CountController_1, AsyncController_4, Assets_7, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, CustomerCtrl_6, LoginController_8, ShoppingCtrl_5, AdminController_0, WarehouseController_2, CountController_1, AsyncController_4, Assets_7, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index""", """controllers.HomeController.index(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.HomeController.products(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productDetails/""" + "$" + """id<[^/]+>""", """controllers.HomeController.productDetails(cat:Long ?= 0, filter:String ?= "", id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.CustomerCtrl.profile(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profileEdit""", """controllers.CustomerCtrl.profileEdit(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orderHistory""", """controllers.CustomerCtrl.orderHistory(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cancelOrder/""" + "$" + """id<[^/]+>""", """controllers.CustomerCtrl.cancelOrder(cat:Long ?= 0, filter:String ?= "", id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editProfileForm/""" + "$" + """email<[^/]+>""", """controllers.LoginController.editProfileForm(email:String, cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingCtrl.showBasket(id:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToBasket(id:Long, cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne""", """controllers.ShoppingCtrl.removeOne(itemId:Long, cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.addOne(itemId:Long, cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:Long, cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingCtrl.emptyBasket(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingCtrl.placeOrder(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrder(id:Long, cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment""", """controllers.ShoppingCtrl.payment(cat:Long ?= 0, filter:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paymentSubmit""", """controllers.ShoppingCtrl.paymentSubmit(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/products""", """controllers.AdminController.products(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addproduct""", """controllers.AdminController.addProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addProductSubmit""", """controllers.AdminController.addProductSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/delProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminController.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminController.updateProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateProductSubmit/""" + "$" + """id<[^/]+>""", """controllers.AdminController.updateProductSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/orders""", """controllers.AdminController.orders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/cancelOrder/""" + "$" + """id<[^/]+>""", """controllers.AdminController.cancelOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateStatus""" + "$" + """id<[^/]+>""", """controllers.AdminController.updateStatus(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/indexSliders""", """controllers.AdminController.indexSliders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addIndexSlider""", """controllers.AdminController.addIndexSlider()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addIndexSliderSubmit""", """controllers.AdminController.addIndexSliderSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateIndexSlider/""" + "$" + """id<[^/]+>""", """controllers.AdminController.updateIndexSlider(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateIndexSliderSubmit/""" + "$" + """id<[^/]+>""", """controllers.AdminController.updateIndexSliderSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/delIndexSlider/""" + "$" + """id<[^/]+>""", """controllers.AdminController.deleteIndexSlider(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/warehouses1""", """controllers.AdminController.warehouses1()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addWarehouse""", """controllers.AdminController.addWarehouse()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addWarehouseSubmit""", """controllers.AdminController.addWarehouseSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateWarehouse/""" + "$" + """s<[^/]+>""", """controllers.AdminController.updateWarehouse(s:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateWarehouseSubmit/""" + "$" + """s<[^/]+>""", """controllers.AdminController.updateWarehouseSubmit(s:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/delWarehouse/""" + "$" + """s<[^/]+>""", """controllers.AdminController.delWarehouse(s:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/setAsMain/""" + "$" + """s<[^/]+>""", """controllers.AdminController.setAsMain(s:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login(cat:Long ?= 0, filter:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout(cat:Long ?= 0, filter:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUserSubmit""", """controllers.HomeController.addUserSubmit(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """like""" + "$" + """id<[^/]+>""", """controllers.HomeController.like(cat:Long ?= 0, filter:String ?= "", id:Long, s:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment""" + "$" + """id<[^/]+>""", """controllers.CustomerCtrl.comment(cat:Long ?= 0, filter:String ?= "", id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse/ordersW""", """controllers.WarehouseController.ordersW"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse/orderDetails/""" + "$" + """id<[^/]+>""", """controllers.WarehouseController.orderDetails(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse/cancelOrder/""" + "$" + """id<[^/]+>""", """controllers.WarehouseController.cancelOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse/updateStatus""" + "$" + """id<[^/]+>""", """controllers.WarehouseController.updateStatus(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse/products""", """controllers.WarehouseController.products(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse/supplyWarehouse/""" + "$" + """id<[^/]+>""", """controllers.WarehouseController.supplyWarehouse(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse/supplyWarehouseSubmit/""" + "$" + """id<[^/]+>""", """controllers.WarehouseController.supplyWarehouseSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """ An example controller showing a sample home page
###############################################################################
 Main
###############################################################################""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_3.index(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """index"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_products2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_HomeController_products2_invoker = createInvoker(
    HomeController_3.products(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "products",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """products"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_productDetails3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productDetails/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_productDetails3_invoker = createInvoker(
    HomeController_3.productDetails(fakeValue[Long], fakeValue[String], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "productDetails",
      Seq(classOf[Long], classOf[String], classOf[Long]),
      "GET",
      """""",
      this.prefix + """productDetails/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_CustomerCtrl_profile4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_CustomerCtrl_profile4_invoker = createInvoker(
    CustomerCtrl_6.profile(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerCtrl",
      "profile",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """###############################################################################
 Customer
###############################################################################""",
      this.prefix + """profile"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_CustomerCtrl_profileEdit5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profileEdit")))
  )
  private[this] lazy val controllers_CustomerCtrl_profileEdit5_invoker = createInvoker(
    CustomerCtrl_6.profileEdit(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerCtrl",
      "profileEdit",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """profileEdit"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_CustomerCtrl_orderHistory6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orderHistory")))
  )
  private[this] lazy val controllers_CustomerCtrl_orderHistory6_invoker = createInvoker(
    CustomerCtrl_6.orderHistory(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerCtrl",
      "orderHistory",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """orderHistory"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_CustomerCtrl_cancelOrder7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cancelOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerCtrl_cancelOrder7_invoker = createInvoker(
    CustomerCtrl_6.cancelOrder(fakeValue[Long], fakeValue[String], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerCtrl",
      "cancelOrder",
      Seq(classOf[Long], classOf[String], classOf[Long]),
      "GET",
      """""",
      this.prefix + """cancelOrder/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_LoginController_editProfileForm8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editProfileForm/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LoginController_editProfileForm8_invoker = createInvoker(
    LoginController_8.editProfileForm(fakeValue[String], fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "editProfileForm",
      Seq(classOf[String], classOf[Long], classOf[String]),
      "POST",
      """""",
      this.prefix + """editProfileForm/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ShoppingCtrl_showBasket9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket9_invoker = createInvoker(
    ShoppingCtrl_5.showBasket(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "showBasket",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """###############################################################################
 Shopping
###############################################################################""",
      this.prefix + """showBasket"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ShoppingCtrl_addToBasket10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket10_invoker = createInvoker(
    ShoppingCtrl_5.addToBasket(fakeValue[Long], fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToBasket",
      Seq(classOf[Long], classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """addToBasket/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ShoppingCtrl_removeOne11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne")))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne11_invoker = createInvoker(
    ShoppingCtrl_5.removeOne(fakeValue[Long], fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long], classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """removeOne"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_ShoppingCtrl_addOne12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne12_invoker = createInvoker(
    ShoppingCtrl_5.addOne(fakeValue[Long], fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addOne",
      Seq(classOf[Long], classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """addOne/""" + "$" + """itemId<[^/]+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_ShoppingCtrl_removeOne13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne13_invoker = createInvoker(
    ShoppingCtrl_5.removeOne(fakeValue[Long], fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long], classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket14_invoker = createInvoker(
    ShoppingCtrl_5.emptyBasket(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "emptyBasket",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """emptyBasket"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_ShoppingCtrl_placeOrder15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder15_invoker = createInvoker(
    ShoppingCtrl_5.placeOrder(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "placeOrder",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """placeOrder"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_ShoppingCtrl_viewOrder16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder16_invoker = createInvoker(
    ShoppingCtrl_5.viewOrder(fakeValue[Long], fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrder",
      Seq(classOf[Long], classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """viewOrder/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_ShoppingCtrl_payment17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment")))
  )
  private[this] lazy val controllers_ShoppingCtrl_payment17_invoker = createInvoker(
    ShoppingCtrl_5.payment(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "payment",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """payment"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_ShoppingCtrl_paymentSubmit18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paymentSubmit")))
  )
  private[this] lazy val controllers_ShoppingCtrl_paymentSubmit18_invoker = createInvoker(
    ShoppingCtrl_5.paymentSubmit(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "paymentSubmit",
      Seq(classOf[Long], classOf[String]),
      "POST",
      """""",
      this.prefix + """paymentSubmit"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_AdminController_products19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/products")))
  )
  private[this] lazy val controllers_AdminController_products19_invoker = createInvoker(
    AdminController_0.products(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "products",
      Seq(classOf[Long]),
      "GET",
      """###############################################################################
 Admin 
###############################################################################
 products -----------------------------------------------------""",
      this.prefix + """admin/products"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_AdminController_addProduct20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addproduct")))
  )
  private[this] lazy val controllers_AdminController_addProduct20_invoker = createInvoker(
    AdminController_0.addProduct,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addProduct",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/addproduct"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_AdminController_addProductSubmit21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addProductSubmit")))
  )
  private[this] lazy val controllers_AdminController_addProductSubmit21_invoker = createInvoker(
    AdminController_0.addProductSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addProductSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/addProductSubmit"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_AdminController_deleteProduct22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/delProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteProduct22_invoker = createInvoker(
    AdminController_0.deleteProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/delProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_AdminController_updateProduct23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateProduct23_invoker = createInvoker(
    AdminController_0.updateProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/updateProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_AdminController_updateProductSubmit24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateProductSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateProductSubmit24_invoker = createInvoker(
    AdminController_0.updateProductSubmit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateProductSubmit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """admin/updateProductSubmit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_AdminController_orders25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/orders")))
  )
  private[this] lazy val controllers_AdminController_orders25_invoker = createInvoker(
    AdminController_0.orders,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "orders",
      Nil,
      "GET",
      """ Orders-----------------------------------------------------""",
      this.prefix + """admin/orders"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_AdminController_cancelOrder26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/cancelOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_cancelOrder26_invoker = createInvoker(
    AdminController_0.cancelOrder(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "cancelOrder",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/cancelOrder/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_AdminController_updateStatus27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateStatus"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateStatus27_invoker = createInvoker(
    AdminController_0.updateStatus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateStatus",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/updateStatus""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_AdminController_indexSliders28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/indexSliders")))
  )
  private[this] lazy val controllers_AdminController_indexSliders28_invoker = createInvoker(
    AdminController_0.indexSliders(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "indexSliders",
      Nil,
      "GET",
      """ Index sliders-----------------------------------------------------""",
      this.prefix + """admin/indexSliders"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_AdminController_addIndexSlider29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addIndexSlider")))
  )
  private[this] lazy val controllers_AdminController_addIndexSlider29_invoker = createInvoker(
    AdminController_0.addIndexSlider(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addIndexSlider",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/addIndexSlider"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_AdminController_addIndexSliderSubmit30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addIndexSliderSubmit")))
  )
  private[this] lazy val controllers_AdminController_addIndexSliderSubmit30_invoker = createInvoker(
    AdminController_0.addIndexSliderSubmit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addIndexSliderSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/addIndexSliderSubmit"""
    )
  )

  // @LINE:68
  private[this] lazy val controllers_AdminController_updateIndexSlider31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateIndexSlider/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateIndexSlider31_invoker = createInvoker(
    AdminController_0.updateIndexSlider(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateIndexSlider",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/updateIndexSlider/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_AdminController_updateIndexSliderSubmit32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateIndexSliderSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateIndexSliderSubmit32_invoker = createInvoker(
    AdminController_0.updateIndexSliderSubmit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateIndexSliderSubmit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """admin/updateIndexSliderSubmit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_AdminController_deleteIndexSlider33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/delIndexSlider/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteIndexSlider33_invoker = createInvoker(
    AdminController_0.deleteIndexSlider(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteIndexSlider",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/delIndexSlider/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_AdminController_warehouses134_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/warehouses1")))
  )
  private[this] lazy val controllers_AdminController_warehouses134_invoker = createInvoker(
    AdminController_0.warehouses1(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "warehouses1",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/warehouses1"""
    )
  )

  // @LINE:77
  private[this] lazy val controllers_AdminController_addWarehouse35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addWarehouse")))
  )
  private[this] lazy val controllers_AdminController_addWarehouse35_invoker = createInvoker(
    AdminController_0.addWarehouse(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addWarehouse",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/addWarehouse"""
    )
  )

  // @LINE:78
  private[this] lazy val controllers_AdminController_addWarehouseSubmit36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addWarehouseSubmit")))
  )
  private[this] lazy val controllers_AdminController_addWarehouseSubmit36_invoker = createInvoker(
    AdminController_0.addWarehouseSubmit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addWarehouseSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/addWarehouseSubmit"""
    )
  )

  // @LINE:80
  private[this] lazy val controllers_AdminController_updateWarehouse37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateWarehouse/"), DynamicPart("s", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateWarehouse37_invoker = createInvoker(
    AdminController_0.updateWarehouse(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateWarehouse",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """admin/updateWarehouse/""" + "$" + """s<[^/]+>"""
    )
  )

  // @LINE:81
  private[this] lazy val controllers_AdminController_updateWarehouseSubmit38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateWarehouseSubmit/"), DynamicPart("s", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateWarehouseSubmit38_invoker = createInvoker(
    AdminController_0.updateWarehouseSubmit(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateWarehouseSubmit",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """admin/updateWarehouseSubmit/""" + "$" + """s<[^/]+>"""
    )
  )

  // @LINE:83
  private[this] lazy val controllers_AdminController_delWarehouse39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/delWarehouse/"), DynamicPart("s", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_delWarehouse39_invoker = createInvoker(
    AdminController_0.delWarehouse(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "delWarehouse",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """admin/delWarehouse/""" + "$" + """s<[^/]+>"""
    )
  )

  // @LINE:85
  private[this] lazy val controllers_AdminController_setAsMain40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/setAsMain/"), DynamicPart("s", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_setAsMain40_invoker = createInvoker(
    AdminController_0.setAsMain(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "setAsMain",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """admin/setAsMain/""" + "$" + """s<[^/]+>"""
    )
  )

  // @LINE:91
  private[this] lazy val controllers_LoginController_login41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login41_invoker = createInvoker(
    LoginController_8.login(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """###############################################################################
 Login routes 
###############################################################################""",
      this.prefix + """login"""
    )
  )

  // @LINE:92
  private[this] lazy val controllers_LoginController_loginSubmit42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit42_invoker = createInvoker(
    LoginController_8.loginSubmit(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Seq(classOf[Long], classOf[String]),
      "POST",
      """""",
      this.prefix + """loginSubmit"""
    )
  )

  // @LINE:93
  private[this] lazy val controllers_LoginController_logout43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout43_invoker = createInvoker(
    LoginController_8.logout(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:94
  private[this] lazy val controllers_HomeController_addUserSubmit44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUserSubmit")))
  )
  private[this] lazy val controllers_HomeController_addUserSubmit44_invoker = createInvoker(
    HomeController_3.addUserSubmit(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUserSubmit",
      Seq(classOf[Long], classOf[String]),
      "POST",
      """""",
      this.prefix + """addUserSubmit"""
    )
  )

  // @LINE:100
  private[this] lazy val controllers_HomeController_like45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("like"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_like45_invoker = createInvoker(
    HomeController_3.like(fakeValue[Long], fakeValue[String], fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "like",
      Seq(classOf[Long], classOf[String], classOf[Long], classOf[String]),
      "GET",
      """###############################################################################
 Others
###############################################################################""",
      this.prefix + """like""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:101
  private[this] lazy val controllers_CustomerCtrl_comment46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerCtrl_comment46_invoker = createInvoker(
    CustomerCtrl_6.comment(fakeValue[Long], fakeValue[String], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerCtrl",
      "comment",
      Seq(classOf[Long], classOf[String], classOf[Long]),
      "POST",
      """""",
      this.prefix + """comment""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:108
  private[this] lazy val controllers_WarehouseController_ordersW47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse/ordersW")))
  )
  private[this] lazy val controllers_WarehouseController_ordersW47_invoker = createInvoker(
    WarehouseController_2.ordersW,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "ordersW",
      Nil,
      "GET",
      """""",
      this.prefix + """warehouse/ordersW"""
    )
  )

  // @LINE:109
  private[this] lazy val controllers_WarehouseController_orderDetails48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse/orderDetails/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WarehouseController_orderDetails48_invoker = createInvoker(
    WarehouseController_2.orderDetails(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "orderDetails",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """warehouse/orderDetails/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:110
  private[this] lazy val controllers_WarehouseController_cancelOrder49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse/cancelOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WarehouseController_cancelOrder49_invoker = createInvoker(
    WarehouseController_2.cancelOrder(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "cancelOrder",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """warehouse/cancelOrder/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:111
  private[this] lazy val controllers_WarehouseController_updateStatus50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse/updateStatus"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WarehouseController_updateStatus50_invoker = createInvoker(
    WarehouseController_2.updateStatus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "updateStatus",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """warehouse/updateStatus""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:115
  private[this] lazy val controllers_WarehouseController_products51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse/products")))
  )
  private[this] lazy val controllers_WarehouseController_products51_invoker = createInvoker(
    WarehouseController_2.products(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "products",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """warehouse/products"""
    )
  )

  // @LINE:117
  private[this] lazy val controllers_WarehouseController_supplyWarehouse52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse/supplyWarehouse/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WarehouseController_supplyWarehouse52_invoker = createInvoker(
    WarehouseController_2.supplyWarehouse(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "supplyWarehouse",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """warehouse/supplyWarehouse/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:118
  private[this] lazy val controllers_WarehouseController_supplyWarehouseSubmit53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse/supplyWarehouseSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WarehouseController_supplyWarehouseSubmit53_invoker = createInvoker(
    WarehouseController_2.supplyWarehouseSubmit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "supplyWarehouseSubmit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """warehouse/supplyWarehouseSubmit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:122
  private[this] lazy val controllers_CountController_count54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count54_invoker = createInvoker(
    CountController_1.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """####################################################################################
 An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:124
  private[this] lazy val controllers_AsyncController_message55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message55_invoker = createInvoker(
    AsyncController_4.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:127
  private[this] lazy val controllers_Assets_versioned56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned56_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_HomeController_index0_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_HomeController_index0_invoker.call(HomeController_3.index(cat, filter))
      }
  
    // @LINE:10
    case controllers_HomeController_index1_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_HomeController_index1_invoker.call(HomeController_3.index(cat, filter))
      }
  
    // @LINE:12
    case controllers_HomeController_products2_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_HomeController_products2_invoker.call(HomeController_3.products(cat, filter))
      }
  
    // @LINE:14
    case controllers_HomeController_productDetails3_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some("")), params.fromPath[Long]("id", None)) { (cat, filter, id) =>
        controllers_HomeController_productDetails3_invoker.call(HomeController_3.productDetails(cat, filter, id))
      }
  
    // @LINE:21
    case controllers_CustomerCtrl_profile4_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_CustomerCtrl_profile4_invoker.call(CustomerCtrl_6.profile(cat, filter))
      }
  
    // @LINE:22
    case controllers_CustomerCtrl_profileEdit5_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_CustomerCtrl_profileEdit5_invoker.call(CustomerCtrl_6.profileEdit(cat, filter))
      }
  
    // @LINE:23
    case controllers_CustomerCtrl_orderHistory6_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_CustomerCtrl_orderHistory6_invoker.call(CustomerCtrl_6.orderHistory(cat, filter))
      }
  
    // @LINE:24
    case controllers_CustomerCtrl_cancelOrder7_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some("")), params.fromPath[Long]("id", None)) { (cat, filter, id) =>
        controllers_CustomerCtrl_cancelOrder7_invoker.call(CustomerCtrl_6.cancelOrder(cat, filter, id))
      }
  
    // @LINE:25
    case controllers_LoginController_editProfileForm8_route(params) =>
      call(params.fromPath[String]("email", None), params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (email, cat, filter) =>
        controllers_LoginController_editProfileForm8_invoker.call(LoginController_8.editProfileForm(email, cat, filter))
      }
  
    // @LINE:31
    case controllers_ShoppingCtrl_showBasket9_route(params) =>
      call(params.fromQuery[Long]("id", Some(0)), params.fromQuery[String]("filter", Some(""))) { (id, filter) =>
        controllers_ShoppingCtrl_showBasket9_invoker.call(ShoppingCtrl_5.showBasket(id, filter))
      }
  
    // @LINE:32
    case controllers_ShoppingCtrl_addToBasket10_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (id, cat, filter) =>
        controllers_ShoppingCtrl_addToBasket10_invoker.call(ShoppingCtrl_5.addToBasket(id, cat, filter))
      }
  
    // @LINE:33
    case controllers_ShoppingCtrl_removeOne11_route(params) =>
      call(params.fromQuery[Long]("itemId", None), params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (itemId, cat, filter) =>
        controllers_ShoppingCtrl_removeOne11_invoker.call(ShoppingCtrl_5.removeOne(itemId, cat, filter))
      }
  
    // @LINE:34
    case controllers_ShoppingCtrl_addOne12_route(params) =>
      call(params.fromPath[Long]("itemId", None), params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (itemId, cat, filter) =>
        controllers_ShoppingCtrl_addOne12_invoker.call(ShoppingCtrl_5.addOne(itemId, cat, filter))
      }
  
    // @LINE:35
    case controllers_ShoppingCtrl_removeOne13_route(params) =>
      call(params.fromPath[Long]("itemId", None), params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (itemId, cat, filter) =>
        controllers_ShoppingCtrl_removeOne13_invoker.call(ShoppingCtrl_5.removeOne(itemId, cat, filter))
      }
  
    // @LINE:36
    case controllers_ShoppingCtrl_emptyBasket14_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_ShoppingCtrl_emptyBasket14_invoker.call(ShoppingCtrl_5.emptyBasket(cat, filter))
      }
  
    // @LINE:37
    case controllers_ShoppingCtrl_placeOrder15_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_ShoppingCtrl_placeOrder15_invoker.call(ShoppingCtrl_5.placeOrder(cat, filter))
      }
  
    // @LINE:38
    case controllers_ShoppingCtrl_viewOrder16_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (id, cat, filter) =>
        controllers_ShoppingCtrl_viewOrder16_invoker.call(ShoppingCtrl_5.viewOrder(id, cat, filter))
      }
  
    // @LINE:39
    case controllers_ShoppingCtrl_payment17_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_ShoppingCtrl_payment17_invoker.call(ShoppingCtrl_5.payment(cat, filter))
      }
  
    // @LINE:40
    case controllers_ShoppingCtrl_paymentSubmit18_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_ShoppingCtrl_paymentSubmit18_invoker.call(ShoppingCtrl_5.paymentSubmit(cat, filter))
      }
  
    // @LINE:47
    case controllers_AdminController_products19_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_AdminController_products19_invoker.call(AdminController_0.products(cat))
      }
  
    // @LINE:49
    case controllers_AdminController_addProduct20_route(params) =>
      call { 
        controllers_AdminController_addProduct20_invoker.call(AdminController_0.addProduct)
      }
  
    // @LINE:50
    case controllers_AdminController_addProductSubmit21_route(params) =>
      call { 
        controllers_AdminController_addProductSubmit21_invoker.call(AdminController_0.addProductSubmit)
      }
  
    // @LINE:52
    case controllers_AdminController_deleteProduct22_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_deleteProduct22_invoker.call(AdminController_0.deleteProduct(id))
      }
  
    // @LINE:54
    case controllers_AdminController_updateProduct23_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_updateProduct23_invoker.call(AdminController_0.updateProduct(id))
      }
  
    // @LINE:55
    case controllers_AdminController_updateProductSubmit24_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_updateProductSubmit24_invoker.call(AdminController_0.updateProductSubmit(id))
      }
  
    // @LINE:58
    case controllers_AdminController_orders25_route(params) =>
      call { 
        controllers_AdminController_orders25_invoker.call(AdminController_0.orders)
      }
  
    // @LINE:59
    case controllers_AdminController_cancelOrder26_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_cancelOrder26_invoker.call(AdminController_0.cancelOrder(id))
      }
  
    // @LINE:60
    case controllers_AdminController_updateStatus27_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_updateStatus27_invoker.call(AdminController_0.updateStatus(id))
      }
  
    // @LINE:63
    case controllers_AdminController_indexSliders28_route(params) =>
      call { 
        controllers_AdminController_indexSliders28_invoker.call(AdminController_0.indexSliders())
      }
  
    // @LINE:65
    case controllers_AdminController_addIndexSlider29_route(params) =>
      call { 
        controllers_AdminController_addIndexSlider29_invoker.call(AdminController_0.addIndexSlider())
      }
  
    // @LINE:66
    case controllers_AdminController_addIndexSliderSubmit30_route(params) =>
      call { 
        controllers_AdminController_addIndexSliderSubmit30_invoker.call(AdminController_0.addIndexSliderSubmit())
      }
  
    // @LINE:68
    case controllers_AdminController_updateIndexSlider31_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_updateIndexSlider31_invoker.call(AdminController_0.updateIndexSlider(id))
      }
  
    // @LINE:69
    case controllers_AdminController_updateIndexSliderSubmit32_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_updateIndexSliderSubmit32_invoker.call(AdminController_0.updateIndexSliderSubmit(id))
      }
  
    // @LINE:71
    case controllers_AdminController_deleteIndexSlider33_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_deleteIndexSlider33_invoker.call(AdminController_0.deleteIndexSlider(id))
      }
  
    // @LINE:75
    case controllers_AdminController_warehouses134_route(params) =>
      call { 
        controllers_AdminController_warehouses134_invoker.call(AdminController_0.warehouses1())
      }
  
    // @LINE:77
    case controllers_AdminController_addWarehouse35_route(params) =>
      call { 
        controllers_AdminController_addWarehouse35_invoker.call(AdminController_0.addWarehouse())
      }
  
    // @LINE:78
    case controllers_AdminController_addWarehouseSubmit36_route(params) =>
      call { 
        controllers_AdminController_addWarehouseSubmit36_invoker.call(AdminController_0.addWarehouseSubmit())
      }
  
    // @LINE:80
    case controllers_AdminController_updateWarehouse37_route(params) =>
      call(params.fromPath[String]("s", None)) { (s) =>
        controllers_AdminController_updateWarehouse37_invoker.call(AdminController_0.updateWarehouse(s))
      }
  
    // @LINE:81
    case controllers_AdminController_updateWarehouseSubmit38_route(params) =>
      call(params.fromPath[String]("s", None)) { (s) =>
        controllers_AdminController_updateWarehouseSubmit38_invoker.call(AdminController_0.updateWarehouseSubmit(s))
      }
  
    // @LINE:83
    case controllers_AdminController_delWarehouse39_route(params) =>
      call(params.fromPath[String]("s", None)) { (s) =>
        controllers_AdminController_delWarehouse39_invoker.call(AdminController_0.delWarehouse(s))
      }
  
    // @LINE:85
    case controllers_AdminController_setAsMain40_route(params) =>
      call(params.fromPath[String]("s", None)) { (s) =>
        controllers_AdminController_setAsMain40_invoker.call(AdminController_0.setAsMain(s))
      }
  
    // @LINE:91
    case controllers_LoginController_login41_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_LoginController_login41_invoker.call(LoginController_8.login(cat, filter))
      }
  
    // @LINE:92
    case controllers_LoginController_loginSubmit42_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_LoginController_loginSubmit42_invoker.call(LoginController_8.loginSubmit(cat, filter))
      }
  
    // @LINE:93
    case controllers_LoginController_logout43_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_LoginController_logout43_invoker.call(LoginController_8.logout(cat, filter))
      }
  
    // @LINE:94
    case controllers_HomeController_addUserSubmit44_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_HomeController_addUserSubmit44_invoker.call(HomeController_3.addUserSubmit(cat, filter))
      }
  
    // @LINE:100
    case controllers_HomeController_like45_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some("")), params.fromPath[Long]("id", None), params.fromQuery[String]("s", None)) { (cat, filter, id, s) =>
        controllers_HomeController_like45_invoker.call(HomeController_3.like(cat, filter, id, s))
      }
  
    // @LINE:101
    case controllers_CustomerCtrl_comment46_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some("")), params.fromPath[Long]("id", None)) { (cat, filter, id) =>
        controllers_CustomerCtrl_comment46_invoker.call(CustomerCtrl_6.comment(cat, filter, id))
      }
  
    // @LINE:108
    case controllers_WarehouseController_ordersW47_route(params) =>
      call { 
        controllers_WarehouseController_ordersW47_invoker.call(WarehouseController_2.ordersW)
      }
  
    // @LINE:109
    case controllers_WarehouseController_orderDetails48_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WarehouseController_orderDetails48_invoker.call(WarehouseController_2.orderDetails(id))
      }
  
    // @LINE:110
    case controllers_WarehouseController_cancelOrder49_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WarehouseController_cancelOrder49_invoker.call(WarehouseController_2.cancelOrder(id))
      }
  
    // @LINE:111
    case controllers_WarehouseController_updateStatus50_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WarehouseController_updateStatus50_invoker.call(WarehouseController_2.updateStatus(id))
      }
  
    // @LINE:115
    case controllers_WarehouseController_products51_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_WarehouseController_products51_invoker.call(WarehouseController_2.products(cat))
      }
  
    // @LINE:117
    case controllers_WarehouseController_supplyWarehouse52_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WarehouseController_supplyWarehouse52_invoker.call(WarehouseController_2.supplyWarehouse(id))
      }
  
    // @LINE:118
    case controllers_WarehouseController_supplyWarehouseSubmit53_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WarehouseController_supplyWarehouseSubmit53_invoker.call(WarehouseController_2.supplyWarehouseSubmit(id))
      }
  
    // @LINE:122
    case controllers_CountController_count54_route(params) =>
      call { 
        controllers_CountController_count54_invoker.call(CountController_1.count)
      }
  
    // @LINE:124
    case controllers_AsyncController_message55_route(params) =>
      call { 
        controllers_AsyncController_message55_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:127
    case controllers_Assets_versioned56_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned56_invoker.call(Assets_7.versioned(path, file))
      }
  }
}
