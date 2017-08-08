package com.dbuyer.springboot.web.thymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dbuyer.ScanBean;

/**
 * 说明: 功能描述
 * 
 * @author 况小锋
 * @version 1.0
 */
@Controller
public class ThymeleafController {

	@RequestMapping("/thyme")
	public String index(Model model) {
		Person single = new Person("aa", 11);

		List<Person> people = new ArrayList<Person>();
		Person p1 = new Person("xx", 11);
		Person p2 = new Person("yy", 22);
		Person p3 = new Person("zz", 33);
		people.add(p1);
		people.add(p2);
		people.add(p3);

		model.addAttribute("singlePerson", single);
		model.addAttribute("people", people);

		return "index";
	}

	@Autowired
	ScanBean scanBean;

	@RequestMapping("/scan")
	public String scan(Model model) {

		Person single = new Person("aa", 11);

		List<Person> people = new ArrayList<Person>();
		Person p1 = new Person("xx", 11);
		Person p2 = new Person("yy", 22);
		Person p3 = new Person("zz", 33);
		people.add(p1);
		people.add(p2);
		people.add(p3);

		model.addAttribute("singlePerson", single);
		model.addAttribute("people", people);

		scanBean.doprint();
		return "index";
	}
}
