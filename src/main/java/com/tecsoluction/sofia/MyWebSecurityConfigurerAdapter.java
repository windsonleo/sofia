package com.tecsoluction.sofia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;




@Configuration
@EnableWebSecurity
@ComponentScan("com.tecsoluction.sofia")
@Import({DataSourceConf.class})
public class MyWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
	
	@Value("${spring.queries.users-query}")
	private String usersQuery;
	
	@Value("${spring.queries.roles-query}")
	private String rolesQuery;	
	
	@Autowired
	private DataSourceConf dataSource;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.
			jdbcAuthentication()
				.usersByUsernameQuery(usersQuery)
				.authoritiesByUsernameQuery(rolesQuery)
				.dataSource(dataSource.dataSource());
//				.passwordEncoder(bCryptPasswordEncoder);
				
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
				
		http.
			authorizeRequests()				
				.antMatchers("/public/**").permitAll()
				.antMatchers("/resources/**").permitAll()
				.antMatchers("/static/**").permitAll()
				.antMatchers("/templates/**").permitAll()
				.antMatchers("/web/**").permitAll()
				.antMatchers("/build/**").permitAll()
				.antMatchers("/sorteio/**").permitAll()
				.antMatchers("/cardapio/**").permitAll()
				.antMatchers("/vendors/**").permitAll()
				.antMatchers("/img/**").permitAll()
				.antMatchers("/image/**").permitAll()
				.antMatchers("/images/**").permitAll()
				.antMatchers("/tabela").permitAll()
				.antMatchers("/inicial").permitAll()
				.antMatchers("*/images/**").permitAll()
				.antMatchers("/tab/**").permitAll()
				.antMatchers("/globe/**").permitAll()
				.antMatchers("/css/**").permitAll()
				.antMatchers("/js/**").permitAll()
				.antMatchers("/login").permitAll()
				.antMatchers("/error/**").permitAll()
				.antMatchers("/fonts/**").permitAll()
				.antMatchers("/bootstrap/**").permitAll()
				.antMatchers("/usuario/listar/").permitAll()
				.antMatchers("/evento/listar/").permitAll()
				.antMatchers("/paciente/listar/").permitAll()
				.antMatchers("/atividade/listar/").permitAll()
				.antMatchers("/build/**").permitAll()
				.antMatchers("/data/**").permitAll()
				.antMatchers("/webjars/**").permitAll()
				.antMatchers("/").permitAll()
				.antMatchers("*/sass/**").permitAll();
//				.antMatchers("/private/**").hasAnyRole("CLIENTE","ADM").anyRequest().authenticated()
//				.and()
//				.csrf().disable().formLogin()
//				.loginPage("/login").failureUrl("/error")
//				.defaultSuccessUrl("/home")
//				.usernameParameter("email")
//				.passwordParameter("senha")
//				.and().logout()
//				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//				.logoutSuccessUrl("/").and().exceptionHandling()
//				.accessDeniedPage("/accessdenied");
				
//		http.sessionManagement().maximumSessions(sessaoMax).and().invalidSessionUrl("/sessaoinvalida").and()
//		.sessionManagement().sessionFixation().migrateSession();
		
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
	    web
	       .ignoring()
	       .antMatchers("/resources/**");
       web
	       .ignoring()
	       .antMatchers("/static/**");
       
       web
       .ignoring()
       .antMatchers("/css/**");
       
       web
       .ignoring()
       .antMatchers("/js/**");
       
       web
       .ignoring()
       .antMatchers("/img/**");
       
       web
       .ignoring()
       .antMatchers("/web/**");
       
       web
       .ignoring()
       .antMatchers("/build/**");
       
       web
       .ignoring()
       .antMatchers("/vendors/**");
       
       web
       .ignoring()
       .antMatchers("/public/**");
       
       web
       .ignoring()
       .antMatchers("/templates/**");
       
       web
       .ignoring()
       .antMatchers("/webjars/**");
       
       web
       .ignoring()
       .antMatchers("*/sass/**");
       
       web
       .ignoring()
       .antMatchers("*/fonts/**");
       
       web
       .ignoring()
       .antMatchers("*/error/**");
       
       web
       .ignoring()
       .antMatchers("*/image/**");
       
       web
       .ignoring()
       .antMatchers("*/globe/**");
       
       web
       .ignoring()
       .antMatchers("*/tab/**");
       web
       .ignoring()
       .antMatchers("*/images/**");
       
       web
       .ignoring()
       .antMatchers("*/tabela/**");

       web
       .ignoring()
       .antMatchers("*/data/**");
	
    web
    .ignoring()
    .antMatchers("*/inicial/**");

	}
	

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("user").password("password").roles("CLIENTE")
                .and()
                .withUser("admin").password("password").roles("ADM");
    }
	
	
	

}
