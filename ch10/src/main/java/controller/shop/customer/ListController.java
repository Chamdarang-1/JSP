package controller.shop.customer;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import dto.shop.CustomerDTO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.shop.CustomerService;

@WebServlet("/shop/customer/list.do")
public class ListController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private CustomerService service = CustomerService.INSTANCE;
	
	// 로거 생성
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		/*
		 개발 환경에서는 system 출력으로 개발과정을 테스트할 수 있지만
		 배포 환경에서는 system 출력이 자원을 낭비하는 것이기 때문에, system 출력보다는 logger을 이용한 출력이 권장된다.
		 
		 개발 단계에서는 debug 레벨로 로그 작업
		 배포단계에서는 warn 레벨 이상으로 로그 작업
		 */
		logger.debug("debug here...1");
		logger.info("info here...1");
		logger.warn("warn here...1");
		logger.error("error here...1");
		
		List<CustomerDTO> dtoList = service.findAll();
		
		logger.debug("here...2 : " + dtoList);
		logger.info("here...2 : " + dtoList);
		logger.warn("here...2 : " + dtoList);
		logger.error("here...2: " + dtoList);
		
		req.setAttribute("dtoList", dtoList);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/shop/customer/list.jsp");
		dispatcher.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
	}
	
	
}
