// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Michel/Documents/develop/InTime/intime/conf/routes
// @DATE:Tue May 15 21:52:45 CEST 2018


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
