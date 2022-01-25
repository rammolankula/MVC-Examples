package mvcFormSample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvcFormSample.model.Datamodel;

@Controller
public class datashowcontroller{
	/* here we need to give register page for showing and taking the data by using one method
	 * for reading the above one method im using second method "/data" $ dollar symbol data
	 * ${data}----->model.addAttribute("data",datamodel);
	 *   it will read the "reg2" page
	 * */
	@RequestMapping(value="/regpage")
	public String dataView() {
		return "reg1";
	}
	@RequestMapping(value="/data", method=RequestMethod.POST)
	public String dataview2(Datamodel datamodel,Model model) {
		model.addAttribute("data",datamodel);
		return "reg2";
	}
}