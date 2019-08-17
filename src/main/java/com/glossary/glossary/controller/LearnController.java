package com.glossary.glossary.controller;

import com.glossary.glossary.entity.Word;
import com.glossary.glossary.repo.WordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/learn")
public class LearnController {


private WordRepo wordRepo;

@Autowired
public LearnController(WordRepo wordRepo) {
        this.wordRepo = wordRepo;
    }
    @ModelAttribute(name = "word")
    public Word word() {
        return new Word();
    }


    @GetMapping
public String learnword(Model model){
    model.addAttribute("words",wordRepo.findAll());
    return "train";
}


}
