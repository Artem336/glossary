package com.glossary.glossary.controller;


import com.glossary.glossary.entity.Word;
import com.glossary.glossary.repo.WordRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
@Slf4j
@Controller
@RequestMapping("/")
public class HomeController {

    private WordRepo wordRepo;


    @Autowired
    public HomeController(WordRepo wordRepo) {
        this.wordRepo = wordRepo;
    }



    @ModelAttribute(name = "word")
    public Word word() {
        return new Word();
    }

    @GetMapping
    public String getHome(Model model){
        model.addAttribute("wordlist",wordRepo.findAllByOrderByIdDesc());
        return "homeWord";
    }

    @PostMapping("/add")
    public String addWord(@ModelAttribute("Word")  @Valid Word word){
      log.info(word.toString());
        wordRepo.save(word);
        return "redirect:/";
    }


}
