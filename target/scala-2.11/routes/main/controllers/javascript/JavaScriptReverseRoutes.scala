
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/project/24-04-17/conf/routes
// @DATE:Mon Apr 24 13:45:13 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:9
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:127
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:127
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:47
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def addProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addProductSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addProductSubmit"})
        }
      """
    )
  
    // @LINE:63
    def indexSliders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.indexSliders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/indexSliders"})
        }
      """
    )
  
    // @LINE:47
    def products: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.products",
      """
        function(cat0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/products" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0))])})
        }
      """
    )
  
    // @LINE:60
    def updateStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateStatus",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/updateStatus" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:83
    def delWarehouse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.delWarehouse",
      """
        function(s0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/delWarehouse/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("s", encodeURIComponent(s0))})
        }
      """
    )
  
    // @LINE:78
    def addWarehouseSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addWarehouseSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addWarehouseSubmit"})
        }
      """
    )
  
    // @LINE:75
    def warehouses1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.warehouses1",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/warehouses1"})
        }
      """
    )
  
    // @LINE:65
    def addIndexSlider: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addIndexSlider",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addIndexSlider"})
        }
      """
    )
  
    // @LINE:59
    def cancelOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.cancelOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/cancelOrder/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:52
    def deleteProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.deleteProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/delProduct/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:71
    def deleteIndexSlider: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.deleteIndexSlider",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/delIndexSlider/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:54
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/updateProduct/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:77
    def addWarehouse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addWarehouse",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addWarehouse"})
        }
      """
    )
  
    // @LINE:58
    def orders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.orders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/orders"})
        }
      """
    )
  
    // @LINE:69
    def updateIndexSliderSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateIndexSliderSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/updateIndexSliderSubmit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:80
    def updateWarehouse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateWarehouse",
      """
        function(s0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/updateWarehouse/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("s", encodeURIComponent(s0))})
        }
      """
    )
  
    // @LINE:81
    def updateWarehouseSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateWarehouseSubmit",
      """
        function(s0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/updateWarehouseSubmit/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("s", encodeURIComponent(s0))})
        }
      """
    )
  
    // @LINE:49
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addproduct"})
        }
      """
    )
  
    // @LINE:85
    def setAsMain: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.setAsMain",
      """
        function(s0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/setAsMain/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("s", encodeURIComponent(s0))})
        }
      """
    )
  
    // @LINE:66
    def addIndexSliderSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addIndexSliderSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addIndexSliderSubmit"})
        }
      """
    )
  
    // @LINE:55
    def updateProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateProductSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/updateProductSubmit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:68
    def updateIndexSlider: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateIndexSlider",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/updateIndexSlider/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:108
  class ReverseWarehouseController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:118
    def supplyWarehouseSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WarehouseController.supplyWarehouseSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouse/supplyWarehouseSubmit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:115
    def products: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WarehouseController.products",
      """
        function(cat0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouse/products" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0))])})
        }
      """
    )
  
    // @LINE:111
    def updateStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WarehouseController.updateStatus",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouse/updateStatus" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:109
    def orderDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WarehouseController.orderDetails",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouse/orderDetails/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:108
    def ordersW: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WarehouseController.ordersW",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouse/ordersW"})
        }
      """
    )
  
    // @LINE:110
    def cancelOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WarehouseController.cancelOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouse/cancelOrder/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:117
    def supplyWarehouse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WarehouseController.supplyWarehouse",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouse/supplyWarehouse/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:122
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:122
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def products: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.products",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:9
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function(cat0,filter1) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
          }
        
        }
      """
    )
  
    // @LINE:100
    def like: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.like",
      """
        function(cat0,filter1,id2,s3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "like" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id2) + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1)), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s3)])})
        }
      """
    )
  
    // @LINE:94
    def addUserSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addUserSubmit",
      """
        function(cat0,filter1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addUserSubmit" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:14
    def productDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.productDetails",
      """
        function(cat0,filter1,id2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productDetails/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id2) + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
  }

  // @LINE:124
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:124
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def editProfileForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.editProfileForm",
      """
        function(email0,cat1,filter2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "editProfileForm/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email0)) + _qS([(cat1 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat1)), (filter2 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter2))])})
        }
      """
    )
  
    // @LINE:93
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:91
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:92
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginSubmit",
      """
        function(cat0,filter1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseCustomerCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def orderHistory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerCtrl.orderHistory",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orderHistory" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:22
    def profileEdit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerCtrl.profileEdit",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profileEdit" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:101
    def comment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerCtrl.comment",
      """
        function(cat0,filter1,id2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "comment" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id2) + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:21
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerCtrl.profile",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:24
    def cancelOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerCtrl.cancelOrder",
      """
        function(cat0,filter1,id2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cancelOrder/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id2) + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseShoppingCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def payment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.payment",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payment" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:34
    def addOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addOne",
      """
        function(itemId0,cat1,filter2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addOne/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0) + _qS([(cat1 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat1)), (filter2 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter2))])})
        }
      """
    )
  
    // @LINE:33
    def removeOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.removeOne",
      """
        function(itemId0,cat1,filter2) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeOne" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("itemId", itemId0), (cat1 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat1)), (filter2 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter2))])})
          }
        
        }
      """
    )
  
    // @LINE:36
    def emptyBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.emptyBasket",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "emptyBasket" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:38
    def viewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.viewOrder",
      """
        function(id0,cat1,filter2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewOrder/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + _qS([(cat1 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat1)), (filter2 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter2))])})
        }
      """
    )
  
    // @LINE:32
    def addToBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addToBasket",
      """
        function(id0,cat1,filter2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToBasket/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + _qS([(cat1 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat1)), (filter2 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter2))])})
        }
      """
    )
  
    // @LINE:37
    def placeOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.placeOrder",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "placeOrder" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:40
    def paymentSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.paymentSubmit",
      """
        function(cat0,filter1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paymentSubmit" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:31
    def showBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.showBasket",
      """
        function(id0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showBasket" + _qS([(id0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
  }


}
