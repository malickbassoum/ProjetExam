package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vueUv_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Enseignant</title>\n");
      out.write("        <link href=\"bootstrap.css\" type=\"text/css\"  rel=\"stylesheet\">\n");
      out.write("        <script type=\"text/javascript\"> \n");
      out.write("            function confirmer(url){\n");
      out.write("                var rep= confirm(\"Etes vous sur de vouloir supprimer?\");\n");
      out.write("                if(rep==true){\n");
      out.write("                    document.location=url;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"padding-left: 15px; padding-top: 15px;padding-bottom: 10px\">\n");
      out.write("        <a class=\"btn btn-info\" href=\"http://localhost:8080/Examen/home.jsp\">Home</a>\n");
      out.write("        <a class=\"btn btn-danger\" href=\"http://localhost:8080/Examen/logout.jsp\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\" style=\"padding-left: 350px\">\n");
      out.write("        <form action=\"/Examen/UvServlet\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                  <td>Mot clé</td>\n");
      out.write("                  <td><input type=\"text\" name=\"motCle\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.motCle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\n");
      out.write("                  <td ><input class=\"btn btn-success\" type=\"submit\" value=\"Chercher\" name=\"action\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        </div> \n");
      out.write("                  <div class=\"container\" style=\" padding-left: 350px\">\n");
      out.write("        <form action=\"/Examen/UvServlet\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.mode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"mode\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                  <td>N Uv: </td>\n");
      out.write("                  <td><input type=\"text\" name=\"nUv\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.uv.nUv}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\n");
      out.write("                  <td></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                  <td>Nom Uv:</td>\n");
      out.write("                  <td><input type=\"text\" name=\"nomUv\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.uv.nomUv}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\n");
      out.write("                  <td></td>\n");
      out.write("                 </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input class=\"btn btn-info\" type=\"submit\" name=\"action\" value=\"Ajouter\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        </div>          \n");
      out.write("                  <div class=\"container\" style=\"padding-left: 350px\">\n");
      out.write("            <table  class=\"table\" style=\"width: 500px\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr class=\"danger\">\n");
      out.write("                    <th>NUV</th>\n");
      out.write("                    <th>Nom UV</th>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.uvs}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("u");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <tbody>\n");
          out.write("                        <tr class=\"info\">\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.nUv}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.nomUv}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        \n");
          out.write("                        <td><a href=\"javascript:confirmer('/Examen/UvServlet?action=delete&nom=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.nUv}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\" class=\"btn btn-danger\">Suprimer</a></td>\n");
          out.write("                        <td><a href=\"/Examen/UvServlet?action=edit&nom=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.nUv}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-info\">Editer</a></td>\n");
          out.write("                    </tr>\n");
          out.write("                    </tbody>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
