/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.90
 * Generated at: 2023-08-27 02:53:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.GioHangbean;
import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Locale;
import bean.Giaybean;
import bean.KhachHangbean;

public final class matHang_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("bean.Giaybean");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Thông tin sản phẩm</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	   <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <a href=\"trangChuController\" class=\"navbar-brand\">Trang chủ</a>\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse1\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarCollapse1\">\r\n");
      out.write("                <div class=\"navbar-nav\">\r\n");
      out.write("                ");

                	ArrayList<GioHangbean> dsGio = (ArrayList<GioHangbean>) session.getAttribute("dsGioHang");
                	int a = 0;
                		if(dsGio != null)
                			a = dsGio.size();
                	
      out.write("\r\n");
      out.write("                    <a href=\"gioHangController\" class=\"nav-item nav-link\">Giỏ hàng(");
      out.print(a );
      out.write(")</a>\r\n");
      out.write("                    <a href=\"lichSuController\" class=\"nav-item nav-link\">Lịch sử mua hàng</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form class=\"d-flex mx-auto\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control me-sm-2\" style=\"width: 300px\" placeholder=\"Search\">\r\n");
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
      out.write("	\r\n");
      out.write("	<div class = \"container mt-5\">\r\n");
      out.write("	");

	Locale localeVN = new Locale("vi", "VN");
    NumberFormat vn = NumberFormat.getInstance(localeVN);
	Giaybean giay = (Giaybean) request.getAttribute("matHang"); 
	ArrayList<Integer> dsSize = (ArrayList<Integer>) request.getAttribute("sizeMatHang");
	
      out.write("\r\n");
      out.write("		<div class = \"row\">\r\n");
      out.write("		<div class = \"col-lg-5\">\r\n");
      out.write("		<img src=\"");
      out.print(giay.getAnh());
      out.write("\" height=\"90%\" width=\"90%\" class = \"img-thumbnail\">\r\n");
      out.write("		</div>	\r\n");
      out.write("		<div class = \"col-lg-7\">\r\n");
      out.write("		<div style=\"font-size: 30px; font-weight: bold;\">");
      out.print(giay.getTenGiay() );
      out.write("</div>	\r\n");
      out.write("		<div style=\"margin: 10px 0; font-size: 25px; font-weight: normal;\">Giá: ");
      out.print(vn.format(giay.getGia()));
      out.write("đ</div>\r\n");
      out.write("		<div style=\"margin: 10px 0; font-size: 20px; font-weight: normal\">Màu sắc: ");
      out.print(giay.getMauGiay() );
      out.write("</div>\r\n");
      out.write("		<div style=\"margin: 10px 0; font-size: 20px; font-weight: normal; color: grey\">Số lượng còn: ");
      out.print(giay.getSoLuongTon());
      out.write("</div>\r\n");
      out.write("		<div>\r\n");
      out.write("			<label style=\"margin: 10px 0; font-size: 20px; font-weight: normal\">Size: </label>\r\n");
      out.write("		<form action=\"gioHangController?maGiay=");
      out.print(giay.getMaGiay());
      out.write("&tenGiay=");
      out.print(giay.getTenGiay());
      out.write("&gia=");
      out.print(giay.getGia());
      out.write("&anh=");
      out.print(giay.getAnh());
      out.write("\r\n");
      out.write("		&mauGiay=");
      out.print(giay.getMauGiay());
      out.write("\" method=\"post\">\r\n");
      out.write("		<div class = \"btn-group\"> \r\n");
      out.write("		");

		int n = dsSize.size();
		for(int i = 0; i <n ; i++){ 
      out.write("\r\n");
      out.write("		<div style=\"margin: 0 5px\">\r\n");
      out.write("			");
if(i == 0){
			//nếu phần từ đầu tiên là cho checkbox = true
			
      out.write("\r\n");
      out.write("				<input type=\"radio\" class=\"btn-check\" name=\"btnradio\" id=\"btnradio");
      out.print(i );
      out.write("\" autocomplete=\"off\" checked value=\"");
      out.print(dsSize.get(i));
      out.write("\">\r\n");
      out.write("   			   <label class=\"btn btn-outline-dark\" for=\"btnradio");
      out.print(i );
      out.write("\" checked>");
      out.print(dsSize.get(i) );
      out.write("</label>\r\n");
      out.write("			");
}else{
			
      out.write("\r\n");
      out.write("   			  <input type=\"radio\" class=\"btn-check\" name=\"btnradio\" id=\"btnradio");
      out.print(i );
      out.write("\" autocomplete=\"off\" value=\"");
      out.print(dsSize.get(i));
      out.write("\">\r\n");
      out.write("   			   <label class=\"btn btn-outline-dark\" for=\"btnradio");
      out.print(i );
      out.write('"');
      out.write('>');
      out.print(dsSize.get(i) );
      out.write("</label>\r\n");
      out.write("  		");
} 
      out.write("\r\n");
      out.write("  		</div>\r\n");
      out.write("		");
} 
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div>\r\n");
      out.write("			<label style=\"margin: 10px 0; font-size: 20px; font-weight: normal\">Số lượng: </label>\r\n");
      out.write("			<input type=\"number\" min = \"1\" max = \"");
      out.print(giay.getSoLuongTon() );
      out.write("\" value = 1 class = \"text-form\" style=\"width : 50px\" name = \"txtSoLuong\">\r\n");
      out.write("		</div>\r\n");
      out.write("		<hr>\r\n");
      out.write("		");
if(giay.getSoLuongTon() != 0){ 
      out.write("\r\n");
      out.write("		<input type=\"submit\" value = \"Thêm vào giỏ hàng\" class = \"btn btn-dark\">\r\n");
      out.write("		");
}else{ 
      out.write("\r\n");
      out.write("		<div style=\"color: red;\">Mặt hàng này đã hết, vui lòng quay lại sau</div>\r\n");
      out.write("		<br>\r\n");
      out.write("		<input type=\"submit\" value = \"Thêm vào giỏ hàng\" class = \"btn btn-dark\" disabled>\r\n");
      out.write("		");
} 
      out.write("\r\n");
      out.write("		</form>\r\n");
      out.write("		</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");
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
