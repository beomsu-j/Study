/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-04-02 04:47:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.ibatis.reflection.SystemMetaObject;
import java.security.SecureRandom;
import java.net.URLEncoder;
import java.math.BigInteger;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1308849601000L));
    _jspx_dependants.put("jar:file:/C:/Users/smhrd/Desktop/JSPStudy/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/GitProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(4);
    _jspx_imports_classes.add("org.apache.ibatis.reflection.SystemMetaObject");
    _jspx_imports_classes.add("java.security.SecureRandom");
    _jspx_imports_classes.add("java.net.URLEncoder");
    _jspx_imports_classes.add("java.math.BigInteger");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/flatpickr\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/flatpickr/dist/l10n/ko.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>ChariTeam - Free Nonprofit Website Template</title>\r\n");
      out.write("<meta content=\"\" name=\"keywords\">\r\n");
      out.write("<meta content=\"\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("<!-- Favicon -->\r\n");
      out.write("<link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("<!-- Google Web Fonts -->\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600&family=Saira:wght@500;600;700&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Icon Font Stylesheet -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Libraries Stylesheet -->\r\n");
      out.write("<link href=\"assets/lib/join/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("<link href=\"assets/css/demo_1/join/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Template Stylesheet -->\r\n");
      out.write("<link href=\"assets/css/demo_1/join/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- ** 달력CSS START-->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/demo_1/calendar.css\" />\r\n");
      out.write("<!-- ** 달력CSS END-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- background #fff 변경 -->\r\n");
      out.write("<link href=\"assets/css/demo_1/signup/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assets/css/demo_1/signup/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assets/css/demo_1/signup/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	");

	String clientId = "gbLrG9lQfNuwCCfz4nge";//애플리케이션 클라이언트 아이디값";
	String redirectURI = URLEncoder.encode("http://localhost:8080/GitProject/fitcallback.do", "UTF-8");
	SecureRandom random = new SecureRandom();
	String state = new BigInteger(130, random).toString();
	String apiURL = "https://nid.naver.com/oauth2.0/authorize?response_type=code" + "&client_id=" + clientId
			+ "&redirect_uri=" + redirectURI + "&state=" + state;
	session.setAttribute("state", state);
	
      out.write("\r\n");
      out.write("	<!-- Carousel Start -->\r\n");
      out.write("	<div class=\"container-fluid p-0 mb-5\">\r\n");
      out.write("		<div id=\"header-carousel\" class=\"carousel slide\"\r\n");
      out.write("			data-bs-ride=\"carousel\">\r\n");
      out.write("			<div class=\"carousel-inner\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<!-- 로그인 START -->\r\n");
      out.write("				<div class=\"carousel-item active\" id=\"carousel-login\">\r\n");
      out.write("					<img class=\"w-100\" src=\"assets/images/join/carousel-bg.jpg\"\r\n");
      out.write("						alt=\"Image\">\r\n");
      out.write("					<div class=\"carousel-caption\">\r\n");
      out.write("						<div class=\"container\">\r\n");
      out.write("							<form class=\"join-form\" action=\"Login.do\" method=\"post\">\r\n");
      out.write("								<div class=\"row justify-content-center\">\r\n");
      out.write("									<div class=\"col-lg-7 pt-5\">\r\n");
      out.write("										<h1 class=\"display-4 text-white mb-3 animated slideInDown\">Login</h1>\r\n");
      out.write("										<p class=\"fs-5 text-white-50 mb-5 animated slideInDown\">Fitneeds\r\n");
      out.write("											로그인을 해볼까요 :)</p>\r\n");
      out.write("\r\n");
      out.write("										<!-- 로그인 START -->\r\n");
      out.write("										<div class=\"row g-3\">\r\n");
      out.write("											<div class=\"col-12\">\r\n");
      out.write("												<div class=\"form-floating\">\r\n");
      out.write("													<input type=\"text\" class=\"form-control bg-light border-0\"\r\n");
      out.write("														id=\"mem_id\" name=\"mem_id\" placeholder=\"Your Name\">\r\n");
      out.write("													<label>아이디</label>\r\n");
      out.write("\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"col-12\">\r\n");
      out.write("												<div class=\"form-floating\">\r\n");
      out.write("													<input type=\"password\"\r\n");
      out.write("														class=\"form-control bg-light border-0\" id=\"mem_pw\"\r\n");
      out.write("														name=\"mem_pw\" placeholder=\"Your Email\"> <label>비밀번호</label>\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("\r\n");
      out.write("										<!-- 로그인input END -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("										<!-- naverButton -->\r\n");
      out.write("										<a href=\"");
      out.print(apiURL);
      out.write("\" class=\"btn animated slideInDown\"> <img\r\n");
      out.write("											height=\"50\"\r\n");
      out.write("											src=\"http://static.nid.naver.com/oauth/small_g_in.PNG\" /></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("										<button type=\"submit\" id=\"login-form-submit\"\r\n");
      out.write("											class=\"btn btn-primary py-2 px-3 animated slideInDown\"\r\n");
      out.write("											href=\"#\">\r\n");
      out.write("											로그인\r\n");
      out.write("											<div\r\n");
      out.write("												class=\"d-inline-flex btn-sm-square bg-white text-primary rounded-circle ms-2\">\r\n");
      out.write("												<i class=\"fa fa-check\"></i>\r\n");
      out.write("											</div>\r\n");
      out.write("										</button>\r\n");
      out.write("							</form>\r\n");
      out.write("							<a\r\n");
      out.write("								class=\"btn btn-primary py-2 px-3 animated slideInDown carousel-control-next\"\r\n");
      out.write("								type=\"button\" data-bs-target=\"#header-carousel\" id=\"join_btn\"\r\n");
      out.write("								data-bs-slide=\"next\" disabled> 회원가입\r\n");
      out.write("								<div\r\n");
      out.write("									class=\"d-inline-flex btn-sm-square bg-white text-primary rounded-circle ms-2\">\r\n");
      out.write("									<i class=\"fa fa-arrow-right\"></i>\r\n");
      out.write("								</div>\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- ////////////////////////////////////////////////////// page1 start ////////////////////////////////////////////////////////////////////  -->\r\n");
      out.write("\r\n");
      out.write("		<div class=\"carousel-item second\" id=\"carousel-first\">\r\n");
      out.write("			<img class=\"w-100\" src=\"assets/images/join/carousel-bg.jpg\"\r\n");
      out.write("				alt=\"Image\">\r\n");
      out.write("			<div class=\"carousel-caption active\">\r\n");
      out.write("				<div class=\"container\">\r\n");
      out.write("					<div class=\"row justify-content-center\">\r\n");
      out.write("						<div class=\"col-lg-7 pt-5\">\r\n");
      out.write("							<h1 class=\"display-4 text-white mb-3 animated slideInDown\">Sign\r\n");
      out.write("								up</h1>\r\n");
      out.write("							<p class=\"fs-5 text-white-50 mb-5 animated slideInDown\">Fitneeds\r\n");
      out.write("								회원가입을 도와드릴게요 :)</p>\r\n");
      out.write("							<div>\r\n");
      out.write("								<div class=\"row g-3\">\r\n");
      out.write("									<div class=\"col-12\">\r\n");
      out.write("										<form class=\"join-form\" action=\"Join.do\" method=\"post\"\r\n");
      out.write("											onsubmit=\"showSuccessAlert()\">\r\n");
      out.write("											<div class=\"form-floating\">\r\n");
      out.write("												<input type=\"text\" class=\"form-control bg-light border-0\"\r\n");
      out.write("													id=\"mem_id\" name=\"mem_id\" placeholder=\"아이디를 입력해 주세요.\">\r\n");
      out.write("												<label>아이디</label>\r\n");
      out.write("\r\n");
      out.write("											</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"col-12\">\r\n");
      out.write("										<div class=\"form-floating\">\r\n");
      out.write("											<input type=\"text\" class=\"form-control bg-light border-0\"\r\n");
      out.write("												id=\"mem_pw\" name=\"mem_pw\" placeholder=\"Your Email\">\r\n");
      out.write("											<label for=\"email\">비밀번호</label>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("									<div class=\"col-12\">\r\n");
      out.write("										<div class=\"form-floating\">\r\n");
      out.write("											<input type=\"text\" class=\"form-control bg-light border-0\"\r\n");
      out.write("												id=\"mem_nick\" name=\"mem_nick\" placeholder=\"Your Email\">\r\n");
      out.write("											<label for=\"email\">닉네임</label>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<a\r\n");
      out.write("								class=\"btn btn-primary py-2 px-3 animated slideInDown carousel-control-prev\"\r\n");
      out.write("								type=\"button\" data-bs-target=\"#header-carousel\"\r\n");
      out.write("								data-bs-slide=\"prev\">\r\n");
      out.write("								<div\r\n");
      out.write("									class=\"d-inline-flex btn-sm-square bg-white text-primary rounded-circle ms-2\">\r\n");
      out.write("									<i class=\"fa fa-arrow-left\"></i>\r\n");
      out.write("								</div> 로그인\r\n");
      out.write("							</a> <a\r\n");
      out.write("								class=\"btn btn-primary py-2 px-3 animated slideInDown carousel-control-next\"\r\n");
      out.write("								type=\"button\" data-bs-target=\"#header-carousel\" id=\"1st-next\"\r\n");
      out.write("								data-bs-slide=\"next\" disabled> Next Step\r\n");
      out.write("								<div\r\n");
      out.write("									class=\"d-inline-flex btn-sm-square bg-white text-primary rounded-circle ms-2\">\r\n");
      out.write("									<i class=\"fa fa-arrow-right\"></i>\r\n");
      out.write("								</div>\r\n");
      out.write("							</a>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- ////////////////////////////////////////////////////// page1 end ////////////////////////////////////////////////////////////////////  -->\r\n");
      out.write("\r\n");
      out.write("		<!-- page2 start -->\r\n");
      out.write("		<div class=\"carousel-item second\">\r\n");
      out.write("			<img class=\"w-100\" src=\"assets/images/join/carousel-bg.jpg\"\r\n");
      out.write("				alt=\"Image\">\r\n");
      out.write("			<div class=\"carousel-caption active\">\r\n");
      out.write("				<div class=\"container\">\r\n");
      out.write("					<div class=\"row justify-content-center\">\r\n");
      out.write("						<div class=\"col-lg-7 pt-5\">\r\n");
      out.write("							<h1 class=\"display-4 text-white mb-3 animated slideInDown\">총\r\n");
      out.write("								3단계로 구성되어 있어요!</h1>\r\n");
      out.write("							<p class=\"fs-5 text-white-50 mb-5 animated slideInDown\">회원가입에\r\n");
      out.write("								필요한 기본정보입력 해주세요.</p>\r\n");
      out.write("							<div>\r\n");
      out.write("\r\n");
      out.write("								<div class=\"row g-3\">\r\n");
      out.write("									<div class=\"col-12\">\r\n");
      out.write("										<div class=\"form-floating\">\r\n");
      out.write("											<input type=\"text\" class=\"form-control bg-light border-0\"\r\n");
      out.write("												id=\"mem_name\" placeholder=\"\" name=\"mem_name\" required\r\n");
      out.write("												value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> <label for=\"name\">이름</label>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"col-12\">\r\n");
      out.write("										<div class=\"form-floating\" id=\"divBirthday\">\r\n");
      out.write("											<input type=\"text\"\r\n");
      out.write("												class=\"input form-control bg-light border-0\"\r\n");
      out.write("												id=\"exampleInputDate\" placeholder=\"생년월일\" maxlength=\"10\"\r\n");
      out.write("												name=\"mem_birthdate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${birthyear}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('-');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${birthday}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("											<label for=\"text\">생년월일</label>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("									<div class=\"col-12\">\r\n");
      out.write("										<div class=\"form-floating\">\r\n");
      out.write("											<input type=\"text\" class=\"form-control bg-light border-0\"\r\n");
      out.write("												id=\"mem_addr\" placeholder=\"주소를 입력해 주세요\" name=\"mem_addr\"\r\n");
      out.write("												required> <label>주소</label>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("									<div class=\"col-12\">\r\n");
      out.write("										<div class=\"form-floating\">\r\n");
      out.write("											<input type=\"text\" class=\"form-control bg-light border-0\"\r\n");
      out.write("												id=\"mem_phone\" placeholder=\"핸드폰번호\" name=\"mem_phone\"\r\n");
      out.write("												value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mobile}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> <label for=\"text\">핸드폰번호</label>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("									<div class=\"col-12\">\r\n");
      out.write("										<div class=\"form-floating\">\r\n");
      out.write("											<input type=\"text\" class=\"form-control bg-light border-0\"\r\n");
      out.write("												id=\"mem_email\" placeholder=\"이메일\" name=\"mem_email\"\r\n");
      out.write("												value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> <label>이메일</label>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<a\r\n");
      out.write("								class=\"btn btn-primary py-2 px-3 animated slideInDown carousel-control-prev\"\r\n");
      out.write("								type=\"button\" data-bs-target=\"#header-carousel\"\r\n");
      out.write("								data-bs-slide=\"prev\">\r\n");
      out.write("								<div\r\n");
      out.write("									class=\"d-inline-flex btn-sm-square bg-white text-primary rounded-circle ms-2\">\r\n");
      out.write("									<i class=\"fa fa-arrow-left\"></i>\r\n");
      out.write("								</div> Prev Step\r\n");
      out.write("							</a> <a\r\n");
      out.write("								class=\"btn btn-primary py-2 px-3 animated slideInDown carousel-control-next\"\r\n");
      out.write("								type=\"button\" data-bs-target=\"#header-carousel\" id=\"2nd-next\"\r\n");
      out.write("								data-bs-slide=\"next\"> Next Step\r\n");
      out.write("								<div\r\n");
      out.write("									class=\"d-inline-flex btn-sm-square bg-white text-primary rounded-circle ms-2\">\r\n");
      out.write("									<i class=\"fa fa-arrow-right\"></i>\r\n");
      out.write("								</div>\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- page2 end -->\r\n");
      out.write("\r\n");
      out.write("		<!-- ///////////////////////////////3page start ////////////////////////////////////////////////////////////////////////////-->\r\n");
      out.write("		<div class=\"carousel-item third\">\r\n");
      out.write("			<img class=\"w-100\" src=\"assets/images/join/carousel-bg.jpg\"\r\n");
      out.write("				alt=\"Image\">\r\n");
      out.write("			<div class=\"carousel-caption\">\r\n");
      out.write("				<div class=\"container\">\r\n");
      out.write("					<div class=\"row justify-content-center\">\r\n");
      out.write("						<div class=\"col-lg-7 pt-5\">\r\n");
      out.write("							<h1 class=\"display-4 text-white mb-3 animated slideInDown\">마지막단계에요\r\n");
      out.write("								:)</h1>\r\n");
      out.write("							<p class=\"fs-5 text-white-50 mb-5 animated slideInDown\">내 정보를\r\n");
      out.write("								입력하시면 비교데이터를 볼 수 있어요!</p>\r\n");
      out.write("							<div>\r\n");
      out.write("								<div class=\"row g-3\">\r\n");
      out.write("									<div class=\"col-12\">\r\n");
      out.write("										<div class=\"form-floating\">\r\n");
      out.write("											<input type=\"text\" class=\"form-control bg-light border-0\"\r\n");
      out.write("												id=\"height\" name=\"height\" placeholder=\"Your Name\"> <label>키</label>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"col-12\">\r\n");
      out.write("										<div class=\"form-floating\">\r\n");
      out.write("											<input type=\"text\" class=\"form-control bg-light border-0\"\r\n");
      out.write("												id=\"weight\" placeholder=\"몸무게\" name=\"weight\"> <label>몸무게</label>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"col-12\">\r\n");
      out.write("										<div class=\"btn-group d-flex justify-content-around\">\r\n");
      out.write("											<input type=\"radio\" class=\"btn-check\" id=\"btnradio1\"\r\n");
      out.write("												value=\"M\" name=\"mem_gender\" checked> <label\r\n");
      out.write("												class=\"btn btn-outline-dark py-3\" for=\"btnradio1\">남성</label>\r\n");
      out.write("											<input type=\"radio\" class=\"btn-check\" id=\"btnradio2\"\r\n");
      out.write("												value=\"F\" name=\"mem_gender\"> <label\r\n");
      out.write("												class=\"btn btn-outline-dark py-3\" for=\"btnradio2\">여성</label>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<a\r\n");
      out.write("								class=\"btn btn-primary py-2 px-3 animated slideInDown carousel-control-prev\"\r\n");
      out.write("								type=\"button\" data-bs-target=\"#header-carousel\"\r\n");
      out.write("								data-bs-slide=\"prev\">\r\n");
      out.write("								<div\r\n");
      out.write("									class=\"d-inline-flex btn-sm-square bg-white text-primary rounded-circle ms-2\">\r\n");
      out.write("									<i class=\"fa fa-arrow-left\"></i>\r\n");
      out.write("								</div> Prev Step\r\n");
      out.write("							</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<button type=\"submit\" id=\"login-form-submit\"\r\n");
      out.write("								class=\"btn btn-primary py-2 px-3 animated slideInDown\" href=\"#\">\r\n");
      out.write("								가입완료\r\n");
      out.write("								<div\r\n");
      out.write("									class=\"d-inline-flex btn-sm-square bg-white text-primary rounded-circle ms-2\">\r\n");
      out.write("									<i class=\"fa fa-check\"></i>\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("							</button>\r\n");
      out.write("							</form>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- page3 end -->\r\n");
      out.write("	</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- Carousel End -->\r\n");
      out.write("	<!-- JavaScript Libraries -->\r\n");
      out.write("	<script src=\"assets/js/join/joinJs.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/join/bootstrap.bundle.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/join_success.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/check_login.js\"></script>\r\n");
      out.write("	<script src=\"assets/js/login_fail.js\"></script>\r\n");
      out.write("	\r\n");
      out.write("		    <!-- calendar JS START  -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("    <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- html 달력-->\r\n");
      out.write("	<script src=\"assets/js/join/datepick.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		$(function() {\r\n");
      out.write("			$(\"#exampleInputDate\").datepicker({\r\n");
      out.write("				dateFormat : \"yy-mm-dd\",\r\n");
      out.write("				regional : \"ko\", // 한글로 지역화\r\n");
      out.write("				yearRange : \"-100:+0\",\r\n");
      out.write("				changeYear : true\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
