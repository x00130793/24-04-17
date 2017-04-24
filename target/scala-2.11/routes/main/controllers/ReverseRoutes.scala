
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/project/24-04-17/conf/routes
// @DATE:Mon Apr 24 14:40:49 IST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:9
package controllers {

  // @LINE:129
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:129
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:49
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def addProductSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/addProductSubmit")
    }
  
    // @LINE:65
    def indexSliders(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/indexSliders")
    }
  
    // @LINE:49
    def products(cat:Long = 0L): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/products" + queryString(List(if(cat == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:62
    def updateStatus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/updateStatus" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:85
    def delWarehouse(s:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/delWarehouse/" + implicitly[PathBindable[String]].unbind("s", dynamicString(s)))
    }
  
    // @LINE:80
    def addWarehouseSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/addWarehouseSubmit")
    }
  
    // @LINE:77
    def warehouses1(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/warehouses1")
    }
  
    // @LINE:67
    def addIndexSlider(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/addIndexSlider")
    }
  
    // @LINE:61
    def cancelOrder(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/cancelOrder/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:54
    def deleteProduct(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/delProduct/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:73
    def deleteIndexSlider(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/delIndexSlider/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:56
    def updateProduct(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/updateProduct/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:79
    def addWarehouse(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/addWarehouse")
    }
  
    // @LINE:60
    def orders(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/orders")
    }
  
    // @LINE:71
    def updateIndexSliderSubmit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/updateIndexSliderSubmit/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:82
    def updateWarehouse(s:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/updateWarehouse/" + implicitly[PathBindable[String]].unbind("s", dynamicString(s)))
    }
  
    // @LINE:83
    def updateWarehouseSubmit(s:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/updateWarehouseSubmit/" + implicitly[PathBindable[String]].unbind("s", dynamicString(s)))
    }
  
    // @LINE:51
    def addProduct(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/addproduct")
    }
  
    // @LINE:87
    def setAsMain(s:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/setAsMain/" + implicitly[PathBindable[String]].unbind("s", dynamicString(s)))
    }
  
    // @LINE:68
    def addIndexSliderSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/addIndexSliderSubmit")
    }
  
    // @LINE:57
    def updateProductSubmit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/updateProductSubmit/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:70
    def updateIndexSlider(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/updateIndexSlider/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:110
  class ReverseWarehouseController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:120
    def supplyWarehouseSubmit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "warehouse/supplyWarehouseSubmit/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:117
    def products(cat:Long = 0L): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "warehouse/products" + queryString(List(if(cat == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:113
    def updateStatus(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "warehouse/updateStatus" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:111
    def orderDetails(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "warehouse/orderDetails/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:110
    def ordersW(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "warehouse/ordersW")
    }
  
    // @LINE:112
    def cancelOrder(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "warehouse/cancelOrder/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:119
    def supplyWarehouse(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "warehouse/supplyWarehouse/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:124
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:124
    def count(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def products(cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "products" + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:9
    def index(cat:Long = 0, filter:String = ""): Call = {
    
      (cat: @unchecked, filter: @unchecked) match {
      
        // @LINE:9
        case (cat, filter)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
      
      }
    
    }
  
    // @LINE:102
    def like(cat:Long = 0, filter:String = "", id:Long, s:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "like" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)), Some(implicitly[QueryStringBindable[String]].unbind("s", s)))))
    }
  
    // @LINE:96
    def addUserSubmit(cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addUserSubmit" + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:14
    def productDetails(cat:Long = 0, filter:String = "", id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "productDetails/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
  }

  // @LINE:126
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:126
    def message(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:27
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def editProfileForm(email:String, cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "editProfileForm/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:95
    def logout(cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout" + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:93
    def login(cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login" + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:94
    def loginSubmit(cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit" + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
  }

  // @LINE:21
  class ReverseCustomerCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def profileSubmit(cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "profileSubmit" + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:25
    def orderHistory(cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "orderHistory" + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:22
    def profileEdit(cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "profileEdit" + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:103
    def comment(cat:Long = 0, filter:String = "", id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "comment" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:21
    def profile(cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "profile" + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:26
    def cancelOrder(cat:Long = 0, filter:String = "", id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "cancelOrder/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
  }

  // @LINE:33
  class ReverseShoppingCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def payment(cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "payment" + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:36
    def addOne(itemId:Long, cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addOne/" + implicitly[PathBindable[Long]].unbind("itemId", itemId) + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:35
    def removeOne(itemId:Long, cat:Long = 0, filter:String = ""): Call = {
    
      (itemId: @unchecked, cat: @unchecked, filter: @unchecked) match {
      
        // @LINE:35
        case (itemId, cat, filter)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "removeOne" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("itemId", itemId)), if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
      
      }
    
    }
  
    // @LINE:38
    def emptyBasket(cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "emptyBasket" + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:40
    def viewOrder(id:Long, cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "viewOrder/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:34
    def addToBasket(id:Long, cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addToBasket/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:39
    def placeOrder(cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "placeOrder" + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:42
    def paymentSubmit(cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "paymentSubmit" + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:33
    def showBasket(id:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "showBasket" + queryString(List(if(id == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("id", id)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
  }


}
