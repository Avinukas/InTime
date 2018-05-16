// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/glideikyte/Documents/development/InTime/intime/conf/routes
// @DATE:Wed May 16 14:39:46 CEST 2018


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
