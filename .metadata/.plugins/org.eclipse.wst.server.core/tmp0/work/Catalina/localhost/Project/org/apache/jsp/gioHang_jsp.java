/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.90
 * Generated at: 2023-08-27 02:54:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.NumberFormat;
import java.util.Locale;
import bean.KhachHangbean;
import bean.GioHangbean;
import java.util.ArrayList;

public final class gioHang_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("bean.KhachHangbean");
    _jspx_imports_classes.add("bean.GioHangbean");
    _jspx_imports_classes.add("java.util.Locale");
    _jspx_imports_classes.add("java.text.NumberFormat");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>Giỏ hàng</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".text {\r\n");
      out.write("   overflow: hidden;\r\n");
      out.write("   display: -webkit-box;\r\n");
      out.write("   -webkit-line-clamp: 2; /* number of lines to show */\r\n");
      out.write("           line-clamp: 2; \r\n");
      out.write("   -webkit-box-orient: vertical;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media (min-width: 992px) {\r\n");
      out.write("	.formbtnXoa2 {\r\n");
      out.write("		display: none\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media (max-width: 992px) {\r\n");
      out.write("	.formbtnXoa1 {\r\n");
      out.write("		display: none\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <a href=\"trangChuController\" class=\"navbar-brand\">Trang chủ</a>\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse1\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarCollapse1\">\r\n");
      out.write("                <div class=\"navbar-nav\">\r\n");
      out.write("                	");

                	ArrayList<GioHangbean> dsGio = (ArrayList<GioHangbean>) session.getAttribute("dsGioHang");
                	int n = 0;
                		if(dsGio != null)
                			n = dsGio.size();
                	
      out.write("\r\n");
      out.write("                    <a href=\"gioHangController\" class=\"nav-item nav-link\">Giỏ hàng(");
      out.print(n );
      out.write(")</a>\r\n");
      out.write("                    <a href=\"lichSuController\" class=\"nav-item nav-link\">Lịch sử mua hàng</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form action=\"trangChuController\" method=\"post\" class=\"d-flex mx-auto\" >\r\n");
      out.write("                    <input type=\"text\" class=\"form-control me-sm-2\" style=\"width: 300px\" placeholder=\"Search\" name = \"txtTimKiem\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-outline-light\">Search</button>\r\n");
      out.write("                </form>\r\n");
      out.write("                <div class=\"navbar-nav\">\r\n");
      out.write("                ");
KhachHangbean khbean = (KhachHangbean) session.getAttribute("khachHang");
                if(khbean == null){
      out.write("\r\n");
      out.write("                <a href=\"dangKyController\" class=\"nav-item nav-link\">Đăng ký</a>\r\n");
      out.write("                <a href=\"dangNhapController\" class=\"nav-item nav-link\">Đăng nhập</a>\r\n");
      out.write("                ");
}else{ 
      out.write("\r\n");
      out.write("                <a href=\"#\" class=\"nav-item nav-link\">");
      out.print(khbean.getHoTen());
      out.write("</a>\r\n");
      out.write("                <a href=\"dangXuatController\" class=\"nav-item nav-link\">Đăng xuất</a>\r\n");
      out.write("                ");
} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class = \"container mt-3\">\r\n");
      out.write("    	");
if(request.getAttribute("noEmpty") == null){ 
      out.write("\r\n");
      out.write("    	<div class = \"row mt-3\"> \r\n");
      out.write("    		<div class =\"col-sm-1 col-1\">\r\n");
      out.write("    			<form action=\"xoaController\" method=\"post\">\r\n");
      out.write("    				<input type=\"submit\" value = \"Xóa\" name =\"btnXoaTungPhan\" class = \"btn btn-outline-dark\">\r\n");
      out.write("    			\r\n");
      out.write("    		</div>\r\n");
      out.write("    		\r\n");
      out.write("    		<div class = \"col-11\" style=\"text-align: center\">\r\n");
      out.write("    			<div class = \"row tieuDe\">\r\n");
      out.write("    			<div class = \"col-1\"></div>\r\n");
      out.write("    			<div class = \"col-4\" style=\"font-weight: bold;\">SẢN PHẨM</div>\r\n");
      out.write("    			\r\n");
      out.write("    			<div class = \"col-2\" style=\"font-weight: bold;\">GÍA</div>\r\n");
      out.write("    			<div class = \"col-2\" style=\"padding: 0px !important; font-weight: bold;\">SỐ LƯỢNG</div>\r\n");
      out.write("    			<div class=\"col-2\" style=\"font-weight: bold;\">TẠM TÍNH</div>\r\n");
      out.write("    			<div clsas = \"col-1\" style=\"font-weight: bold;\"></div>\r\n");
      out.write("    			</div>\r\n");
      out.write("    		</div>\r\n");
      out.write("    	</div>\r\n");
      out.write("    	<div class = \"row mt-3\"> \r\n");
      out.write("    		");

    		Locale localeVN = new Locale("vi", "VN");
    	    NumberFormat vn = NumberFormat.getInstance(localeVN);
    		
    		
      out.write("\r\n");
      out.write("    		<div class = \"col-1\">\r\n");
      out.write("    		");

    		//checkbox
    		for(GioHangbean gio: dsGio){
      out.write("\r\n");
      out.write("    			<div class = \"row\" style=\"height: 80px; text-align: center\"\">\r\n");
      out.write("    				<div style=\"display: flex; align-items: center; justify-content: center; height: 100%;\">\r\n");
      out.write("    					<input type=\"checkbox\" name = \"checkbox\" value=\"");
      out.print(gio.getMaGiay());
      out.write("\">\r\n");
      out.write("    				</div>\r\n");
      out.write("    			\r\n");
      out.write("    			\r\n");
      out.write("    			</div>\r\n");
      out.write("    			<br>\r\n");
      out.write("    		");
}
    		
      out.write("\r\n");
      out.write("    		</form>\r\n");
      out.write("    		</div>\r\n");
      out.write("    		<div class = \"col-11\">\r\n");
      out.write("    		");

    		//ds giỏ
    		for(GioHangbean gio: dsGio){
      out.write("	\r\n");
      out.write("				<div class = \"row\" style=\" height: 80px;text-align: center\"> \r\n");
      out.write("    		\r\n");
      out.write("    			<div class = \"col-1\"><img src=\"");
      out.print(gio.getAnh());
      out.write("\" style=\"width: 100%; height: 100%\"></div>\r\n");
      out.write("    			<div class = \"col-4 text\" style=\"font-weight: bold;\"><p class = \"text\">");
      out.print(gio.getTenGiay());
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(gio.getSize());
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(gio.getMauGiay() );
      out.write("</p></div>\r\n");
      out.write("    			\r\n");
      out.write("    			<div class = \"col-2\">");
      out.print(vn.format(gio.getGia()));
      out.write("đ</div>\r\n");
      out.write("    			<div class = \"col-2\">\r\n");
      out.write("    			<form action=\"gioHangController?mg=");
      out.print(gio.getMaGiay());
      out.write("\" method=\"post\">\r\n");
      out.write("    			<div class = \"row\">\r\n");
      out.write("    				<input type=\"number\" name = \"txtSL\" value= \"");
      out.print(gio.getSoLuong() );
      out.write("\" min = 1 class = \"col-lg-4 col-sm-6 col-6\" style=\"padding: 0 !important; margin-right: 2px;\" width=\"100%\">\r\n");
      out.write("    				<input type = \"submit\" value = \"Sửa\" class = \"col-lg-5 col-sm-6 col-6 btn btn-outline-dark btn-sm\" style=\"width: 50%\">\r\n");
      out.write("    				</div>\r\n");
      out.write("    			</form>\r\n");
      out.write("    			</div>\r\n");
      out.write("    			<div class = \"col-2 \">");
      out.print(vn.format(gio.getThanhTien()));
      out.write("đ</div>\r\n");
      out.write("    			<div class = \"col-1\">\r\n");
      out.write("    			<form action=\"xoaController?mg=");
      out.print(gio.getMaGiay());
      out.write("\" method=\"post\" class = \"formbtnXoa1\">\r\n");
      out.write("    				<input type = \"submit\" value = \"Xóa\" name = \"btnXoa\" class = \"btn btn-outline-danger btn-sm\" style=\"width: 100%\">\r\n");
      out.write("    			</form>\r\n");
      out.write("    			<form action=\"xoaController?mg=");
      out.print(gio.getMaGiay());
      out.write("\" method=\"post\" class = \"formbtnXoa2\">\r\n");
      out.write("    				<button name = \"btnXoa\" class = \"btn btn-outline-danger btn-sm\">X</button>\r\n");
      out.write("    			</form>\r\n");
      out.write("    			</div>\r\n");
      out.write("    			\r\n");
      out.write("    		</div>\r\n");
      out.write("				\r\n");
      out.write("				<br>\r\n");
      out.write("    		");
}
      out.write("\r\n");
      out.write("    	</div>\r\n");
      out.write("    	<hr>\r\n");
      out.write("    	<div class =\"row\">\r\n");
      out.write("    		<div class = \"col-1\"></div>\r\n");
      out.write("    		<div class = \"col-11\">\r\n");
      out.write("    			<div class =\"row\">\r\n");
      out.write("    				<div class =\"col-10\" style=\"font-weight: bold;\">TỔNG TIỀN: </div>\r\n");
      out.write("    				<div class =\"col-2\">");
      out.print(vn.format(session.getAttribute("tong")));
      out.write("đ</div>\r\n");
      out.write("    			</div>\r\n");
      out.write("    		</div>\r\n");
      out.write("    	</div>\r\n");
      out.write("    	\r\n");
      out.write("    	<div class =\"row\">\r\n");
      out.write("    		<div class = \"col-10\">\r\n");
      out.write("    			<form action=\"xoaController\" method=\"post\">\r\n");
      out.write("    				<input type=\"submit\" value =\"Xóa tất cả\" class = \"btn btn-outline-dark\" name = \"btnXoaTatCa\">\r\n");
      out.write("    			</form>\r\n");
      out.write("    		</div>\r\n");
      out.write("    		<div class = \"col-2\">\r\n");
      out.write("    			<form action=\"muaHangController\">\r\n");
      out.write("    				<input type=\"submit\" value=\"Mua hàng\"  class = \"btn btn-outline-dark\" name = \"btnXacNhan\">\r\n");
      out.write("    			</form>\r\n");
      out.write("    		</div>\r\n");
      out.write("    	</div>\r\n");
      out.write("    	</div>\r\n");
      out.write("    		\r\n");
      out.write("    	");
}else{ 
      out.write("\r\n");
      out.write("    	<div class = \"row\">\r\n");
      out.write("    	<div class =\"col-3\"></div>\r\n");
      out.write("    		<div class =\"col-6\">\r\n");
      out.write("    			<img src=\"");
      out.print(request.getAttribute("noEmpty"));
      out.write("\" width=\"100%\" >\r\n");
      out.write("    		</div>\r\n");
      out.write("    	<div class =\"col-3\"></div>\r\n");
      out.write("    	</div>\r\n");
      out.write("    	");
} 
      out.write("\r\n");
      out.write("     	\r\n");
      out.write("     </div>\r\n");
      out.write("     \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
