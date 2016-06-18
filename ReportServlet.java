package servers;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import util.Conexao;

@WebServlet("/iReport")
public class ReportServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {       
	    
        //cria relatorio
        JasperReport report = null;
		InputStream reportStream = null;
	    try { 
	    	reportStream = getServletConfig().getServletContext().getResourceAsStream("/iReport/colaboradores.jrxml");
	    	report = JasperCompileManager.compileReport(reportStream);
		} catch (JRException e) {
                    System.out.println("erro ao criar o relatório");
                    e.printStackTrace();
		}
            
        // preenche os dados do relatorio
		JasperPrint print = null;
            try {
                print = JasperFillManager.fillReport(report, null, new Conexao().getConnection());                                                
            } catch (JRException e) {
                System.out.println("erro ao preencher o relatório");
		e.printStackTrace();
		}

        //exportação do relatório
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
	public void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
		this.doGet(request, response);
	}
}