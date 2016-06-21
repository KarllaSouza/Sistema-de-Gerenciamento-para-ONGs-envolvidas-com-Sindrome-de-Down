package servers;

import java.io.IOException;
import java.io.InputStream;
/*import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;*/
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import util.Conexao;

@WebServlet("/iReport")
public class ReportServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private Scanner in;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {       
	        JasperReport report = null;
		InputStream reportStream = null;
		try { 
		    	int relatorio
	     		in = new Scanner (System.in);
	    		System.out.println("- - - Gerando relatórios - - -");
	    		System.out.println("1 - Atividades \n2- Colaborador \n3- Despesas \n4- Doacao \n5- Funcionario \n6- Endereço dos Funcionários \n7- Patrimônio");
	    		relatorio = in.nextInt();
	    	
			if(relatorio==1){
	    			reportStream = getServletConfig().getServletContext().getResourceAsStream("/iReport/atividades.jrxml");
	    			report = JasperCompileManager.compileReport(reportStream);
		 	} else if(relatorio==2){
	    			reportStream = getServletConfig().getServletContext().getResourceAsStream("/iReport/colaborador.jrxml");
	    			report = JasperCompileManager.compileReport(reportStream);
	    		} else if(relatorio==3){
	    			reportStream = getServletConfig().getServletContext().getResourceAsStream("/iReport/despesas.jrxml");
	    			report = JasperCompileManager.compileReport(reportStream);
	    		} else if(relatorio==4){
	    			reportStream = getServletConfig().getServletContext().getResourceAsStream("/iReport/doacao.jrxml");
	    			report = JasperCompileManager.compileReport(reportStream);
	    		} else if(relatorio==5){
	    			reportStream = getServletConfig().getServletContext().getResourceAsStream("/iReport/funcionario.jrxml");
	    			report = JasperCompileManager.compileReport(reportStream);
		  	} else if(relatorio==6){
	    			reportStream = getServletConfig().getServletContext().getResourceAsStream("/iReport/enderecos_funcionarios.jrxml");
	    			report = JasperCompileManager.compileReport(reportStream);
	    		} else if(relatorio==7){
	    			reportStream = getServletConfig().getServletContext().getResourceAsStream("/iReport/patrimonio.jrxml");
	    			report = JasperCompileManager.compileReport(reportStream);
	    		} else{
				System.out.println("Opção inválida!");
			}
		} catch (JRException e) {
                    System.out.println("erro ao criar o relatório");
                    e.printStackTrace();
		}
		JasperPrint print = null;
	        try {
                	print = JasperFillManager.fillReport(report, null, new Conexao().getConnection());                                                
            	} catch (JRException e) {
                	System.out.println("erro ao preencher o relatório");
			e.printStackTrace();
        	}
		byte[] bytes = null;
		try {
                	bytes = JasperExportManager.exportReportToPdf(print);                      
            	} catch (JRException e) {
                	System.out.println("erro ao exportar o relatório");
                	e.printStackTrace();
		}
		response.setContentType("application/pdf");     
		response.setContentLength(bytes.length);     
		ServletOutputStream ouputStream = response.getOutputStream();     
		ouputStream.write(bytes, 0, bytes.length);     
		ouputStream.flush();     
		ouputStream.close();                  		
	}

    @Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
