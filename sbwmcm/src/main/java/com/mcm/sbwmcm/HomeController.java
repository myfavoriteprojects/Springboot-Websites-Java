package com.mcm.sbwmcm;


import java.util.Arrays;
import java.util.Collections;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;





//https://github.com/myfavoriteprojects


//Springboot-Websites-Java      https://github.com/myfavoriteprojects/Springboot-Websites-Java
//Flask-Websites-Python         https://github.com/myfavoriteprojects/Flask-Websites-Python
//Django-Websites-Python   	    https://github.com/myfavoriteprojects/Django-Websites-Python

//Android-Apps-Kotlin           https://github.com/myfavoriteprojects/Android-Apps-Kotlin
//Android-Apps-Java    	   	    https://github.com/myfavoriteprojects/Android-Apps-Java
//Jsoup-Java-Web-Scrapers       https://github.com/myfavoriteprojects/Jsoup-Java-Web-Scrapers

//Beautiful-Soup-Python-Web-Scrapers   https://github.com/myfavoriteprojects/Beautiful-Soup-Python-Web-Scrapers
//Scrapy-Python-Web-Scrapers   		   https://github.com/myfavoriteprojects/Scrapy-Python-Web-Scrapers
//Selenium-Python-Web-Scrapers         https://github.com/myfavoriteprojects/Selenium-Python-Web-Scrapers





import com.mcm.sbwmcm.model.Project;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "redirect:home";
	}

	@GetMapping("/home")
	public String home(Model model) {
		Project[] projects = new Project[9];

		projects[0] = new Project();
		projects[0].setName("Springboot Websites");
		projects[0].setSummary("Java");
		projects[0].setImgSrc("img/javaspringboot.png");
		projects[0].setUrl("https://github.com/myfavoriteprojects/Springboot-Websites-Java");

		projects[1] = new Project();
		projects[1].setName("Flask Websites");
		projects[1].setSummary("Python");
		projects[1].setImgSrc("img/pyflask.png");
		projects[1].setUrl("https://github.com/myfavoriteprojects/Flask-Websites-Python");

		projects[2] = new Project();
		projects[2].setName("Django Websites");
		projects[2].setSummary("Python");
		projects[2].setImgSrc("img/pydjango.png");
		projects[2].setUrl("https://github.com/myfavoriteprojects/Django-Websites-Python");

		projects[3] = new Project();
		projects[3].setName("Android Apps");
		projects[3].setSummary("Kotilin");
		projects[3].setImgSrc("img/kotlinandroid.png");
		projects[3].setUrl("https://github.com/myfavoriteprojects/Android-Apps-Kotlin");

		projects[4] = new Project();
		projects[4].setName("Android Apps");
		projects[4].setSummary("Java");
		projects[4].setImgSrc("img/javaandroid.png");
		projects[4].setUrl("https://github.com/myfavoriteprojects/Android-Apps-Java");

		projects[5] = new Project();
		projects[5].setName("Jsoup");
		projects[5].setSummary("Java Web Scrapers");
		projects[5].setImgSrc("img/javajsoup.png");
		projects[5].setUrl("https://github.com/myfavoriteprojects/Jsoup-Java-Web-Scrapers");

		projects[6] = new Project();
		projects[6].setName("Beautiful Soup");
		projects[6].setSummary("Python Web Scrapers");
		projects[6].setImgSrc("img/pybeautifulsoup.png");
		projects[6].setUrl("https://github.com/myfavoriteprojects/Beautiful-Soup-Python-Web-Scrapers");

		projects[7] = new Project();
		projects[7].setName("Scrapy");
		projects[7].setSummary("Python Web Scrapers");
		projects[7].setImgSrc("img/pyscrapy.png");
		projects[7].setUrl("https://github.com/myfavoriteprojects/Scrapy-Python-Web-Scrapers");

		projects[8] = new Project();
		projects[8].setName("Selenium");
		projects[8].setSummary("Python Web Scrapers");
		projects[8].setImgSrc("img/pyselenium.png");
		projects[8].setUrl("https://github.com/myfavoriteprojects/Selenium-Python-Web-Scrapers");


		model.addAttribute("projects", projects);
		return "home";
	}

	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
}