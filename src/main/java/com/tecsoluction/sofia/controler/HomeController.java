package com.tecsoluction.sofia.controler;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class HomeController {
	
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
//	@Autowired
//	private  UsuarioServicoImpl usuarioService;
//	
//	@Autowired
//	private ProdutoServicoImpl produtoservice;
//	
//	@Autowired
//	private PremioServicoImpl premioservice;
//	
//	@Autowired
//	private ClienteServicoImpl clienteservice;
//	
//	
//	
//	
//	private List<Produto> produtos;
//	
//	private List<Premio> premios;
//	
//	private List<Cliente> clientes;
//	
//	private List<Usuario> usuarios;
	
	
	


	
	  @ModelAttribute
	    public void addAttributes(Model model) {
		  
		  Date data = new Date();
	    	Calendar cal = Calendar.getInstance();
	    	cal.setTime(data);
	    	
	    	int day = cal.get(Calendar.DAY_OF_MONTH);
	    	int month = cal.get(Calendar.MONTH);
	    	int year = cal.get(Calendar.YEAR);

	    	int hora = cal.get(Calendar.HOUR_OF_DAY);
	    	int minuto = cal.get(Calendar.MINUTE);
	    	int segundo = cal.get(Calendar.SECOND);
	    	
	    	int horafull = cal.get(Calendar.HOUR);
	    	
	    	
			
			System.out.println("Day: "+ day);
			System.out.println("Month: "+ month);
			System.out.println("Year: "+ year);
			
			
			Date d = new Date();
			Calendar c = new GregorianCalendar();
			c.setTime(d);
			String dianome = "";
			String mesnome = "";
			int dia = c.get(c.DAY_OF_WEEK);
			int mes =c.get(c.MONTH);
			
			
			switch(dia){
			  case Calendar.SUNDAY: dianome = "Domingo";break;
			  case Calendar.MONDAY: dianome = "Segunda";break;
			  case Calendar.TUESDAY: dianome = "Terça";break;
			  case Calendar.WEDNESDAY: dianome = "Quarta";break;
			  case Calendar.THURSDAY: dianome = "Quinta";break;
			  case Calendar.FRIDAY: dianome = "Sexta";break;
			  case Calendar.SATURDAY: dianome = "Sábado";break;
			}
			
			switch(mes){
			  case Calendar.JANUARY: mesnome = "Janeiro";break;
			  case Calendar.FEBRUARY: mesnome = "Fevereiro";break;
			  case Calendar.MARCH: mesnome = "Março";break;
			  case Calendar.APRIL: mesnome = "Abril";break;
			  case Calendar.MAY: mesnome = "Maio";break;
			  case Calendar.JUNE: mesnome = "Junho";break;
			  case Calendar.JULY: mesnome = "Julho";break;
			  
			  case Calendar.AUGUST: mesnome = "Agosto";break;
			  case Calendar.SEPTEMBER: mesnome = "Setembro";break;
			  case Calendar.OCTOBER: mesnome = "Outubro";break;
			  case Calendar.NOVEMBER: mesnome = "Novembro";break;
			  case Calendar.DECEMBER: mesnome = "Dezembro";break;
			}
		  
//	        login.addObject("dia", dia);
//	        login.addObject("mes", month);
//	        login.addObject("ano", year);
//	        login.addObject("dianome", dianome);
//	        login.addObject("mesnome", mesnome);
//	        login.addObject("hora", hora);
//	        login.addObject("minuto", minuto);
//	        login.addObject("segundo", segundo);
//	        login.addObject("horafull", horafull);
//	        login.addObject("day", day);
		 		  
		  
//		  produtos = produtoservice.findAll();
//		  
//		  premios = premioservice.findAll();
//		  
//		  clientes = clienteservice.findAll();
//		  
//		  usuarios = usuarioService.findAll();
//
//	             
//	        
//	        
//	        
	        model.addAttribute("dia", dia);
	        model.addAttribute("mes", month);
	        model.addAttribute("ano", year);
	        model.addAttribute("dianome", dianome);
	        
	        model.addAttribute("mesnome", mesnome);
	        model.addAttribute("hora", hora);
	        model.addAttribute("minuto", minuto);
	        model.addAttribute("segundo", segundo);
	        
	        
	        model.addAttribute("horafull", horafull);
	        model.addAttribute("day", day);

	    }
	
	
	
   



	@RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView Home(Locale locale, Model model) {
       
    	
    	
    	logger.info("Welcome Home /home! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/private/home");
        
       
         
//         home.addObject("statustratamento", statustratamento);



        return home;
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView Homem(Locale locale, Model model) {
       
    	logger.info("Welcome iniciall /! The client locale is {}.", locale);
    	

		
		

        ModelAndView home = new ModelAndView("/public/login");


        return new ModelAndView("redirect:/inicial");
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView Loginn(Locale locale, Model model) {
      
    	logger.info("Welcome loginn! The client locale is {}.", locale);

    	Date data = new Date();
    	Calendar cal = Calendar.getInstance();
    	cal.setTime(data);
    	
    	int day = cal.get(Calendar.DAY_OF_MONTH);
    	int month = cal.get(Calendar.MONTH);
    	int year = cal.get(Calendar.YEAR);

    	int hora = cal.get(Calendar.HOUR_OF_DAY);
    	int minuto = cal.get(Calendar.MINUTE);
    	int segundo = cal.get(Calendar.SECOND);
    	
    	int horafull = cal.get(Calendar.HOUR);
    	
    	
		
		System.out.println("Day: "+ day);
		System.out.println("Month: "+ month);
		System.out.println("Year: "+ year);
		
		
		Date d = new Date();
		Calendar c = new GregorianCalendar();
		c.setTime(d);
		String dianome = "";
		String mesnome = "";
		int dia = c.get(c.DAY_OF_WEEK);
		int mes =c.get(c.MONTH);
		
		
		switch(dia){
		  case Calendar.SUNDAY: dianome = "Domingo";break;
		  case Calendar.MONDAY: dianome = "Segunda";break;
		  case Calendar.TUESDAY: dianome = "Terça";break;
		  case Calendar.WEDNESDAY: dianome = "Quarta";break;
		  case Calendar.THURSDAY: dianome = "Quinta";break;
		  case Calendar.FRIDAY: dianome = "Sexta";break;
		  case Calendar.SATURDAY: dianome = "Sábado";break;
		}
		
		switch(mes){
		  case Calendar.JANUARY: mesnome = "Janeiro";break;
		  case Calendar.FEBRUARY: mesnome = "Fevereiro";break;
		  case Calendar.MARCH: mesnome = "Março";break;
		  case Calendar.APRIL: mesnome = "Abril";break;
		  case Calendar.MAY: mesnome = "Maio";break;
		  case Calendar.JUNE: mesnome = "Junho";break;
		  case Calendar.JULY: mesnome = "Julho";break;
		  
		  case Calendar.AUGUST: mesnome = "Agosto";break;
		  case Calendar.SEPTEMBER: mesnome = "Setembro";break;
		  case Calendar.OCTOBER: mesnome = "Outubro";break;
		  case Calendar.NOVEMBER: mesnome = "Novembro";break;
		  case Calendar.DECEMBER: mesnome = "Dezembro";break;
		}

        ModelAndView login = new ModelAndView("/public/login");
        
        login.addObject("dia", dia);
        login.addObject("mes", month);
        login.addObject("ano", year);
        login.addObject("dianome", dianome);
        login.addObject("mesnome", mesnome);
        login.addObject("hora", hora);
        login.addObject("minuto", minuto);
        login.addObject("segundo", segundo);
        login.addObject("horafull", horafull);
        login.addObject("day", day);
        
        return new ModelAndView("redirect:/inicial");
    }
    
    @RequestMapping(value = "/inicial", method = RequestMethod.GET)
    public ModelAndView Login(Locale locale, Model model) {
      
    	logger.info("Welcome inicial! The client locale is {}.", locale);

    	Date data = new Date();
    	Calendar cal = Calendar.getInstance();
    	cal.setTime(data);
    	
    	int day = cal.get(Calendar.DAY_OF_MONTH);
    	int month = cal.get(Calendar.MONTH);
    	int year = cal.get(Calendar.YEAR);

    	int hora = cal.get(Calendar.HOUR_OF_DAY);
    	int minuto = cal.get(Calendar.MINUTE);
    	int segundo = cal.get(Calendar.SECOND);
    	
    	int horafull = cal.get(Calendar.HOUR);
    	
    	
		
		System.out.println("Day: "+ day);
		System.out.println("Month: "+ month);
		System.out.println("Year: "+ year);
		
		
		Date d = new Date();
		Calendar c = new GregorianCalendar();
		c.setTime(d);
		String dianome = "";
		String mesnome = "";
		int dia = c.get(c.DAY_OF_WEEK);
		int mes =c.get(c.MONTH);
		
		
		switch(dia){
		  case Calendar.SUNDAY: dianome = "Domingo";break;
		  case Calendar.MONDAY: dianome = "Segunda";break;
		  case Calendar.TUESDAY: dianome = "Terça";break;
		  case Calendar.WEDNESDAY: dianome = "Quarta";break;
		  case Calendar.THURSDAY: dianome = "Quinta";break;
		  case Calendar.FRIDAY: dianome = "Sexta";break;
		  case Calendar.SATURDAY: dianome = "Sábado";break;
		}
		
		switch(mes){
		  case Calendar.JANUARY: mesnome = "Janeiro";break;
		  case Calendar.FEBRUARY: mesnome = "Fevereiro";break;
		  case Calendar.MARCH: mesnome = "Março";break;
		  case Calendar.APRIL: mesnome = "Abril";break;
		  case Calendar.MAY: mesnome = "Maio";break;
		  case Calendar.JUNE: mesnome = "Junho";break;
		  case Calendar.JULY: mesnome = "Julho";break;
		  
		  case Calendar.AUGUST: mesnome = "Agosto";break;
		  case Calendar.SEPTEMBER: mesnome = "Setembro";break;
		  case Calendar.OCTOBER: mesnome = "Outubro";break;
		  case Calendar.NOVEMBER: mesnome = "Novembro";break;
		  case Calendar.DECEMBER: mesnome = "Dezembro";break;
		}

        ModelAndView login = new ModelAndView("/public/login");
        
        login.addObject("dia", dia);
        login.addObject("mes", month);
        login.addObject("ano", year);
        login.addObject("dianome", dianome);
        login.addObject("mesnome", mesnome);
        login.addObject("hora", hora);
        login.addObject("minuto", minuto);
        login.addObject("segundo", segundo);
        login.addObject("horafull", horafull);
        login.addObject("day", day);
        
        return login;
    }
    
    @RequestMapping(value = "/tabela", method = RequestMethod.GET)
    public ModelAndView cardapio(Locale locale, Model model) {
      
    	logger.info("Welcome tabela! The client locale is {}.", locale);


        ModelAndView login = new ModelAndView("/public/tabela");
        
        
        
        
        
        
        
//        login.addObject("usuario", new Usuario());


        return login;
    }
    
//    @RequestMapping(value = "/sorteio", method = RequestMethod.GET)
//    public ModelAndView Sorteio(Locale locale, Model model) {
//      
//    	logger.info("Welcome Sorteio! The client locale is {}.", locale);
//
//
//        ModelAndView login = new ModelAndView("/private/sorteio");
//        
////        login.addObject("usuario", new Usuario());
//
//
//        return login;
//    }
    
    
    @RequestMapping(value = "/erro", method = RequestMethod.GET)
    public ModelAndView Error(Locale locale, Model model) {
       
    	logger.info("Welcome Error ! The client locale is {}.", locale);
    	
    	

        ModelAndView home = new ModelAndView("/public/error/erro");
        
//        Usuario usuario = new Usuario();
//        usuario.setEmail(SecurityContextHolder.getContext().getAuthentication().getName());
//        usuario = usuarioService.findByEmail(usuario.getEmail());
//        
//        
//        
//        home.addObject(attributeName, attributeValue);


        return home;
    }
    
    
    
    @RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
    public ModelAndView accessdenied(Locale locale, Model model) {
       
    	logger.info("Welcome accessdenied ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/accessdenied");


        return home;
    }
    
    
    @RequestMapping(value = "/esquecisenha", method = RequestMethod.GET)
    public ModelAndView Cadastros(Locale locale, Model model) {
       
    	logger.info("Welcome cadastros ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/esquecisenha");


        return home;
    }
    
    @RequestMapping(value = "/registro", method = RequestMethod.GET)
    public ModelAndView Registro(Locale locale, Model model) {
       
    	logger.info("Welcome registro ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/registro");


        return home;
    }
    
    @RequestMapping(value = "/encontros", method = RequestMethod.GET)
    public ModelAndView Encontros(Locale locale, Model model) {
       
    	logger.info("Welcome encontros ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/encontros");


        return home;
    }
    
    @RequestMapping(value = "/movimentacoes", method = RequestMethod.GET)
    public ModelAndView Movimentacoes(Locale locale, Model model) {
       
    	logger.info("Welcome movimentacoes ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/private/movimentacoes");


        return home;
    }
    
    @RequestMapping(value = "/financeiro", method = RequestMethod.GET)
    public ModelAndView ffinanceiro(Locale locale, Model model) {
       
    	logger.info("Welcome financeiro ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/private/financeiro");


        return home;
    }
    
    
//    @RequestMapping(value = "/checkout", method = RequestMethod.GET)
//    public ModelAndView Checkout(Locale locale, Model model) {
//       
//    	logger.info("Welcome Checkout ! The client locale is {}.", locale);
//
//        ModelAndView home = new ModelAndView("/public/checkout");
//
//
//        return home;
//    }
    
    @RequestMapping(value = "/ajuda", method = RequestMethod.GET)
    public ModelAndView Ajuda(Locale locale, Model model) {
       
    	logger.info("Welcome ajuda ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/ajuda");


        return home;
    }
    
    @RequestMapping(value = "/contato", method = RequestMethod.GET)
    public ModelAndView Contato(Locale locale, Model model) {
       
    	logger.info("Welcome Contato ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/contato");


        return home;
    }
    
    
    @RequestMapping(value = "/entregas", method = RequestMethod.GET)
    public ModelAndView Entrega(Locale locale, Model model) {
       
    	logger.info("Welcome Entrega ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/entrega");


        return home;
    }
    
     
    
    @RequestMapping(value = "/catalogo", method = RequestMethod.GET)
    public ModelAndView Catalogo(Locale locale, Model model) {
       
    	logger.info("Welcome catalogo ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/catalogo");


        return home;
    }
    
    
    @RequestMapping(value = "/novos", method = RequestMethod.GET)
    public ModelAndView novos(Locale locale, Model model) {
       
    	logger.info("Welcome novos! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/novos");


        return home;
    }
     
    @RequestMapping(value = "/aempresa", method = RequestMethod.GET)
    public ModelAndView AeMPRESA(Locale locale, Model model) {
       
    	logger.info("Welcome ampresa ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/empresa");


        return home;
    }
     
    @RequestMapping(value = "/indicacao", method = RequestMethod.GET)
    public ModelAndView Indicacao(Locale locale, Model model) {
       
    	logger.info("Welcome indicacao ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/indicacao");


        return home;
    }
     
    @RequestMapping(value = "/ofertas", method = RequestMethod.GET)
    public ModelAndView Ofertas(Locale locale, Model model) {
       
    	logger.info("Welcome ofertas ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/ofertas");


        return home;
    }
    
    @RequestMapping(value = "/rotas", method = RequestMethod.GET)
    public ModelAndView Rotas(Locale locale, Model model) {
       
    	logger.info("Welcome ofertas ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/private/rotas/rotas");


        return home;
    }
    
//    @RequestMapping(value = "/enviaremail", method = RequestMethod.POST)
//    public ModelAndView enviaremail(Locale locale, Model model) {
//       
//    	logger.info("Welcome enviaremail ! The client locale is {}.", locale);
//    	
//        ModelAndView home = new ModelAndView("/public/home");
//
//    	senderMailService = new SenderMailService();
//    	
//    	senderMailService.enviar();
//    	
//
//        return home;
//    }
   
//    @RequestMapping(value = "/enviaremail", method = RequestMethod.GET)
//    public ModelAndView enviaremail(Locale locale, Model model, HttpServletRequest request) {
//       
//    	
//    	logger.info("Welcome enviaremail ! The client locale is {}.", locale);
//    	
//    	String sucesso = "Email enviado com sucesso!";
//    	
//    	String erro = "Erro ao enviar email.";
//    	
//    	UUID idf = UUID.fromString("2700325f-cc1b-428b-b617-0a3a5f57a246");
//    	
////    	Empresa empresa = empresaServico.findOne(idf);
//    
//    	
//    	String email = request.getParameter("email");
//    	
//
//        ModelAndView home = new ModelAndView("/public/home");
//       
//
//        SimpleMailMessage message = new SimpleMailMessage();
//
//        message.setText("Olá Voce Recebeu este Email da Tecshop");
//        message.setTo(email);
////        message.setFrom(empresa.getEmail());
//
//        try {
//            mailSender.send(message);
//            home.addObject("sucesso", sucesso);
//            return home;
//        } catch (Exception e) {
//            e.printStackTrace();
//            home.addObject("erro", erro + e);
//            return home;
//        }
//        
//    }  

}
