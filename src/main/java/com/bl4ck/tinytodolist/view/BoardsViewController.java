package com.bl4ck.tinytodolist.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bl4ck.tinytodolist.persistence.service.BoardService;


@Controller
public class BoardsViewController {

	@Autowired
	BoardService boardService;

	@GetMapping("/boards")
	public String greeting(Model model) {

		model.addAttribute("boards", boardService.getAll());
		return "boards";
	}

}
