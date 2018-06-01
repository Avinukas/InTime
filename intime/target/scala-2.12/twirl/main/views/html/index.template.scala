
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/(""" """),_display_(/*1.6*/main("In Time")/*1.21*/ {_display_(Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*2.1*/("""<section class="container">
	<div class="one border">
		<h2>Firma</h2>
		<ul class="nav nav-tabs">
			<li class="active"><a data-toggle="tab" href="#firmaAnmelden">Anmelden</a></li>
			<li><a data-toggle="tab" href="#firmaRegistrieren">Registrieren</a></li>
		</ul>

		<div class="tab-content">
			<div id="firmaAnmelden" class="tab-pane fade in active">
				<form>
					<div class="input-group">
						<input id="firmaId" type="text" class="form-control"
							name="FirmaId" placeholder="Firma ID"> <input id="email"
							type="text" class="form-control" name="email" placeholder="Email">
						<input id="password" type="password" class="form-control"
							name="password" placeholder="Passwort">
						<button type="button" class="btn btn-default ">anmelden</button>
					</div>
				</form>
			</div>
			<div id="firmaRegistrieren" class="tab-pane fade">
				<form>
					<div class="input-group">
						<input id="firmaName" type="text" class="form-control"
							name="FirmaName" placeholder="Name der Firma"> <input
							id="emailr" type="text" class="form-control" name="emailr"
							placeholder="Email"> <input id="passwordr"
							type="password" class="form-control" name="passwordr"
							placeholder="Passwort"> <input id="passwordrw"
							type="password" class="form-control" name="passwordrw"
							placeholder="Passwort wiederholen">
						<button type="button" class="btn btn-default">registrieren</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<div class="two border">
		<h2>Mitarbeiter</h2>

		<ul class="nav nav-tabs">
			<li class="active"><a data-toggle="tab" href="#mitarbeiterAnmeldung">Anmelden</a></li>
			<li><a data-toggle="tab" href="#mitarbeiterRegistrieren">Registrieren</a></li>
		</ul>

		<div class="tab-content">
			<div id="mitarbeiterAnmeldung" class="tab-pane fade in active">
				<form>
					<div class="input-group">
						<input id="firmaIdm" type="text" class="form-control"
							name="FirmaIdm" placeholder="Firma ID"> 
						<input id="emailm"
							type="text" class="form-control" name="email" placeholder="Email">
						<input id="passwordm" type="password" class="form-control"
							name="passwordm" placeholder="Passwort">
						<button type="button" class="btn btn-default ">anmelden</button>
					</div>
				</form>
			</div>
			<div id="mitarbeiterRegistrieren" class="tab-pane fade">
				<form>
					<div class="input-group">
						<input id="firmaIdmr" type="text" class="form-control"
							name="FirmaIdmr" placeholder="ID der Firma"> <input
							id="emailrm" type="text" class="form-control" name="emailrm"
							placeholder="Email"> <input id="passwordrm"
							type="password" class="form-control" name="passwordrm"
							placeholder="Passwort"> <input id="passwordrwm"
							type="password" class="form-control" name="passwordrwm"
							placeholder="Passwort wiederholen">
						<button type="button" class="btn btn-default">registrieren</button>
					</div>
				</form>
			</div>
		</div>

	</div>
</section>

""")))}),format.raw/*82.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 27 20:44:00 CEST 2018
                  SOURCE: /Users/glideikyte/Documents/development/InTime/intime/app/views/index.scala.html
                  HASH: 0c1000027ecff8e507d0f937601752194aceb107
                  MATRIX: 941->1|1037->3|1064->5|1087->20|1126->22|1153->23|4196->3036
                  LINES: 28->1|33->1|33->1|33->1|33->1|34->2|114->82
                  -- GENERATED --
              */
          