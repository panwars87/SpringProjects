package com.ys.spring.helloMVC;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ys.spring.helloMVC.dto.Address;
import com.ys.spring.helloMVC.dto.JSONResponse;
import com.ys.spring.helloMVC.dto.PersonDTO;

@Controller(value="helloMVCController")
@SessionAttributes({"personDTO"})
public class HelloMVC {

	@Autowired
    private MessageSource messageSource;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
	
	@RequestMapping(value="/viewAjax", method=RequestMethod.GET)
	public ModelAndView getPerson() {
		Map<String,Object> model = new HashMap<String,Object>();
		String message = "Hello World, Spring 4.0!";
		model.put("message", message);
		model.put("personDTO", new PersonDTO());
		return new ModelAndView("main", model);
	}
	
	@RequestMapping(value="/view", method=RequestMethod.POST)
	public @ResponseBody JSONResponse savePerson(@Valid @ModelAttribute(value="personDTO") PersonDTO personDTO, BindingResult bindingResult) {
		JSONResponse res = new JSONResponse();
		//System.out.println("Inside resource method....");
		//System.out.println("Binding Result is : "+bindingResult.toString());
		//System.out.println("Person DTO is : "+ personDTO.toString());
		Map<String ,String> errorsMap=new HashMap<String, String>();
		
		if(bindingResult.hasErrors()){
			//String statusMessageKey = "Exception while saving Person";
			System.out.println("Field erros are : "+ bindingResult.getFieldErrors());
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();
			for (FieldError fieldError : fieldErrors) {
				System.out.println("particular field error is : "+ fieldError);
				System.out.println("Error code is : "+ fieldError.getCode());
				String[] resolveMessageCodes = bindingResult.resolveMessageCodes(fieldError.getCode());
				String string = resolveMessageCodes[0];
				System.out.println("resolveMessageCodes : "+string);
				String message = messageSource.getMessage(string+"."+fieldError.getField(), new Object[]{fieldError.getRejectedValue()}, null);
				System.out.println("Meassage : "+message);
				errorsMap.put(fieldError.getField(), message);
			}
			res.setStatus("ERROR");
			res.setResult(bindingResult.getAllErrors());
			res.setErrorMap(errorsMap);
			res.setPersonDTO(personDTO);
		}else{
			res.setStatus("SUCCESS");
			res.setResult(personDTO.getFirstName());
		}
		System.out.println("Resposne is : "+res);
		return res;
	}
	
	@RequestMapping(value="/page2", method=RequestMethod.POST)
	public @ResponseBody JSONResponse saveAddress(@Valid @ModelAttribute(value="personDTO") PersonDTO personDTO, BindingResult bindingResult) {
		JSONResponse res = new JSONResponse();
		//System.out.println("Inside resource method....");
		//System.out.println("Binding Result is : "+bindingResult.toString());
		//System.out.println("Person DTO is : "+ personDTO.toString());
		Map<String ,String> errorsMap=new HashMap<String, String>();
		Address add = personDTO.getAddress();
		System.out.println("Person DTO is : "+ personDTO);
		System.out.println("Address is : "+ add.toString());
		
		if(bindingResult.hasErrors()){
			//String statusMessageKey = "Exception while saving Person";
			System.out.println("Field erros are : "+ bindingResult.getFieldErrors());
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();
			for (FieldError fieldError : fieldErrors) {
				System.out.println("particular field error is : "+ fieldError);
				System.out.println("Error code is : "+ fieldError.getCode());
				String[] resolveMessageCodes = bindingResult.resolveMessageCodes(fieldError.getCode());
				String string = resolveMessageCodes[0];
				System.out.println("resolveMessageCodes : "+string);
				String message = messageSource.getMessage(string+"."+fieldError.getField(), new Object[]{fieldError.getRejectedValue()}, null);
				System.out.println("Meassage : "+message);
				errorsMap.put(fieldError.getField(), message);
			}
			res.setStatus("ERROR");
			res.setResult(bindingResult.getAllErrors());
			res.setErrorMap(errorsMap);
			res.setPersonDTO(personDTO);
		}else{
			res.setStatus("SUCCESS");
			res.setResult(personDTO);
			res.setPersonDTO(personDTO);
		}
		System.out.println("Resposne is : "+res);
		return res;
	}
	
	/*@RequestMapping(value="/view", method=RequestMethod.POST)
	public ModelAndView savePerson(@Valid @ModelAttribute(value="personDTO") PersonDTO personDTO, BindingResult bindingResult) {
		Map<String,Object> model = new HashMap<String,Object>();
		System.out.println("Binding Result is : "+bindingResult.toString());
		if(bindingResult.hasErrors()){
			String statusMessageKey = "Exception while saving Person";
			model.put("statusMessageKey", statusMessageKey);
			return new ModelAndView("view", model);
		}else{
			String statusMessageKey = "Person Saved successfully! "+personDTO.getFirstName();
			model.put("statusMessageKey", statusMessageKey);
		}
		return new ModelAndView("home", model);
	}*/
}