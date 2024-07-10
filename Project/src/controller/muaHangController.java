package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.GioHangbean;
import bean.KhachHangbean;
import bo.ChiTietHoaDonbo;
import bo.HoaDonbo;

/**
 * Servlet implementation class muaHangController
 */
@WebServlet("/muaHangController")
public class muaHangController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public muaHangController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			HttpSession session = request.getSession();
			String btnXacNhan = request.getParameter("btnXacNhan");
			if (btnXacNhan != null) {
				KhachHangbean kh = (KhachHangbean) session.getAttribute("khachHang");
				if (kh == null) {
					response.sendRedirect("dangNhapController");
				} else {
					HoaDonbo hdbo = new HoaDonbo();
					Date a = new Date();
					SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
					String ns = f.format(a);
					Date ngayMua = f.parse(ns);
					hdbo.addHoaDon(kh.getMaKhachHang(), ngayMua, false);
					long maHD = hdbo.getMaHoaDon();
					ArrayList<GioHangbean> dsGioHang = (ArrayList<GioHangbean>) session.getAttribute("dsGioHang");
					ChiTietHoaDonbo cthdbo = new ChiTietHoaDonbo();
					for (GioHangbean gio : dsGioHang) {
						cthdbo.addChiTietHoaDon(maHD, gio.getMaGiay(), Integer.parseInt(gio.getSoLuong() + ""), false,
								gio.getSize());
					}
					session.removeAttribute("dsGioHang");
					response.sendRedirect("lichSuController");
				}
			}
			response.sendRedirect("lichSuController");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
