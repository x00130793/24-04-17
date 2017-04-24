
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/project2/project2017/conf/routes
// @DATE:Mon Apr 24 12:48:20 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
