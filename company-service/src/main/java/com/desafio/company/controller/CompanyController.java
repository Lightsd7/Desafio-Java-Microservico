package com.desafio.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.company.VO.ResponseTemplateVO;
import com.desafio.company.entity.Company;
import com.desafio.company.service.CompanyService;

@RestController
@RequestMapping("/companies")
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@PostMapping("/")
	public Company saveCompany(@RequestBody Company company) {
		return companyService.saveCompany(company);
	}

	@GetMapping()
	public List<Company> findAll() {
		return companyService.findAll();
	}

	@GetMapping("/{cnpj}")
	public Company findCompanyByCnpj(@PathVariable Long cnpj) {
		return companyService.findCompanyByCnpj(cnpj);
	}

	@GetMapping("/cnpj/{cnpj}")
	public ResponseTemplateVO getCompanyWithUser(@PathVariable("cnpj") Long cnpj) {
		return companyService.getCompanyWithUser(cnpj);
	}
}
