package com.example.practice.jokesapp.jokesapp.controllers;

import com.example.practice.jokesapp.jokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

  private JokeService jokeService;

  @Autowired //Not Required for SpringBoot
  public JokeController(JokeService jokeService) {
    this.jokeService = jokeService;
  }

  @RequestMapping({"/", ""})
  public String showJokes(Model model)
  {
    model.addAttribute("joke", jokeService.getJokes());
    return "checknorris";
  }
}
